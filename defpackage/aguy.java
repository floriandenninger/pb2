package defpackage;

import android.content.Context;
import android.os.PowerManager;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aguy implements aguk {
    public final PowerManager.WakeLock a;
    public final agzr b;
    private final ScheduledExecutorService c;

    public aguy(Context context, ScheduledExecutorService scheduledExecutorService, agzr agzrVar) {
        this.c = scheduledExecutorService;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        powerManager.getClass();
        this.a = powerManager.newWakeLock(1, getClass().getName());
        this.b = agzrVar;
    }

    @Override // defpackage.aguk
    public final void a(final aguf agufVar) {
        anaf.R(new Runnable() { // from class: agux
            @Override // java.lang.Runnable
            public final void run() {
                aguy aguyVar = aguy.this;
                aguf agufVar2 = agufVar;
                zga.g("Acquiring transfer wakelock");
                long millis = TimeUnit.HOURS.toMillis(aguyVar.b.a());
                long currentTimeMillis = System.currentTimeMillis();
                if (millis > 0) {
                    aguyVar.a.acquire(millis);
                } else {
                    aguyVar.a.acquire();
                }
                try {
                    agufVar2.run();
                } finally {
                    aguyVar.b();
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
        }, this.c).d(new Runnable() { // from class: aguw
            @Override // java.lang.Runnable
            public final void run() {
                String valueOf = String.valueOf(aguy.this.getClass().getName());
                if (valueOf.length() != 0) {
                    "[Offline] Transfer task succeeds with ".concat(valueOf);
                }
            }
        }, this.c);
    }

    public final void b() {
        try {
            this.a.release();
        } catch (RuntimeException unused) {
            zga.l("Wakelock already released.");
        }
    }
}
