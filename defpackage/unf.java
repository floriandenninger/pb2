package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class unf {
    public static final /* synthetic */ int b = 0;
    private static final amxj c = amxj.l("com/google/android/libraries/performance/primes/Primes");
    private static final unf d;
    private static volatile boolean e;
    private static volatile unf f;
    public final ung a;

    static {
        unf unfVar = new unf(new une());
        d = unfVar;
        e = true;
        f = unfVar;
    }

    public unf(ung ungVar) {
        this.a = ungVar;
    }

    public static unf a() {
        if (f == d && e) {
            e = false;
            ((amxh) ((amxh) c.e()).i("com/google/android/libraries/performance/primes/Primes", "get", 134, "Primes.java")).q("Primes not initialized, returning default (no-op) Primes instance which will ignore all calls. Please call Primes.initialize(...) before using any Primes API.");
        }
        return f;
    }

    public static synchronized void b(unc uncVar) {
        synchronized (unf.class) {
            if (f != d) {
                ((amxh) ((amxh) c.c()).i("com/google/android/libraries/performance/primes/Primes", "initialize", 112, "Primes.java")).q("Primes.initialize() is called more than once. This call will be ignored.");
            } else {
                if (!uqq.n()) {
                    ((amxh) ((amxh) c.g()).i("com/google/android/libraries/performance/primes/Primes", "initialize", 116, "Primes.java")).q("Primes.initialize() should only be called from the main thread.");
                }
                f = uncVar.a;
            }
        }
    }
}
