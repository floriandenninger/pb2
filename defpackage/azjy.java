package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azjy extends AtomicInteger implements Runnable, ayta {
    private static final long serialVersionUID = 3880992722410194083L;
    final ayqd a;
    final Object b;

    public azjy(ayqd ayqdVar, Object obj) {
        this.a = ayqdVar;
        this.b = obj;
    }

    @Override // defpackage.aytf
    public final void d() {
        lazySet(3);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return get() == 3;
    }

    @Override // defpackage.aytf
    public final boolean j() {
        return get() != 1;
    }

    @Override // defpackage.aytf
    public final boolean k(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.ayqx
    public final void qc() {
        set(3);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            this.a.c(this.b);
            if (get() == 2) {
                lazySet(3);
                this.a.sh();
            }
        }
    }

    @Override // defpackage.aytb
    public final int sf(int i) {
        if ((i & 1) == 0) {
            return 0;
        }
        lazySet(1);
        return 1;
    }

    @Override // defpackage.aytf
    public final Object sg() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.b;
    }
}
