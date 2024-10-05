package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azjh implements ayqd {
    final azrl a;
    final AtomicReference b;

    public azjh(azrl azrlVar, AtomicReference atomicReference) {
        this.a = azrlVar;
        this.b = atomicReference;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        ayrz.g(this.b, ayqxVar);
    }

    @Override // defpackage.ayqd
    public final void sh() {
        this.a.sh();
    }
}
