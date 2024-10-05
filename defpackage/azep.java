package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azep extends AtomicReference implements ayqk {
    private static final long serialVersionUID = 8042919737683345351L;
    final azeq a;
    volatile Object b;

    public azep(azeq azeqVar) {
        this.a = azeqVar;
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        azeq azeqVar = this.a;
        if (!azeqVar.f.compareAndSet(this, null) || !azqi.e(azeqVar.d, th)) {
            aynu.j(th);
            return;
        }
        azeqVar.g.sd();
        azeqVar.d();
        azeqVar.g();
    }

    @Override // defpackage.ayqk, defpackage.aypt
    public final void sc(Object obj) {
        this.b = obj;
        this.a.g();
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        ayrz.g(this, ayqxVar);
    }
}
