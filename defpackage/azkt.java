package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azkt implements ayqd, ayqx {
    final ayqd a;
    final ayrw b;
    ayqx c;
    boolean d;

    public azkt(ayqd ayqdVar, ayrw ayrwVar) {
        this.a = ayqdVar;
        this.b = ayrwVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        if (this.d) {
            aynu.j(th);
        } else {
            this.d = true;
            this.a.b(th);
        }
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        if (this.d) {
            return;
        }
        this.a.c(obj);
        try {
            if (this.b.a(obj)) {
                this.d = true;
                this.c.qc();
                this.a.sh();
            }
        } catch (Throwable th) {
            aynu.c(th);
            this.c.qc();
            b(th);
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
            this.a.se(this);
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.sh();
    }
}
