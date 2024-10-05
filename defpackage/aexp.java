package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aexp extends bdi {
    public final aewz o;
    private long p;
    private volatile boolean q;
    private volatile boolean r;
    private final bdm s;

    public aexp(ate ateVar, ath athVar, pms pmsVar, int i, Object obj, long j, bdm bdmVar, aewz aewzVar) {
        super(ateVar, athVar, pmsVar, i, obj, j, j, -9223372036854775807L, -9223372036854775807L, 0L);
        this.s = bdmVar;
        this.o = aewzVar;
    }

    @Override // defpackage.bfv
    public final void a() {
        this.q = true;
    }

    @Override // defpackage.bfv
    public final void b() {
        afic aficVar = afic.ABR;
        String.valueOf(this.h.c);
        ath b = this.f.b(this.p);
        try {
            bgh bghVar = this.m;
            bid bidVar = new bid(bghVar, b.g, bghVar.h(b));
            if (this.p == 0) {
                this.s.b(new bdo() { // from class: aexo
                    @Override // defpackage.bdo
                    public final bjc a(int i, int i2) {
                        aexp aexpVar = aexp.this;
                        aexpVar.o.a(aexpVar.d().a(i, i2));
                        return aexpVar.o;
                    }
                }, -9223372036854775807L, -9223372036854775807L);
            }
            do {
                try {
                    if (this.q) {
                        break;
                    }
                } finally {
                    this.p = bidVar.c - this.f.g;
                }
            } while (this.s.d(bidVar));
            this.m.j();
            this.r = !this.q;
        } catch (Throwable th) {
            this.m.j();
            throw th;
        }
    }

    @Override // defpackage.bdu
    public final long f() {
        return -1L;
    }

    @Override // defpackage.bdu
    public final boolean h() {
        return this.r;
    }
}
