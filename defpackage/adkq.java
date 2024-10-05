package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adkq {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;

    public adkq() {
    }

    public adkq(long j, long j2, long j3, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
    }

    public static adkp a() {
        adkp adkpVar = new adkp();
        adkpVar.b(0L);
        adkpVar.c(0L);
        adkpVar.d(0L);
        adkpVar.e(false);
        return adkpVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adkq) {
            adkq adkqVar = (adkq) obj;
            if (this.a == adkqVar.a && this.b == adkqVar.b && this.c == adkqVar.c && this.d == adkqVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        return (true != this.d ? 1237 : 1231) ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(188);
        sb.append("ConnectedSessionInfo{lastConnectedTimeMs=");
        sb.append(j);
        sb.append(", firstConnectedTimeMs=");
        sb.append(j2);
        sb.append(", recoveryExpirationTimeMs=");
        sb.append(j3);
        sb.append(", shouldSkipRecoveryExpiration=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
