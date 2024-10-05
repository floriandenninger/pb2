package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azcg implements aypt, ayqx {
    final aypt a;
    final ayrs b;
    ayqx c;

    public azcg(aypt ayptVar, ayrs ayrsVar) {
        this.a = ayptVar;
        this.b = ayrsVar;
    }

    @Override // defpackage.aypt
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.c.e();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.c.qc();
    }

    @Override // defpackage.aypt
    public final void sc(Object obj) {
        this.a.sc(obj);
        try {
            this.b.a(obj);
        } catch (Throwable th) {
            aynu.c(th);
            aynu.j(th);
        }
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
        this.a.sh();
    }
}
