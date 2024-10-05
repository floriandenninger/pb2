package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sjo implements ThreadFactory {
    public final HashSet a = new HashSet();
    private final ThreadFactory b;

    public sjo(ThreadFactory threadFactory) {
        this.b = threadFactory;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ArrayList a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        Thread newThread = this.b.newThread(new Runnable() { // from class: sjn
            @Override // java.lang.Runnable
            public final void run() {
                sjo sjoVar = sjo.this;
                try {
                    runnable.run();
                    synchronized (sjoVar) {
                        sjoVar.a.remove(Thread.currentThread());
                    }
                } catch (Throwable th) {
                    synchronized (sjoVar) {
                        sjoVar.a.remove(Thread.currentThread());
                        throw th;
                    }
                }
            }
        });
        synchronized (this) {
            this.a.add(newThread);
        }
        return newThread;
    }
}
