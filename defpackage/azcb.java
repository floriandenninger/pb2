package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azcb extends AtomicReference implements aypt, ayqx {
    private static final long serialVersionUID = -6076952298809384986L;
    final ayrs a;
    final ayrs b;
    final ayrm c;

    public azcb(ayrs ayrsVar, ayrs ayrsVar2, ayrm ayrmVar) {
        this.a = ayrsVar;
        this.b = ayrsVar2;
        this.c = ayrmVar;
    }

    @Override // defpackage.aypt
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
        return ayrz.d((ayqx) get());
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrz.c(this);
    }

    @Override // defpackage.aypt
    public final void sc(Object obj) {
        lazySet(ayrz.a);
        try {
            this.a.a(obj);
        } catch (Throwable th) {
            aynu.c(th);
            aynu.j(th);
        }
    }

    @Override // defpackage.aypt
    public final void se(ayqx ayqxVar) {
        ayrz.g(this, ayqxVar);
    }

    @Override // defpackage.aypt
    public final void sh() {
        lazySet(ayrz.a);
        try {
            this.c.a();
        } catch (Throwable th) {
            aynu.c(th);
            aynu.j(th);
        }
    }
}
