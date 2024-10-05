package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ceh implements Runnable {
    final /* synthetic */ UUID a;
    final /* synthetic */ byt b;
    final /* synthetic */ Context c;
    final /* synthetic */ cei d;
    final /* synthetic */ cex e;

    public ceh(cei ceiVar, cex cexVar, UUID uuid, byt bytVar, Context context) {
        this.d = ceiVar;
        this.e = cexVar;
        this.a = uuid;
        this.b = bytVar;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!this.e.isCancelled()) {
                String uuid = this.a.toString();
                int h = this.d.b.h(uuid);
                if (h == 0 || abm.d(h)) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ccd ccdVar = this.d.a;
                byt bytVar = this.b;
                synchronized (((bzr) ccdVar).g) {
                    ajbh.X();
                    String.format("Moving WorkSpec (%s) to the foreground", uuid);
                    ajbh.V(new Throwable[0]);
                    can canVar = (can) ((bzr) ccdVar).e.remove(uuid);
                    if (canVar != null) {
                        if (((bzr) ccdVar).b == null) {
                            ((bzr) ccdVar).b = ced.a(((bzr) ccdVar).c, "ProcessorForegroundLck");
                            ((bzr) ccdVar).b.acquire();
                        }
                        ((bzr) ccdVar).d.put(uuid, canVar);
                        Intent c = ccg.c(((bzr) ccdVar).c, uuid, bytVar);
                        Context context = ((bzr) ccdVar).c;
                        if (Build.VERSION.SDK_INT >= 26) {
                            ail.a(context, c);
                        } else {
                            context.startService(c);
                        }
                    }
                }
                this.c.startService(ccg.b(this.c, uuid, this.b));
            }
            this.e.e(null);
        } catch (Throwable th) {
            this.e.f(th);
        }
    }
}
