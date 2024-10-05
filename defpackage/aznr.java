package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aznr extends AtomicReference implements ayqk, ayqx {
    private static final long serialVersionUID = -5314538511045349925L;
    final ayqk a;
    final ayrv b;

    public aznr(ayqk ayqkVar, ayrv ayrvVar) {
        this.a = ayqkVar;
        this.b = ayrvVar;
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        try {
            ayqm ayqmVar = (ayqm) this.b.a(th);
            aysw.b(ayqmVar, "The nextFunction returned a null SingleSource.");
            ayqmVar.Z(new azea(this, this.a, 1));
        } catch (Throwable th2) {
            aynu.c(th2);
            this.a.b(new ayrf(th, th2));
        }
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
        this.a.sc(obj);
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        if (ayrz.g(this, ayqxVar)) {
            this.a.se(this);
        }
    }
}
