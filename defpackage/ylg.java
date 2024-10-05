package defpackage;

import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ylg {
    private static ylg a;
    private final Semaphore b = new Semaphore(Integer.MAX_VALUE);

    private ylg() {
    }

    public static synchronized ylg a() {
        ylg ylgVar;
        synchronized (ylg.class) {
            if (a == null) {
                a = new ylg();
            }
            ylgVar = a;
        }
        return ylgVar;
    }

    public final void b() {
        this.b.acquire(Integer.MAX_VALUE);
    }

    public final void c() {
        this.b.acquire();
    }

    public final void d() {
        this.b.release(Integer.MAX_VALUE);
    }

    public final void e() {
        this.b.release();
    }

    public final boolean f() {
        return this.b.tryAcquire();
    }
}
