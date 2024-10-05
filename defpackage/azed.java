package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azed extends AtomicReference implements aypt {
    private static final long serialVersionUID = -1266041316834525931L;
    final azee a;

    public azed(azee azeeVar) {
        this.a = azeeVar;
    }

    @Override // defpackage.aypt
    public final void b(Throwable th) {
        azee azeeVar = this.a;
        if (ayrz.c(azeeVar)) {
            azeeVar.a.b(th);
        } else {
            aynu.j(th);
        }
    }

    @Override // defpackage.aypt
    public final void sc(Object obj) {
        this.a.c();
    }

    @Override // defpackage.aypt
    public final void se(ayqx ayqxVar) {
        ayrz.g(this, ayqxVar);
    }

    @Override // defpackage.aypt
    public final void sh() {
        this.a.c();
    }
}
