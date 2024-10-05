package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anxx {
    public final String a;
    public final long b;
    public final int c;

    public anxx() {
    }

    public anxx(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public static anxw a() {
        anxw anxwVar = new anxw();
        anxwVar.b(0L);
        return anxwVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anxx) {
            anxx anxxVar = (anxx) obj;
            String str = this.a;
            if (str != null ? str.equals(anxxVar.a) : anxxVar.a == null) {
                if (this.b == anxxVar.b) {
                    int i = this.c;
                    int i2 = anxxVar.c;
                    if (i != 0 ? i == i2 : i2 == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        int i2 = this.c;
        return i ^ (i2 != 0 ? i2 : 0);
    }

    public final String toString() {
        String str = this.a;
        long j = this.b;
        int i = this.c;
        String str2 = i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 81 + str2.length());
        sb.append("TokenResult{token=");
        sb.append(str);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(j);
        sb.append(", responseCode=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
