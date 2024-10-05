package defpackage;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayvv extends AtomicLong implements aypq, banx, ayrq {
    private static final long serialVersionUID = -7370244972039324525L;
    final banw a;
    final Callable b;
    final int c;
    banx g;
    boolean h;
    int i;
    public volatile boolean j;
    long k;
    final int d = 1;
    final AtomicBoolean f = new AtomicBoolean();
    final ArrayDeque e = new ArrayDeque();

    public ayvv(banw banwVar, int i, Callable callable) {
        this.a = banwVar;
        this.c = i;
        this.b = callable;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (this.h) {
            aynu.j(th);
            return;
        }
        this.h = true;
        this.e.clear();
        this.a.b(th);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        if (this.h) {
            return;
        }
        ArrayDeque arrayDeque = this.e;
        int i = this.i;
        int i2 = i + 1;
        if (i == 0) {
            try {
                arrayDeque.offer(((azqe) this.b).call());
            } catch (Throwable th) {
                aynu.c(th);
                sd();
                b(th);
                return;
            }
        }
        Collection collection = (Collection) arrayDeque.peek();
        if (collection != null && collection.size() + 1 == this.c) {
            arrayDeque.poll();
            collection.add(obj);
            this.k++;
            this.a.c(collection);
        }
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).add(obj);
        }
        if (i2 == this.d) {
            i2 = 0;
        }
        this.i = i2;
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.g, banxVar)) {
            this.g = banxVar;
            this.a.f(this);
        }
    }

    @Override // defpackage.banx
    public final void sd() {
        this.j = true;
        this.g.sd();
    }

    @Override // defpackage.banw
    public final void sh() {
        long j;
        long j2;
        if (this.h) {
            return;
        }
        this.h = true;
        long j3 = this.k;
        if (j3 != 0) {
            ayeq.n(this, j3);
        }
        banw banwVar = this.a;
        ArrayDeque arrayDeque = this.e;
        if (arrayDeque.isEmpty()) {
            banwVar.sh();
            return;
        }
        if (aynu.m(get(), banwVar, arrayDeque, this, this)) {
            return;
        }
        do {
            j = get();
            if ((j & Long.MIN_VALUE) != 0) {
                return;
            } else {
                j2 = Long.MIN_VALUE | j;
            }
        } while (!compareAndSet(j, j2));
        if (j != 0) {
            aynu.m(j2, banwVar, arrayDeque, this, this);
        }
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        long j2;
        if (azqb.h(j)) {
            banw banwVar = this.a;
            ArrayDeque arrayDeque = this.e;
            do {
                j2 = get();
            } while (!compareAndSet(j2, (j2 & Long.MIN_VALUE) | ayeq.l(Long.MAX_VALUE & j2, j)));
            if (j2 == Long.MIN_VALUE) {
                aynu.m(j | Long.MIN_VALUE, banwVar, arrayDeque, this, this);
                return;
            }
            if (this.f.get() || !this.f.compareAndSet(false, true)) {
                this.g.sj(ayeq.m(this.d, j));
            } else {
                this.g.sj(ayeq.l(this.c, ayeq.m(this.d, j - 1)));
            }
        }
    }
}
