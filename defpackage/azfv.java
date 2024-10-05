package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azfv extends AtomicReference implements ayqd {
    private static final long serialVersionUID = 2620149119579502636L;
    final ayqd a;
    final azfw b;

    public azfv(ayqd ayqdVar, azfw azfwVar) {
        this.a = ayqdVar;
        this.b = azfwVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        azfw azfwVar = this.b;
        if (azqi.e(azfwVar.c, th)) {
            boolean z = azfwVar.e;
            azfwVar.g.qc();
            azfwVar.h = false;
            azfwVar.f();
            return;
        }
        aynu.j(th);
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        ayrz.i(this, ayqxVar);
    }

    @Override // defpackage.ayqd
    public final void sh() {
        azfw azfwVar = this.b;
        azfwVar.h = false;
        azfwVar.f();
    }
}
