package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aekk {
    public final String a;
    public final int b;
    public final String c;
    private final long d;
    private final long e;

    public aekk(String str, int i, long j, long j2, String str2) {
        afki.a(str);
        this.a = str;
        this.b = i;
        this.d = j;
        this.e = j2;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aekk) {
            aekk aekkVar = (aekk) obj;
            return this.a.equals(aekkVar.a) && this.b == aekkVar.b && this.d == aekkVar.d && this.e == aekkVar.e && this.c.equals(aekkVar.c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.c.hashCode();
        int i = this.b;
        long j = this.d;
        long j2 = this.e;
        return ((((((((hashCode + 527) * 31) + hashCode2) * 31) + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2));
    }
}
