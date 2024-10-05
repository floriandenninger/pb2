package defpackage;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azpn extends ayqh implements ayqx {
    volatile boolean c;
    final PriorityBlockingQueue a = new PriorityBlockingQueue();
    private final AtomicInteger d = new AtomicInteger();
    final AtomicInteger b = new AtomicInteger();

    @Override // defpackage.ayqh
    public final ayqx a(Runnable runnable) {
        return g(runnable, f(TimeUnit.MILLISECONDS));
    }

    @Override // defpackage.ayqh
    public final ayqx c(Runnable runnable, long j, TimeUnit timeUnit) {
        long f = f(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
        return g(new azpk(runnable, this, f), f);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.c;
    }

    final ayqx g(Runnable runnable, long j) {
        if (this.c) {
            return aysa.INSTANCE;
        }
        azpl azplVar = new azpl(runnable, Long.valueOf(j), this.b.incrementAndGet());
        this.a.add(azplVar);
        if (this.d.getAndIncrement() == 0) {
            int i = 1;
            while (!this.c) {
                azpl azplVar2 = (azpl) this.a.poll();
                if (azplVar2 == null) {
                    i = this.d.addAndGet(-i);
                    if (i == 0) {
                        return aysa.INSTANCE;
                    }
                } else if (!azplVar2.d) {
                    azplVar2.a.run();
                }
            }
            this.a.clear();
            return aysa.INSTANCE;
        }
        return aynu.f(new azpm(this, azplVar));
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.c = true;
    }
}
