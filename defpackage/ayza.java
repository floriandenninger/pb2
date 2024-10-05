package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayza extends ayyz {
    private static final long serialVersionUID = 644624475404284533L;
    final aysx m;
    long n;

    public ayza(aysx aysxVar, ayqh ayqhVar, int i) {
        super(ayqhVar, i);
        this.m = aysxVar;
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
        aysx aysxVar = this.m;
        aytf aytfVar = this.f;
        long j = this.k;
        long j2 = this.n;
        int i = 1;
        while (true) {
            long j3 = this.d.get();
            while (j != j3) {
                boolean z = this.h;
                try {
                    Object sg = aytfVar.sg();
                    boolean z2 = sg == null;
                    if (m(z, z2, aysxVar)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    if (aysxVar.e(sg)) {
                        j++;
                    }
                    j2++;
                    if (j2 == this.c) {
                        this.e.sj(j2);
                        j2 = 0;
                    }
                } catch (Throwable th) {
                    aynu.c(th);
                    this.g = true;
                    this.e.sd();
                    aytfVar.d();
                    aysxVar.b(th);
                    this.a.qc();
                    return;
                }
            }
            if (j == j3 && m(this.h, aytfVar.j(), aysxVar)) {
                return;
            }
            int i2 = get();
            if (i == i2) {
                this.k = j;
                this.n = j2;
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
        aysx aysxVar = this.m;
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
                        if (aysxVar.e(sg)) {
                            j++;
                        }
                    } else {
                        this.g = true;
                        aysxVar.sh();
                        this.a.qc();
                        return;
                    }
                } catch (Throwable th) {
                    aynu.c(th);
                    this.g = true;
                    this.e.sd();
                    aysxVar.b(th);
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
                aysxVar.sh();
                this.a.qc();
                return;
            }
        }
    }

    @Override // defpackage.aytf
    public final Object sg() {
        Object sg = this.f.sg();
        if (sg != null && this.j != 1) {
            long j = this.n + 1;
            if (j == this.c) {
                this.n = 0L;
                this.e.sj(j);
            } else {
                this.n = j;
            }
        }
        return sg;
    }
}
