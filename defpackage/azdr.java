package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azdr implements aypt, ayqx {
    final aypt a;
    final ayrv b;
    ayqx c;
    private final /* synthetic */ int d;

    public azdr(aypt ayptVar, ayrv ayrvVar, int i) {
        this.d = i;
        this.a = ayptVar;
        this.b = ayrvVar;
    }

    @Override // defpackage.aypt
    public final void b(Throwable th) {
        if (this.d == 0) {
            try {
                Object a = this.b.a(th);
                aysw.b(a, "The valueSupplier returned a null value");
                this.a.sc(a);
                return;
            } catch (Throwable th2) {
                aynu.c(th2);
                this.a.b(new ayrf(th, th2));
                return;
            }
        }
        this.a.b(th);
    }

    @Override // defpackage.aypt
    public final void sc(Object obj) {
        if (this.d != 0) {
            try {
                Object a = this.b.a(obj);
                aysw.b(a, "The mapper returned a null item");
                this.a.sc(a);
                return;
            } catch (Throwable th) {
                aynu.c(th);
                this.a.b(th);
                return;
            }
        }
        this.a.sc(obj);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.d != 0 ? this.c.e() : this.c.e();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        if (this.d == 0) {
            this.c.qc();
            return;
        }
        ayqx ayqxVar = this.c;
        this.c = ayrz.a;
        ayqxVar.qc();
    }

    @Override // defpackage.aypt
    public final void sh() {
        if (this.d != 0) {
            this.a.sh();
        } else {
            this.a.sh();
        }
    }

    @Override // defpackage.aypt
    public final void se(ayqx ayqxVar) {
        if (this.d != 0) {
            if (ayrz.h(this.c, ayqxVar)) {
                this.c = ayqxVar;
                this.a.se(this);
                return;
            }
            return;
        }
        if (ayrz.h(this.c, ayqxVar)) {
            this.c = ayqxVar;
            this.a.se(this);
        }
    }
}
