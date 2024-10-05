package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azt extends asw {
    public long f;
    public int g;
    private int h;

    public azt() {
        super(2);
        this.h = 32;
    }

    @Override // defpackage.asw, defpackage.asp
    public final void clear() {
        super.clear();
        this.g = 0;
    }

    public final void e(int i) {
        pse.e(true);
        this.h = i;
    }

    public final boolean f(asw aswVar) {
        ByteBuffer byteBuffer;
        pse.e(!aswVar.d());
        pse.e(!aswVar.hasSupplementalData());
        pse.e(!aswVar.isEndOfStream());
        if (g()) {
            if (this.g >= this.h || aswVar.isDecodeOnly() != isDecodeOnly()) {
                return false;
            }
            ByteBuffer byteBuffer2 = aswVar.b;
            if (byteBuffer2 != null && (byteBuffer = this.b) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i = this.g;
        this.g = i + 1;
        if (i == 0) {
            this.d = aswVar.d;
            if (aswVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        if (aswVar.isDecodeOnly()) {
            setFlags(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        }
        ByteBuffer byteBuffer3 = aswVar.b;
        if (byteBuffer3 != null) {
            b(byteBuffer3.remaining());
            this.b.put(byteBuffer3);
        }
        this.f = aswVar.d;
        return true;
    }

    public final boolean g() {
        return this.g > 0;
    }
}
