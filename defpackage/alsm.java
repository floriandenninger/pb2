package defpackage;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alsm {
    public static final alsm a = new alsm(a("SetupCompatServiceInvoker", 50));
    public static final alsm b = new alsm(a("SetupBindbackServiceExecutor", 1));
    public final Executor c;

    private alsm(Executor executor) {
        this.c = executor;
    }

    public static ExecutorService a(String str, int i) {
        return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.SECONDS, new ArrayBlockingQueue(i), new ptr(str, 2));
    }
}
