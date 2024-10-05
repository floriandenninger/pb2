package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class twi {
    public final String a;
    public final String b;

    public twi() {
    }

    public twi(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof twi) {
            twi twiVar = (twi) obj;
            if (this.a.equals(twiVar.a)) {
                String str = this.b;
                String str2 = twiVar.b;
                if (str != null ? str.equals(str2) : str2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(str2).length());
        sb.append("PreferenceKey{key=");
        sb.append(str);
        sb.append(", dynamicKey=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
