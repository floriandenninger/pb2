package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pnt {
    public static final ash r = new ash(new Object());
    public final pou a;
    public final long b;
    public final long c;
    public final int d;
    public final plp e;
    public final boolean f;
    public final asj g;
    public final ber h;
    public final List i;
    public final boolean j;
    public final int k;
    public final pnu l;
    public final boolean m;
    public final boolean n;
    public volatile long o;
    public volatile long p;
    public volatile long q;
    public final ash s;
    public final ash t;

    public pnt(pou pouVar, ash ashVar, long j, long j2, int i, plp plpVar, boolean z, asj asjVar, ber berVar, List list, ash ashVar2, boolean z2, int i2, pnu pnuVar, long j3, long j4, long j5, boolean z3, boolean z4) {
        this.a = pouVar;
        this.s = ashVar;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = plpVar;
        this.f = z;
        this.g = asjVar;
        this.h = berVar;
        this.i = list;
        this.t = ashVar2;
        this.j = z2;
        this.k = i2;
        this.l = pnuVar;
        this.o = j3;
        this.p = j4;
        this.q = j5;
        this.m = z3;
        this.n = z4;
    }

    public static pnt g(ber berVar) {
        pou pouVar = pou.d;
        ash ashVar = r;
        return new pnt(pouVar, ashVar, -9223372036854775807L, 0L, 1, null, false, asj.a, berVar, amru.q(), ashVar, false, 0, pnu.a, 0L, 0L, 0L, false, false);
    }

    public final pnt a(boolean z) {
        return new pnt(this.a, this.s, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.j, this.k, this.l, this.o, this.p, this.q, z, this.n);
    }

    public final pnt b(boolean z, int i) {
        return new pnt(this.a, this.s, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, z, i, this.l, this.o, this.p, this.q, this.m, this.n);
    }

    public final pnt c(plp plpVar) {
        return new pnt(this.a, this.s, this.b, this.c, this.d, plpVar, this.f, this.g, this.h, this.i, this.t, this.j, this.k, this.l, this.o, this.p, this.q, this.m, this.n);
    }

    public final pnt d(pnu pnuVar) {
        return new pnt(this.a, this.s, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.j, this.k, pnuVar, this.o, this.p, this.q, this.m, this.n);
    }

    public final pnt e(int i) {
        return new pnt(this.a, this.s, this.b, this.c, i, this.e, this.f, this.g, this.h, this.i, this.t, this.j, this.k, this.l, this.o, this.p, this.q, this.m, this.n);
    }

    public final pnt f(pou pouVar) {
        return new pnt(pouVar, this.s, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.j, this.k, this.l, this.o, this.p, this.q, this.m, this.n);
    }

    public final pnt h(ash ashVar) {
        return new pnt(this.a, this.s, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, ashVar, this.j, this.k, this.l, this.o, this.p, this.q, this.m, this.n);
    }

    public final pnt i(ash ashVar, long j, long j2, long j3, long j4, asj asjVar, ber berVar, List list) {
        return new pnt(this.a, ashVar, j2, j3, this.d, this.e, this.f, asjVar, berVar, list, this.t, this.j, this.k, this.l, this.o, j4, j, this.m, this.n);
    }
}
