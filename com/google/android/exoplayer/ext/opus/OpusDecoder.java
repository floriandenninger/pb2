package com.google.android.exoplayer.ext.opus;

import defpackage.oyp;
import defpackage.pbu;
import defpackage.phb;
import defpackage.phc;
import defpackage.phd;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class OpusDecoder extends phd {
    public static final boolean a;
    private final int b;
    private final int c;
    private final int d;
    private final long e;
    private int f;

    static {
        boolean z;
        try {
            System.loadLibrary("opusJNI");
            z = true;
        } catch (UnsatisfiedLinkError unused) {
            z = false;
        }
        a = z;
    }

    public OpusDecoder(List list) {
        super(new phb[16], new OpusOutputBuffer[16]);
        int i;
        int i2;
        byte[] bArr = (byte[]) list.get(0);
        int length = bArr.length;
        if (length < 19) {
            throw new pbu("Header size is too small.");
        }
        int i3 = bArr[9] & 255;
        this.b = i3;
        if (i3 > 8) {
            StringBuilder sb = new StringBuilder(34);
            sb.append("Invalid channel count: ");
            sb.append(i3);
            throw new pbu(sb.toString());
        }
        int m = m(bArr, 10);
        int m2 = m(bArr, 16);
        byte[] bArr2 = new byte[8];
        if (bArr[18] == 0) {
            if (i3 > 2) {
                throw new pbu("Invalid Header, missing stream map.");
            }
            int i4 = i3 == 2 ? 1 : 0;
            bArr2[0] = 0;
            bArr2[1] = 1;
            i = i4;
            i2 = 1;
        } else {
            if (length < i3 + 21) {
                throw new pbu("Header size is too small.");
            }
            int i5 = bArr[19] & 255;
            i = bArr[20] & 255;
            for (int i6 = 0; i6 < this.b; i6++) {
                bArr2[i6] = bArr[i6 + 21];
            }
            i2 = i5;
        }
        if (list.size() == 3) {
            if (((byte[]) list.get(1)).length != 8 || ((byte[]) list.get(2)).length != 8) {
                throw new pbu("Invalid Codec Delay or Seek Preroll");
            }
            long j = ByteBuffer.wrap((byte[]) list.get(1)).order(ByteOrder.nativeOrder()).getLong();
            long j2 = ByteBuffer.wrap((byte[]) list.get(2)).order(ByteOrder.nativeOrder()).getLong();
            this.c = l(j);
            this.d = l(j2);
        } else {
            this.c = m;
            this.d = 3840;
        }
        long opusInit = opusInit(48000, this.b, i2, i, m2, bArr2);
        this.e = opusInit;
        if (opusInit == 0) {
            throw new pbu("Failed to initialize decoder");
        }
        k(5760);
    }

    public static native String getLibopusVersion();

    private static int l(long j) {
        return (int) ((j * 48000) / 1000000000);
    }

    private static int m(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    private native void opusClose(long j);

    private native int opusDecode(long j, ByteBuffer byteBuffer, int i, OpusOutputBuffer opusOutputBuffer, int i2);

    private native String opusGetErrorMessage(int i);

    private native long opusInit(int i, int i2, int i3, int i4, int i5, byte[] bArr);

    private native void opusReset(long j);

    @Override // defpackage.phd
    public final phb a() {
        return new phb();
    }

    @Override // defpackage.phd
    public final /* bridge */ /* synthetic */ phc b() {
        return new OpusOutputBuffer(this);
    }

    @Override // defpackage.phd
    public final /* bridge */ /* synthetic */ Exception c(phb phbVar, phc phcVar, boolean z) {
        OpusOutputBuffer opusOutputBuffer = (OpusOutputBuffer) phcVar;
        if (z) {
            opusReset(this.e);
            this.f = phbVar.a.e == 0 ? this.c : this.d;
        }
        oyp oypVar = phbVar.a;
        opusOutputBuffer.timestampUs = oypVar.e;
        ByteBuffer byteBuffer = oypVar.b;
        int opusDecode = opusDecode(this.e, oypVar.b, oypVar.c, opusOutputBuffer, 48000);
        pbu pbuVar = null;
        if (opusDecode < 0) {
            String valueOf = String.valueOf(opusGetErrorMessage(opusDecode));
            pbuVar = new pbu(valueOf.length() != 0 ? "Decode error: ".concat(valueOf) : new String("Decode error: "));
        } else {
            int i = this.f;
            if (i > 0) {
                int i2 = this.b;
                int i3 = i2 + i2;
                int i4 = i * i3;
                if (opusDecode <= i4) {
                    this.f = i - (opusDecode / i3);
                    opusOutputBuffer.setFlag(2);
                } else {
                    this.f = 0;
                }
            }
        }
        return pbuVar;
    }

    @Override // defpackage.phd
    public final void d() {
        super.d();
        opusClose(this.e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(OpusOutputBuffer opusOutputBuffer) {
        super.j(opusOutputBuffer);
    }
}
