package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aytq extends AtomicReference implements aypi, ayqx {
    private static final long serialVersionUID = -7545121636549663526L;

    @Override // defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        lazySet(ayrz.a);
        aynu.j(new ayrh(th));
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return get() == ayrz.a;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrz.c(this);
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        ayrz.g(this, ayqxVar);
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void sh() {
        lazySet(ayrz.a);
    }
}
