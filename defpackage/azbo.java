package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azbo extends azpx implements aypq, banx {
    private static final long serialVersionUID = -8134157938864266736L;
    banx a;

    public azbo(banw banwVar, Collection collection) {
        super(banwVar);
        this.g = collection;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        this.g = null;
        this.f.b(th);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        Collection collection = (Collection) this.g;
        if (collection != null) {
            collection.add(obj);
        }
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.a, banxVar)) {
            this.a = banxVar;
            this.f.f(this);
            banxVar.sj(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.azpx, defpackage.banx
    public final void sd() {
        super.sd();
        this.a.sd();
    }

    @Override // defpackage.banw
    public final void sh() {
        g((Collection) this.g);
    }
}
