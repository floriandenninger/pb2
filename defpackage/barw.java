package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class barw {
    public final String a;
    public final String b;

    public barw(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null clientId");
        }
        this.a = str;
        if (str2 != null) {
            this.b = str2;
            return;
        }
        throw new NullPointerException("Null blockInstanceId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof barw) {
            barw barwVar = (barw) obj;
            if (this.a.equals(barwVar.a) && this.b.equals(barwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 44 + str2.length());
        sb.append("BlockClientInfo{clientId=");
        sb.append(str);
        sb.append(", blockInstanceId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public barw() {
    }
}
