package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azbq implements aypq, ayqx {
    final ayqk a;
    banx b;
    Collection c;

    public azbq(ayqk ayqkVar, Collection collection) {
        this.a = ayqkVar;
        this.c = collection;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        this.c = null;
        this.b = azqb.a;
        this.a.b(th);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        this.c.add(obj);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.b == azqb.a;
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.b, banxVar)) {
            this.b = banxVar;
            this.a.se(this);
            banxVar.sj(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.b.sd();
        this.b = azqb.a;
    }

    @Override // defpackage.banw
    public final void sh() {
        this.b = azqb.a;
        this.a.sc(this.c);
    }
}
