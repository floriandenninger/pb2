package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aysd extends AtomicReference implements ayqx {
    private static final long serialVersionUID = -754898800686245608L;

    public aysd() {
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return ayrz.d((ayqx) get());
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrz.c(this);
    }

    public aysd(ayqx ayqxVar) {
        lazySet(ayqxVar);
    }
}
