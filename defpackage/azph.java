package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azph {
    public static final boolean a;
    public static final int b;
    static final AtomicReference c = new AtomicReference();
    public static final Map d = new ConcurrentHashMap();

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (r2 != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004e A[LOOP:0: B:8:0x004e->B:12:0x007c, LOOP_START] */
    static {
        /*
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            defpackage.azph.c = r0
            j$.util.concurrent.ConcurrentHashMap r0 = new j$.util.concurrent.ConcurrentHashMap
            r0.<init>()
            defpackage.azph.d = r0
            java.util.Properties r0 = java.lang.System.getProperties()
            azpg r1 = new azpg
            r1.<init>()
            java.lang.String r2 = "rx2.purge-enabled"
            boolean r3 = r0.containsKey(r2)
            r4 = 1
            if (r3 == 0) goto L2d
            java.lang.String r2 = r0.getProperty(r2)
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            r1.a = r2
            if (r2 == 0) goto L42
            goto L2f
        L2d:
            r1.a = r4
        L2f:
            java.lang.String r2 = "rx2.purge-period-seconds"
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L42
            java.lang.String r0 = r0.getProperty(r2)     // Catch: java.lang.NumberFormatException -> L42
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L42
            r1.b = r0     // Catch: java.lang.NumberFormatException -> L42
            goto L44
        L42:
            r1.b = r4
        L44:
            boolean r0 = r1.a
            defpackage.azph.a = r0
            int r1 = r1.b
            defpackage.azph.b = r1
            if (r0 == 0) goto L80
        L4e:
            java.util.concurrent.atomic.AtomicReference r0 = defpackage.azph.c
            java.lang.Object r1 = r0.get()
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1
            if (r1 == 0) goto L59
            goto L80
        L59:
            azpb r1 = new azpb
            java.lang.String r2 = "RxSchedulerPurge"
            r1.<init>(r2)
            java.util.concurrent.ScheduledExecutorService r5 = java.util.concurrent.Executors.newScheduledThreadPool(r4, r1)
            r1 = 0
            boolean r0 = r0.compareAndSet(r1, r5)
            if (r0 == 0) goto L7c
            ajfg r6 = new ajfg
            r0 = 17
            r6.<init>(r0)
            int r0 = defpackage.azph.b
            long r7 = (long) r0
            long r9 = (long) r0
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            r5.scheduleAtFixedRate(r6, r7, r9, r11)
            return
        L7c:
            r5.shutdownNow()
            goto L4e
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azph.<clinit>():void");
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        return newScheduledThreadPool;
    }
}
