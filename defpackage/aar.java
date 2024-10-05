package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aar extends gm {
    public static final Executor a = new qmq(1);
    private static volatile aar c;
    public final gm b;
    private final gm d;

    private aar() {
        aas aasVar = new aas();
        this.d = aasVar;
        this.b = aasVar;
    }

    public static aar B() {
        if (c != null) {
            return c;
        }
        synchronized (aar.class) {
            if (c == null) {
                c = new aar();
            }
        }
        return c;
    }

    public final boolean C() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
