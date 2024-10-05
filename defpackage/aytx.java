package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aytx extends AtomicReference implements aypi, ayqx {
    private static final long serialVersionUID = -4101678820158072998L;
    final aypi a;
    final aypk b;

    public aytx(aypi aypiVar, aypk aypkVar) {
        this.a = aypiVar;
        this.b = aypkVar;
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return ayrz.d((ayqx) get());
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrz.c(this);
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        if (ayrz.g(this, ayqxVar)) {
            this.a.se(this);
        }
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void sh() {
        this.b.U(new aytw(this, this.a));
    }
}
