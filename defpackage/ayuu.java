package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayuu extends AtomicReference implements aypi, ayqx {
    private static final long serialVersionUID = 251330541679988317L;
    final /* synthetic */ ayuv a;

    public ayuu(ayuv ayuvVar) {
        this.a = ayuvVar;
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        ayuv ayuvVar = this.a;
        ayuvVar.e.f(this);
        if (!ayuvVar.c) {
            ayuvVar.f.sd();
            ayuvVar.e.qc();
            if (azqi.e(ayuvVar.d, th)) {
                if (ayuvVar.getAndSet(0) > 0) {
                    ayuvVar.a.b(azqi.d(ayuvVar.d));
                    return;
                }
                return;
            }
            aynu.j(th);
            return;
        }
        if (azqi.e(ayuvVar.d, th)) {
            if (ayuvVar.decrementAndGet() == 0) {
                ayuvVar.a.b(azqi.d(ayuvVar.d));
                return;
            } else {
                if (ayuvVar.b != Integer.MAX_VALUE) {
                    ayuvVar.f.sj(1L);
                    return;
                }
                return;
            }
        }
        aynu.j(th);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return ayrz.d((ayqx) get());
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrz.c(this);
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        ayrz.g(this, ayqxVar);
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void sh() {
        ayuv ayuvVar = this.a;
        ayuvVar.e.f(this);
        if (ayuvVar.decrementAndGet() != 0) {
            if (ayuvVar.b != Integer.MAX_VALUE) {
                ayuvVar.f.sj(1L);
            }
        } else {
            Throwable th = (Throwable) ayuvVar.d.get();
            if (th != null) {
                ayuvVar.a.b(th);
            } else {
                ayuvVar.a.sh();
            }
        }
    }
}
