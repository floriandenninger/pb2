package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class anhd extends anht {
    private final anhy a;

    public anhd(anhy anhyVar) {
        anhyVar.getClass();
        this.a = anhyVar;
    }

    @Override // defpackage.anfm, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // defpackage.anfm, defpackage.anhy
    public final void d(Runnable runnable, Executor executor) {
        this.a.d(runnable, executor);
    }

    @Override // defpackage.anfm, java.util.concurrent.Future
    public final Object get() {
        return this.a.get();
    }

    @Override // defpackage.anfm, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // defpackage.anfm, java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // defpackage.anfm
    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.anfm, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }
}
