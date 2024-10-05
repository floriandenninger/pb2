package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anxr {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;
    public final int g;

    static {
        a().a();
    }

    public anxr() {
    }

    public anxr(String str, int i, String str2, String str3, long j, long j2, String str4) {
        this.a = str;
        this.g = i;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = j2;
        this.f = str4;
    }

    public static anxq a() {
        anxq anxqVar = new anxq();
        anxqVar.d(0L);
        anxqVar.c(1);
        anxqVar.b(0L);
        return anxqVar;
    }

    public final boolean b() {
        return this.g == 5;
    }

    public final boolean c() {
        int i = this.g;
        return i == 2 || i == 1;
    }

    public final boolean d() {
        return this.g == 4;
    }

    public final boolean e() {
        return this.g == 3;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof anxr) {
            anxr anxrVar = (anxr) obj;
            String str3 = this.a;
            if (str3 != null ? str3.equals(anxrVar.a) : anxrVar.a == null) {
                int i = this.g;
                int i2 = anxrVar.g;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && ((str = this.b) != null ? str.equals(anxrVar.b) : anxrVar.b == null) && ((str2 = this.c) != null ? str2.equals(anxrVar.c) : anxrVar.c == null) && this.d == anxrVar.d && this.e == anxrVar.e) {
                    String str4 = this.f;
                    String str5 = anxrVar.f;
                    if (str4 != null ? str4.equals(str5) : str5 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final anxq f() {
        return new anxq(this);
    }

    public final anxr g() {
        anxq f = f();
        f.d = "BAD CONFIG";
        f.c(5);
        return f.a();
    }

    public final String toString() {
        String str = this.a;
        int i = this.g;
        String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION";
        String str3 = this.b;
        String str4 = this.c;
        long j = this.d;
        long j2 = this.e;
        String str5 = this.f;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 193 + str2.length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length());
        sb.append("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(str);
        sb.append(", registrationStatus=");
        sb.append(str2);
        sb.append(", authToken=");
        sb.append(str3);
        sb.append(", refreshToken=");
        sb.append(str4);
        sb.append(", expiresInSecs=");
        sb.append(j);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(j2);
        sb.append(", fisError=");
        sb.append(str5);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        int i = this.g;
        if (i == 0) {
            throw null;
        }
        int i2 = (hashCode ^ i) * 1000003;
        String str2 = this.b;
        int hashCode2 = (i2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.d;
        long j2 = this.e;
        int i3 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        String str4 = this.f;
        return i3 ^ (str4 != null ? str4.hashCode() : 0);
    }
}
