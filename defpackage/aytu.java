package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aytu extends AtomicReference implements ayqd, ayqx {
    private static final long serialVersionUID = -7251123623727029452L;
    final ayrs a;
    final ayrs b;
    final ayrm c;

    public aytu(ayrs ayrsVar, ayrs ayrsVar2, ayrm ayrmVar) {
        this.a = ayrsVar;
        this.b = ayrsVar2;
        this.c = ayrmVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        if (!e()) {
            lazySet(ayrz.a);
            try {
                this.b.a(th);
                return;
            } catch (Throwable th2) {
                aynu.c(th2);
                aynu.j(new ayrf(th, th2));
                return;
            }
        }
        aynu.j(th);
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        if (e()) {
            return;
        }
        try {
            this.a.a(obj);
        } catch (Throwable th) {
            aynu.c(th);
            ((ayqx) get()).qc();
            b(th);
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

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        ayrz.g(this, ayqxVar);
    }

    @Override // defpackage.ayqd
    public final void sh() {
        if (e()) {
            return;
        }
        lazySet(ayrz.a);
        try {
            this.c.a();
        } catch (Throwable th) {
            aynu.c(th);
            aynu.j(th);
        }
    }
}
