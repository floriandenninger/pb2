package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class anhx extends AtomicReference implements Runnable {
    private static final Runnable a;
    private static final Runnable b;

    static {
        int i = 15;
        a = new ajfg(i);
        b = new ajfg(i);
    }

    private final void c(Thread thread) {
        Runnable runnable = (Runnable) get();
        anhw anhwVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof anhw)) {
                if (runnable != b) {
                    break;
                }
            } else {
                anhwVar = (anhw) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(anhwVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public abstract Object a();

    public abstract String b();

    public abstract void d(Throwable th);

    public abstract void e(Object obj);

    public abstract boolean g();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            anhw anhwVar = new anhw(this);
            anhwVar.a(Thread.currentThread());
            if (compareAndSet(runnable, anhwVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(a)) == b) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(a)) == b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean z = !g();
            if (z) {
                try {
                    obj = a();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, a)) {
                        c(currentThread);
                    }
                    d(th);
                    return;
                }
            }
            if (!compareAndSet(currentThread, a)) {
                c(currentThread);
            }
            if (z) {
                e(obj);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == a) {
            str = "running=[DONE]";
        } else if (runnable instanceof anhw) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String b2 = b();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(b2).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(b2);
        return sb2.toString();
    }
}
