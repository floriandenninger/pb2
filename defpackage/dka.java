package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dka implements ThreadFactory {
    private static final AtomicInteger b = new AtomicInteger(1);
    public final int a;
    private final AtomicInteger c = new AtomicInteger(1);
    private final int d = b.getAndIncrement();

    public dka(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        djz djzVar = new djz(this, runnable);
        int i = this.d;
        int andIncrement = this.c.getAndIncrement();
        StringBuilder sb = new StringBuilder(44);
        sb.append("ComponentLayoutThread");
        sb.append(i);
        sb.append("-");
        sb.append(andIncrement);
        Thread thread = new Thread(djzVar, sb.toString());
        thread.setPriority(10);
        return thread;
    }
}
