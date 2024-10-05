package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qts implements ThreadFactory {
    private final String a;
    private final ThreadFactory b = Executors.defaultThreadFactory();

    public qts(String str) {
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.b.newThread(new qtt(runnable));
        newThread.setName(this.a);
        return newThread;
    }
}
