package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azrm extends AtomicInteger implements ayqx {
    private static final long serialVersionUID = 466549804534799122L;
    final ayqd a;
    final azro b;
    Object c;
    volatile boolean d;

    public azrm(ayqd ayqdVar, azro azroVar) {
        this.a = ayqdVar;
        this.b = azroVar;
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.d;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.b.aN(this);
    }
}
