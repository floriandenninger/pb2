package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cdz implements Executor {
    public final ArrayDeque a = new ArrayDeque();
    public final Object b = new Object();
    private final Executor c;
    private volatile Runnable d;

    public cdz(Executor executor) {
        this.c = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        synchronized (this.b) {
            Runnable runnable = (Runnable) this.a.poll();
            this.d = runnable;
            if (runnable != null) {
                this.c.execute(this.d);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.b) {
            this.a.add(new cdy(this, runnable));
            if (this.d == null) {
                a();
            }
        }
    }
}
