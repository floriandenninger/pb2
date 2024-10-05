package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azhi extends AtomicReference implements aypi, ayqx {
    private static final long serialVersionUID = 8606673141535671828L;
    final /* synthetic */ azhj a;

    public azhi(azhj azhjVar) {
        this.a = azhjVar;
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        azhj azhjVar = this.a;
        azhjVar.d.f(this);
        azhjVar.b(th);
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
        azhj azhjVar = this.a;
        azhjVar.d.f(this);
        azhjVar.sh();
    }
}
