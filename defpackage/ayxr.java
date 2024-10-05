package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayxr extends AtomicReference implements aypi, ayqx {
    private static final long serialVersionUID = 8606673141535671828L;
    final /* synthetic */ ayxs a;

    public ayxr(ayxs ayxsVar) {
        this.a = ayxsVar;
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        ayxs ayxsVar = this.a;
        ayxsVar.d.f(this);
        ayxsVar.b(th);
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
        ayxs ayxsVar = this.a;
        ayxsVar.d.f(this);
        ayxsVar.sh();
    }
}
