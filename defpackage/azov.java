package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azov extends ayqh {
    final AtomicBoolean a = new AtomicBoolean();
    private final ayqw b = new ayqw();
    private final azou c;
    private final azow d;

    public azov(azou azouVar) {
        azow azowVar;
        this.c = azouVar;
        if (azouVar.c.b) {
            azowVar = azox.d;
            this.d = azowVar;
        }
        while (true) {
            if (!azouVar.b.isEmpty()) {
                azowVar = (azow) azouVar.b.poll();
                if (azowVar != null) {
                    break;
                }
            } else {
                azowVar = new azow(azouVar.d);
                azouVar.c.d(azowVar);
                break;
            }
        }
        this.d = azowVar;
    }

    @Override // defpackage.ayqh
    public final ayqx c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.b.b ? aysa.INSTANCE : this.d.i(runnable, j, timeUnit, this.b);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.a.get();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        if (this.a.compareAndSet(false, true)) {
            this.b.qc();
            azou azouVar = this.c;
            azow azowVar = this.d;
            azowVar.a = System.nanoTime() + azouVar.a;
            azouVar.b.offer(azowVar);
        }
    }
}
