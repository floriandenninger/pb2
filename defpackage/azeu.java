package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azeu extends AtomicReference implements aypt {
    private static final long serialVersionUID = -3051469169682093892L;
    final azev a;

    public azeu(azev azevVar) {
        this.a = azevVar;
    }

    @Override // defpackage.aypt
    public final void b(Throwable th) {
        azev azevVar = this.a;
        if (azqi.e(azevVar.c, th)) {
            int i = azevVar.k;
            azevVar.f.qc();
            azevVar.j = 0;
            azevVar.f();
            return;
        }
        aynu.j(th);
    }

    @Override // defpackage.aypt
    public final void sc(Object obj) {
        azev azevVar = this.a;
        azevVar.i = obj;
        azevVar.j = 2;
        azevVar.f();
    }

    @Override // defpackage.aypt
    public final void se(ayqx ayqxVar) {
        ayrz.i(this, ayqxVar);
    }

    @Override // defpackage.aypt
    public final void sh() {
        azev azevVar = this.a;
        azevVar.j = 0;
        azevVar.f();
    }
}
