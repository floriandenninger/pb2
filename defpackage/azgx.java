package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azgx implements ayqd, ayqx {
    final aypt a;
    ayqx b;
    long c;
    boolean d;

    public azgx(aypt ayptVar) {
        this.a = ayptVar;
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
        long j = this.c;
        if (j != 0) {
            this.c = j + 1;
            return;
        }
        this.d = true;
        this.b.qc();
        this.a.sc(obj);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.b.e();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.b.qc();
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.b, ayqxVar)) {
            this.b = ayqxVar;
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
