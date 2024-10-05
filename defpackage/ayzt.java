package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayzt extends AtomicLong implements banx {
    private static final long serialVersionUID = 2845000326761540265L;
    final banw a;
    final ayzu b;
    long c;

    public ayzt(banw banwVar, ayzu ayzuVar) {
        this.a = banwVar;
        this.b = ayzuVar;
    }

    public final boolean a() {
        return get() == Long.MIN_VALUE;
    }

    @Override // defpackage.banx
    public final void sd() {
        if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            this.b.g(this);
            this.b.d();
        }
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        ayeq.k(this, j);
        this.b.d();
    }
}
