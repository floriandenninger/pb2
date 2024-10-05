package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yry {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public yry() {
    }

    public yry(int i, int i2, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
    }

    public static yqx a() {
        yqx yqxVar = new yqx();
        yqxVar.b(20000);
        yqxVar.d(20000);
        yqxVar.c(true);
        yqxVar.a = true;
        return yqxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yry) {
            yry yryVar = (yry) obj;
            if (this.a == yryVar.a && this.b == yryVar.b && this.c == yryVar.c && this.d == yryVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true == this.d ? 1231 : 1237);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        StringBuilder sb = new StringBuilder(135);
        sb.append("HttpClientConfig{connectionTimeoutMs=");
        sb.append(i);
        sb.append(", readTimeoutMs=");
        sb.append(i2);
        sb.append(", installSecureRequestEnforcer=");
        sb.append(z);
        sb.append(", followRedirects=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
