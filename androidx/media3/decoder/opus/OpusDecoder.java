package androidx.media3.decoder.opus;

import androidx.media3.common.decoder.CryptoConfig;
import androidx.media3.common.decoder.SimpleOutputBuffer;
import androidx.media3.decoder.opus.OpusDecoder;
import defpackage.asq;
import defpackage.ass;
import defpackage.asu;
import defpackage.asw;
import defpackage.asx;
import defpackage.asy;
import defpackage.ata;
import defpackage.auf;
import defpackage.hp;
import defpackage.pse;
import defpackage.pts;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OpusDecoder extends ata {
    public final boolean a;
    public final int b;
    private final CryptoConfig c;
    private final int d;
    private final int e;
    private final long f;
    private int g;

    public OpusDecoder(int i, List list, CryptoConfig cryptoConfig, boolean z) {
        super(new asw[16], new SimpleOutputBuffer[16]);
        int g;
        int i2;
        int i3;
        if (OpusLibrary.a()) {
            this.c = cryptoConfig;
            if (cryptoConfig == null || OpusLibrary.opusIsSecureDecodeSupported()) {
                int size = list.size();
                if (size != 1) {
                    if (size == 3) {
                        if (((byte[]) list.get(1)).length != 8 || ((byte[]) list.get(2)).length != 8) {
                            throw new auf("Invalid pre-skip or seek pre-roll");
                        }
                    } else {
                        throw new auf("Invalid initialization data size");
                    }
                }
                if (list.size() == 3) {
                    g = (int) hp.h(ByteBuffer.wrap((byte[]) list.get(1)).order(ByteOrder.nativeOrder()).getLong());
                } else {
                    g = hp.g((byte[]) list.get(0));
                }
                this.d = g;
                this.e = list.size() == 3 ? (int) hp.h(ByteBuffer.wrap((byte[]) list.get(2)).order(ByteOrder.nativeOrder()).getLong()) : 3840;
                byte[] bArr = (byte[]) list.get(0);
                int length = bArr.length;
                if (length < 19) {
                    throw new auf("Invalid header length");
                }
                int f = hp.f(bArr);
                this.b = f;
                if (f <= 8) {
                    short s = (short) ((bArr[16] & 255) | ((bArr[17] & 255) << 8));
                    byte[] bArr2 = new byte[8];
                    if (bArr[18] == 0) {
                        if (f > 2) {
                            throw new auf("Invalid header, missing stream map");
                        }
                        int i4 = f == 2 ? 1 : 0;
                        bArr2[0] = 0;
                        bArr2[1] = 1;
                        i3 = i4;
                        i2 = 1;
                    } else {
                        if (length < f + 21) {
                            throw new auf("Invalid header length");
                        }
                        int i5 = bArr[19] & 255;
                        int i6 = bArr[20] & 255;
                        System.arraycopy(bArr, 21, bArr2, 0, f);
                        i2 = i5;
                        i3 = i6;
                    }
                    long opusInit = opusInit(48000, f, i2, i3, s, bArr2);
                    this.f = opusInit;
                    if (opusInit == 0) {
                        throw new auf("Failed to initialize decoder");
                    }
                    o(i);
                    this.a = z;
                    if (z) {
                        opusSetFloatOutput();
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder(34);
                sb.append("Invalid channel count: ");
                sb.append(f);
                throw new auf(sb.toString());
            }
            throw new auf("Opus decoder does not support secure decode");
        }
        throw new auf("Failed to load decoder native libraries");
    }

    private native void opusClose(long j);

    private native int opusDecode(long j, long j2, ByteBuffer byteBuffer, int i, SimpleOutputBuffer simpleOutputBuffer);

    private native int opusGetErrorCode(long j);

    private native String opusGetErrorMessage(long j);

    private native long opusInit(int i, int i2, int i3, int i4, int i5, byte[] bArr);

    private native void opusReset(long j);

    private native int opusSecureDecode(long j, long j2, ByteBuffer byteBuffer, int i, SimpleOutputBuffer simpleOutputBuffer, int i2, CryptoConfig cryptoConfig, int i3, byte[] bArr, byte[] bArr2, int i4, int[] iArr, int[] iArr2);

    private native void opusSetFloatOutput();

    @Override // defpackage.ast
    public final String c() {
        String valueOf = String.valueOf(OpusLibrary.a() ? OpusLibrary.opusGetVersion() : null);
        return valueOf.length() != 0 ? "libopus".concat(valueOf) : new String("libopus");
    }

    @Override // defpackage.ata, defpackage.ast
    public final void f() {
        super.f();
        opusClose(this.f);
    }

    @Override // defpackage.ata
    protected final /* bridge */ /* synthetic */ asu g(Throwable th) {
        return new auf("Unexpected decode error", th);
    }

    @Override // defpackage.ata
    protected final /* bridge */ /* synthetic */ asu h(asw aswVar, asy asyVar, boolean z) {
        SimpleOutputBuffer simpleOutputBuffer;
        OpusDecoder opusDecoder;
        int opusDecode;
        SimpleOutputBuffer simpleOutputBuffer2 = (SimpleOutputBuffer) asyVar;
        if (z) {
            opusReset(this.f);
            this.g = aswVar.d == 0 ? this.d : this.e;
        }
        ByteBuffer byteBuffer = aswVar.b;
        int i = pts.a;
        ass assVar = aswVar.a;
        if (aswVar.d()) {
            simpleOutputBuffer = simpleOutputBuffer2;
            opusDecode = opusSecureDecode(this.f, aswVar.d, byteBuffer, byteBuffer.limit(), simpleOutputBuffer2, 48000, this.c, assVar.c, (byte[]) pse.c(assVar.b), (byte[]) pse.c(assVar.a), assVar.f, assVar.d, assVar.e);
            opusDecoder = this;
        } else {
            simpleOutputBuffer = simpleOutputBuffer2;
            opusDecoder = this;
            opusDecode = opusDecode(opusDecoder.f, aswVar.d, byteBuffer, byteBuffer.limit(), simpleOutputBuffer);
        }
        if (opusDecode < 0) {
            if (opusDecode == -2) {
                String valueOf = String.valueOf(opusDecoder.opusGetErrorMessage(opusDecoder.f));
                String concat = valueOf.length() != 0 ? "Drm error: ".concat(valueOf) : new String("Drm error: ");
                opusDecoder.opusGetErrorCode(opusDecoder.f);
                return new auf(concat, new asq(concat));
            }
            String valueOf2 = String.valueOf(opusDecoder.opusGetErrorMessage(opusDecode));
            return new auf(valueOf2.length() != 0 ? "Decode error: ".concat(valueOf2) : new String("Decode error: "));
        }
        SimpleOutputBuffer simpleOutputBuffer3 = simpleOutputBuffer;
        ByteBuffer byteBuffer2 = simpleOutputBuffer3.data;
        int i2 = opusDecoder.g;
        if (i2 <= 0) {
            return null;
        }
        int i3 = opusDecoder.b;
        int i4 = i3 + i3;
        int i5 = i2 * i4;
        if (opusDecode <= i5) {
            opusDecoder.g = i2 - (opusDecode / i4);
            simpleOutputBuffer3.addFlag(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
            return null;
        }
        opusDecoder.g = 0;
        return null;
    }

    @Override // defpackage.ata
    protected final asw i() {
        return new asw(2);
    }

    @Override // defpackage.ata
    protected final /* bridge */ /* synthetic */ asy k() {
        return new SimpleOutputBuffer(new asx() { // from class: aue
            @Override // defpackage.asx
            public final void a(asy asyVar) {
                OpusDecoder.this.n((SimpleOutputBuffer) asyVar);
            }
        });
    }
}
