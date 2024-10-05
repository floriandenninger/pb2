package defpackage;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class unk implements RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        ((amxh) ((amxh) unn.a.c()).i("com/google/android/libraries/performance/primes/PrimesExecutorsModule$DefaultRejectedExecutionHandler", "rejectedExecution", 64, "PrimesExecutorsModule.java")).s("Service rejected execution of %s", runnable);
    }
}
