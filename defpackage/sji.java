package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sji implements ThreadFactory {
    private final sjo a;
    private final sjq b;
    private final AtomicInteger c = new AtomicInteger(1000);

    public sji(sjq sjqVar, ThreadFactory threadFactory) {
        this.b = sjqVar;
        this.a = new sjo(threadFactory);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int size;
        Thread newThread = this.a.newThread(runnable);
        if (sjp.c()) {
            sjo sjoVar = this.a;
            synchronized (sjoVar) {
                size = sjoVar.a.size();
            }
            if (size >= 1000) {
                while (true) {
                    int i = this.c.get();
                    if (size < i) {
                        break;
                    }
                    if (this.c.compareAndSet(i, i + i)) {
                        StringBuilder sb = new StringBuilder(82);
                        sb.append("Number of blocking threads ");
                        sb.append(size);
                        sb.append(" exceeds starvation threshold of 1000");
                        sjp.b(this.b, this.a.a(), new sjm(sb.toString()));
                    }
                }
            }
        }
        return newThread;
    }
}
