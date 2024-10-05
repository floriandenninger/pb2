package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aznc extends AtomicReference implements ayqk, ayqx {
    private static final long serialVersionUID = -5843758257109742742L;
    final aypt a;
    final ayrv b;

    public aznc(aypt ayptVar, ayrv ayrvVar) {
        this.a = ayptVar;
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
            aypv aypvVar = (aypv) this.b.a(obj);
            aysw.b(aypvVar, "The mapper returned a null MaybeSource");
            if (e()) {
                return;
            }
            aypvVar.Y(new azdo(this, this.a, 3));
        } catch (Throwable th) {
            aynu.c(th);
            b(th);
        }
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        if (ayrz.g(this, ayqxVar)) {
            this.a.se(this);
        }
    }
}
