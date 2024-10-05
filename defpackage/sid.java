package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sid extends anhg implements anic {
    public static final /* synthetic */ int b = 0;
    public final anic a;
    private final anib c;

    private sid(anib anibVar, anic anicVar) {
        this.c = anibVar;
        this.a = anicVar;
    }

    public static sid a(anib anibVar, anic anicVar) {
        return new sid(anibVar, anicVar);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: b */
    public final ania schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        anhz b2 = anhz.b(runnable);
        if (j <= 0) {
            return new sic(this.c.submit(runnable), System.nanoTime());
        }
        return new sib(b2, this.a.schedule(new shv(this, b2, 1), j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: c */
    public final ania schedule(Callable callable, long j, TimeUnit timeUnit) {
        if (j <= 0) {
            return new sic(this.c.submit(callable), System.nanoTime());
        }
        anhz a = anhz.a(callable);
        return new sib(a, this.a.schedule(new shv(this, a, 0), j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d */
    public final ania scheduleAtFixedRate(final Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        final Executor E = anaf.E(this);
        final SettableFuture f = SettableFuture.f();
        return new sib(f, this.a.scheduleAtFixedRate(new Runnable() { // from class: shx
            @Override // java.lang.Runnable
            public final void run() {
                Executor executor = E;
                final Runnable runnable2 = runnable;
                final SettableFuture settableFuture = f;
                executor.execute(new Runnable() { // from class: shw
                    @Override // java.lang.Runnable
                    public final void run() {
                        Runnable runnable3 = runnable2;
                        SettableFuture settableFuture2 = settableFuture;
                        int i = sid.b;
                        try {
                            runnable3.run();
                        } catch (Throwable th) {
                            settableFuture2.e(th);
                        }
                    }
                });
            }
        }, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: e */
    public final ania scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        SettableFuture f = SettableFuture.f();
        sib sibVar = new sib(f, null);
        sibVar.a = this.a.schedule(new shz(this, runnable, f, sibVar, j2, timeUnit), j, timeUnit);
        return sibVar;
    }

    @Override // defpackage.anhg
    public final anib f() {
        return this.c;
    }

    @Override // defpackage.anhc, defpackage.amqt
    public final /* synthetic */ Object g() {
        return this.c;
    }

    @Override // defpackage.anhg, defpackage.anhc
    public final /* synthetic */ ExecutorService h() {
        return this.c;
    }
}
