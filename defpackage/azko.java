package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azko implements ayqd, ayqx {
    final ayqd a;
    boolean b;
    ayqx c;
    long d;

    public azko(ayqd ayqdVar, long j) {
        this.a = ayqdVar;
        this.d = j;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        if (this.b) {
            aynu.j(th);
            return;
        }
        this.b = true;
        this.c.qc();
        this.a.b(th);
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        if (this.b) {
            return;
        }
        long j = this.d;
        long j2 = (-1) + j;
        this.d = j2;
        if (j > 0) {
            this.a.c(obj);
            if (j2 == 0) {
                sh();
            }
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.c.e();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.c.qc();
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.c, ayqxVar)) {
            this.c = ayqxVar;
            if (this.d == 0) {
                this.b = true;
                ayqxVar.qc();
                aysa.f(this.a);
                return;
            }
            this.a.se(this);
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.c.qc();
        this.a.sh();
    }
}
