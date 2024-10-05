package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aytg implements ayqd, ayta {
    protected final ayqd a;
    protected ayqx b;
    protected ayta c;
    protected boolean d;
    protected int e;

    public aytg(ayqd ayqdVar) {
        this.a = ayqdVar;
    }

    @Override // defpackage.ayqd
    public void b(Throwable th) {
        if (this.d) {
            aynu.j(th);
        } else {
            this.d = true;
            this.a.b(th);
        }
    }

    @Override // defpackage.aytf
    public void d() {
        this.c.d();
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.b.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int f(int i) {
        ayta aytaVar = this.c;
        if (aytaVar == null || (i & 4) != 0) {
            return 0;
        }
        int sf = aytaVar.sf(i);
        if (sf != 0) {
            this.e = sf;
        }
        return sf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g(Throwable th) {
        aynu.c(th);
        this.b.qc();
        b(th);
    }

    @Override // defpackage.aytf
    public final boolean j() {
        return this.c.j();
    }

    @Override // defpackage.aytf
    public final boolean k(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.b.qc();
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.b, ayqxVar)) {
            this.b = ayqxVar;
            if (ayqxVar instanceof ayta) {
                this.c = (ayta) ayqxVar;
            }
            this.a.se(this);
        }
    }

    @Override // defpackage.ayqd
    public void sh() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.sh();
    }
}
