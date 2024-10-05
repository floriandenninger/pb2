package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azaa extends AtomicLong implements banx, ayqx {
    private static final long serialVersionUID = -4453897557930727610L;
    final azae a;
    final banw b;
    Object c;
    final AtomicLong d = new AtomicLong();
    boolean e;
    boolean f;

    public azaa(azae azaeVar, banw banwVar) {
        this.a = azaeVar;
        this.b = banwVar;
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return get() == Long.MIN_VALUE;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            this.a.g(this);
            this.a.d();
            this.c = null;
        }
    }

    @Override // defpackage.banx
    public final void sd() {
        qc();
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (!azqb.h(j) || ayeq.k(this, j) == Long.MIN_VALUE) {
            return;
        }
        ayeq.j(this.d, j);
        this.a.d();
        this.a.i.b(this);
    }
}
