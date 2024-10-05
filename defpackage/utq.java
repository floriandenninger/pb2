package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class utq implements uoo {
    private final int a;
    private final boolean b;
    private final int c;
    private final uqq d;

    public utq() {
    }

    public utq(int i, uqq uqqVar, boolean z, byte[] bArr, byte[] bArr2) {
        this.c = 2;
        this.a = i;
        this.d = uqqVar;
        this.b = z;
    }

    @Override // defpackage.uoo
    public final int a() {
        return this.a;
    }

    @Override // defpackage.uoo
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof utq)) {
            return false;
        }
        utq utqVar = (utq) obj;
        int i = this.c;
        int i2 = utqVar.c;
        if (i != 0) {
            return i == i2 && this.a == utqVar.a && this.d.equals(utqVar.d) && this.b == utqVar.b;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.c;
        uop.b(i);
        return ((((((i ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String a = uop.a(this.c);
        int i = this.a;
        String valueOf = String.valueOf(this.d);
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(a.length() + 114 + String.valueOf(valueOf).length());
        sb.append("TikTokTraceConfigurations{enablement=");
        sb.append(a);
        sb.append(", rateLimitPerSecond=");
        sb.append(i);
        sb.append(", dynamicSampler=");
        sb.append(valueOf);
        sb.append(", recordTimerDuration=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
