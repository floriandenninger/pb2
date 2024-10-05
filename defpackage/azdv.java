package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azdv extends AtomicReference implements aypt, ayqx {
    private static final long serialVersionUID = 8571289934935992137L;
    final aysd a = new aysd();
    final aypt b;

    public azdv(aypt ayptVar) {
        this.b = ayptVar;
    }

    @Override // defpackage.aypt
    public final void b(Throwable th) {
        this.b.b(th);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return ayrz.d((ayqx) get());
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrz.c(this);
        ayrz.c(this.a);
    }

    @Override // defpackage.aypt
    public final void sc(Object obj) {
        this.b.sc(obj);
    }

    @Override // defpackage.aypt
    public final void se(ayqx ayqxVar) {
        ayrz.g(this, ayqxVar);
    }

    @Override // defpackage.aypt
    public final void sh() {
        this.b.sh();
    }
}
