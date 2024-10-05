package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bdt extends bdn {
    public bdo a;
    private long b;
    private volatile boolean c;
    private final bdm d;

    public bdt(ate ateVar, ath athVar, pms pmsVar, int i, Object obj, bdm bdmVar) {
        super(ateVar, athVar, 2, pmsVar, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.d = bdmVar;
    }

    @Override // defpackage.bfv
    public final void a() {
        this.c = true;
    }

    @Override // defpackage.bfv
    public final void b() {
        if (this.b == 0) {
            this.d.b(this.a, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            ath b = this.f.b(this.b);
            bgh bghVar = this.m;
            bid bidVar = new bid(bghVar, b.g, bghVar.h(b));
            while (!this.c && this.d.d(bidVar)) {
                try {
                } finally {
                    this.b = bidVar.c - this.f.g;
                }
            }
        } finally {
            pts.N(this.m);
        }
    }
}
