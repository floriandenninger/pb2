package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class byj implements ThreadFactory {
    final /* synthetic */ boolean a;
    private final AtomicInteger b = new AtomicInteger(0);

    public byj(boolean z) {
        this.a = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, (true != this.a ? "androidx.work-" : "WM.task-") + this.b.incrementAndGet());
    }
}
