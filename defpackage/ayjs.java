package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayjs implements Runnable {
    private static final Logger a = Logger.getLogger(ayjs.class.getName());
    private final Runnable b;

    public ayjs(Runnable runnable) {
        runnable.getClass();
        this.b = runnable;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("LogExceptionRunnable(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.run();
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(this.b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Exception while executing runnable ");
            sb.append(valueOf);
            logger.logp(level, "io.grpc.internal.LogExceptionRunnable", "run", sb.toString(), th);
            amnz.f(th);
            throw new AssertionError(th);
        }
    }
}
