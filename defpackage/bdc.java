package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bdc implements bbp {
    private static final asj a = new asj(new asi(bde.d));
    private final long b;
    private final ArrayList c = new ArrayList();

    public bdc(long j) {
        this.b = j;
    }

    private final long j(long j) {
        return pts.m(j, 0L, this.b);
    }

    @Override // defpackage.bbp
    public final long a(long j, poi poiVar) {
        return j(j);
    }

    @Override // defpackage.bbp, defpackage.bda
    public final long c() {
        return Long.MIN_VALUE;
    }

    @Override // defpackage.bbp
    public final long d() {
        return -9223372036854775807L;
    }

    @Override // defpackage.bbp
    public final long e(long j) {
        long j2 = j(j);
        for (int i = 0; i < this.c.size(); i++) {
            ((bdd) this.c.get(i)).e(j2);
        }
        return j2;
    }

    @Override // defpackage.bbp
    public final long f(bel[] belVarArr, boolean[] zArr, bcy[] bcyVarArr, boolean[] zArr2, long j) {
        long j2 = j(j);
        for (int i = 0; i < belVarArr.length; i++) {
            bcy bcyVar = bcyVarArr[i];
            if (bcyVar != null && (belVarArr[i] == null || !zArr[i])) {
                this.c.remove(bcyVar);
                bcyVarArr[i] = null;
                bcyVar = null;
            }
            if (bcyVar == null && belVarArr[i] != null) {
                bdd bddVar = new bdd(this.b);
                bddVar.e(j2);
                this.c.add(bddVar);
                bcyVarArr[i] = bddVar;
                zArr2[i] = true;
            }
        }
        return j2;
    }

    @Override // defpackage.bbp
    public final asj g() {
        return a;
    }

    @Override // defpackage.bbp
    public final void h(long j, boolean z) {
    }

    @Override // defpackage.bbp
    public final void i() {
    }

    @Override // defpackage.bbp, defpackage.bda
    public final long jJ() {
        return Long.MIN_VALUE;
    }

    @Override // defpackage.bbp
    public final void l(bbo bboVar, long j) {
        bboVar.k(this);
    }

    @Override // defpackage.bbp, defpackage.bda
    public final void m(long j) {
    }

    @Override // defpackage.bbp, defpackage.bda
    public final boolean o(long j) {
        return false;
    }

    @Override // defpackage.bbp, defpackage.bda
    public final boolean p() {
        return false;
    }
}
