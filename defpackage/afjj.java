package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afjj implements shf, zfi {
    private final shf a;
    private Long b;
    private final double c;
    private final boolean d;

    public afjj(shf shfVar, double d, boolean z) {
        afki.a(shfVar);
        afki.b(d > 0.0d);
        this.a = shfVar;
        this.c = 1.0d - Math.exp(Math.log(0.5d) / d);
        this.d = z;
    }

    @Override // defpackage.shf
    public final long b() {
        return this.a.b();
    }

    @Override // defpackage.shf
    public final synchronized long c() {
        long j;
        if (this.b != null) {
            j = this.a.d() + this.b.longValue();
        } else {
            if (!this.d) {
                return this.a.c();
            }
            j = -1;
        }
        return j;
    }

    @Override // defpackage.shf
    public final long d() {
        return this.a.d();
    }

    @Override // defpackage.shf
    public final long e() {
        return this.a.e();
    }

    @Override // defpackage.shf
    public final long f() {
        return System.nanoTime();
    }

    @Override // defpackage.shf
    public final long g() {
        return this.a.g();
    }

    @Override // defpackage.zfi
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final synchronized void a(Long l) {
        if (l == null) {
            return;
        }
        long longValue = l.longValue() - this.a.d();
        Long l2 = this.b;
        if (l2 == null) {
            this.b = Long.valueOf(longValue);
            return;
        }
        double d = 1.0d - this.c;
        double longValue2 = l2.longValue();
        Double.isNaN(longValue2);
        double d2 = d * longValue2;
        double d3 = this.c;
        double d4 = longValue;
        Double.isNaN(d4);
        this.b = Long.valueOf(Math.round(d2 + (d3 * d4)));
    }
}
