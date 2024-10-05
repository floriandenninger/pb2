package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azbd extends AtomicReference implements aypq {
    private static final long serialVersionUID = -3592821756711087922L;
    final /* synthetic */ azbe a;

    public azbd(azbe azbeVar) {
        this.a = azbeVar;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        azqb.f(this.a.c);
        azbe azbeVar = this.a;
        ayeq.g(azbeVar.a, th, azbeVar, azbeVar.d);
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        azqb.f(this);
        sh();
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        azqb.k(this, banxVar, Long.MAX_VALUE);
    }

    @Override // defpackage.banw
    public final void sh() {
        azqb.f(this.a.c);
        azbe azbeVar = this.a;
        ayeq.e(azbeVar.a, azbeVar, azbeVar.d);
    }
}
