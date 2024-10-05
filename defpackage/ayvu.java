package defpackage;

import java.util.Collection;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayvu implements aypq, banx {
    final banw a;
    final Callable b;
    Collection c;
    banx d;
    boolean e;

    public ayvu(banw banwVar, Callable callable) {
        this.a = banwVar;
        this.b = callable;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (this.e) {
            aynu.j(th);
        } else {
            this.e = true;
            this.a.b(th);
        }
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        if (this.e) {
            return;
        }
        Collection collection = this.c;
        if (collection == null) {
            try {
                collection = ((azqe) this.b).call();
                this.c = collection;
            } catch (Throwable th) {
                aynu.c(th);
                sd();
                b(th);
                return;
            }
        }
        collection.add(obj);
        this.c = null;
        this.a.c(collection);
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.d, banxVar)) {
            this.d = banxVar;
            this.a.f(this);
        }
    }

    @Override // defpackage.banx
    public final void sd() {
        this.d.sd();
    }

    @Override // defpackage.banw
    public final void sh() {
        if (this.e) {
            return;
        }
        this.e = true;
        Collection collection = this.c;
        if (collection != null && !collection.isEmpty()) {
            this.a.c(collection);
        }
        this.a.sh();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (azqb.h(j)) {
            this.d.sj(ayeq.m(j, 1L));
        }
    }
}
