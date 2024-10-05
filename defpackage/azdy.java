package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azdy extends AtomicReference implements aypt, ayqx {
    private static final long serialVersionUID = -2223459372976438024L;
    final aypt a;
    final aypv b;

    public azdy(aypt ayptVar, aypv aypvVar) {
        this.a = ayptVar;
        this.b = aypvVar;
    }

    @Override // defpackage.aypt
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return ayrz.d((ayqx) get());
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrz.c(this);
    }

    @Override // defpackage.aypt
    public final void sc(Object obj) {
        this.a.sc(obj);
    }

    @Override // defpackage.aypt
    public final void se(ayqx ayqxVar) {
        if (ayrz.g(this, ayqxVar)) {
            this.a.se(this);
        }
    }

    @Override // defpackage.aypt
    public final void sh() {
        ayqx ayqxVar = (ayqx) get();
        if (ayqxVar == ayrz.a || !compareAndSet(ayqxVar, null)) {
            return;
        }
        this.b.Y(new azdo(this.a, this, 2));
    }
}
