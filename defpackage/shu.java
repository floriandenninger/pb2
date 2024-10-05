package defpackage;

import android.os.Build;
import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class shu {
    public static final int[] a;

    static {
        "ranchu".equals(Build.HARDWARE);
        a = new int[]{19, 16, 13, 10, 0, -2, -4, -5, -6, -8};
    }

    public static ThreadFactory a(final int i, final ThreadFactory threadFactory) {
        return new ThreadFactory() { // from class: sht
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                final int i2;
                final int i3 = i;
                ThreadFactory threadFactory2 = threadFactory;
                int i4 = 0;
                while (true) {
                    int length = shu.a.length;
                    i2 = 10;
                    if (i4 >= 10) {
                        break;
                    }
                    if (i3 >= shu.a[i4]) {
                        i2 = i4 + 1;
                        break;
                    }
                    i4++;
                }
                Thread newThread = threadFactory2.newThread(new Runnable() { // from class: shs
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i5 = i2;
                        int i6 = i3;
                        Runnable runnable2 = runnable;
                        if (i5 <= 0 || i5 > 10) {
                            StringBuilder sb = new StringBuilder(34);
                            sb.append("Invalid java priority: ");
                            sb.append(i5);
                            throw new IllegalArgumentException(sb.toString());
                        }
                        if (shu.a[i5 - 1] != i6 || Build.VERSION.SDK_INT == 21) {
                            Process.setThreadPriority(i6);
                        }
                        runnable2.run();
                    }
                });
                newThread.setPriority(i2);
                return newThread;
            }
        };
    }
}
