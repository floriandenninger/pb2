package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azwr extends azwz implements Runnable {
    private static volatile Thread _thread;
    public static final azwr b;
    private static volatile int debugStatus;
    private static final long g;

    static {
        Long l;
        azwr azwrVar = new azwr();
        b = azwrVar;
        azwrVar.f(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        g = timeUnit.toNanos(l.longValue());
    }

    private azwr() {
    }

    private final synchronized Thread n() {
        Thread thread = _thread;
        if (thread != null) {
            return thread;
        }
        Thread thread2 = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
        _thread = thread2;
        thread2.setDaemon(true);
        thread2.start();
        return thread2;
    }

    private final synchronized void o() {
        if (q()) {
            debugStatus = 3;
            azvm azvmVar = ((azwz) this).e;
            int i = azvn.a;
            azvmVar.a = null;
            this.f.a = null;
            notifyAll();
        }
    }

    private final synchronized boolean p() {
        if (q()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    private static final boolean q() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.azwy
    public final Thread c() {
        Thread thread = _thread;
        return thread == null ? n() : thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        azxw azxwVar = azxw.a;
        azxw.b.set(this);
        try {
            if (!p()) {
                _thread = null;
                o();
                if (m()) {
                    return;
                }
                c();
                return;
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long k = k();
                if (k == Long.MAX_VALUE) {
                    long nanoTime = System.nanoTime();
                    if (j == Long.MAX_VALUE) {
                        j = g + nanoTime;
                    }
                    long j2 = j - nanoTime;
                    if (j2 <= 0) {
                        _thread = null;
                        o();
                        if (m()) {
                            return;
                        }
                        c();
                        return;
                    }
                    if (k > j2) {
                        k = j2;
                    }
                } else {
                    j = Long.MAX_VALUE;
                }
                if (k > 0) {
                    if (q()) {
                        _thread = null;
                        o();
                        if (m()) {
                            return;
                        }
                        c();
                        return;
                    }
                    LockSupport.parkNanos(this, k);
                }
            }
        } catch (Throwable th) {
            _thread = null;
            o();
            if (!m()) {
                c();
            }
            throw th;
        }
    }
}
