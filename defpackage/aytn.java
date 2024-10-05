package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aytn extends AtomicReference implements ayqk, ayqx {
    private static final long serialVersionUID = -7012088219455310787L;
    final ayrs a;
    final ayrs b;

    public aytn(ayrs ayrsVar, ayrs ayrsVar2) {
        this.a = ayrsVar;
        this.b = ayrsVar2;
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        lazySet(ayrz.a);
        try {
            this.b.a(th);
        } catch (Throwable th2) {
            aynu.c(th2);
            aynu.j(new ayrf(th, th2));
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return get() == ayrz.a;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrz.c(this);
    }

    @Override // defpackage.ayqk, defpackage.aypt
    public final void sc(Object obj) {
        lazySet(ayrz.a);
        try {
            this.a.a(obj);
        } catch (Throwable th) {
            aynu.c(th);
            aynu.j(th);
        }
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        ayrz.g(this, ayqxVar);
    }
}
