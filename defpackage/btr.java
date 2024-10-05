package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class btr implements Executor {
    private final Executor a;
    private final ArrayDeque b = new ArrayDeque();
    private Runnable c;

    public btr(Executor executor) {
        this.a = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a() {
        Runnable runnable = (Runnable) this.b.poll();
        this.c = runnable;
        if (runnable != null) {
            this.a.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        this.b.offer(new btq(this, runnable));
        if (this.c == null) {
            a();
        }
    }
}
