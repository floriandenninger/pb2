package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class siv extends anfm implements Runnable, ania {
    final /* synthetic */ siw a;
    private Callable b;
    private final long c;

    public siv(siw siwVar, Callable callable, long j) {
        this.a = siwVar;
        this.b = callable;
        this.c = j;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Delayed delayed) {
        return siw.a(this, delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return Math.max(0L, TimeUnit.MILLISECONDS.convert(this.c - this.a.a.d(), timeUnit));
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isDone()) {
            return;
        }
        try {
            Callable callable = this.b;
            this.b = null;
            o(callable.call());
        } catch (Throwable th) {
            e(th);
            throw new RuntimeException(th);
        }
    }
}
