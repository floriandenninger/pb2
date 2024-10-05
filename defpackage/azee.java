package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azee extends AtomicReference implements aypt, ayqx {
    private static final long serialVersionUID = -2187421758664251153L;
    final aypt a;
    final azed b = new azed(this);

    public azee(aypt ayptVar) {
        this.a = ayptVar;
    }

    @Override // defpackage.aypt
    public final void b(Throwable th) {
        ayrz.c(this.b);
        if (getAndSet(ayrz.a) != ayrz.a) {
            this.a.b(th);
        } else {
            aynu.j(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (ayrz.c(this)) {
            this.a.sh();
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return ayrz.d((ayqx) get());
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrz.c(this);
        ayrz.c(this.b);
    }

    @Override // defpackage.aypt
    public final void sc(Object obj) {
        ayrz.c(this.b);
        if (getAndSet(ayrz.a) != ayrz.a) {
            this.a.sc(obj);
        }
    }

    @Override // defpackage.aypt
    public final void se(ayqx ayqxVar) {
        ayrz.g(this, ayqxVar);
    }

    @Override // defpackage.aypt
    public final void sh() {
        ayrz.c(this.b);
        if (getAndSet(ayrz.a) != ayrz.a) {
            this.a.sh();
        }
    }
}
