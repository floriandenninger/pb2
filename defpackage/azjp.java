package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azjp extends AtomicInteger implements ayqx {
    private static final long serialVersionUID = 2728361546769921047L;
    final azjs a;
    final ayqd b;
    Object c;
    volatile boolean d;

    public azjp(azjs azjsVar, ayqd ayqdVar) {
        this.a = azjsVar;
        this.b = ayqdVar;
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
        this.a.f(this);
        this.c = null;
    }
}
