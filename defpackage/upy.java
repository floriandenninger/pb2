package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class upy implements uoo {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final double e;
    private final int f;

    public upy() {
    }

    public upy(int i, int i2, int i3, int i4, double d) {
        this.f = 1;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = d;
    }

    @Override // defpackage.uoo
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.uoo
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof upy)) {
            return false;
        }
        upy upyVar = (upy) obj;
        int i = this.f;
        int i2 = upyVar.f;
        if (i != 0) {
            return i2 == 1 && this.a == upyVar.a && this.b == upyVar.b && this.c == upyVar.c && this.d == upyVar.d && Double.doubleToLongBits(this.e) == Double.doubleToLongBits(upyVar.e);
        }
        throw null;
    }

    public final int hashCode() {
        uop.b(this.f);
        return ((((((((this.a ^ (-722379962)) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.e) >>> 32) ^ Double.doubleToLongBits(this.e)));
    }

    public final String toString() {
        String a = uop.a(this.f);
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        double d = this.e;
        StringBuilder sb = new StringBuilder(a.length() + 211);
        sb.append("CpuProfilingConfigurations{enablement=");
        sb.append(a);
        sb.append(", maxBufferSizeBytes=");
        sb.append(i);
        sb.append(", sampleDurationMs=");
        sb.append(i2);
        sb.append(", sampleDurationSkewMs=");
        sb.append(i3);
        sb.append(", sampleFrequencyMicro=");
        sb.append(i4);
        sb.append(", samplesPerEpoch=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
