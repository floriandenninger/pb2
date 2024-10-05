package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azrk extends AtomicBoolean implements ayqx {
    private static final long serialVersionUID = 3562861878281475070L;
    final ayqd a;
    final azrl b;

    public azrk(ayqd ayqdVar, azrl azrlVar) {
        this.a = ayqdVar;
        this.b = azrlVar;
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return get();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        if (compareAndSet(false, true)) {
            this.b.aN(this);
        }
    }
}
