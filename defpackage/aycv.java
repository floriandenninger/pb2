package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class aycv extends axzr {
    @Override // defpackage.axzr
    public void b(String str, Throwable th) {
        f().b(str, th);
    }

    @Override // defpackage.axzr
    public final void c() {
        f().c();
    }

    @Override // defpackage.axzr
    public final void d(int i) {
        f().d(i);
    }

    protected abstract axzr f();

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("delegate", f());
        return Y.toString();
    }
}
