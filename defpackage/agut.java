package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agut extends Thread {
    final /* synthetic */ aguu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agut(aguu aguuVar, Runnable runnable) {
        super(runnable, "offlineTransfer");
        this.a = aguuVar;
    }

    private final void a() {
        try {
            this.a.a.release();
        } catch (RuntimeException unused) {
            zga.l("Wakelock already released.");
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        zga.g("Acquiring transfer wakelock");
        long millis = TimeUnit.HOURS.toMillis(this.a.b.a());
        long currentTimeMillis = System.currentTimeMillis();
        if (millis > 0) {
            this.a.a.acquire(millis);
        } else {
            this.a.a.acquire();
        }
        try {
            super.run();
        } finally {
            a();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (millis > 0) {
                currentTimeMillis2 = Math.min(currentTimeMillis2, millis);
            }
            StringBuilder sb = new StringBuilder(50);
            sb.append("Transfer wakelock held for ");
            sb.append(currentTimeMillis2);
            sb.append(" ms");
            zga.l(sb.toString());
        }
    }
}
