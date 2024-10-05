package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dft {
    public boolean a;
    private byte b;
    private byte c;
    private byte d;
    private byte e;
    private byte f;
    private byte g;
    private int h;

    public dft() {
    }

    public final void a(ByteBuffer byteBuffer) {
        did.aa(byteBuffer, (this.b << 28) | (this.c << 26) | (this.d << 24) | (this.e << 22) | (this.f << 20) | (this.g << 17) | ((this.a ? 1 : 0) << 16) | this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dft dftVar = (dft) obj;
        return this.c == dftVar.c && this.b == dftVar.b && this.h == dftVar.h && this.d == dftVar.d && this.f == dftVar.f && this.e == dftVar.e && this.a == dftVar.a && this.g == dftVar.g;
    }

    public final int hashCode() {
        return (((((((((((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + (this.a ? 1 : 0)) * 31) + this.h;
    }

    public final String toString() {
        byte b = this.b;
        byte b2 = this.c;
        byte b3 = this.d;
        byte b4 = this.e;
        byte b5 = this.f;
        byte b6 = this.g;
        boolean z = this.a;
        int i = this.h;
        StringBuilder sb = new StringBuilder(147);
        sb.append("SampleFlags{reserved=");
        sb.append((int) b);
        sb.append(", isLeading=");
        sb.append((int) b2);
        sb.append(", depOn=");
        sb.append((int) b3);
        sb.append(", isDepOn=");
        sb.append((int) b4);
        sb.append(", hasRedundancy=");
        sb.append((int) b5);
        sb.append(", padValue=");
        sb.append((int) b6);
        sb.append(", isDiffSample=");
        sb.append(z);
        sb.append(", degradPrio=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    public dft(ByteBuffer byteBuffer) {
        long ak = did.ak(byteBuffer);
        this.b = (byte) (((-268435456) & ak) >> 28);
        this.c = (byte) ((201326592 & ak) >> 26);
        this.d = (byte) ((50331648 & ak) >> 24);
        this.e = (byte) ((12582912 & ak) >> 22);
        this.f = (byte) ((3145728 & ak) >> 20);
        this.g = (byte) ((917504 & ak) >> 17);
        this.a = ((65536 & ak) >> 16) > 0;
        this.h = (int) (ak & 65535);
    }
}
