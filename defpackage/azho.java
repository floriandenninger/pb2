package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azho extends AtomicReference implements aypt, ayqx {
    private static final long serialVersionUID = -502562646270949838L;
    final /* synthetic */ azhp a;

    public azho(azhp azhpVar) {
        this.a = azhpVar;
    }

    @Override // defpackage.aypt
    public final void b(Throwable th) {
        azhp azhpVar = this.a;
        azhpVar.b.f(this);
        if (azqi.e(azhpVar.d, th)) {
            azhpVar.g.qc();
            azhpVar.b.qc();
            azhpVar.c.decrementAndGet();
            azhpVar.g();
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

    @Override // defpackage.aypt
    public final void sc(Object obj) {
        azoh azohVar;
        azhp azhpVar = this.a;
        azhpVar.b.f(this);
        if (azhpVar.get() != 0 || !azhpVar.compareAndSet(0, 1)) {
            do {
                azohVar = (azoh) azhpVar.f.get();
                if (azohVar != null) {
                    break;
                } else {
                    azohVar = new azoh(aypn.a);
                }
            } while (!azhpVar.f.compareAndSet(null, azohVar));
            synchronized (azohVar) {
                azohVar.k(obj);
            }
            azhpVar.c.decrementAndGet();
            if (azhpVar.getAndIncrement() != 0) {
                return;
            }
        } else {
            azhpVar.a.c(obj);
            int decrementAndGet = azhpVar.c.decrementAndGet();
            azoh azohVar2 = (azoh) azhpVar.f.get();
            if (decrementAndGet != 0 || (azohVar2 != null && !azohVar2.j())) {
                if (azhpVar.decrementAndGet() == 0) {
                    return;
                }
            } else {
                Throwable d = azqi.d(azhpVar.d);
                if (d != null) {
                    azhpVar.a.b(d);
                    return;
                } else {
                    azhpVar.a.sh();
                    return;
                }
            }
        }
        azhpVar.h();
    }

    @Override // defpackage.aypt
    public final void se(ayqx ayqxVar) {
        ayrz.g(this, ayqxVar);
    }

    @Override // defpackage.aypt
    public final void sh() {
        azhp azhpVar = this.a;
        azhpVar.b.f(this);
        if (azhpVar.get() != 0 || !azhpVar.compareAndSet(0, 1)) {
            azhpVar.c.decrementAndGet();
            azhpVar.g();
            return;
        }
        int decrementAndGet = azhpVar.c.decrementAndGet();
        azoh azohVar = (azoh) azhpVar.f.get();
        if (decrementAndGet != 0 || (azohVar != null && !azohVar.j())) {
            if (azhpVar.decrementAndGet() == 0) {
                return;
            }
            azhpVar.h();
        } else {
            Throwable d = azqi.d(azhpVar.d);
            if (d != null) {
                azhpVar.a.b(d);
            } else {
                azhpVar.a.sh();
            }
        }
    }
}
