package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class azqq implements aypi, ayqx {
    final AtomicReference b = new AtomicReference();

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.b.get() == ayrz.a;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrz.c(this.b);
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        ayeq.i(this.b, ayqxVar, getClass());
    }
}
