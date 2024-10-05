package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bca implements bbp, bbo {
    public final bbp a;
    private final long b;
    private bbo c;

    public bca(bbp bbpVar, long j) {
        this.a = bbpVar;
        this.b = j;
    }

    @Override // defpackage.bbp
    public final long a(long j, poi poiVar) {
        return this.a.a(j - this.b, poiVar) + this.b;
    }

    @Override // defpackage.bbp, defpackage.bda
    public final long c() {
        long c = this.a.c();
        if (c == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return c + this.b;
    }

    @Override // defpackage.bbp
    public final long d() {
        long d = this.a.d();
        if (d == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return d + this.b;
    }

    @Override // defpackage.bbp
    public final long e(long j) {
        return this.a.e(j - this.b) + this.b;
    }

    @Override // defpackage.bbp
    public final long f(bel[] belVarArr, boolean[] zArr, bcy[] bcyVarArr, boolean[] zArr2, long j) {
        bcy[] bcyVarArr2 = new bcy[bcyVarArr.length];
        int i = 0;
        while (true) {
            bcy bcyVar = null;
            if (i >= bcyVarArr.length) {
                break;
            }
            bcb bcbVar = (bcb) bcyVarArr[i];
            if (bcbVar != null) {
                bcyVar = bcbVar.a;
            }
            bcyVarArr2[i] = bcyVar;
            i++;
        }
        long f = this.a.f(belVarArr, zArr, bcyVarArr2, zArr2, j - this.b);
        for (int i2 = 0; i2 < bcyVarArr.length; i2++) {
            bcy bcyVar2 = bcyVarArr2[i2];
            if (bcyVar2 == null) {
                bcyVarArr[i2] = null;
            } else {
                bcy bcyVar3 = bcyVarArr[i2];
                if (bcyVar3 == null || ((bcb) bcyVar3).a != bcyVar2) {
                    bcyVarArr[i2] = new bcb(bcyVar2, this.b);
                }
            }
        }
        return f + this.b;
    }

    @Override // defpackage.bbp
    public final asj g() {
        return this.a.g();
    }

    @Override // defpackage.bbp
    public final void h(long j, boolean z) {
        this.a.h(j - this.b, z);
    }

    @Override // defpackage.bbp
    public final void i() {
        this.a.i();
    }

    @Override // defpackage.bcz
    public final /* bridge */ /* synthetic */ void j(bda bdaVar) {
        bbo bboVar = this.c;
        pse.c(bboVar);
        bboVar.j(this);
    }

    @Override // defpackage.bbp, defpackage.bda
    public final long jJ() {
        long jJ = this.a.jJ();
        if (jJ == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jJ + this.b;
    }

    @Override // defpackage.bbo
    public final void k(bbp bbpVar) {
        bbo bboVar = this.c;
        pse.c(bboVar);
        bboVar.k(this);
    }

    @Override // defpackage.bbp
    public final void l(bbo bboVar, long j) {
        this.c = bboVar;
        this.a.l(this, j - this.b);
    }

    @Override // defpackage.bbp, defpackage.bda
    public final void m(long j) {
        this.a.m(j - this.b);
    }

    @Override // defpackage.bbp, defpackage.bda
    public final boolean o(long j) {
        return this.a.o(j - this.b);
    }

    @Override // defpackage.bbp, defpackage.bda
    public final boolean p() {
        return this.a.p();
    }
}
