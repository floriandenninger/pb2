package defpackage;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aynr implements Executor, Runnable {
    private static final Logger b = Logger.getLogger(aynr.class.getName());
    private static final ayno c;
    private final Executor d;
    private final Queue e = new ConcurrentLinkedQueue();
    public volatile int a = 0;

    static {
        ayno aynqVar;
        try {
            aynqVar = new aynp(AtomicIntegerFieldUpdater.newUpdater(aynr.class, "a"));
        } catch (Throwable th) {
            b.logp(Level.SEVERE, "io.grpc.internal.SerializingExecutor", "getAtomicHelper", "FieldUpdaterAtomicHelper failed", th);
            aynqVar = new aynq();
        }
        c = aynqVar;
    }

    public aynr(Executor executor) {
        executor.getClass();
        this.d = executor;
    }

    private final void a(Runnable runnable) {
        if (c.a(this)) {
            try {
                this.d.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.e.remove(runnable);
                }
                c.b(this);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Queue queue = this.e;
        runnable.getClass();
        queue.add(runnable);
        a(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        try {
            Executor executor = this.d;
            while (executor == this.d && (runnable = (Runnable) this.e.poll()) != null) {
                try {
                    runnable.run();
                } catch (RuntimeException e) {
                    Logger logger = b;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(runnable);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                    sb.append("Exception while executing runnable ");
                    sb.append(valueOf);
                    logger.logp(level, "io.grpc.internal.SerializingExecutor", "run", sb.toString(), (Throwable) e);
                }
            }
            c.b(this);
            if (this.e.isEmpty()) {
                return;
            }
            a(null);
        } catch (Throwable th) {
            c.b(this);
            throw th;
        }
    }
}
