package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azop extends AtomicBoolean implements Runnable, ayqx {
    private static final long serialVersionUID = -2421395018820541164L;
    final Runnable a;

    public azop(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return get();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        lazySet(true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get()) {
            return;
        }
        try {
            this.a.run();
        } finally {
            lazySet(true);
        }
    }
}
