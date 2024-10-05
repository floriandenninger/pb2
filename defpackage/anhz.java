package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anhz extends FutureTask implements anhy {
    private final angt a;

    public anhz(Runnable runnable) {
        super(runnable, null);
        this.a = new angt();
    }

    public static anhz a(Callable callable) {
        return new anhz(callable);
    }

    public static anhz b(Runnable runnable) {
        return new anhz(runnable);
    }

    @Override // defpackage.anhy
    public final void d(Runnable runnable, Executor executor) {
        angt angtVar = this.a;
        runnable.getClass();
        executor.getClass();
        synchronized (angtVar) {
            if (!angtVar.b) {
                angtVar.a = new angs(runnable, executor, angtVar.a);
            } else {
                angt.a(runnable, executor);
            }
        }
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        angt angtVar = this.a;
        synchronized (angtVar) {
            if (angtVar.b) {
                return;
            }
            angtVar.b = true;
            angs angsVar = angtVar.a;
            angs angsVar2 = null;
            angtVar.a = null;
            while (angsVar != null) {
                angs angsVar3 = angsVar.c;
                angsVar.c = angsVar2;
                angsVar2 = angsVar;
                angsVar = angsVar3;
            }
            while (angsVar2 != null) {
                angt.a(angsVar2.a, angsVar2.b);
                angsVar2 = angsVar2.c;
            }
        }
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (nanos <= 2147483647999999999L) {
            return super.get(j, timeUnit);
        }
        return super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }

    public anhz(Callable callable) {
        super(callable);
        this.a = new angt();
    }
}
