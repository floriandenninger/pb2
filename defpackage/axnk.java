package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axnk extends axml {
    int a;
    int b;
    boolean c;
    int d;
    long e;
    long f;
    int g;
    int h;
    int i;
    int j;
    int k;

    @Override // defpackage.axml
    public final String a() {
        return "tscl";
    }

    @Override // defpackage.axml
    public final ByteBuffer b() {
        ByteBuffer allocate = ByteBuffer.allocate(20);
        did.ab(allocate, this.a);
        did.ab(allocate, (this.b << 6) + (true != this.c ? 0 : 32) + this.d);
        did.aa(allocate, this.e);
        long j = this.f & 281474976710655L;
        did.Y(allocate, (int) (j >> 32));
        did.aa(allocate, j & 4294967295L);
        did.ab(allocate, this.g);
        did.Y(allocate, this.h);
        did.Y(allocate, this.i);
        did.ab(allocate, this.j);
        did.Y(allocate, this.k);
        return (ByteBuffer) allocate.rewind();
    }

    @Override // defpackage.axml
    public final void c(ByteBuffer byteBuffer) {
        this.a = did.aj(byteBuffer);
        int aj = did.aj(byteBuffer);
        this.b = (aj & 192) >> 6;
        this.c = (aj & 32) > 0;
        this.d = aj & 31;
        this.e = did.ak(byteBuffer);
        this.f = (did.ah(byteBuffer) << 32) + did.ak(byteBuffer);
        this.g = did.aj(byteBuffer);
        this.h = did.ah(byteBuffer);
        this.i = did.ah(byteBuffer);
        this.j = did.aj(byteBuffer);
        this.k = did.ah(byteBuffer);
    }

    @Override // defpackage.axml
    public final int d() {
        return 20;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axnk axnkVar = (axnk) obj;
        return this.a == axnkVar.a && this.i == axnkVar.i && this.k == axnkVar.k && this.j == axnkVar.j && this.h == axnkVar.h && this.f == axnkVar.f && this.g == axnkVar.g && this.e == axnkVar.e && this.d == axnkVar.d && this.b == axnkVar.b && this.c == axnkVar.c;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = this.b;
        boolean z = this.c;
        int i3 = this.d;
        long j = this.e;
        long j2 = this.f;
        return (((((((((((((((((((i * 31) + i2) * 31) + (z ? 1 : 0)) * 31) + i3) * 31) + ((int) ((j >>> 32) ^ j))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        boolean z = this.c;
        int i3 = this.d;
        long j = this.e;
        long j2 = this.f;
        int i4 = this.g;
        int i5 = this.h;
        int i6 = this.i;
        int i7 = this.j;
        int i8 = this.k;
        StringBuilder sb = new StringBuilder(369);
        sb.append("TemporalLayerSampleGroup{temporalLayerId=");
        sb.append(i);
        sb.append(", tlprofile_space=");
        sb.append(i2);
        sb.append(", tltier_flag=");
        sb.append(z);
        sb.append(", tlprofile_idc=");
        sb.append(i3);
        sb.append(", tlprofile_compatibility_flags=");
        sb.append(j);
        sb.append(", tlconstraint_indicator_flags=");
        sb.append(j2);
        sb.append(", tllevel_idc=");
        sb.append(i4);
        sb.append(", tlMaxBitRate=");
        sb.append(i5);
        sb.append(", tlAvgBitRate=");
        sb.append(i6);
        sb.append(", tlConstantFrameRate=");
        sb.append(i7);
        sb.append(", tlAvgFrameRate=");
        sb.append(i8);
        sb.append("}");
        return sb.toString();
    }
}
