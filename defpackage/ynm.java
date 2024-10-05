package defpackage;

import com.google.android.libraries.youtube.common.concurrent.YouTubeFutures$LifecycleAwareFutureCallback;
import com.google.android.libraries.youtube.common.concurrent.YouTubeFutures$LifecycleAwareFutureWrapper;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ynm {
    private static final amnv c = amkq.x(gzp.o);
    public static final Executor a = qmq.e;
    private static final ynk d = lra.o;
    public static final ynl b = llr.n;

    public static anhh a(zfi zfiVar) {
        return new ynj(zfiVar);
    }

    public static anhy b(aok aokVar, anhy anhyVar, amml ammlVar) {
        return new YouTubeFutures$LifecycleAwareFutureWrapper(aoe.CREATED, aokVar.getLifecycle(), anhyVar, ammlVar);
    }

    public static anhy c(aok aokVar, anhy anhyVar, amml ammlVar) {
        return new YouTubeFutures$LifecycleAwareFutureWrapper(aoe.RESUMED, aokVar.getLifecycle(), anhyVar, ammlVar);
    }

    public static Object d(Future future, amml ammlVar) {
        try {
            return future.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Exception exc = (Exception) ammlVar.apply(e);
            exc.getClass();
            throw exc;
        } catch (ExecutionException e2) {
            t(e2.getCause(), ammlVar);
            throw new AssertionError();
        }
    }

    public static Object e(Future future, amml ammlVar, long j, TimeUnit timeUnit) {
        try {
            return future.get(j, timeUnit);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Exception exc = (Exception) ammlVar.apply(e);
            exc.getClass();
            throw exc;
        } catch (ExecutionException e2) {
            t(e2.getCause(), ammlVar);
            throw new AssertionError();
        } catch (TimeoutException e3) {
            Exception exc2 = (Exception) ammlVar.apply(e3);
            exc2.getClass();
            throw exc2;
        }
    }

    public static Object f(Future future, Object obj) {
        try {
            return d(future, yml.c);
        } catch (Exception e) {
            zga.d("Failed to get the result of the future.", e);
            return obj;
        }
    }

    public static Object g(Future future, long j, TimeUnit timeUnit, Object obj) {
        try {
            return e(future, yml.c, j, timeUnit);
        } catch (Exception e) {
            zga.d("Failed to get the result of the future.", e);
            return obj;
        }
    }

    public static Object h(Future future, Object obj) {
        try {
            return anaf.W(future);
        } catch (Exception e) {
            zga.d("Failed to get the value of the future.", e);
            return obj;
        }
    }

    public static void i(anhy anhyVar, ynl ynlVar) {
        k(anhyVar, angq.a, d, ynlVar);
    }

    public static void j(anhy anhyVar, Executor executor, ynk ynkVar) {
        k(anhyVar, executor, ynkVar, b);
    }

    public static void k(anhy anhyVar, Executor executor, ynk ynkVar, ynl ynlVar) {
        l(anhyVar, executor, ynkVar, ynlVar, null);
    }

    public static void l(anhy anhyVar, Executor executor, ynk ynkVar, ynl ynlVar, Runnable runnable) {
        anaf.Y(anhyVar, new yni(ynlVar, runnable, ynkVar), executor);
    }

    public static void m(anhy anhyVar, ynk ynkVar) {
        k(anhyVar, angq.a, ynkVar, b);
    }

    public static void n(aok aokVar, anhy anhyVar, zfi zfiVar, zfi zfiVar2) {
        s(aokVar.getLifecycle(), anhyVar, zfiVar, zfiVar2, aoe.CREATED);
    }

    public static void o(aok aokVar, anhy anhyVar, zfi zfiVar, zfi zfiVar2) {
        s(aokVar.getLifecycle(), anhyVar, zfiVar, zfiVar2, aoe.RESUMED);
    }

    public static void p(aok aokVar, anhy anhyVar, zfi zfiVar, zfi zfiVar2) {
        s(aokVar.getLifecycle(), anhyVar, zfiVar, zfiVar2, aoe.STARTED);
    }

    public static /* synthetic */ void q(Runnable runnable) {
        if (yjk.h()) {
            runnable.run();
        } else {
            ((Executor) c.get()).execute(runnable);
        }
    }

    private static void s(aof aofVar, anhy anhyVar, zfi zfiVar, zfi zfiVar2, aoe aoeVar) {
        yjk.f();
        anaf.Y(anhyVar, new YouTubeFutures$LifecycleAwareFutureCallback(aoeVar, aofVar, zfiVar2, zfiVar), a);
    }

    private static void t(Throwable th, amml ammlVar) {
        if (th instanceof Error) {
            throw new angr((Error) th);
        }
        if (th instanceof RuntimeException) {
            throw new aniv(th);
        }
        Exception exc = (Exception) ammlVar.apply(th);
        exc.getClass();
        throw exc;
    }
}
