package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anzm {
    private static final long e = TimeUnit.HOURS.toSeconds(8);
    public final anys a;
    public final FirebaseMessaging b;
    public final anzk d;
    private final Context f;
    private final anyw g;
    private final ScheduledExecutorService h;
    public final Map c = new adz();
    private boolean i = false;

    public anzm(FirebaseMessaging firebaseMessaging, anyw anywVar, anzk anzkVar, anys anysVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = firebaseMessaging;
        this.g = anywVar;
        this.d = anzkVar;
        this.a = anysVar;
        this.f = context;
        this.h = scheduledExecutorService;
    }

    public static rpt a(final FirebaseMessaging firebaseMessaging, final anyw anywVar, final anys anysVar, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return rqr.a(scheduledExecutorService, new Callable() { // from class: anzl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = context;
                ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
                return new anzm(firebaseMessaging, anywVar, anzk.b(context2, scheduledExecutorService2), anysVar, context2, scheduledExecutorService2);
            }
        });
    }

    public static void c(rpt rptVar) {
        try {
            rqr.e(rptVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            e = e2;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e3);
        } catch (TimeoutException e4) {
            e = e4;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final rpt b(anzj anzjVar) {
        ArrayDeque arrayDeque;
        this.d.c(anzjVar);
        rpv rpvVar = new rpv();
        synchronized (this.c) {
            String str = anzjVar.c;
            if (this.c.containsKey(str)) {
                arrayDeque = (ArrayDeque) this.c.get(str);
            } else {
                ArrayDeque arrayDeque2 = new ArrayDeque();
                this.c.put(str, arrayDeque2);
                arrayDeque = arrayDeque2;
            }
            arrayDeque.add(rpvVar);
        }
        return rpvVar.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(Runnable runnable, long j) {
        this.h.schedule(runnable, j, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(boolean z) {
        this.i = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        if (this.d.a() == null || h()) {
            return;
        }
        g(0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(long j) {
        d(new anzo(this, this.f, this.g, Math.min(Math.max(30L, j + j), e)), j);
        e(true);
    }

    final synchronized boolean h() {
        return this.i;
    }
}
