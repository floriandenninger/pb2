package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aytw implements aypi {
    final AtomicReference a;
    final aypi b;

    public aytw(AtomicReference atomicReference, aypi aypiVar) {
        this.a = atomicReference;
        this.b = aypiVar;
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        this.b.b(th);
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        ayrz.i(this.a, ayqxVar);
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void sh() {
        this.b.sh();
    }
}
