package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azpo extends ayqi {
    public static final azpo b = new azpo();

    @Override // defpackage.ayqi
    public final ayqh a() {
        return new azpn();
    }

    @Override // defpackage.ayqi
    public final ayqx c(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            aynu.k(runnable);
            runnable.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            aynu.j(e);
        }
        return aysa.INSTANCE;
    }

    @Override // defpackage.ayqi
    public final ayqx f(Runnable runnable) {
        aynu.k(runnable);
        runnable.run();
        return aysa.INSTANCE;
    }
}
