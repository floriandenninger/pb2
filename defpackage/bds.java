package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bds extends bdi {
    private final int o;
    private final long p;
    private long q;
    private volatile boolean r;
    private boolean s;
    private final bdm t;

    public bds(ate ateVar, ath athVar, pms pmsVar, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, bdm bdmVar) {
        super(ateVar, athVar, pmsVar, i, obj, j, j2, j3, j4, j5);
        this.o = i2;
        this.p = j6;
        this.t = bdmVar;
    }

    @Override // defpackage.bfv
    public final void a() {
        this.r = true;
    }

    @Override // defpackage.bfv
    public final void b() {
        if (this.q == 0) {
            bdk d = d();
            d.b(this.p);
            bdm bdmVar = this.t;
            bdo g = g(d);
            long j = this.a;
            long j2 = j == -9223372036854775807L ? -9223372036854775807L : j - this.p;
            long j3 = this.b;
            bdmVar.b(g, j2, j3 == -9223372036854775807L ? -9223372036854775807L : j3 - this.p);
        }
        try {
            ath b = this.f.b(this.q);
            bgh bghVar = this.m;
            bid bidVar = new bid(bghVar, b.g, bghVar.h(b));
            do {
                try {
                    if (this.r) {
                        break;
                    }
                } finally {
                    this.q = bidVar.c - this.f.g;
                }
            } while (this.t.d(bidVar));
            pts.N(this.m);
            this.s = !this.r;
        } catch (Throwable th) {
            pts.N(this.m);
            throw th;
        }
    }

    @Override // defpackage.bdu
    public final long f() {
        return this.n + this.o;
    }

    protected bdo g(bdk bdkVar) {
        return bdkVar;
    }

    @Override // defpackage.bdu
    public final boolean h() {
        return this.s;
    }
}
