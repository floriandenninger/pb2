package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anip implements Runnable {
    anir a;

    public anip(anir anirVar) {
        this.a = anirVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        anhy anhyVar;
        anir anirVar = this.a;
        if (anirVar == null || (anhyVar = anirVar.a) == null) {
            return;
        }
        this.a = null;
        if (anhyVar.isDone()) {
            anirVar.qK(anhyVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = anirVar.b;
            anirVar.b = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        StringBuilder sb = new StringBuilder(75);
                        sb.append("Timed out");
                        sb.append(" (timeout delayed by ");
                        sb.append(abs);
                        sb.append(" ms after scheduled time)");
                        str = sb.toString();
                    }
                } catch (Throwable th) {
                    anirVar.e(new aniq("Timed out"));
                    throw th;
                }
            }
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(anhyVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(valueOf2).length());
            sb2.append(valueOf);
            sb2.append(": ");
            sb2.append(valueOf2);
            anirVar.e(new aniq(sb2.toString()));
        } finally {
            anhyVar.cancel(true);
        }
    }
}
