package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azin extends AtomicReference implements Runnable, ayqx {
    private static final long serialVersionUID = 346773832286157679L;
    final ayqd a;
    long b;

    public azin(ayqd ayqdVar) {
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
        if (get() != ayrz.a) {
            ayqd ayqdVar = this.a;
            long j = this.b;
            this.b = 1 + j;
            ayqdVar.c(Long.valueOf(j));
        }
    }
}
