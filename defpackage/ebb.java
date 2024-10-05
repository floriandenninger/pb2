package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ebb implements ThreadFactory {
    private final ThreadFactory a = Executors.defaultThreadFactory();
    private final AtomicInteger b = new AtomicInteger(1);
    private final /* synthetic */ int c;

    public ebb(int i, byte[] bArr) {
        this.c = i;
    }

    public ebb(int i) {
        this.c = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        if (this.c == 0) {
            Thread newThread = this.a.newThread(runnable);
            int andIncrement = this.b.getAndIncrement();
            StringBuilder sb = new StringBuilder(16);
            sb.append("gads-");
            sb.append(andIncrement);
            newThread.setName(sb.toString());
            return newThread;
        }
        Thread newThread2 = this.a.newThread(runnable);
        int andIncrement2 = this.b.getAndIncrement();
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("PlayBillingLibrary-");
        sb2.append(andIncrement2);
        newThread2.setName(sb2.toString());
        return newThread2;
    }
}
