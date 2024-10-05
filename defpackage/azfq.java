package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azfq implements ayqd, ayqx {
    final ayqk a;
    final ayrn b;
    final Object c;
    ayqx d;
    boolean e;

    public azfq(ayqk ayqkVar, Object obj, ayrn ayrnVar) {
        this.a = ayqkVar;
        this.b = ayrnVar;
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
            this.b.a(this.c, obj);
        } catch (Throwable th) {
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
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.a.sc(this.c);
    }
}
