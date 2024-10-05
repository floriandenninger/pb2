package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azqv extends azqw {
    static final azqu[] b = new azqu[0];
    static final azqu[] c = new azqu[0];
    final AtomicReference d;
    final ReadWriteLock e;
    final Lock f;
    final Lock g;
    public final AtomicReference h;
    final AtomicReference i;
    long j;

    public azqv() {
        this.h = new AtomicReference();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.e = reentrantReadWriteLock;
        this.f = reentrantReadWriteLock.readLock();
        this.g = reentrantReadWriteLock.writeLock();
        this.d = new AtomicReference(b);
        this.i = new AtomicReference();
    }

    public static azqv ap() {
        return new azqv();
    }

    public static azqv aq(Object obj) {
        aysw.b(obj, "defaultValue is null");
        return new azqv(obj);
    }

    @Override // defpackage.aypn
    protected final void ac(banw banwVar) {
        azqu[] azquVarArr;
        azqu[] azquVarArr2;
        azqd azqdVar;
        azqu azquVar = new azqu(banwVar, this);
        banwVar.f(azquVar);
        do {
            azquVarArr = (azqu[]) this.d.get();
            if (azquVarArr != c) {
                int length = azquVarArr.length;
                azquVarArr2 = new azqu[length + 1];
                System.arraycopy(azquVarArr, 0, azquVarArr2, 0, length);
                azquVarArr2[length] = azquVar;
            } else {
                Throwable th = (Throwable) this.i.get();
                if (th == azqi.a) {
                    banwVar.sh();
                    return;
                } else {
                    banwVar.b(th);
                    return;
                }
            }
        } while (!this.d.compareAndSet(azquVarArr, azquVarArr2));
        if (azquVar.g) {
            as(azquVar);
            return;
        }
        if (azquVar.g) {
            return;
        }
        synchronized (azquVar) {
            if (azquVar.g) {
                return;
            }
            if (azquVar.c) {
                return;
            }
            azqv azqvVar = azquVar.b;
            Lock lock = azqvVar.f;
            lock.lock();
            azquVar.h = azqvVar.j;
            Object obj = azqvVar.h.get();
            lock.unlock();
            azquVar.d = obj != null;
            azquVar.c = true;
            if (obj == null || azquVar.a(obj)) {
                return;
            }
            while (!azquVar.g) {
                synchronized (azquVar) {
                    azqdVar = azquVar.e;
                    if (azqdVar == null) {
                        azquVar.d = false;
                        return;
                    }
                    azquVar.e = null;
                }
                azqdVar.b(azquVar);
            }
        }
    }

    public final Object ar() {
        Object obj = this.h.get();
        if (azqm.g(obj) || azqm.h(obj)) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void as(azqu azquVar) {
        azqu[] azquVarArr;
        azqu[] azquVarArr2;
        do {
            azquVarArr = (azqu[]) this.d.get();
            int length = azquVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (azquVarArr[i] == azquVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                azquVarArr2 = b;
            } else {
                azqu[] azquVarArr3 = new azqu[length - 1];
                System.arraycopy(azquVarArr, 0, azquVarArr3, 0, i);
                System.arraycopy(azquVarArr, i + 1, azquVarArr3, i, (length - i) - 1);
                azquVarArr2 = azquVarArr3;
            }
        } while (!this.d.compareAndSet(azquVarArr, azquVarArr2));
    }

    final void at(Object obj) {
        Lock lock = this.g;
        lock.lock();
        this.j++;
        this.h.lazySet(obj);
        lock.unlock();
    }

    final azqu[] au(Object obj) {
        azqu[] azquVarArr = (azqu[]) this.d.get();
        azqu[] azquVarArr2 = c;
        if (azquVarArr != azquVarArr2 && (azquVarArr = (azqu[]) this.d.getAndSet(azquVarArr2)) != azquVarArr2) {
            at(obj);
        }
        return azquVarArr;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        aysw.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.i.compareAndSet(null, th)) {
            aynu.j(th);
            return;
        }
        Object b2 = azqm.b(th);
        for (azqu azquVar : au(b2)) {
            azquVar.b(b2, this.j);
        }
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        aysw.b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.i.get() != null) {
            return;
        }
        azqm azqmVar = azqm.a;
        at(obj);
        for (azqu azquVar : (azqu[]) this.d.get()) {
            azquVar.b(obj, this.j);
        }
    }

    @Override // defpackage.banw
    public final void f(banx banxVar) {
        if (this.i.get() != null) {
            banxVar.sd();
        } else {
            banxVar.sj(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.banw
    public final void sh() {
        if (this.i.compareAndSet(null, azqi.a)) {
            azqm azqmVar = azqm.a;
            for (azqu azquVar : au(azqmVar)) {
                azquVar.b(azqmVar, this.j);
            }
        }
    }

    public azqv(Object obj) {
        this();
        AtomicReference atomicReference = this.h;
        aysw.b(obj, "defaultValue is null");
        atomicReference.lazySet(obj);
    }
}
