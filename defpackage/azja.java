package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azja extends AtomicReference implements ayqx {
    private static final long serialVersionUID = -1100270633763673112L;
    final ayqd a;

    public azja(ayqd ayqdVar) {
        this.a = ayqdVar;
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return get() == this;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        Object andSet = getAndSet(this);
        if (andSet == null || andSet == this) {
            return;
        }
        ((azjb) andSet).f(this);
    }
}
