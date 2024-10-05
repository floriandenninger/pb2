package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class baak extends azxb implements Executor, baan {
    private final baaj b;
    private final int d;
    private final String e;
    private final ConcurrentLinkedQueue f;
    private final azvk g;

    public baak(baaj baajVar, int i) {
        baajVar.getClass();
        this.b = baajVar;
        this.d = i;
        this.e = "Dispatchers.IO";
        this.f = new ConcurrentLinkedQueue();
        this.g = azth.p();
    }

    private final void g(Runnable runnable, boolean z) {
        while (this.g.b() > this.d) {
            this.f.add(runnable);
            if (this.g.a() >= this.d || (runnable = (Runnable) this.f.poll()) == null) {
                return;
            }
        }
        this.b.e(runnable, this, z);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // defpackage.baan
    public final int e() {
        return 1;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        g(runnable, false);
    }

    @Override // defpackage.baan
    public final void f() {
        Runnable runnable = (Runnable) this.f.poll();
        if (runnable != null) {
            this.b.e(runnable, this, true);
            return;
        }
        this.g.a();
        Runnable runnable2 = (Runnable) this.f.poll();
        if (runnable2 == null) {
            return;
        }
        g(runnable2, true);
    }

    @Override // defpackage.azwj
    public final void so(azsv azsvVar, Runnable runnable) {
        azsvVar.getClass();
        g(runnable, false);
    }

    @Override // defpackage.azwj
    public final String toString() {
        return this.e;
    }
}
