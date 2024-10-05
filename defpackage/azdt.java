package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azdt implements aypt, ayqx {
    final aypt a;
    final azdu b;
    ayqx c;

    public azdt(aypt ayptVar, azdu azduVar) {
        this.a = ayptVar;
        this.b = azduVar;
    }

    @Override // defpackage.aypt
    public final void b(Throwable th) {
        if (this.c == ayrz.a) {
            aynu.j(th);
        } else {
            c(th);
        }
    }

    final void c(Throwable th) {
        try {
            this.b.c.a(th);
        } catch (Throwable th2) {
            aynu.c(th2);
            th = new ayrf(th, th2);
        }
        this.c = ayrz.a;
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
        if (this.c == ayrz.a) {
            return;
        }
        try {
            this.b.b.a(obj);
            this.c = ayrz.a;
            this.a.sc(obj);
        } catch (Throwable th) {
            aynu.c(th);
            c(th);
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
        if (this.c == ayrz.a) {
            return;
        }
        try {
            this.b.d.a();
            this.c = ayrz.a;
            this.a.sh();
        } catch (Throwable th) {
            aynu.c(th);
            c(th);
        }
    }
}
