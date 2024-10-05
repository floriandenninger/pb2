package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azex extends AtomicReference implements aypi {
    private static final long serialVersionUID = -8003404460084760287L;
    final azey a;

    public azex(azey azeyVar) {
        this.a = azeyVar;
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        azey azeyVar = this.a;
        if (!azeyVar.e.compareAndSet(this, null) || !azqi.e(azeyVar.d, th)) {
            aynu.j(th);
            return;
        }
        azeyVar.qc();
        Throwable d = azqi.d(azeyVar.d);
        if (d != azqi.a) {
            azeyVar.b.b(d);
        }
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        ayrz.g(this, ayqxVar);
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void sh() {
        azey azeyVar = this.a;
        if (azeyVar.e.compareAndSet(this, null) && azeyVar.f) {
            Throwable d = azqi.d(azeyVar.d);
            if (d == null) {
                azeyVar.b.sh();
            } else {
                azeyVar.b.b(d);
            }
        }
    }
}
