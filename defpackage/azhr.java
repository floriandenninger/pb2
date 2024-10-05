package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azhr extends AtomicReference implements ayqk, ayqx {
    private static final long serialVersionUID = -502562646270949838L;
    final /* synthetic */ azhs a;

    public azhr(azhs azhsVar) {
        this.a = azhsVar;
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        azhs azhsVar = this.a;
        azhsVar.b.f(this);
        if (azqi.e(azhsVar.d, th)) {
            azhsVar.g.qc();
            azhsVar.b.qc();
            azhsVar.c.decrementAndGet();
            azhsVar.g();
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
        azoh azohVar;
        azhs azhsVar = this.a;
        azhsVar.b.f(this);
        if (azhsVar.get() != 0 || !azhsVar.compareAndSet(0, 1)) {
            do {
                azohVar = (azoh) azhsVar.f.get();
                if (azohVar != null) {
                    break;
                } else {
                    azohVar = new azoh(aypn.a);
                }
            } while (!azhsVar.f.compareAndSet(null, azohVar));
            synchronized (azohVar) {
                azohVar.k(obj);
            }
            azhsVar.c.decrementAndGet();
            if (azhsVar.getAndIncrement() != 0) {
                return;
            }
        } else {
            azhsVar.a.c(obj);
            int decrementAndGet = azhsVar.c.decrementAndGet();
            azoh azohVar2 = (azoh) azhsVar.f.get();
            if (decrementAndGet != 0 || (azohVar2 != null && !azohVar2.j())) {
                if (azhsVar.decrementAndGet() == 0) {
                    return;
                }
            } else {
                Throwable d = azqi.d(azhsVar.d);
                if (d != null) {
                    azhsVar.a.b(d);
                    return;
                } else {
                    azhsVar.a.sh();
                    return;
                }
            }
        }
        azhsVar.h();
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        ayrz.g(this, ayqxVar);
    }
}
