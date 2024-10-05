package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azpk implements Runnable {
    private final Runnable a;
    private final azpn b;
    private final long c;

    public azpk(Runnable runnable, azpn azpnVar, long j) {
        this.a = runnable;
        this.b = azpnVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.c) {
            return;
        }
        long f = azpn.f(TimeUnit.MILLISECONDS);
        long j = this.c;
        if (j > f) {
            try {
                Thread.sleep(j - f);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                aynu.j(e);
                return;
            }
        }
        if (this.b.c) {
            return;
        }
        this.a.run();
    }
}
