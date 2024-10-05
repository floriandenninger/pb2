package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azbm extends AtomicReference implements Runnable, banx {
    private static final long serialVersionUID = -2809475196591179431L;
    final banw a;
    volatile boolean b;

    public azbm(banw banwVar) {
        this.a = banwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() != ayrz.a) {
            if (this.b) {
                this.a.c(0L);
                lazySet(aysa.INSTANCE);
                this.a.sh();
            } else {
                lazySet(aysa.INSTANCE);
                this.a.b(new ayrg("Can't deliver value due to lack of requests"));
            }
        }
    }

    @Override // defpackage.banx
    public final void sd() {
        ayrz.c(this);
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        if (azqb.h(j)) {
            this.b = true;
        }
    }
}
