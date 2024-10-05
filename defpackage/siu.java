package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class siu extends anfm implements Runnable, ania {
    final long a;
    final long b;
    final boolean c;
    final AtomicLong d = new AtomicLong(0);
    Runnable e;
    final /* synthetic */ siw f;

    public siu(siw siwVar, Runnable runnable, long j, long j2, boolean z) {
        this.f = siwVar;
        this.e = runnable;
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    private final long f() {
        return Math.max(0L, ((this.d.get() * this.b) + this.a) - this.f.a.d());
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Delayed delayed) {
        return siw.a(this, delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(f(), TimeUnit.MILLISECONDS);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isDone()) {
            return;
        }
        this.d.incrementAndGet();
        try {
            this.e.run();
            if (this.c) {
                uqq.k(this, f());
            } else {
                uqq.k(this, this.b);
            }
        } catch (Throwable th) {
            this.e = null;
            e(th);
        }
    }
}
