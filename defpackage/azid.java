package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azid implements aypm, ayqx {
    final ayqd a;
    final ayro b;
    Object c;
    volatile boolean d;
    boolean e;
    boolean f;

    public azid(ayqd ayqdVar, ayro ayroVar, Object obj) {
        this.a = ayqdVar;
        this.b = ayroVar;
        this.c = obj;
    }

    @Override // defpackage.aypm
    public final void a() {
        throw null;
    }

    @Override // defpackage.aypm
    public final void c(Throwable th) {
        if (this.e) {
            aynu.j(th);
        } else {
            this.e = true;
            this.a.b(th);
        }
    }

    @Override // defpackage.aypm
    public final void d(Object obj) {
        if (this.e) {
            return;
        }
        if (this.f) {
            c(new IllegalStateException("onNext already called in this generate turn"));
        } else if (obj == null) {
            c(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else {
            this.f = true;
            this.a.c(obj);
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.d;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.d = true;
    }
}
