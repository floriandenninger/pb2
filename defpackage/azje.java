package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azje extends AtomicReference implements ayqx {
    private static final long serialVersionUID = 7463222674719692880L;
    final ayqd a;

    public azje(ayqd ayqdVar, azjf azjfVar) {
        this.a = ayqdVar;
        lazySet(azjfVar);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return get() == null;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        azjf azjfVar = (azjf) getAndSet(null);
        if (azjfVar != null) {
            azjfVar.f(this);
        }
    }
}
