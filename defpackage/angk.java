package defpackage;

import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class angk {
    public static final Logger a = Logger.getLogger(angk.class.getName());
    public final anht c;
    private final AtomicReference d = new AtomicReference(angj.OPEN);
    public final angh b = new angh();

    public angk(vht vhtVar, Executor executor) {
        aniu g = aniu.g(new angc(this, vhtVar));
        executor.execute(g);
        this.c = g;
    }

    @Deprecated
    public static angk a(anhy anhyVar, Executor executor) {
        executor.getClass();
        angk angkVar = new angk(anaf.P(anhyVar));
        anaf.Y(anhyVar, new angb(angkVar, executor), angq.a);
        return angkVar;
    }

    public static angk b(anhy anhyVar) {
        return new angk(anhyVar);
    }

    public static void f(Closeable closeable, Executor executor) {
        if (closeable != null) {
            try {
                executor.execute(new anga(closeable));
            } catch (RejectedExecutionException e) {
                Logger logger = a;
                if (logger.isLoggable(Level.WARNING)) {
                    logger.logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture", "closeQuietly", String.format("while submitting close to %s; will close inline", executor), (Throwable) e);
                }
                f(closeable, angq.a);
            }
        }
    }

    private final boolean i(angj angjVar, angj angjVar2) {
        return this.d.compareAndSet(angjVar, angjVar2);
    }

    public final angk c(angg anggVar, Executor executor) {
        anggVar.getClass();
        return g((anht) anfq.i(this.c, new ange(this, anggVar), executor));
    }

    public final void d(angh anghVar) {
        e(angj.OPEN, angj.SUBSUMED);
        anghVar.a(this.b, angq.a);
    }

    public final void e(angj angjVar, angj angjVar2) {
        amkq.T(i(angjVar, angjVar2), "Expected state to be %s, but it was %s", angjVar, angjVar2);
    }

    protected final void finalize() {
        if (((angj) this.d.get()).equals(angj.OPEN)) {
            a.logp(Level.SEVERE, "com.google.common.util.concurrent.ClosingFuture", "finalize", "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            h();
        }
    }

    public final angk g(anht anhtVar) {
        angk angkVar = new angk(anhtVar);
        d(angkVar.b);
        return angkVar;
    }

    public final anht h() {
        if (i(angj.OPEN, angj.WILL_CLOSE)) {
            a.logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "finishToFuture", "will close {0}", this);
            this.c.d(new angf(this), angq.a);
        } else {
            int ordinal = ((angj) this.d.get()).ordinal();
            if (ordinal == 0) {
                throw new AssertionError();
            }
            if (ordinal == 1) {
                throw new IllegalStateException("Cannot call finishToFuture() after deriving another step");
            }
            if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
                throw new IllegalStateException("Cannot call finishToFuture() twice");
            }
            if (ordinal == 5) {
                throw new IllegalStateException("Cannot call finishToFuture() after calling finishToValueAndCloser()");
            }
        }
        return this.c;
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("state", this.d.get());
        Y.a(this.c);
        return Y.toString();
    }

    private angk(anhy anhyVar) {
        this.c = anht.q(anhyVar);
    }
}
