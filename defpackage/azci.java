package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azci implements aypt, ayqx {
    final aypt a;
    final ayrn b;
    ayqx c;

    public azci(aypt ayptVar, ayrn ayrnVar) {
        this.a = ayptVar;
        this.b = ayrnVar;
    }

    @Override // defpackage.aypt
    public final void b(Throwable th) {
        this.c = ayrz.a;
        try {
            this.b.a(null, th);
        } catch (Throwable th2) {
            aynu.c(th2);
            th = new ayrf(th, th2);
        }
        this.a.b(th);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.c.e();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.c.qc();
        this.c = ayrz.a;
    }

    @Override // defpackage.aypt
    public final void sc(Object obj) {
        this.c = ayrz.a;
        try {
            this.b.a(obj, null);
            this.a.sc(obj);
        } catch (Throwable th) {
            aynu.c(th);
            this.a.b(th);
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
        this.c = ayrz.a;
        try {
            this.b.a(null, null);
            this.a.sh();
        } catch (Throwable th) {
            aynu.c(th);
            this.a.b(th);
        }
    }
}
