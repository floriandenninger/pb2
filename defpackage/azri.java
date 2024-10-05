package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azri extends AtomicReference implements ayqx {
    private static final long serialVersionUID = -7650903191002190468L;
    final aypi a;

    public azri(aypi aypiVar, azrj azrjVar) {
        this.a = aypiVar;
        lazySet(azrjVar);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return get() == null;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        azrj azrjVar = (azrj) getAndSet(null);
        if (azrjVar != null) {
            azrjVar.X(this);
        }
    }
}
