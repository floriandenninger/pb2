package defpackage;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayvw extends AtomicInteger implements aypq, banx {
    private static final long serialVersionUID = -5616169793639412593L;
    final banw a;
    final Callable b;
    final int c;
    final int d = 1;
    Collection e;
    banx f;
    boolean g;
    int h;

    public ayvw(banw banwVar, int i, Callable callable) {
        this.a = banwVar;
        this.c = i;
        this.b = callable;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (this.g) {
            aynu.j(th);
            return;
        }
        this.g = true;
        this.e = null;
        this.a.b(th);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        if (this.g) {
            return;
        }
        Collection collection = this.e;
        int i = this.h;
        int i2 = i + 1;
        if (i == 0) {
            try {
                collection = ((azqe) this.b).call();
                this.e = collection;
            } catch (Throwable th) {
                aynu.c(th);
                sd();
                b(th);
                return;
            }
        }
        if (collection != null) {
            collection.add(obj);
            if (collection.size() == this.c) {
                this.e = null;
                this.a.c(collection);
            }
        }
        if (i2 == this.d) {
            i2 = 0;
        }
        this.h = i2;
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.f, banxVar)) {
            this.f = banxVar;
            this.a.f(this);
        }
    }

    @Override // defpackage.banx
    public final void sd() {
        this.f.sd();
    }

    @Override // defpackage.banw
    public final void sh() {
        if (this.g) {
            return;
        }
        this.g = true;
        Collection collection = this.e;
        this.e = null;
        if (collection != null) {
            this.a.c(collection);
        }
        this.a.sh();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (azqb.h(j)) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                this.f.sj(ayeq.m(this.d, j));
                return;
            }
            this.f.sj(ayeq.l(ayeq.m(j, this.c), ayeq.m(this.d - this.c, j - 1)));
        }
    }
}
