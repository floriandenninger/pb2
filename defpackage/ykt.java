package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ykt extends yky {
    private final Handler b;
    private final Thread c;

    private ykt(Handler handler, ykl yklVar) {
        super(yklVar);
        handler.getClass();
        this.b = handler;
        this.c = handler.getLooper().getThread();
    }

    public static ykt c(Handler handler, ykl yklVar) {
        return new ykt(handler, yklVar);
    }

    @Override // defpackage.yky
    protected final void d(Runnable runnable) {
        if (Thread.currentThread() != this.c) {
            this.b.post(runnable);
        } else {
            runnable.run();
        }
    }
}
