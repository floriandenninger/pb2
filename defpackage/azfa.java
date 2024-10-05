package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azfa extends AtomicReference implements ayqd, ayqk, ayqx {
    private static final long serialVersionUID = -8948264376121066672L;
    final ayqd a;
    final ayrv b;

    public azfa(ayqd ayqdVar, ayrv ayrvVar) {
        this.a = ayqdVar;
        this.b = ayrvVar;
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
        ayrz.c(this);
    }

    @Override // defpackage.ayqk, defpackage.aypt
    public final void sc(Object obj) {
        try {
            ayqb ayqbVar = (ayqb) this.b.a(obj);
            aysw.b(ayqbVar, "The mapper returned a null Publisher");
            ayqbVar.aE(this);
        } catch (Throwable th) {
            aynu.c(th);
            this.a.b(th);
        }
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        ayrz.i(this, ayqxVar);
    }

    @Override // defpackage.ayqd
    public final void sh() {
        this.a.sh();
    }
}
