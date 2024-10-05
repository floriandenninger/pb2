package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azor extends ayqh implements Runnable {
    final Executor a;
    volatile boolean c;
    final AtomicInteger d = new AtomicInteger();
    final ayqw e = new ayqw();
    final azof b = new azof();

    public azor(Executor executor) {
        this.a = executor;
    }

    @Override // defpackage.ayqh
    public final ayqx a(Runnable runnable) {
        if (this.c) {
            return aysa.INSTANCE;
        }
        aynu.k(runnable);
        azop azopVar = new azop(runnable);
        this.b.k(azopVar);
        if (this.d.getAndIncrement() == 0) {
            try {
                this.a.execute(this);
            } catch (RejectedExecutionException e) {
                this.c = true;
                this.b.d();
                aynu.j(e);
                return aysa.INSTANCE;
            }
        }
        return azopVar;
    }

    @Override // defpackage.ayqh
    public final ayqx c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (j <= 0) {
            return a(runnable);
        }
        if (this.c) {
            return aysa.INSTANCE;
        }
        aysd aysdVar = new aysd();
        aysd aysdVar2 = new aysd(aysdVar);
        aynu.k(runnable);
        azpe azpeVar = new azpe(new azoq(this, aysdVar2, runnable), this.e);
        this.e.d(azpeVar);
        Executor executor = this.a;
        if (executor instanceof ScheduledExecutorService) {
            try {
                azpeVar.a(((ScheduledExecutorService) executor).schedule((Callable) azpeVar, j, timeUnit));
            } catch (RejectedExecutionException e) {
                this.c = true;
                aynu.j(e);
                return aysa.INSTANCE;
            }
        } else {
            azpeVar.a(new azom(azos.b.c(azpeVar, j, timeUnit)));
        }
        ayrz.i(aysdVar, azpeVar);
        return aysdVar2;
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.c;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.e.qc();
        if (this.d.getAndIncrement() == 0) {
            this.b.d();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        azof azofVar = this.b;
        int i = 1;
        while (!this.c) {
            do {
                Runnable runnable = (Runnable) azofVar.sg();
                if (runnable != null) {
                    runnable.run();
                } else if (!this.c) {
                    i = this.d.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    azofVar.d();
                    return;
                }
            } while (!this.c);
            azofVar.d();
            return;
        }
        azofVar.d();
    }
}
