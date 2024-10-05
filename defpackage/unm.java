package defpackage;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class unm implements ThreadFactory {
    public final int a;
    private final AtomicInteger b = new AtomicInteger(1);
    private final String c = "Primes";

    public unm(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        Runnable runnable2 = new Runnable() { // from class: unl
            @Override // java.lang.Runnable
            public final void run() {
                unm unmVar = unm.this;
                Runnable runnable3 = runnable;
                int i = unmVar.a;
                if (i != 0) {
                    Process.setThreadPriority(i);
                }
                runnable3.run();
            }
        };
        String str = this.c;
        int andIncrement = this.b.getAndIncrement();
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append(str);
        sb.append("-");
        sb.append(andIncrement);
        Thread thread = new Thread(runnable2, sb.toString());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
