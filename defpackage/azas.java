package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azas extends AtomicReference implements aypq {
    private static final long serialVersionUID = -5592042965931999169L;
    final /* synthetic */ azat a;

    public azas(azat azatVar) {
        this.a = azatVar;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        azqb.f(this.a.b);
        azat azatVar = this.a;
        ayeq.g(azatVar.a, th, azatVar, azatVar.e);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        this.a.f = true;
        ((banx) get()).sd();
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        azqb.k(this, banxVar, Long.MAX_VALUE);
    }

    @Override // defpackage.banw
    public final void sh() {
        this.a.f = true;
    }
}
