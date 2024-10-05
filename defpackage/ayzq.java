package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayzq extends AtomicLong implements banx {
    private static final long serialVersionUID = -4453897557930727610L;
    final banw a;
    volatile ayzr b;
    long c;

    public ayzq(banw banwVar) {
        this.a = banwVar;
    }

    @Override // defpackage.banx
    public final void sd() {
        ayzr ayzrVar;
        if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE || (ayzrVar = this.b) == null) {
            return;
        }
        ayzrVar.g(this);
        ayzrVar.d();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (azqb.h(j)) {
            ayeq.k(this, j);
            ayzr ayzrVar = this.b;
            if (ayzrVar != null) {
                ayzrVar.d();
            }
        }
    }
}
