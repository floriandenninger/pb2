package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class una implements Callable {
    public final /* synthetic */ unb a;
    private final /* synthetic */ int b;

    public /* synthetic */ una(unb unbVar, int i) {
        this.b = i;
        this.a = unbVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.b == 0) {
            unb unbVar = this.a;
            ((amxh) ((amxh) unb.a.c()).i("com/google/android/libraries/performance/primes/DeferrableExecutor", "unblockAfterResume", 85, "DeferrableExecutor.java")).q("DeferrableExecutor unblocked after onResume");
            unbVar.a();
            return null;
        }
        unb unbVar2 = this.a;
        ((amxh) ((amxh) unb.a.c()).i("com/google/android/libraries/performance/primes/DeferrableExecutor", "unblockAfterMaxDelay", 79, "DeferrableExecutor.java")).q("DeferrableExecutor unblocked after max task delay");
        unbVar2.a();
        return null;
    }
}
