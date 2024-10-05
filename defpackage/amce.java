package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amce {
    public final anhy a;

    public amce() {
        this.a = anaf.O(false);
    }

    public amce(anhy anhyVar) {
        this.a = anhyVar;
    }

    private static final long c(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return 912680550L;
        }
        if (i2 != 2) {
            return i2 != 4 ? 3650722200L : 2738041650L;
        }
        return 1825361100L;
    }

    public final anhy a() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b() {
        /*
            r7 = this;
            anhy r0 = r7.a
            boolean r0 = r0.isDone()
            if (r0 == 0) goto L11
            anhy r0 = r7.a     // Catch: java.lang.Throwable -> L11
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L11
            ammv r0 = (defpackage.ammv) r0     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            amlr r0 = defpackage.amlr.a
        L13:
            boolean r1 = r0.h()
            r2 = 1
            if (r1 != 0) goto L1b
            return r2
        L1b:
            java.lang.Object r0 = r0.c()
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r3 = 4
            long r4 = c(r3)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L2f
            return r3
        L2f:
            r3 = 5
            long r4 = c(r3)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L39
            return r3
        L39:
            r3 = 3
            long r4 = c(r3)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L43
            return r3
        L43:
            r3 = 2
            long r4 = c(r3)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L4d
            return r3
        L4d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amce.b():int");
    }

    public amce(final aadw aadwVar, final Context context, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.a = anaf.V(anaf.S(new Callable() { // from class: aknc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ActivityManager activityManager;
                aadw aadwVar2 = aadw.this;
                Context context2 = context;
                atfq atfqVar = aadwVar2.b().o;
                if (atfqVar == null) {
                    atfqVar = atfq.a;
                }
                if (atfqVar.r && (activityManager = (ActivityManager) context2.getSystemService("activity")) != null) {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    return ammv.j(Long.valueOf(memoryInfo.totalMem));
                }
                return amlr.a;
            }
        }, executor), 10L, TimeUnit.SECONDS, scheduledExecutorService);
    }
}
