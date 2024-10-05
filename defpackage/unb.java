package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class unb implements Executor {
    public static final amxj a = amxj.l("com/google/android/libraries/performance/primes/DeferrableExecutor");
    public final anic b;
    private final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    private volatile boolean d = false;
    private final AtomicBoolean e = new AtomicBoolean();

    public unb(anic anicVar, uok uokVar) {
        this.b = anicVar;
        unj unjVar = new unj(uokVar);
        uokVar.a(unjVar);
        unjVar.execute(new Runnable() { // from class: umz
            @Override // java.lang.Runnable
            public final void run() {
                unb unbVar = unb.this;
                unbVar.b.schedule(new una(unbVar, 0), 3000L, TimeUnit.MILLISECONDS);
            }
        });
    }

    private final void b() {
        while (true) {
            Runnable runnable = (Runnable) this.c.poll();
            if (runnable == null) {
                return;
            } else {
                this.b.execute(runnable);
            }
        }
    }

    public final void a() {
        this.d = true;
        b();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.d) {
            this.b.execute(runnable);
            return;
        }
        this.c.add(runnable);
        if (this.d) {
            b();
        } else {
            if (this.e.getAndSet(true)) {
                return;
            }
            this.b.schedule(new una(this, 1), 7000L, TimeUnit.MILLISECONDS);
        }
    }
}
