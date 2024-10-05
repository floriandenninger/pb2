package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class shz implements Runnable {
    final Runnable a = this;
    final /* synthetic */ Runnable b;
    final /* synthetic */ SettableFuture c;
    final /* synthetic */ sib d;
    final /* synthetic */ long e;
    final /* synthetic */ TimeUnit f;
    final /* synthetic */ sid g;

    public shz(sid sidVar, Runnable runnable, SettableFuture settableFuture, sib sibVar, long j, TimeUnit timeUnit) {
        this.g = sidVar;
        this.b = runnable;
        this.c = settableFuture;
        this.d = sibVar;
        this.e = j;
        this.f = timeUnit;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sid sidVar = this.g;
        final Runnable runnable = this.b;
        final SettableFuture settableFuture = this.c;
        final sib sibVar = this.d;
        final long j = this.e;
        final TimeUnit timeUnit = this.f;
        sidVar.execute(new Runnable() { // from class: shy
            @Override // java.lang.Runnable
            public final void run() {
                shz shzVar = shz.this;
                Runnable runnable2 = runnable;
                SettableFuture settableFuture2 = settableFuture;
                sib sibVar2 = sibVar;
                long j2 = j;
                TimeUnit timeUnit2 = timeUnit;
                try {
                    runnable2.run();
                    if (settableFuture2.isDone()) {
                        return;
                    }
                    ania schedule = shzVar.g.a.schedule(shzVar.a, j2, timeUnit2);
                    sibVar2.a = schedule;
                    if (sibVar2.isDone()) {
                        schedule.cancel(false);
                    }
                } catch (Throwable th) {
                    settableFuture2.e(th);
                }
            }
        });
    }
}
