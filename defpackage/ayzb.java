package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayzb extends ayyz implements aypq {
    private static final long serialVersionUID = -4547113800637756442L;
    final banw m;

    public ayzb(banw banwVar, ayqh ayqhVar, int i) {
        super(ayqhVar, i);
        this.m = banwVar;
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.e, banxVar)) {
            this.e = banxVar;
            if (banxVar instanceof aytc) {
                aytc aytcVar = (aytc) banxVar;
                int sf = aytcVar.sf(7);
                if (sf == 1) {
                    this.j = 1;
                    this.f = aytcVar;
                    this.h = true;
                    this.m.f(this);
                    return;
                }
                if (sf == 2) {
                    this.j = 2;
                    this.f = aytcVar;
                    this.m.f(this);
                    banxVar.sj(this.b);
                    return;
                }
            }
            this.f = new azog(this.b);
            this.m.f(this);
            banxVar.sj(this.b);
        }
    }

    @Override // defpackage.ayyz
    public final void g() {
        banw banwVar = this.m;
        aytf aytfVar = this.f;
        long j = this.k;
        int i = 1;
        while (true) {
            long j2 = this.d.get();
            while (j != j2) {
                boolean z = this.h;
                try {
                    Object sg = aytfVar.sg();
                    boolean z2 = sg == null;
                    if (m(z, z2, banwVar)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    banwVar.c(sg);
                    j++;
                    if (j == this.c) {
                        if (j2 != Long.MAX_VALUE) {
                            j2 = this.d.addAndGet(-j);
                        }
                        this.e.sj(j);
                        j = 0;
                    }
                } catch (Throwable th) {
                    aynu.c(th);
                    this.g = true;
                    this.e.sd();
                    aytfVar.d();
                    banwVar.b(th);
                    this.a.qc();
                    return;
                }
            }
            if (j == j2 && m(this.h, aytfVar.j(), banwVar)) {
                return;
            }
            int i2 = get();
            if (i == i2) {
                this.k = j;
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                i = i2;
            }
        }
    }

    @Override // defpackage.ayyz
    public final void h() {
        int i = 1;
        while (!this.g) {
            boolean z = this.h;
            this.m.c(null);
            if (!z) {
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                this.g = true;
                Throwable th = this.i;
                if (th != null) {
                    this.m.b(th);
                } else {
                    this.m.sh();
                }
                this.a.qc();
                return;
            }
        }
    }

    @Override // defpackage.ayyz
    public final void i() {
        banw banwVar = this.m;
        aytf aytfVar = this.f;
        long j = this.k;
        int i = 1;
        while (true) {
            long j2 = this.d.get();
            while (j != j2) {
                try {
                    Object sg = aytfVar.sg();
                    if (this.g) {
                        return;
                    }
                    if (sg != null) {
                        banwVar.c(sg);
                        j++;
                    } else {
                        this.g = true;
                        banwVar.sh();
                        this.a.qc();
                        return;
                    }
                } catch (Throwable th) {
                    aynu.c(th);
                    this.g = true;
                    this.e.sd();
                    banwVar.b(th);
                    this.a.qc();
                    return;
                }
            }
            if (this.g) {
                return;
            }
            if (!aytfVar.j()) {
                int i2 = get();
                if (i == i2) {
                    this.k = j;
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    i = i2;
                }
            } else {
                this.g = true;
                banwVar.sh();
                this.a.qc();
                return;
            }
        }
    }

    @Override // defpackage.aytf
    public final Object sg() {
        Object sg = this.f.sg();
        if (sg != null && this.j != 1) {
            long j = this.k + 1;
            if (j == this.c) {
                this.k = 0L;
                this.e.sj(j);
            } else {
                this.k = j;
            }
        }
        return sg;
    }
}
