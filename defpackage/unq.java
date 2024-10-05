package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class unq {
    private static final amxj c = amxj.l("com/google/android/libraries/performance/primes/Shutdown");
    final List a = new ArrayList();
    public volatile boolean b;

    public final synchronized void a() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((amxh) ((amxh) c.c()).i("com/google/android/libraries/performance/primes/Shutdown", "shutdown", 37, "Shutdown.java")).q("Shutdown ...");
        synchronized (this.a) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                try {
                    ((unr) it.next()).a();
                } catch (RuntimeException e) {
                    ((amxh) ((amxh) ((amxh) c.c()).h(e)).i("com/google/android/libraries/performance/primes/Shutdown", "shutdown", '+', "Shutdown.java")).q("ShutdownListener crashed");
                }
            }
            this.a.clear();
            ((amxh) ((amxh) c.c()).i("com/google/android/libraries/performance/primes/Shutdown", "shutdown", 47, "Shutdown.java")).q("All ShutdownListeners notified.");
        }
    }
}
