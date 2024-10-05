package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azoo extends AtomicReference implements Runnable, ayqx {
    private static final long serialVersionUID = -4101336210206799084L;
    final aysd a;
    final aysd b;

    public azoo(Runnable runnable) {
        super(runnable);
        this.a = new aysd();
        this.b = new aysd();
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return get() == null;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        if (getAndSet(null) != null) {
            ayrz.c(this.a);
            ayrz.c(this.b);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = (Runnable) get();
        if (runnable != null) {
            try {
                runnable.run();
            } finally {
                lazySet(null);
                this.a.lazySet(ayrz.a);
                this.b.lazySet(ayrz.a);
            }
        }
    }
}
