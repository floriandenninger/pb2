package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class anfx extends anfi {
    private static final Logger a = Logger.getLogger(anfx.class.getName());
    public static final anfu b;
    public volatile int remaining;
    public volatile Set seenExceptions = null;

    static {
        anfu anfwVar;
        try {
            anfwVar = new anfv(AtomicReferenceFieldUpdater.newUpdater(anfx.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(anfx.class, "remaining"));
            th = null;
        } catch (Throwable th) {
            th = th;
            anfwVar = new anfw();
        }
        Throwable th2 = th;
        b = anfwVar;
        if (th2 != null) {
            a.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
    }

    public anfx(int i) {
        this.remaining = i;
    }

    public abstract void f(Set set);
}
