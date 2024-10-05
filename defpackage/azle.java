package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azle extends AtomicReference implements Runnable, ayqx {
    private static final long serialVersionUID = -2809475196591179431L;
    final ayqd a;

    public azle(ayqd ayqdVar) {
        this.a = ayqdVar;
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return get() == ayrz.a;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrz.c(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (e()) {
            return;
        }
        this.a.c(0L);
        lazySet(aysa.INSTANCE);
        this.a.sh();
    }
}
