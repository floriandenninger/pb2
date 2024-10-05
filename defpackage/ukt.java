package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ukt implements ukk {
    public final amnv a;
    public final AtomicReference b = new AtomicReference();
    private final anib c;

    public ukt(ExecutorService executorService, amnv amnvVar) {
        this.c = anaf.C(executorService);
        this.a = amkq.x(amnvVar);
    }

    private final anhy g(final amml ammlVar) {
        if (this.b.get() != null) {
            return (anhy) ammlVar.apply((ukk) this.b.get());
        }
        final amnv amnvVar = this.a;
        amnvVar.getClass();
        return amka.c(amkq.l(new Callable() { // from class: uks
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (ukk) amnv.this.get();
            }
        }, this.c)).i(new anfz() { // from class: ukp
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                ukt uktVar = ukt.this;
                amml ammlVar2 = ammlVar;
                ukk ukkVar = (ukk) obj;
                uktVar.b.set(ukkVar);
                return (anhy) ammlVar2.apply(ukkVar);
            }
        }, angq.a);
    }

    private final void h(final Runnable runnable) {
        if (this.b.get() != null) {
            runnable.run();
        } else {
            this.c.execute(amjk.f(new Runnable() { // from class: ukr
                @Override // java.lang.Runnable
                public final void run() {
                    ukt uktVar = ukt.this;
                    Runnable runnable2 = runnable;
                    uktVar.b.set((ukk) uktVar.a.get());
                    runnable2.run();
                }
            }));
        }
    }

    @Override // defpackage.ukk
    public final anhy a() {
        return g(tur.d);
    }

    @Override // defpackage.ukk
    public final anhy b() {
        return g(tur.e);
    }

    @Override // defpackage.ukk
    public final void c(ufi ufiVar) {
        h(new ukq(this, ufiVar, 1));
    }

    @Override // defpackage.ukk
    public final void d(ufi ufiVar) {
        h(new ukq(this, ufiVar, 0));
    }

    @Override // defpackage.ukk
    public final anhy e(String str, int i) {
        return g(new uko(str, i, 1));
    }

    @Override // defpackage.ukk
    public final anhy f(String str, int i) {
        return g(new uko(str, i, 0));
    }
}
