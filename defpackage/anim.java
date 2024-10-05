package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anim implements Executor {
    public static final Logger a = Logger.getLogger(anim.class.getName());
    private final Executor e;
    public final Deque b = new ArrayDeque();
    public int d = 1;
    public long c = 0;
    private final anil f = new anil(this);

    public anim(Executor executor) {
        executor.getClass();
        this.e = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.b) {
            int i = this.d;
            if (i != 4 && i != 3) {
                long j = this.c;
                boolean z = false;
                anik anikVar = new anik(runnable, 0);
                this.b.add(anikVar);
                this.d = 2;
                try {
                    this.e.execute(this.f);
                    if (this.d != 2) {
                        return;
                    }
                    synchronized (this.b) {
                        if (this.c == j && this.d == 2) {
                            this.d = 3;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.b) {
                        int i2 = this.d;
                        if ((i2 == 1 || i2 == 2) && this.b.removeLastOccurrence(anikVar)) {
                            z = true;
                        }
                        if (!(e instanceof RejectedExecutionException) || z) {
                            throw e;
                        }
                    }
                    return;
                }
            }
            this.b.add(runnable);
        }
    }

    public final String toString() {
        int identityHashCode = System.identityHashCode(this);
        String valueOf = String.valueOf(this.e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("SequentialExecutor@");
        sb.append(identityHashCode);
        sb.append("{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
