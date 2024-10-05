package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayvl extends AtomicReference implements Runnable, ayqx {
    private static final long serialVersionUID = 3167244060586201109L;
    final aypi a;

    public ayvl(aypi aypiVar) {
        this.a = aypiVar;
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return ayrz.d((ayqx) get());
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrz.c(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.sh();
    }
}
