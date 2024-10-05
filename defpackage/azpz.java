package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azpz extends AtomicInteger implements aytc {
    private static final long serialVersionUID = -3830916580126663321L;
    final Object a;
    final banw b;

    public azpz(banw banwVar, Object obj) {
        this.b = banwVar;
        this.a = obj;
    }

    @Override // defpackage.aytf
    public final void d() {
        lazySet(1);
    }

    @Override // defpackage.aytf
    public final boolean j() {
        return get() != 0;
    }

    @Override // defpackage.aytf
    public final boolean k(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.banx
    public final void sd() {
        lazySet(2);
    }

    @Override // defpackage.aytb
    public final int sf(int i) {
        return i & 1;
    }

    @Override // defpackage.aytf
    public final Object sg() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.a;
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (azqb.h(j) && compareAndSet(0, 1)) {
            banw banwVar = this.b;
            banwVar.c(this.a);
            if (get() != 2) {
                banwVar.sh();
            }
        }
    }
}
