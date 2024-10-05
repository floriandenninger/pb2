package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayxo extends AtomicReference implements aypi, ayqx {
    private static final long serialVersionUID = 8606673141535671828L;
    final /* synthetic */ ayxp a;

    public ayxo(ayxp ayxpVar) {
        this.a = ayxpVar;
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        ayxp ayxpVar = this.a;
        ayxpVar.d.f(this);
        ayxpVar.b(th);
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
        ayrz.g(this, ayqxVar);
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void sh() {
        ayxp ayxpVar = this.a;
        ayxpVar.d.f(this);
        ayxpVar.sh();
    }
}
