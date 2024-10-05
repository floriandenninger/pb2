package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cda {
    public static final String a = ajbh.S("WorkSpec");
    public static final abb b = new ccx();
    public String c;
    public String d;
    public String e;
    public byr f;
    public byr g;
    public long h;
    public long i;
    public long j;
    public byo k;
    public int l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public int r;
    public int s;
    public int t;

    public cda(cda cdaVar) {
        this.r = 1;
        this.f = byr.a;
        this.g = byr.a;
        this.k = byo.a;
        this.s = 1;
        this.m = 30000L;
        this.p = -1L;
        this.t = 1;
        this.c = cdaVar.c;
        this.d = cdaVar.d;
        this.r = cdaVar.r;
        this.e = cdaVar.e;
        this.f = new byr(cdaVar.f);
        this.g = new byr(cdaVar.g);
        this.h = cdaVar.h;
        this.i = cdaVar.i;
        this.j = cdaVar.j;
        this.k = new byo(cdaVar.k);
        this.l = cdaVar.l;
        this.s = cdaVar.s;
        this.m = cdaVar.m;
        this.n = cdaVar.n;
        this.o = cdaVar.o;
        this.p = cdaVar.p;
        this.q = cdaVar.q;
        this.t = cdaVar.t;
    }

    public final void b(long j, long j2) {
        if (j < 900000) {
            ajbh.X();
            ajbh.W(a, String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new Throwable[0]);
            j = 900000;
        }
        if (j2 < 300000) {
            ajbh.X();
            ajbh.W(a, String.format("Flex duration lesser than minimum allowed value; Changed to %s", 300000L), new Throwable[0]);
            j2 = 300000;
        }
        if (j2 > j) {
            ajbh.X();
            ajbh.W(a, String.format("Flex duration greater than interval duration; Changed to %s", Long.valueOf(j)), new Throwable[0]);
            j2 = j;
        }
        this.i = j;
        this.j = j2;
    }

    public final boolean c() {
        return !byo.a.equals(this.k);
    }

    public final boolean d() {
        return this.r == 1 && this.l > 0;
    }

    public final boolean e() {
        return this.i != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cda cdaVar = (cda) obj;
            if (this.h != cdaVar.h || this.i != cdaVar.i || this.j != cdaVar.j || this.l != cdaVar.l || this.m != cdaVar.m || this.n != cdaVar.n || this.o != cdaVar.o || this.p != cdaVar.p || this.q != cdaVar.q || !this.c.equals(cdaVar.c) || this.r != cdaVar.r || !this.d.equals(cdaVar.d)) {
                return false;
            }
            String str = this.e;
            if (str == null ? cdaVar.e != null : !str.equals(cdaVar.e)) {
                return false;
            }
            if (this.f.equals(cdaVar.f) && this.g.equals(cdaVar.g) && this.k.equals(cdaVar.k) && this.s == cdaVar.s && this.t == cdaVar.t) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode();
        int i = this.r;
        abm.e(i);
        int hashCode2 = ((((hashCode * 31) + i) * 31) + this.d.hashCode()) * 31;
        String str = this.e;
        int hashCode3 = str != null ? str.hashCode() : 0;
        int hashCode4 = this.f.hashCode();
        int hashCode5 = this.g.hashCode();
        long j = this.h;
        long j2 = this.i;
        long j3 = this.j;
        int hashCode6 = (((((((((((((((hashCode2 + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + ((int) ((j >>> 32) ^ j))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + this.k.hashCode()) * 31) + this.l) * 31;
        int i2 = this.s;
        if (i2 == 0) {
            throw null;
        }
        long j4 = this.m;
        long j5 = this.n;
        long j6 = this.o;
        long j7 = this.p;
        int i3 = (((((((((((hashCode6 + i2) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) ((j5 >>> 32) ^ j5))) * 31) + ((int) ((j6 >>> 32) ^ j6))) * 31) + ((int) ((j7 >>> 32) ^ j7))) * 31) + (this.q ? 1 : 0)) * 31;
        int i4 = this.t;
        if (i4 != 0) {
            return i3 + i4;
        }
        throw null;
    }

    public final String toString() {
        return "{WorkSpec: " + this.c + "}";
    }

    public final long a() {
        if (!d()) {
            if (!e()) {
                long j = this.n;
                if (j == 0) {
                    j = System.currentTimeMillis();
                }
                return j + this.h;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = this.n;
            long j3 = j2 == 0 ? currentTimeMillis + this.h : j2;
            long j4 = this.j;
            long j5 = this.i;
            if (j4 != j5) {
                return j3 + j5 + (j2 == 0 ? -j4 : 0L);
            }
            return j3 + (j2 != 0 ? j5 : 0L);
        }
        return this.n + Math.min(18000000L, this.s == 2 ? this.m * this.l : Math.scalb((float) this.m, this.l - 1));
    }

    public cda(String str, String str2) {
        this.r = 1;
        this.f = byr.a;
        this.g = byr.a;
        this.k = byo.a;
        this.s = 1;
        this.m = 30000L;
        this.p = -1L;
        this.t = 1;
        this.c = str;
        this.d = str2;
    }
}
