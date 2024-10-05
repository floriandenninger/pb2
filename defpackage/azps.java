package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azps extends AtomicReference implements aypq, banx, ayqx {
    private static final long serialVersionUID = -7251123623727029452L;
    final ayrs a;
    final ayrs b;
    final ayrs c;

    public azps(ayrs ayrsVar, ayrs ayrsVar2, ayrs ayrsVar3) {
        this.a = ayrsVar;
        this.b = ayrsVar2;
        this.c = ayrsVar3;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (get() != azqb.a) {
            lazySet(azqb.a);
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

    @Override // defpackage.banw
    public final void c(Object obj) {
        if (e()) {
            return;
        }
        try {
            this.a.a(obj);
        } catch (Throwable th) {
            aynu.c(th);
            ((banx) get()).sd();
            b(th);
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return get() == azqb.a;
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.g(this, banxVar)) {
            try {
                this.c.a(this);
            } catch (Throwable th) {
                aynu.c(th);
                banxVar.sd();
                b(th);
            }
        }
    }

    @Override // defpackage.ayqx
    public final void qc() {
        azqb.f(this);
    }

    @Override // defpackage.banx
    public final void sd() {
        azqb.f(this);
    }

    @Override // defpackage.banw
    public final void sh() {
        if (get() != azqb.a) {
            lazySet(azqb.a);
        }
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        ((banx) get()).sj(j);
    }
}
