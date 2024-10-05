package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pnf implements plg {
    public static final pnf a = new pne().a();
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final byte[] g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final Integer k;
    public final Integer l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final CharSequence q;
    public final CharSequence r;
    public final CharSequence s;

    public pnf(pne pneVar) {
        this.b = pneVar.a;
        this.c = pneVar.b;
        this.d = pneVar.c;
        this.e = pneVar.d;
        this.f = pneVar.e;
        this.g = pneVar.f;
        this.h = pneVar.g;
        this.i = pneVar.h;
        this.j = pneVar.i;
        this.k = pneVar.j;
        this.l = pneVar.k;
        this.m = pneVar.l;
        this.n = pneVar.m;
        this.o = pneVar.n;
        this.p = pneVar.o;
        this.q = pneVar.p;
        this.r = pneVar.q;
        this.s = pneVar.r;
    }

    public final pne a() {
        return new pne(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            pnf pnfVar = (pnf) obj;
            if (pts.R(this.b, pnfVar.b) && pts.R(this.c, pnfVar.c) && pts.R(this.d, pnfVar.d) && pts.R(this.e, pnfVar.e) && pts.R(null, null) && pts.R(null, null) && pts.R(this.f, pnfVar.f) && pts.R(null, null) && pts.R(null, null) && pts.R(null, null) && Arrays.equals(this.g, pnfVar.g) && pts.R(this.h, pnfVar.h) && pts.R(null, null) && pts.R(this.i, pnfVar.i) && pts.R(this.j, pnfVar.j) && pts.R(null, null) && pts.R(null, null) && pts.R(this.k, pnfVar.k) && pts.R(this.l, pnfVar.l) && pts.R(this.m, pnfVar.m) && pts.R(this.n, pnfVar.n) && pts.R(this.o, pnfVar.o) && pts.R(this.p, pnfVar.p) && pts.R(this.q, pnfVar.q) && pts.R(this.r, pnfVar.r) && pts.R(this.s, pnfVar.s) && pts.R(null, null) && pts.R(null, null) && pts.R(null, null) && pts.R(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, null, null, this.f, null, null, null, Integer.valueOf(Arrays.hashCode(this.g)), this.h, null, this.i, this.j, null, null, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, null, null, null, null});
    }
}
