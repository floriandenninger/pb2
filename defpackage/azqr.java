package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class azqr implements ayqd, ayqx {
    final AtomicReference e = new AtomicReference();

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.e.get() == ayrz.a;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrz.c(this.e);
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        ayeq.i(this.e, ayqxVar, getClass());
    }
}
