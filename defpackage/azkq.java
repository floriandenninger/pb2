package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azkq extends AtomicReference implements ayqd {
    private static final long serialVersionUID = -8693423678067375039L;
    final /* synthetic */ azkr a;

    public azkq(azkr azkrVar) {
        this.a = azkrVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        azkr azkrVar = this.a;
        ayrz.c(azkrVar.b);
        ayeq.f(azkrVar.a, th, azkrVar, azkrVar.d);
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        ayrz.c(this);
        this.a.f();
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        ayrz.g(this, ayqxVar);
    }

    @Override // defpackage.ayqd
    public final void sh() {
        this.a.f();
    }
}
