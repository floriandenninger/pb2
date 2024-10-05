package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azfd extends AtomicReference implements Iterator, j$.util.Iterator, ayqd, ayqx {
    private static final long serialVersionUID = 6695226475494099826L;
    final azoh a;
    final Lock b;
    final Condition c;
    volatile boolean d;
    volatile Throwable e;

    public azfd(int i) {
        this.a = new azoh(i);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.b = reentrantLock;
        this.c = reentrantLock.newCondition();
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        this.e = th;
        this.d = true;
        f();
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        this.a.k(obj);
        f();
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return ayrz.d((ayqx) get());
    }

    final void f() {
        this.b.lock();
        try {
            this.c.signalAll();
        } finally {
            this.b.unlock();
        }
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        while (!e()) {
            boolean z = this.d;
            boolean j = this.a.j();
            if (z) {
                Throwable th = this.e;
                if (th == null) {
                    return !j;
                }
                throw azqi.b(th);
            }
            if (!j) {
                return true;
            }
            try {
                boolean z2 = aynu.x;
                this.b.lock();
                while (!this.d && this.a.j() && !e()) {
                    try {
                        this.c.await();
                    } catch (Throwable th2) {
                        this.b.unlock();
                        throw th2;
                    }
                }
                this.b.unlock();
            } catch (InterruptedException e) {
                ayrz.c(this);
                f();
                throw azqi.b(e);
            }
        }
        Throwable th3 = this.e;
        if (th3 == null) {
            return false;
        }
        throw azqi.b(th3);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (hasNext()) {
            return this.a.sg();
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrz.c(this);
        f();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        ayrz.g(this, ayqxVar);
    }

    @Override // defpackage.ayqd
    public final void sh() {
        this.d = true;
        f();
    }
}
