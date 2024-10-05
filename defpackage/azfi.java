package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azfi extends aypy {
    final azqo a;
    final ayrs b;
    final AtomicInteger c = new AtomicInteger();

    public azfi(azqo azqoVar, ayrs ayrsVar) {
        this.a = azqoVar;
        this.b = ayrsVar;
    }

    @Override // defpackage.aypy
    public final void f(ayqd ayqdVar) {
        this.a.aE(ayqdVar);
        if (this.c.incrementAndGet() == 1) {
            this.a.a(this.b);
        }
    }
}
