package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pot implements plg {
    public static final Object a = new Object();
    private static final pnd r;

    @Deprecated
    public Object c;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;

    @Deprecated
    public boolean j;
    public pnb k;
    public boolean l;
    public long m;
    public long n;
    public int o;
    public int p;
    public long q;
    public Object b = a;
    public pnd d = r;

    static {
        pmx pmxVar = new pmx();
        pmxVar.b("com.google.android.exoplayer2.Timeline");
        pmxVar.a = Uri.EMPTY;
        r = pmxVar.a();
    }

    public final long a() {
        return plh.d(this.m);
    }

    public final long b() {
        return plh.d(this.n);
    }

    public final long c() {
        return plh.d(this.q);
    }

    public final boolean d() {
        pse.g(this.j == (this.k != null));
        return this.k != null;
    }

    public final void e(Object obj, pnd pndVar, long j, long j2, boolean z, boolean z2, pnb pnbVar, long j3, long j4, long j5) {
        pnc pncVar;
        this.b = obj;
        this.d = pndVar != null ? pndVar : r;
        Object obj2 = null;
        if (pndVar != null && (pncVar = pndVar.b) != null) {
            obj2 = pncVar.h;
        }
        this.c = obj2;
        this.e = j;
        this.f = j2;
        this.g = -9223372036854775807L;
        this.h = z;
        this.i = z2;
        this.j = pnbVar != null;
        this.k = pnbVar;
        this.m = j3;
        this.n = j4;
        this.o = 0;
        this.p = 0;
        this.q = j5;
        this.l = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            pot potVar = (pot) obj;
            if (pts.R(this.b, potVar.b) && pts.R(this.d, potVar.d) && pts.R(null, null) && pts.R(this.k, potVar.k) && this.e == potVar.e && this.f == potVar.f && this.g == potVar.g && this.h == potVar.h && this.i == potVar.i && this.l == potVar.l && this.m == potVar.m && this.n == potVar.n && this.o == potVar.o && this.p == potVar.p && this.q == potVar.q) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.b.hashCode() + 217) * 31) + this.d.hashCode()) * 961;
        pnb pnbVar = this.k;
        int hashCode2 = pnbVar == null ? 0 : pnbVar.hashCode();
        long j = this.e;
        long j2 = this.f;
        long j3 = this.g;
        boolean z = this.h;
        boolean z2 = this.i;
        boolean z3 = this.l;
        long j4 = this.m;
        long j5 = this.n;
        int i = this.o;
        int i2 = this.p;
        long j6 = this.q;
        return ((((((((((((((((((((((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + i) * 31) + i2) * 31) + ((int) ((j6 >>> 32) ^ j6));
    }
}
