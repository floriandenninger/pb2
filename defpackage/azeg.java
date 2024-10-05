package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azeg extends ayto implements aypt {
    private static final long serialVersionUID = 7603343402964826922L;
    ayqx c;

    public azeg(ayqd ayqdVar) {
        super(ayqdVar);
    }

    @Override // defpackage.aypt
    public final void b(Throwable th) {
        g(th);
    }

    @Override // defpackage.ayto, defpackage.ayqx
    public final void qc() {
        super.qc();
        this.c.qc();
    }

    @Override // defpackage.aypt
    public final void sc(Object obj) {
        f(obj);
    }

    @Override // defpackage.aypt
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.c, ayqxVar)) {
            this.c = ayqxVar;
            this.a.se(this);
        }
    }

    @Override // defpackage.aypt
    public final void sh() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.a.sh();
    }
}
