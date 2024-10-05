package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anxc implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(1);
    private final /* synthetic */ int b;

    public anxc(int i, byte[] bArr) {
        this.b = i;
    }

    public anxc(int i) {
        this.b = i;
    }

    public anxc(int i, char[] cArr) {
        this.b = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.b;
        if (i == 0) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.a.getAndIncrement())));
        }
        if (i == 1) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.a.getAndIncrement())));
            return thread;
        }
        return new Thread(new iiz(runnable, 4), "CrAsyncTask #" + this.a.getAndIncrement());
    }
}
