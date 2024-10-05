package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bcr extends bar implements bcj {
    public final pnd d;
    private final pnc e;
    private final atd f;
    private final ayr g;
    private final bfs h;
    private final int i;
    private boolean j;
    private long k;
    private boolean l;
    private boolean m;
    private att n;
    private final bcp o;

    public bcr(pnd pndVar, atd atdVar, bcp bcpVar, ayr ayrVar, bfs bfsVar, int i) {
        pnc pncVar = pndVar.b;
        pse.c(pncVar);
        this.e = pncVar;
        this.d = pndVar;
        this.f = atdVar;
        this.o = bcpVar;
        this.g = ayrVar;
        this.h = bfsVar;
        this.i = i;
        this.j = true;
        this.k = -9223372036854775807L;
    }

    private final void t() {
        pou bdfVar = new bdf(this.k, this.l, this.m, this.d);
        if (this.j) {
            bdfVar = new bco(bdfVar);
        }
        rw(bdfVar);
    }

    @Override // defpackage.bcj
    public final void a(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.k;
        }
        if (!this.j && this.k == j && this.l == z && this.m == z2) {
            return;
        }
        this.k = j;
        this.l = z;
        this.m = z2;
        this.j = false;
        t();
    }

    @Override // defpackage.bar
    protected final void k() {
        this.g.d();
    }

    @Override // defpackage.bbr
    public final pnd r() {
        return this.d;
    }

    @Override // defpackage.bar
    protected final void rq(att attVar) {
        this.n = attVar;
        this.g.c();
        t();
    }

    @Override // defpackage.bbr
    public final void s() {
    }

    @Override // defpackage.bbr
    public final void u(bbp bbpVar) {
        bcn bcnVar = (bcn) bbpVar;
        if (bcnVar.l) {
            for (bcx bcxVar : bcnVar.k) {
                bcxVar.p();
            }
        }
        bcnVar.e.d(bcnVar);
        bcnVar.h.removeCallbacksAndMessages(null);
        bcnVar.i = null;
        bcnVar.s = true;
    }

    @Override // defpackage.bbr
    public final bbp v(ash ashVar, bfg bfgVar, long j) {
        ate a = this.f.a();
        att attVar = this.n;
        if (attVar != null) {
            a.b(attVar);
        }
        return new bcn(this.e.a, a, new bat(this.o.a), this.g, q(ashVar), this.h, n(ashVar), this, bfgVar, this.i, null);
    }
}
