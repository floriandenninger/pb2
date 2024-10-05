package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azlr implements ayqd {
    final azlq a;
    final azoh b;
    volatile boolean c;
    Throwable d;
    final AtomicReference e = new AtomicReference();

    public azlr(azlq azlqVar, int i) {
        this.a = azlqVar;
        this.b = new azoh(i);
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        this.d = th;
        this.c = true;
        this.a.f();
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        this.b.k(obj);
        this.a.f();
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        ayrz.g(this.e, ayqxVar);
    }

    @Override // defpackage.ayqd
    public final void sh() {
        this.c = true;
        this.a.f();
    }
}
