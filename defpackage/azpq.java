package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class azpq implements aypq, aytc {
    protected final banw d;
    protected banx e;
    protected aytc f;
    protected boolean g;
    protected int h;

    public azpq(banw banwVar) {
        this.d = banwVar;
    }

    @Override // defpackage.banw
    public void b(Throwable th) {
        if (this.g) {
            aynu.j(th);
        } else {
            this.g = true;
            this.d.b(th);
        }
    }

    @Override // defpackage.aytf
    public final void d() {
        this.f.d();
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.e, banxVar)) {
            this.e = banxVar;
            if (banxVar instanceof aytc) {
                this.f = (aytc) banxVar;
            }
            this.d.f(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int g(int i) {
        aytc aytcVar = this.f;
        if (aytcVar == null || (i & 4) != 0) {
            return 0;
        }
        int sf = aytcVar.sf(i);
        if (sf != 0) {
            this.h = sf;
        }
        return sf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(Throwable th) {
        aynu.c(th);
        this.e.sd();
        b(th);
    }

    @Override // defpackage.aytf
    public final boolean j() {
        return this.f.j();
    }

    @Override // defpackage.aytf
    public final boolean k(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.banx
    public final void sd() {
        this.e.sd();
    }

    @Override // defpackage.banw
    public void sh() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.d.sh();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        this.e.sj(j);
    }
}
