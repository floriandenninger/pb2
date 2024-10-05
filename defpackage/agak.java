package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agak {
    public final int a;
    public final String b;

    public agak() {
    }

    public agak(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agak) {
            agak agakVar = (agak) obj;
            if (this.a == agakVar.a && this.b.equals(agakVar.b)) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45);
        sb.append("NotificationCommandData{id=");
        sb.append(i);
        sb.append(", tag=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
