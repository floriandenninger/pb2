package j$.sun.nio.cs;

import j$.lang.DesugarCharacter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

/* loaded from: classes5.dex */
public abstract class UnicodeEncoder extends CharsetEncoder {
    private int byteOrder;
    private boolean needsMark;
    private final Surrogate$Parser sgp;
    private boolean usesMark;

    /* JADX INFO: Access modifiers changed from: protected */
    public UnicodeEncoder(Charset charset, int i, boolean z) {
        super(charset, 2.0f, z ? 4.0f : 2.0f, i == 0 ? new byte[]{-1, -3} : new byte[]{-3, -1});
        this.sgp = new Surrogate$Parser();
        this.needsMark = z;
        this.usesMark = z;
        this.byteOrder = i;
    }

    private void put(char c, ByteBuffer byteBuffer) {
        if (this.byteOrder == 0) {
            byteBuffer.put((byte) (c >> '\b'));
            byteBuffer.put((byte) (c & 255));
        } else {
            byteBuffer.put((byte) (c & 255));
            byteBuffer.put((byte) (c >> '\b'));
        }
    }

    @Override // java.nio.charset.CharsetEncoder
    protected CoderResult encodeLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
        CoderResult coderResult;
        int position = charBuffer.position();
        if (this.needsMark && charBuffer.hasRemaining()) {
            if (byteBuffer.remaining() < 2) {
                return CoderResult.OVERFLOW;
            }
            put((char) 65279, byteBuffer);
            this.needsMark = false;
        }
        while (true) {
            try {
                if (charBuffer.hasRemaining()) {
                    char c = charBuffer.get();
                    if (!DesugarCharacter.isSurrogate(c)) {
                        if (byteBuffer.remaining() < 2) {
                            coderResult = CoderResult.OVERFLOW;
                            break;
                        }
                        position++;
                        put(c, byteBuffer);
                    } else {
                        int parse = this.sgp.parse(c, charBuffer);
                        if (parse < 0) {
                            coderResult = this.sgp.error();
                            break;
                        }
                        if (byteBuffer.remaining() < 4) {
                            coderResult = CoderResult.OVERFLOW;
                            break;
                        }
                        position += 2;
                        put(DesugarCharacter.highSurrogate(parse), byteBuffer);
                        put(DesugarCharacter.lowSurrogate(parse), byteBuffer);
                    }
                } else {
                    coderResult = CoderResult.UNDERFLOW;
                    break;
                }
            } finally {
            }
        }
        return coderResult;
    }

    @Override // java.nio.charset.CharsetEncoder
    protected void implReset() {
        this.needsMark = this.usesMark;
    }

    @Override // java.nio.charset.CharsetEncoder
    public boolean canEncode(char c) {
        return !DesugarCharacter.isSurrogate(c);
    }
}
