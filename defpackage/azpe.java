package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azpe extends AtomicReferenceArray implements Runnable, Callable, ayqx {
    static final Object a = new Object();
    static final Object b = new Object();
    static final Object c = new Object();
    static final Object d = new Object();
    private static final long serialVersionUID = -6120223772001106981L;
    final Runnable e;

    public azpe(Runnable runnable, ayry ayryVar) {
        super(3);
        this.e = runnable;
        lazySet(0, ayryVar);
    }

    public final void a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == d) {
                return;
            }
            if (obj == b) {
                future.cancel(false);
                return;
            } else if (obj == c) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        Object obj = get(0);
        return obj == a || obj == d;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == d || obj5 == (obj3 = b) || obj5 == (obj4 = c)) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (z) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 != null) {
                    ((Future) obj5).cancel(z);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == d || obj == (obj2 = a) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((ayry) obj).f(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        Object obj3;
        boolean compareAndSet;
        Object obj4;
        Object obj5;
        lazySet(2, Thread.currentThread());
        try {
            this.e.run();
        } finally {
            try {
                lazySet(2, null);
                obj4 = get(0);
                if (obj4 != a) {
                    ((ayry) obj4).f(this);
                }
                do {
                    obj5 = get(1);
                    if (obj5 != b) {
                        return;
                    } else {
                        return;
                    }
                } while (!compareAndSet(1, obj5, d));
            } catch (Throwable th) {
                do {
                    if (obj == obj2) {
                        break;
                    } else if (obj == obj3) {
                        break;
                    }
                } while (!compareAndSet);
            }
        }
        lazySet(2, null);
        obj4 = get(0);
        if (obj4 != a && compareAndSet(0, obj4, d) && obj4 != null) {
            ((ayry) obj4).f(this);
        }
        do {
            obj5 = get(1);
            if (obj5 != b || obj5 == c) {
                return;
            }
        } while (!compareAndSet(1, obj5, d));
    }
}
