package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azke implements ayqd, ayqx {
    final ayqd a;
    long b;
    ayqx c;

    public azke(ayqd ayqdVar, long j) {
        this.a = ayqdVar;
        this.b = j;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        long j = this.b;
        if (j != 0) {
            this.b = j - 1;
        } else {
            this.a.c(obj);
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
        this.a.sh();
    }
}
