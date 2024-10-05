package defpackage;

import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rgr extends rhg {
    public static final AtomicLong a = new AtomicLong(Long.MIN_VALUE);
    public rgq b;
    public rgq c;
    public final Object d;
    public final Semaphore e;
    public volatile boolean f;
    private final PriorityBlockingQueue g;
    private final BlockingQueue h;
    private final Thread.UncaughtExceptionHandler i;
    private final Thread.UncaughtExceptionHandler j;

    public rgr(rgt rgtVar) {
        super(rgtVar);
        this.d = new Object();
        this.e = new Semaphore(2);
        this.g = new PriorityBlockingQueue();
        this.h = new LinkedBlockingQueue();
        this.i = new rgo(this, "Thread death: Uncaught exception on worker thread");
        this.j = new rgo(this, "Thread death: Uncaught exception on network thread");
    }

    public final Object a(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            aG().g(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                aF().f.a(str.length() != 0 ? "Interrupted waiting for ".concat(str) : new String("Interrupted waiting for "));
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            aF().f.a(str.length() != 0 ? "Timed out waiting for ".concat(str) : new String("Timed out waiting for "));
        }
        return obj;
    }

    public final Future b(Callable callable) {
        j();
        qip.an(callable);
        rgp rgpVar = new rgp(this, callable, false);
        if (Thread.currentThread() == this.b) {
            if (!this.g.isEmpty()) {
                aF().f.a("Callable skipped the worker queue.");
            }
            rgpVar.run();
        } else {
            c(rgpVar);
        }
        return rgpVar;
    }

    public final void c(rgp rgpVar) {
        synchronized (this.d) {
            this.g.add(rgpVar);
            rgq rgqVar = this.b;
            if (rgqVar != null) {
                rgqVar.a();
            } else {
                rgq rgqVar2 = new rgq(this, "Measurement Worker", this.g);
                this.b = rgqVar2;
                rgqVar2.setUncaughtExceptionHandler(this.i);
                this.b.start();
            }
        }
    }

    public final void e(Runnable runnable) {
        j();
        qip.an(runnable);
        rgp rgpVar = new rgp(this, runnable, false, "Task exception on network thread");
        synchronized (this.d) {
            this.h.add(rgpVar);
            rgq rgqVar = this.c;
            if (rgqVar != null) {
                rgqVar.a();
            } else {
                rgq rgqVar2 = new rgq(this, "Measurement Network", this.h);
                this.c = rgqVar2;
                rgqVar2.setUncaughtExceptionHandler(this.j);
                this.c.start();
            }
        }
    }

    @Override // defpackage.rhg
    protected final boolean f() {
        return false;
    }

    public final void g(Runnable runnable) {
        j();
        qip.an(runnable);
        c(new rgp(this, runnable, false, "Task exception on worker thread"));
    }

    public final void h(Runnable runnable) {
        j();
        qip.an(runnable);
        c(new rgp(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean i() {
        return Thread.currentThread() == this.b;
    }

    @Override // defpackage.rhf
    public final void n() {
        if (Thread.currentThread() != this.b) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }
}
