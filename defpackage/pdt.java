package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pdt implements pbz {
    private pdz a;

    @Override // defpackage.pbz
    public final void a(pca pcaVar) {
        pcn pH = pcaVar.pH(0);
        pcaVar.pJ();
        pdz pdzVar = this.a;
        pdzVar.d = pcaVar;
        pdzVar.c = pH;
    }

    @Override // defpackage.pbz
    public final void d() {
        this.a.d();
    }

    @Override // defpackage.pbz
    public final boolean e(pbw pbwVar) {
        try {
            pgx pgxVar = new pgx(new byte[27], 0);
            pdx pdxVar = new pdx();
            if (pdy.c(pbwVar, pdxVar, pgxVar, true) && (pdxVar.a & 2) == 2 && pdxVar.e >= 7) {
                pgxVar.v();
                pbwVar.g(pgxVar.a, 0, 7);
                if (pgxVar.h() != 127 || pgxVar.n() != 1179402563) {
                    pgxVar.v();
                    try {
                        if (opn.p(1, pgxVar, true)) {
                            this.a = new pec();
                        }
                    } catch (oyo unused) {
                    }
                } else {
                    this.a = new pds();
                }
                return true;
            }
            return false;
        } catch (oyo unused2) {
            return false;
        }
    }

    @Override // defpackage.pbz
    public final int f(pbw pbwVar, tfq tfqVar) {
        return this.a.a(pbwVar, tfqVar);
    }
}
