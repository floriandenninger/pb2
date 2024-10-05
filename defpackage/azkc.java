package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azkc implements ayqd, ayqx {
    final ayqk a;
    final Object b;
    ayqx c;
    Object d;
    boolean e;

    public azkc(ayqk ayqkVar, Object obj) {
        this.a = ayqkVar;
        this.b = obj;
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
        if (this.d == null) {
            this.d = obj;
            return;
        }
        this.e = true;
        this.c.qc();
        this.a.b(new IllegalArgumentException("Sequence contains more than one element!"));
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
        if (this.e) {
            return;
        }
        this.e = true;
        Object obj = this.d;
        this.d = null;
        if (obj == null) {
            obj = this.b;
        }
        this.a.sc(obj);
    }
}
