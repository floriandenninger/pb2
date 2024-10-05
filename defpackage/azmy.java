package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azmy extends AtomicReference implements ayqk, ayqx {
    private static final long serialVersionUID = 3258103020495908596L;
    final ayqk a;
    final ayrv b;

    public azmy(ayqk ayqkVar, ayrv ayrvVar) {
        this.a = ayqkVar;
        this.b = ayrvVar;
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
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

    @Override // defpackage.ayqk, defpackage.aypt
    public final void sc(Object obj) {
        try {
            ayqm ayqmVar = (ayqm) this.b.a(obj);
            aysw.b(ayqmVar, "The single returned by the mapper is null");
            if (e()) {
                return;
            }
            ayqmVar.Z(new azea(this, this.a, 2));
        } catch (Throwable th) {
            aynu.c(th);
            this.a.b(th);
        }
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        if (ayrz.g(this, ayqxVar)) {
            this.a.se(this);
        }
    }
}
