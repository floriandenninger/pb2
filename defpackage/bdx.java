package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bdx extends bdi {
    private final int o;
    private final pms p;
    private long q;
    private boolean r;

    public bdx(ate ateVar, ath athVar, pms pmsVar, int i, Object obj, long j, long j2, long j3, int i2, pms pmsVar2) {
        super(ateVar, athVar, pmsVar, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.o = i2;
        this.p = pmsVar2;
    }

    @Override // defpackage.bfv
    public final void a() {
    }

    @Override // defpackage.bfv
    public final void b() {
        bdk d = d();
        d.b(0L);
        bjc a = d.a(0, this.o);
        a.rp(this.p);
        try {
            long h = this.m.h(this.f.b(this.q));
            if (h != -1) {
                h += this.q;
            }
            bid bidVar = new bid(this.m, this.q, h);
            for (int i = 0; i != -1; i = a.e(bidVar, Integer.MAX_VALUE, true)) {
                this.q += i;
            }
            a.v(this.k, 1, (int) this.q, 0, null);
            pts.N(this.m);
            this.r = true;
        } catch (Throwable th) {
            pts.N(this.m);
            throw th;
        }
    }

    @Override // defpackage.bdu
    public final boolean h() {
        return this.r;
    }
}
