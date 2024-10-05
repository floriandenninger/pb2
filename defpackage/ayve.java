package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayve implements aypi, ayqx {
    final aypi a;
    ayqx b;
    final /* synthetic */ ayvf c;

    public ayve(ayvf ayvfVar, aypi aypiVar) {
        this.c = ayvfVar;
        this.a = aypiVar;
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        if (this.b == ayrz.a) {
            aynu.j(th);
            return;
        }
        try {
            this.c.c.a(th);
        } catch (Throwable th2) {
            aynu.c(th2);
            th = new ayrf(th, th2);
        }
        this.a.b(th);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.b.e();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        try {
            this.c.e.a();
        } catch (Throwable th) {
            aynu.c(th);
            aynu.j(th);
        }
        this.b.qc();
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        try {
            this.c.b.a(ayqxVar);
            if (ayrz.h(this.b, ayqxVar)) {
                this.b = ayqxVar;
                this.a.se(this);
            }
        } catch (Throwable th) {
            aynu.c(th);
            ayqxVar.qc();
            this.b = ayrz.a;
            aysa.g(th, this.a);
        }
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void sh() {
        if (this.b == ayrz.a) {
            return;
        }
        try {
            this.c.d.a();
            this.a.sh();
        } catch (Throwable th) {
            aynu.c(th);
            this.a.b(th);
        }
    }
}
