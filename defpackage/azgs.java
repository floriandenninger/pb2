package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azgs implements ayqd, ayqx {
    final ayqd a;
    final ayrs b;
    final ayrs c;
    final ayrm d;
    ayqx e;
    boolean f;

    public azgs(ayqd ayqdVar, ayrs ayrsVar, ayrs ayrsVar2, ayrm ayrmVar) {
        this.a = ayqdVar;
        this.b = ayrsVar;
        this.c = ayrsVar2;
        this.d = ayrmVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        if (this.f) {
            aynu.j(th);
            return;
        }
        this.f = true;
        try {
            this.c.a(th);
        } catch (Throwable th2) {
            aynu.c(th2);
            th = new ayrf(th, th2);
        }
        this.a.b(th);
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        if (this.f) {
            return;
        }
        try {
            this.b.a(obj);
            this.a.c(obj);
        } catch (Throwable th) {
            aynu.c(th);
            this.e.qc();
            b(th);
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.e.e();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.e.qc();
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.e, ayqxVar)) {
            this.e = ayqxVar;
            this.a.se(this);
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        if (this.f) {
            return;
        }
        try {
            this.d.a();
            this.f = true;
            this.a.sh();
        } catch (Throwable th) {
            aynu.c(th);
            b(th);
        }
    }
}
