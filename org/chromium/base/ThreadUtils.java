package org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ThreadUtils {
    private static final Object a = new Object();
    private static Handler b;

    public static Handler a() {
        boolean z;
        synchronized (a) {
            if (b == null) {
                b = new Handler(Looper.getMainLooper());
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            TraceEvent.e();
        }
        return b;
    }

    public static Looper b() {
        return a().getLooper();
    }

    @Deprecated
    public static void c(Runnable runnable) {
        if (a().getLooper() != Looper.myLooper()) {
            a().post(runnable);
        } else {
            runnable.run();
        }
    }

    private static boolean isThreadPriorityAudio(int i) {
        return Process.getThreadPriority(i) == -16;
    }

    public static void setThreadPriorityAudio(int i) {
        Process.setThreadPriority(i, -16);
    }
}
