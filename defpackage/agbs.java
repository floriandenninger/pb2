package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agbs {
    public final String a;
    public final int b;
    public final String c;

    public agbs(String str, int i, String str2) {
        if (str == null) {
            throw new NullPointerException("Null tag");
        }
        this.a = str;
        this.b = i;
        if (str2 != null) {
            this.c = str2;
            return;
        }
        throw new NullPointerException("Null clientId");
    }

    public static agbs a(String str, int i) {
        return new agbs(str, i, "");
    }

    public static agbs b(String str, int i, String str2) {
        return new agbs(str, i, str2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agbs) {
            agbs agbsVar = (agbs) obj;
            if (this.a.equals(agbsVar.a) && this.b == agbsVar.b && this.c.equals(agbsVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        String str2 = this.c;
        StringBuilder sb = new StringBuilder(str.length() + 48 + str2.length());
        sb.append("NotificationTag{tag=");
        sb.append(str);
        sb.append(", id=");
        sb.append(i);
        sb.append(", clientId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public agbs() {
    }
}
