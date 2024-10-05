package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amlq implements Runnable {
    final /* synthetic */ SettableFuture a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ AtomicReference c;
    final /* synthetic */ anic d;
    final /* synthetic */ long e;
    final /* synthetic */ long f;
    final /* synthetic */ shf g;

    public amlq(SettableFuture settableFuture, Runnable runnable, AtomicReference atomicReference, anic anicVar, long j, long j2, shf shfVar) {
        this.a = settableFuture;
        this.b = runnable;
        this.c = atomicReference;
        this.d = anicVar;
        this.e = j;
        this.f = j2;
        this.g = shfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.a.isDone()) {
                return;
            }
            this.b.run();
            SettableFuture f = SettableFuture.f();
            this.c.set(f);
            if (this.a.isDone()) {
                return;
            }
            anic anicVar = this.d;
            long j = this.e;
            long j2 = this.f;
            long d = this.g.d();
            f.qK(anicVar.schedule(this, d < j ? (j + j2) - d : j2 - ((d - j) % j2), TimeUnit.MILLISECONDS));
        } catch (Throwable th) {
            this.a.e(th);
        }
    }

    public final String toString() {
        return this.b.toString();
    }
}
