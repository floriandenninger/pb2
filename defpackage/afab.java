package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afab extends bdi {
    private volatile boolean o;
    private long p;
    private boolean q;
    private final bdm r;

    public afab(ate ateVar, ath athVar, pms pmsVar, int i, Object obj, bdm bdmVar) {
        super(ateVar, athVar, pmsVar, i, obj, 0L, 0L, -9223372036854775807L, -9223372036854775807L, -1L);
        this.r = bdmVar;
    }

    @Override // defpackage.bfv
    public final void a() {
        this.o = true;
    }

    @Override // defpackage.bfv
    public final void b() {
        ath b = this.f.b(this.p);
        try {
            bgh bghVar = this.m;
            bid bidVar = new bid(bghVar, b.f, bghVar.h(b));
            if (this.p == 0) {
                this.r.b(d(), -9223372036854775807L, -9223372036854775807L);
            }
            while (!this.o && this.r.d(bidVar)) {
                try {
                } finally {
                    this.p = bidVar.c - this.f.f;
                }
            }
            pts.N(this.m);
            this.q = !this.o;
        } catch (Throwable th) {
            pts.N(this.m);
            throw th;
        }
    }

    @Override // defpackage.bdu
    public final boolean h() {
        return this.q;
    }
}
