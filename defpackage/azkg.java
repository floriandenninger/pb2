package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azkg extends AtomicReference implements ayqd, ayqx {
    private static final long serialVersionUID = 8094547886072529208L;
    final ayqd a;
    final AtomicReference b = new AtomicReference();

    public azkg(ayqd ayqdVar) {
        this.a = ayqdVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return ayrz.d((ayqx) get());
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrz.c(this.b);
        ayrz.c(this);
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        ayrz.g(this.b, ayqxVar);
    }

    @Override // defpackage.ayqd
    public final void sh() {
        this.a.sh();
    }
}
