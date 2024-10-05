package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayra implements ayqx {
    final AtomicReference a = new AtomicReference();

    public final void a(ayqx ayqxVar) {
        ayrz.f(this.a, ayqxVar);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return ayrz.d((ayqx) this.a.get());
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrz.c(this.a);
    }
}
