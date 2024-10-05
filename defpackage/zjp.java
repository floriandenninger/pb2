package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zjp {
    public final long a;
    public final String b;

    public zjp(long j, String str) {
        this.a = j;
        if (str == null) {
            throw new NullPointerException("Null cpid");
        }
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zjp) {
            zjp zjpVar = (zjp) obj;
            if (this.a == zjpVar.a && this.b.equals(zjpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return this.b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        String str = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 57);
        sb.append("DataPlanIdentifier{carrierId=");
        sb.append(j);
        sb.append(", cpid=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public zjp() {
    }
}
