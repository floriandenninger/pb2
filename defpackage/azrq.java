package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azrq extends AtomicReference implements ayqx {
    private static final long serialVersionUID = -7650903191002190468L;
    final ayqk a;

    public azrq(ayqk ayqkVar, azrr azrrVar) {
        this.a = ayqkVar;
        lazySet(azrrVar);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return get() == null;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        azrr azrrVar = (azrr) getAndSet(null);
        if (azrrVar != null) {
            azrrVar.ad(this);
        }
    }
}
