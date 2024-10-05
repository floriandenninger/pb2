package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import com.google.android.libraries.youtube.common.startup.ShutdownLikely$Handler;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yyf {
    public static final int a = wbs.aq(0, 2);
    public static final int b = wbs.aq(2, 2);
    public static final int c = wbs.aq(4, 6);
    public static final int d = wbs.aq(10, 1);
    public static final int e = wbs.aq(11, 4);
    public final aypy f;
    public final azrw g;
    public final ShutdownLikely$Handler h;
    public volatile int i;
    private final azrh j;
    private final azrw k;
    private volatile int l;

    public yyf(Context context, azrw azrwVar, azrw azrwVar2) {
        this.k = azrwVar;
        this.g = azrwVar2;
        ShutdownLikely$Handler shutdownLikely$Handler = new ShutdownLikely$Handler(this, context);
        this.h = shutdownLikely$Handler;
        this.l = 0;
        this.i = wbs.av(0, b, 2);
        if (shutdownLikely$Handler.a != null) {
            this.i = wbs.av(this.i, e, 4);
        }
        azrh aN = azrh.aN(Long.valueOf(wbs.aw(this.i, this.i)));
        this.j = aN;
        this.f = aN.aT().U();
    }

    public final void a() {
        c(e, 1);
    }

    public final void b() {
        ShutdownLikely$Handler shutdownLikely$Handler = this.h;
        shutdownLikely$Handler.b = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(shutdownLikely$Handler);
        Application application = shutdownLikely$Handler.a;
        if (application != null) {
            application.registerComponentCallbacks(shutdownLikely$Handler);
            Looper.myQueue().addIdleHandler(shutdownLikely$Handler);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0041 A[Catch: all -> 0x00a1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x0055, B:8:0x0063, B:10:0x006b, B:12:0x0074, B:14:0x0087, B:17:0x008c, B:25:0x000f, B:27:0x0013, B:37:0x0029, B:39:0x0041), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void c(final int r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = defpackage.yyf.e     // Catch: java.lang.Throwable -> La1
            r1 = 0
            r2 = 1
            if (r8 != r0) goto Lf
            int r3 = r7.i     // Catch: java.lang.Throwable -> La1
            int r0 = defpackage.wbs.au(r3, r0)     // Catch: java.lang.Throwable -> La1
            r9 = r9 | r0
            goto L55
        Lf:
            int r3 = defpackage.yyf.c     // Catch: java.lang.Throwable -> La1
            if (r8 != r3) goto L55
            int r3 = r7.i     // Catch: java.lang.Throwable -> La1
            int r0 = defpackage.wbs.au(r3, r0)     // Catch: java.lang.Throwable -> La1
            r0 = r0 & 8
            if (r0 != 0) goto L1f
            monitor-exit(r7)
            return
        L1f:
            r0 = -1
            if (r9 == r0) goto L28
            if (r9 != r2) goto L26
            r9 = 1
            goto L28
        L26:
            r0 = 0
            goto L29
        L28:
            r0 = 1
        L29:
            defpackage.amkq.E(r0)     // Catch: java.lang.Throwable -> La1
            int r0 = r7.i     // Catch: java.lang.Throwable -> La1
            int r0 = defpackage.wbs.au(r0, r8)     // Catch: java.lang.Throwable -> La1
            int r0 = r0 + r9
            int r9 = java.lang.Math.max(r0, r1)     // Catch: java.lang.Throwable -> La1
            int r0 = defpackage.wbs.as(r8)     // Catch: java.lang.Throwable -> La1
            int r9 = java.lang.Math.min(r9, r0)     // Catch: java.lang.Throwable -> La1
            if (r9 != r2) goto L55
            azrw r0 = r7.k     // Catch: java.lang.Throwable -> La1
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> La1
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0     // Catch: java.lang.Throwable -> La1
            yyd r3 = new yyd     // Catch: java.lang.Throwable -> La1
            r3.<init>()     // Catch: java.lang.Throwable -> La1
            r4 = 30
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> La1
            r0.schedule(r3, r4, r6)     // Catch: java.lang.Throwable -> La1
        L55:
            int r0 = r7.i     // Catch: java.lang.Throwable -> La1
            int r8 = defpackage.wbs.av(r0, r8, r9)     // Catch: java.lang.Throwable -> La1
            int r9 = defpackage.yyf.a     // Catch: java.lang.Throwable -> La1
            int r0 = defpackage.wbs.au(r8, r9)     // Catch: java.lang.Throwable -> La1
            if (r0 != 0) goto L73
            int r0 = defpackage.yyf.b     // Catch: java.lang.Throwable -> La1
            int r0 = defpackage.wbs.au(r8, r0)     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L73
            int r0 = defpackage.yyf.c     // Catch: java.lang.Throwable -> La1
            int r0 = defpackage.wbs.au(r8, r0)     // Catch: java.lang.Throwable -> La1
            if (r0 <= 0) goto L74
        L73:
            r1 = 1
        L74:
            r7.l = r1     // Catch: java.lang.Throwable -> La1
            int r0 = defpackage.yyf.d     // Catch: java.lang.Throwable -> La1
            int r1 = r7.l     // Catch: java.lang.Throwable -> La1
            int r8 = defpackage.wbs.av(r8, r0, r1)     // Catch: java.lang.Throwable -> La1
            int r0 = r7.i     // Catch: java.lang.Throwable -> La1
            int r9 = defpackage.wbs.au(r0, r9)     // Catch: java.lang.Throwable -> La1
            r0 = 3
            if (r9 == r0) goto L9f
            int r9 = r7.i     // Catch: java.lang.Throwable -> La1
            if (r9 != r8) goto L8c
            goto L9f
        L8c:
            int r9 = r7.i     // Catch: java.lang.Throwable -> La1
            r7.i = r8     // Catch: java.lang.Throwable -> La1
            azrh r0 = r7.j     // Catch: java.lang.Throwable -> La1
            long r8 = defpackage.wbs.aw(r8, r9)     // Catch: java.lang.Throwable -> La1
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> La1
            r0.c(r8)     // Catch: java.lang.Throwable -> La1
            monitor-exit(r7)
            return
        L9f:
            monitor-exit(r7)
            return
        La1:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yyf.c(int, int):void");
    }
}
