package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amxr extends amxs {
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private int f = 0;

    public amxr(String str, String str2, int i, String str3) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
    }

    @Override // defpackage.amxs
    public final int a() {
        return (char) this.d;
    }

    @Override // defpackage.amxs
    public final String b() {
        return this.b.replace('/', '.');
    }

    @Override // defpackage.amxs
    public final String c() {
        return this.e;
    }

    @Override // defpackage.amxs
    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof amxr) {
            amxr amxrVar = (amxr) obj;
            if (this.b.equals(amxrVar.b) && this.c.equals(amxrVar.c) && this.d == amxrVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((this.b.hashCode() + 4867) * 31) + this.c.hashCode()) * 31) + this.d;
        this.f = hashCode;
        return hashCode;
    }
}
