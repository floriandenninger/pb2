package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class teh {
    protected double a = -1.0d;
    protected double b = -1.0d;
    protected double c = -1.0d;
    protected double d = -1.0d;
    protected final axqn e = new axqn((byte[]) null);
    protected final axqn f = new axqn(new double[]{tef.ONE_HUNDRED_PERCENT.l, tef.NINETY_PERCENT.l, tef.EIGHTY_PERCENT.l, tef.SEVENTY_PERCENT.l, tef.SIXTY_PERCENT.l, tef.FIFTY_PERCENT.l, tef.FORTY_PERCENT.l, tef.THIRTY_PERCENT.l, tef.TWENTY_PERCENT.l, tef.TEN_PERCENT.l, tef.ZERO.l});

    protected int a() {
        return 1000;
    }

    public final void b(long j, double d, double d2) {
        if (j > 0) {
            this.e.f(d, j);
            this.f.f(d2, j);
        }
        this.b = Math.max(d, this.b);
        double d3 = this.a;
        if (d3 != -1.0d) {
            d = Math.min(d, d3);
        }
        this.a = d;
        this.d = Math.max(d2, this.d);
        double d4 = this.c;
        if (d4 != -1.0d) {
            d2 = Math.min(d2, d4);
        }
        this.c = d2;
    }

    public final boolean c() {
        return this.e.e(3, teg.HALF.f) >= ((long) a());
    }

    public final Long[] d() {
        return e(true);
    }

    public final Long[] e(boolean z) {
        return this.e.i(3, z);
    }
}
