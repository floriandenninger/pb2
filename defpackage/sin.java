package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sin extends AbstractExecutorService {
    public boolean e;
    public final ThreadFactory g;
    public final boolean h;
    public final CountDownLatch i;
    public final siy j;
    private final int k;
    private boolean l;
    private final boolean m;
    private final sim[] n;
    public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();
    public final AtomicInteger b = new AtomicInteger();
    public final AtomicInteger c = new AtomicInteger();
    public final AtomicInteger d = new AtomicInteger();
    public final AtomicBoolean f = new AtomicBoolean();

    public sin(int i, ThreadFactory threadFactory) {
        if (i > 0) {
            this.k = Integer.MAX_VALUE;
            this.g = threadFactory;
            this.h = true;
            this.m = true;
            this.i = new CountDownLatch(i);
            sim[] simVarArr = new sim[i];
            for (int i2 = 0; i2 < i; i2++) {
                simVarArr[i2] = new sim(this, i2);
            }
            this.n = simVarArr;
            this.j = new siy(simVarArr);
            return;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("numThreads must be positive: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    private final void b(boolean z) {
        six sixVar;
        this.l = true;
        siy siyVar = this.j;
        while (true) {
            six sixVar2 = (six) siyVar.c.get();
            if (sixVar2.a == siy.a) {
                return;
            }
            if (sixVar2.a != siy.b || z) {
                sixVar = siyVar.e[0];
            } else {
                sixVar = siyVar.e[sixVar2.b];
            }
            if (siyVar.c.compareAndSet(sixVar2, sixVar)) {
                while (sixVar2.a != siy.b) {
                    sim simVar = siyVar.f[sixVar2.b];
                    Thread thread = simVar.b;
                    simVar.i = 3;
                    if (thread == null) {
                        simVar.a();
                    } else {
                        LockSupport.unpark(thread);
                    }
                    sixVar2 = (six) sixVar2.a;
                }
            }
        }
    }

    public final void a() {
        if (this.m) {
            this.b.decrementAndGet();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.i.await(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i;
        runnable.getClass();
        if (!this.l) {
            if (this.m) {
                if (this.k == Integer.MAX_VALUE) {
                    this.b.incrementAndGet();
                }
                do {
                    i = this.b.get();
                    if (i != this.k) {
                    }
                } while (!this.b.compareAndSet(i, i + 1));
            }
            six sixVar = new six(runnable, -1);
            this.a.add(sixVar);
            siy siyVar = this.j;
            while (true) {
                six sixVar2 = (six) siyVar.c.get();
                if (sixVar2.a == siy.b) {
                    int i2 = sixVar2.b;
                    int min = Math.min(i2 + 1, siyVar.f.length);
                    if (min == i2 || siyVar.c.compareAndSet(sixVar2, siyVar.d[min])) {
                        return;
                    }
                } else if (sixVar2.a != siy.a) {
                    int i3 = sixVar2.b;
                    if (siyVar.c.compareAndSet(sixVar2, (six) sixVar2.a)) {
                        sim simVar = siyVar.f[i3];
                        Thread thread = simVar.b;
                        simVar.i = 1;
                        if (thread != null) {
                            LockSupport.unpark(thread);
                            return;
                        } else {
                            simVar.h.c.incrementAndGet();
                            simVar.b();
                            return;
                        }
                    }
                } else {
                    if (this.a.remove(sixVar)) {
                        a();
                        throw new RejectedExecutionException();
                    }
                    return;
                }
            }
        }
        throw new RejectedExecutionException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return ((six) this.j.c.get()).a == siy.a;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.i.getCount() == 0;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        b(false);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        b(true);
        ArrayList arrayList = new ArrayList();
        if (this.f.compareAndSet(false, true)) {
            while (true) {
                six sixVar = (six) this.a.poll();
                if (sixVar == null) {
                    break;
                }
                a();
                arrayList.add((Runnable) sixVar.a);
            }
            this.e = true;
            for (sim simVar : this.n) {
                Thread thread = simVar.c;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        return arrayList;
    }
}
