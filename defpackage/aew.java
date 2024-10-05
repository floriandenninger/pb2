package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aew implements anhy {
    final WeakReference a;
    public final aer b = new aev(this);

    public aew(aes aesVar) {
        this.a = new WeakReference(aesVar);
    }

    public final boolean a(Throwable th) {
        aer aerVar = this.b;
        aer.g(th);
        if (!aer.b.d(aerVar, null, new ael(th))) {
            return false;
        }
        aer.e(aerVar);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        aes aesVar = (aes) this.a.get();
        boolean cancel = this.b.cancel(z);
        if (!cancel || aesVar == null) {
            return cancel;
        }
        aesVar.a = null;
        aesVar.b = null;
        aesVar.c.f(null);
        return true;
    }

    @Override // defpackage.anhy
    public final void d(Runnable runnable, Executor executor) {
        this.b.d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
