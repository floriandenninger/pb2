package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anfd {
    static final anfd a = new anfd();
    final Runnable b;
    final Executor c;
    anfd next;

    public anfd() {
        this.b = null;
        this.c = null;
    }

    public anfd(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}
