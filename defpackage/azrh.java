package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azrh extends azrs {
    static final azrg[] a = new azrg[0];
    static final azrg[] b = new azrg[0];
    public final AtomicReference c;
    final AtomicReference d;
    final ReadWriteLock e;
    final Lock f;
    final Lock g;
    final AtomicReference h;
    long i;

    public azrh() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.e = reentrantReadWriteLock;
        this.f = reentrantReadWriteLock.readLock();
        this.g = reentrantReadWriteLock.writeLock();
        this.d = new AtomicReference(a);
        this.c = new AtomicReference();
        this.h = new AtomicReference();
    }

    public static azrh aN(Object obj) {
        return new azrh(obj);
    }

    public static azrh e() {
        return new azrh();
    }

    public final Object aO() {
        Object obj = this.c.get();
        if (azqm.g(obj) || azqm.h(obj)) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aP(azrg azrgVar) {
        azrg[] azrgVarArr;
        azrg[] azrgVarArr2;
        do {
            azrgVarArr = (azrg[]) this.d.get();
            int length = azrgVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (azrgVarArr[i] == azrgVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                azrgVarArr2 = a;
            } else {
                azrg[] azrgVarArr3 = new azrg[length - 1];
                System.arraycopy(azrgVarArr, 0, azrgVarArr3, 0, i);
                System.arraycopy(azrgVarArr, i + 1, azrgVarArr3, i, (length - i) - 1);
                azrgVarArr2 = azrgVarArr3;
            }
        } while (!this.d.compareAndSet(azrgVarArr, azrgVarArr2));
    }

    final void aQ(Object obj) {
        this.g.lock();
        this.i++;
        this.c.lazySet(obj);
        this.g.unlock();
    }

    public final boolean aR() {
        Object obj = this.c.get();
        return (obj == null || azqm.g(obj) || azqm.h(obj)) ? false : true;
    }

    final azrg[] aS(Object obj) {
        AtomicReference atomicReference = this.d;
        azrg[] azrgVarArr = b;
        azrg[] azrgVarArr2 = (azrg[]) atomicReference.getAndSet(azrgVarArr);
        if (azrgVarArr2 != azrgVarArr) {
            aQ(obj);
        }
        return azrgVarArr2;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        aysw.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.h.compareAndSet(null, th)) {
            aynu.j(th);
            return;
        }
        Object b2 = azqm.b(th);
        for (azrg azrgVar : aS(b2)) {
            azrgVar.c(b2, this.i);
        }
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        aysw.b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.h.get() != null) {
            return;
        }
        azqm azqmVar = azqm.a;
        aQ(obj);
        for (azrg azrgVar : (azrg[]) this.d.get()) {
            azrgVar.c(obj, this.i);
        }
    }

    @Override // defpackage.aypy
    protected final void f(ayqd ayqdVar) {
        azrg[] azrgVarArr;
        azrg[] azrgVarArr2;
        azqd azqdVar;
        azrg azrgVar = new azrg(ayqdVar, this);
        ayqdVar.se(azrgVar);
        do {
            azrgVarArr = (azrg[]) this.d.get();
            if (azrgVarArr != b) {
                int length = azrgVarArr.length;
                azrgVarArr2 = new azrg[length + 1];
                System.arraycopy(azrgVarArr, 0, azrgVarArr2, 0, length);
                azrgVarArr2[length] = azrgVar;
            } else {
                Throwable th = (Throwable) this.h.get();
                if (th == azqi.a) {
                    ayqdVar.sh();
                    return;
                } else {
                    ayqdVar.b(th);
                    return;
                }
            }
        } while (!this.d.compareAndSet(azrgVarArr, azrgVarArr2));
        if (azrgVar.g) {
            aP(azrgVar);
            return;
        }
        if (azrgVar.g) {
            return;
        }
        synchronized (azrgVar) {
            if (azrgVar.g) {
                return;
            }
            if (azrgVar.c) {
                return;
            }
            azrh azrhVar = azrgVar.b;
            Lock lock = azrhVar.f;
            lock.lock();
            azrgVar.h = azrhVar.i;
            Object obj = azrhVar.c.get();
            lock.unlock();
            azrgVar.d = obj != null;
            azrgVar.c = true;
            if (obj == null || azrgVar.a(obj)) {
                return;
            }
            while (!azrgVar.g) {
                synchronized (azrgVar) {
                    azqdVar = azrgVar.e;
                    if (azqdVar == null) {
                        azrgVar.d = false;
                        return;
                    }
                    azrgVar.e = null;
                }
                azqdVar.b(azrgVar);
            }
        }
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (this.h.get() != null) {
            ayqxVar.qc();
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        if (this.h.compareAndSet(null, azqi.a)) {
            azqm azqmVar = azqm.a;
            for (azrg azrgVar : aS(azqmVar)) {
                azrgVar.c(azqmVar, this.i);
            }
        }
    }

    public azrh(Object obj) {
        this();
        AtomicReference atomicReference = this.c;
        aysw.b(obj, "defaultValue is null");
        atomicReference.lazySet(obj);
    }
}
