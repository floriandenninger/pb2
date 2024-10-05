package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azwa extends azxb {
    public static final azwa b = new azwa();
    private static final int d;
    private static volatile Executor pool;

    static {
        String str;
        int intValue;
        boolean z;
        Integer num = null;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            intValue = -1;
        } else {
            int length = str.length();
            if (length != 0) {
                int i = 0;
                char charAt = str.charAt(0);
                int i2 = -2147483647;
                int i3 = 1;
                if (azul.d(charAt) >= 0) {
                    z = false;
                    i3 = 0;
                } else if (length != 1) {
                    if (charAt == '-') {
                        i2 = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                        z = true;
                    } else if (charAt == '+') {
                        z = false;
                    }
                }
                int i4 = -59652323;
                while (true) {
                    if (i3 < length) {
                        int m = azul.m(str.charAt(i3));
                        if (m < 0) {
                            break;
                        }
                        if (i < i4) {
                            if (i4 != -59652323 || i < -214748364) {
                                break;
                            } else {
                                i4 = -214748364;
                            }
                        }
                        int i5 = i * 10;
                        if (i5 < i2 + m) {
                            break;
                        }
                        i = i5 - m;
                        i3++;
                    } else {
                        num = z ? Integer.valueOf(i) : Integer.valueOf(-i);
                    }
                }
            }
            if (num == null || num.intValue() <= 0) {
                throw new IllegalStateException(azul.a("Expected positive number in kotlinx.coroutines.default.parallelism, but has ", str).toString());
            }
            intValue = num.intValue();
        }
        d = intValue;
    }

    private azwa() {
    }

    private final int e() {
        Integer valueOf = Integer.valueOf(d);
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return azuj.c(Runtime.getRuntime().availableProcessors() - 1, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0040 A[Catch: all -> 0x009c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x000b, B:8:0x0096, B:17:0x001c, B:18:0x0022, B:36:0x0040, B:45:0x005f, B:29:0x0092), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized java.util.concurrent.Executor f() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.concurrent.Executor r0 = defpackage.azwa.pool     // Catch: java.lang.Throwable -> L9c
            if (r0 != 0) goto L9a
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L11
            java.util.concurrent.ExecutorService r0 = r6.g()     // Catch: java.lang.Throwable -> L9c
            goto L96
        L11:
            r0 = 0
            java.lang.String r1 = "java.util.concurrent.ForkJoinPool"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L19
            goto L1a
        L19:
            r1 = r0
        L1a:
            if (r1 != 0) goto L22
            java.util.concurrent.ExecutorService r0 = r6.g()     // Catch: java.lang.Throwable -> L9c
            goto L96
        L22:
            int r2 = defpackage.azwa.d     // Catch: java.lang.Throwable -> L9c
            r3 = 0
            if (r2 >= 0) goto L6a
            java.lang.String r2 = "commonPool"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L3c
            java.lang.reflect.Method r2 = r1.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L3c
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r2.invoke(r0, r4)     // Catch: java.lang.Throwable -> L3c
            boolean r4 = r2 instanceof java.util.concurrent.ExecutorService     // Catch: java.lang.Throwable -> L3c
            if (r4 == 0) goto L3c
            java.util.concurrent.ExecutorService r2 = (java.util.concurrent.ExecutorService) r2     // Catch: java.lang.Throwable -> L3c
            goto L3d
        L3c:
            r2 = r0
        L3d:
            if (r2 != 0) goto L40
            goto L6a
        L40:
            ajfg r4 = defpackage.ajfg.i     // Catch: java.lang.Throwable -> L9c
            r2.submit(r4)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r4 = "getPoolSize"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L5a
            java.lang.reflect.Method r4 = r1.getMethod(r4, r5)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r4 = r4.invoke(r2, r5)     // Catch: java.lang.Throwable -> L5a
            boolean r5 = r4 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L5a
            if (r5 == 0) goto L5a
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L5a
            goto L5b
        L5a:
            r4 = r0
        L5b:
            if (r4 != 0) goto L5f
        L5d:
            r2 = r0
            goto L66
        L5f:
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L9c
            if (r4 > 0) goto L66
            goto L5d
        L66:
            if (r2 == 0) goto L6a
            r0 = r2
            goto L96
        L6a:
            r2 = 1
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L8f
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L8f
            r4[r3] = r5     // Catch: java.lang.Throwable -> L8f
            java.lang.reflect.Constructor r1 = r1.getConstructor(r4)     // Catch: java.lang.Throwable -> L8f
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L8f
            azwa r4 = defpackage.azwa.b     // Catch: java.lang.Throwable -> L8f
            int r4 = r4.e()     // Catch: java.lang.Throwable -> L8f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L8f
            r2[r3] = r4     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.Throwable -> L8f
            boolean r2 = r1 instanceof java.util.concurrent.ExecutorService     // Catch: java.lang.Throwable -> L8f
            if (r2 == 0) goto L90
            java.util.concurrent.ExecutorService r1 = (java.util.concurrent.ExecutorService) r1     // Catch: java.lang.Throwable -> L8f
            r0 = r1
            goto L90
        L8f:
        L90:
            if (r0 != 0) goto L96
            java.util.concurrent.ExecutorService r0 = r6.g()     // Catch: java.lang.Throwable -> L9c
        L96:
            defpackage.azwa.pool = r0     // Catch: java.lang.Throwable -> L9c
            monitor-exit(r6)
            return r0
        L9a:
            monitor-exit(r6)
            return r0
        L9c:
            r0 = move-exception
            monitor-exit(r6)
            goto La0
        L9f:
            throw r0
        La0:
            goto L9f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azwa.f():java.util.concurrent.Executor");
    }

    private final ExecutorService g() {
        return Executors.newFixedThreadPool(e(), new barg(new AtomicInteger(), 1));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    @Override // defpackage.azwj
    public final void so(azsv azsvVar, Runnable runnable) {
        azsvVar.getClass();
        try {
            Executor executor = pool;
            if (executor == null) {
                executor = f();
            }
            executor.execute(runnable);
        } catch (RejectedExecutionException unused) {
            azwr.b.l(runnable);
        }
    }

    @Override // defpackage.azwj
    public final String toString() {
        return "CommonPool";
    }
}
