package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azcp extends AtomicReference implements aypt, aypi, ayqx {
    private static final long serialVersionUID = -2177128922851101253L;
    final aypi a;
    final ayrv b;

    public azcp(aypi aypiVar, ayrv ayrvVar) {
        this.a = aypiVar;
        this.b = ayrvVar;
    }

    @Override // defpackage.aypt
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

    @Override // defpackage.aypt
    public final void sc(Object obj) {
        try {
            aypk aypkVar = (aypk) this.b.a(obj);
            aysw.b(aypkVar, "The mapper returned a null CompletableSource");
            if (e()) {
                return;
            }
            aypkVar.U(this);
        } catch (Throwable th) {
            aynu.c(th);
            b(th);
        }
    }

    @Override // defpackage.aypt
    public final void se(ayqx ayqxVar) {
        ayrz.i(this, ayqxVar);
    }

    @Override // defpackage.aypt
    public final void sh() {
        this.a.sh();
    }
}
