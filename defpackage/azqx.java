package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azqx extends AtomicLong implements banx {
    private static final long serialVersionUID = 3562861878281475070L;
    final banw a;
    final azqy b;

    public azqx(banw banwVar, azqy azqyVar) {
        this.a = banwVar;
        this.b = azqyVar;
    }

    @Override // defpackage.banx
    public final void sd() {
        if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            this.b.aq(this);
        }
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (azqb.h(j)) {
            ayeq.k(this, j);
        }
    }
}
