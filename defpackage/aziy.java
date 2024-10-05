package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aziy implements ayqd, ayqx {
    final ayqd a;
    final ayrv b;
    ayqx c;
    private final /* synthetic */ int d;

    public aziy(ayqd ayqdVar, ayrv ayrvVar, int i) {
        this.d = i;
        this.a = ayqdVar;
        this.b = ayrvVar;
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        if (this.d == 0) {
            this.a.c(obj);
            return;
        }
        if (this.c == ayrz.a) {
            return;
        }
        try {
            ayqd ayqdVar = this.a;
            for (Object obj2 : (Iterable) this.b.a(obj)) {
                try {
                    try {
                        aysw.b(obj2, "The iterator returned a null value");
                        ayqdVar.c(obj2);
                    } catch (Throwable th) {
                        aynu.c(th);
                        this.c.qc();
                        b(th);
                        return;
                    }
                } catch (Throwable th2) {
                    aynu.c(th2);
                    this.c.qc();
                    b(th2);
                    return;
                }
            }
        } catch (Throwable th3) {
            aynu.c(th3);
            this.c.qc();
            b(th3);
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.d != 0 ? this.c.e() : this.c.e();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        if (this.d == 0) {
            this.c.qc();
        } else {
            this.c.qc();
            this.c = ayrz.a;
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        if (this.d == 0) {
            this.a.sh();
        } else {
            if (this.c == ayrz.a) {
                return;
            }
            this.c = ayrz.a;
            this.a.sh();
        }
    }

    @Override // defpackage.ayqd
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

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        if (this.d != 0) {
            if (this.c == ayrz.a) {
                aynu.j(th);
                return;
            } else {
                this.c = ayrz.a;
                this.a.b(th);
                return;
            }
        }
        try {
            Object a = this.b.a(th);
            if (a == null) {
                NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                nullPointerException.initCause(th);
                this.a.b(nullPointerException);
            } else {
                this.a.c(a);
                this.a.sh();
            }
        } catch (Throwable th2) {
            aynu.c(th2);
            this.a.b(new ayrf(th, th2));
        }
    }
}
