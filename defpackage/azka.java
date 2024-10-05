package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azka implements ayqd, ayqx {
    final ayqd a;
    final ayro b;
    Object c;
    ayqx d;
    boolean e;

    public azka(ayqd ayqdVar, ayro ayroVar, Object obj) {
        this.a = ayqdVar;
        this.b = ayroVar;
        this.c = obj;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        if (this.e) {
            aynu.j(th);
        } else {
            this.e = true;
            this.a.b(th);
        }
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        if (this.e) {
            return;
        }
        try {
            Object a = this.b.a(this.c, obj);
            aysw.b(a, "The accumulator returned a null value");
            this.c = a;
            this.a.c(a);
        } catch (Throwable th) {
            aynu.c(th);
            this.d.qc();
            b(th);
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.d.e();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.d.qc();
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.d, ayqxVar)) {
            this.d = ayqxVar;
            this.a.se(this);
            this.a.c(this.c);
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.a.sh();
    }
}
