package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adma {
    public final int a;
    public final String b;

    public adma() {
    }

    public adma(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public static agaj a() {
        agaj agajVar = new agaj();
        agajVar.b(0);
        agajVar.c("");
        return agajVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adma) {
            adma admaVar = (adma) obj;
            if (this.a == admaVar.a && this.b.equals(admaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
        sb.append("SessionRecoveryStatus{recoveryState=");
        sb.append(i);
        sb.append(", screenName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
