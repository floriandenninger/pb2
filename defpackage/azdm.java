package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azdm implements aypt, ayqx {
    final aypt a;
    final ayrw b;
    ayqx c;
    private final /* synthetic */ int d;

    public azdm(aypt ayptVar, ayrw ayrwVar, int i) {
        this.d = i;
        this.a = ayptVar;
        this.b = ayrwVar;
    }

    @Override // defpackage.aypt
    public final void b(Throwable th) {
        if (this.d == 0) {
            try {
                if (this.b.a(th)) {
                    this.a.sh();
                    return;
                } else {
                    this.a.b(th);
                    return;
                }
            } catch (Throwable th2) {
                aynu.c(th2);
                this.a.b(new ayrf(th, th2));
                return;
            }
        }
        this.a.b(th);
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
    public final void sc(Object obj) {
        if (this.d == 0) {
            this.a.sc(obj);
            return;
        }
        try {
            if (this.b.a(obj)) {
                this.a.sc(obj);
            } else {
                this.a.sh();
            }
        } catch (Throwable th) {
            aynu.c(th);
            this.a.b(th);
        }
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
