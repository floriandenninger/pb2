package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aznz extends ayto implements ayqk {
    private static final long serialVersionUID = 3786543492451018833L;
    ayqx c;

    public aznz(ayqd ayqdVar) {
        super(ayqdVar);
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        g(th);
    }

    @Override // defpackage.ayto, defpackage.ayqx
    public final void qc() {
        super.qc();
        this.c.qc();
    }

    @Override // defpackage.ayqk, defpackage.aypt
    public final void sc(Object obj) {
        f(obj);
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.c, ayqxVar)) {
            this.c = ayqxVar;
            this.a.se(this);
        }
    }
}
