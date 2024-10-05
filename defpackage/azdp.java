package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azdp extends AtomicReference implements aypt, ayqx {
    private static final long serialVersionUID = 2026620218879969836L;
    final aypt a;
    final ayrv b;
    final boolean c = true;

    public azdp(aypt ayptVar, ayrv ayrvVar) {
        this.a = ayptVar;
        this.b = ayrvVar;
    }

    @Override // defpackage.aypt
    public final void b(Throwable th) {
        if (this.c || (th instanceof Exception)) {
            try {
                aypv aypvVar = (aypv) ((aysq) this.b).a;
                aysw.b(aypvVar, "The resumeFunction returned a null MaybeSource");
                ayrz.i(this, null);
                aypvVar.Y(new azdo(this.a, this, 0));
                return;
            } catch (Throwable th2) {
                aynu.c(th2);
                this.a.b(new ayrf(th, th2));
                return;
            }
        }
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
        this.a.sc(obj);
    }

    @Override // defpackage.aypt
    public final void se(ayqx ayqxVar) {
        if (ayrz.g(this, ayqxVar)) {
            this.a.se(this);
        }
    }

    @Override // defpackage.aypt
    public final void sh() {
        this.a.sh();
    }
}
