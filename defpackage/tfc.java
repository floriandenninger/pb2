package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tfc extends teh {
    public double g;
    public double h;
    public long i;
    public final tev j;
    public final tev k;
    public final tev l;
    public int m;
    public final tev n;
    public int o;
    public int p;
    public final tee q;
    public final teq r;
    public final teq s;
    public final teq t;
    public final axqn u;
    private final boolean v;

    public tfc() {
        this.g = -1.0d;
        this.h = -1.0d;
        this.j = new tev();
        this.k = new tev();
        this.u = new axqn((byte[]) null);
        this.l = new tev();
        this.n = new tev();
        this.o = 1;
        this.q = new tee();
        this.r = new teq();
        this.s = new teq();
        this.t = new teq();
        this.v = false;
    }

    private final boolean k(double d) {
        return this.v ? d > 0.0d : d >= 0.1d;
    }

    @Override // defpackage.teh
    protected final int a() {
        return 2000;
    }

    public final long f() {
        return this.j.b(1);
    }

    public final void g(long j, double d, double d2, double d3, boolean z, boolean z2, boolean z3, double d4) {
        b(j, d, d4);
        if (z3) {
            this.e.g();
        }
        if (j > 0) {
            int i = (int) j;
            long j2 = i;
            this.j.d(j2);
            boolean z4 = k(d2) && k(d3);
            if (z4) {
                this.k.d(j2);
            }
            if (z) {
                this.i += j2;
                this.m += i;
            }
            if (z4) {
                this.u.f(d, j2);
            } else {
                this.u.g();
            }
            if (d >= teg.HALF.f) {
                this.l.d(j2);
                tev tevVar = this.n;
                if (true != z4) {
                    j2 = 0;
                }
                tevVar.d(j2);
            }
        }
        this.h = Math.max(d2, this.h);
        double d5 = this.g;
        this.g = d5 == -1.0d ? d2 : Math.min(d2, d5);
        this.q.a.clear();
        this.q.b(ted.AUDIBLE_MEASURABLE);
        this.q.b(ted.BACKGROUNDED_MEASURABLE);
        this.q.b(ted.COVERAGE_MEASURABLE);
        boolean k = k(d2);
        if (d >= teg.HALF.f) {
            this.q.b(ted.VISIBLE_50_PERCENT);
        }
        if (c()) {
            this.q.b(ted.VIEWABLE);
        }
        if (k) {
            this.q.b(ted.AUDIBLE);
        }
        if (d >= teg.HALF.f && k) {
            this.q.b(ted.AUDIBLE_AND_VISIBLE_50_PERCENT);
        }
        if (c() && k) {
            this.q.b(ted.AUDIBLE_AND_VIEWABLE);
        }
        if (z) {
            this.q.b(ted.FULLSCREEN);
        }
        if (d > 0.0d) {
            this.q.b(ted.PARTIALLY_VIEWABLE);
        }
        if (i()) {
            this.q.b(ted.GROUPM_DURATION_REACHED);
        }
        if (d()[teg.FULL.ordinal()].longValue() >= 2000) {
            this.q.b(ted.PMX_VIEWABLE);
        }
        if (z2) {
            this.q.b(ted.BACKGROUNDED);
        }
        int i2 = (int) j;
        teg tegVar = d >= teg.FULL.f ? teg.FULL : d >= teg.THREE_QUARTER.f ? teg.THREE_QUARTER : d >= teg.HALF.f ? teg.HALF : d >= teg.QUARTER.f ? teg.QUARTER : d > teg.NONE.f ? teg.NONE : null;
        if (tegVar == null) {
            this.r.a(i2, false);
            this.s.a(i2, false);
        } else {
            this.r.a(i2, tegVar.ordinal() <= teg.HALF.ordinal());
            this.s.a(i2, tegVar.ordinal() <= teg.FULL.ordinal());
        }
        this.t.a(i2, k(d2));
    }

    public final boolean h() {
        return k(this.g);
    }

    public final boolean i() {
        return j(f());
    }

    public final boolean j(long j) {
        int i;
        return j >= 15000 || ((i = this.p) > 0 && j >= ((long) (i >> 1)));
    }

    public tfc(boolean z) {
        this.g = -1.0d;
        this.h = -1.0d;
        this.j = new tev();
        this.k = new tev();
        this.u = new axqn((byte[]) null);
        this.l = new tev();
        this.n = new tev();
        this.o = 1;
        this.q = new tee();
        this.r = new teq();
        this.s = new teq();
        this.t = new teq();
        this.v = z;
    }
}
