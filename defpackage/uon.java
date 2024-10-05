package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uon {
    static volatile boolean a;
    public static final /* synthetic */ int b = 0;
    private static volatile ActivityManager c;

    private uon() {
    }

    public static ActivityManager a(Context context) {
        if (c == null) {
            synchronized (uon.class) {
                if (c == null) {
                    Object systemService = context.getSystemService("activity");
                    systemService.getClass();
                    c = (ActivityManager) systemService;
                }
            }
        }
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r2 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b() {
        /*
            int r0 = android.os.Process.myPid()
            r1 = 0
            if (r0 > 0) goto L8
            goto L49
        L8:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L45
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L45
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L45
            r5 = 25
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L45
            java.lang.String r5 = "/proc/"
            r4.append(r5)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L45
            r4.append(r0)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L45
            java.lang.String r0 = "/cmdline"
            r4.append(r0)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L45
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L45
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L45
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L45
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c
            r0.getClass()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c
            java.lang.String r1 = r0.trim()     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c
        L35:
            r2.close()     // Catch: java.io.IOException -> L49
            goto L49
        L39:
            r0 = move-exception
            r1 = r2
            goto L3f
        L3c:
            goto L46
        L3e:
            r0 = move-exception
        L3f:
            if (r1 == 0) goto L44
            r1.close()     // Catch: java.io.IOException -> L44
        L44:
            throw r0
        L45:
            r2 = r1
        L46:
            if (r2 == 0) goto L49
            goto L35
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uon.b():java.lang.String");
    }

    public static boolean c(Context context) {
        Object systemService = context.getSystemService("activity");
        systemService.getClass();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            String packageName = context.getPackageName();
            String concat = String.valueOf(packageName).concat(":");
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(concat))) {
                    if (Build.VERSION.SDK_INT >= 23 || d(context)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean d(Context context) {
        Object systemService = context.getSystemService("power");
        systemService.getClass();
        return ((PowerManager) systemService).isInteractive();
    }
}
