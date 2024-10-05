package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azpd extends azoi implements Callable {
    private static final long serialVersionUID = 1811839108042568751L;

    public azpd(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.d = Thread.currentThread();
        try {
            this.c.run();
            return null;
        } finally {
            lazySet(a);
            this.d = null;
        }
    }
}
