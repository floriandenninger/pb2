package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayvt extends aypn {
    final ayrk b;
    final ayrs c;
    final AtomicInteger d = new AtomicInteger();

    public ayvt(ayrk ayrkVar, ayrs ayrsVar) {
        this.b = ayrkVar;
        this.c = ayrsVar;
    }

    @Override // defpackage.aypn
    public final void ac(banw banwVar) {
        this.b.ab(banwVar);
        if (this.d.incrementAndGet() == 1) {
            this.b.ap(this.c);
        }
    }
}
