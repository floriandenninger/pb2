package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayxu extends AtomicReference implements ayqk, ayqx {
    private static final long serialVersionUID = -502562646270949838L;
    final /* synthetic */ ayxv a;

    public ayxu(ayxv ayxvVar) {
        this.a = ayxvVar;
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        ayxv ayxvVar = this.a;
        ayxvVar.d.f(this);
        if (azqi.e(ayxvVar.f, th)) {
            ayxvVar.i.sd();
            ayxvVar.d.qc();
            ayxvVar.e.decrementAndGet();
            ayxvVar.h();
            return;
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

    @Override // defpackage.ayqk, defpackage.aypt
    public final void sc(Object obj) {
        ayxv ayxvVar = this.a;
        ayxvVar.d.f(this);
        if (ayxvVar.get() != 0 || !ayxvVar.compareAndSet(0, 1)) {
            azoh d = ayxvVar.d();
            synchronized (d) {
                d.k(obj);
            }
            ayxvVar.e.decrementAndGet();
            if (ayxvVar.getAndIncrement() != 0) {
                return;
            }
        } else {
            int decrementAndGet = ayxvVar.e.decrementAndGet();
            if (ayxvVar.c.get() != 0) {
                ayxvVar.a.c(obj);
                azoh azohVar = (azoh) ayxvVar.h.get();
                if (decrementAndGet != 0 || (azohVar != null && !azohVar.j())) {
                    ayeq.n(ayxvVar.c, 1L);
                    if (ayxvVar.b != Integer.MAX_VALUE) {
                        ayxvVar.i.sj(1L);
                    }
                } else {
                    Throwable d2 = azqi.d(ayxvVar.f);
                    if (d2 != null) {
                        ayxvVar.a.b(d2);
                        return;
                    } else {
                        ayxvVar.a.sh();
                        return;
                    }
                }
            } else {
                azoh d3 = ayxvVar.d();
                synchronized (d3) {
                    d3.k(obj);
                }
            }
            if (ayxvVar.decrementAndGet() == 0) {
                return;
            }
        }
        ayxvVar.i();
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        ayrz.g(this, ayqxVar);
    }
}
