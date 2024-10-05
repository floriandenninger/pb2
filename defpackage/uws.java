package defpackage;

import android.os.Process;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uws implements uxb {
    private static boolean b;
    public final amnv a;
    private final amnv c;
    private final int d;

    public uws(amnv amnvVar) {
        gzp gzpVar = gzp.k;
        this.c = amnvVar;
        this.d = Math.max(5, 10);
        this.a = gzpVar;
    }

    @Override // defpackage.uxb
    public final void a() {
        synchronized (uws.class) {
            if (!b) {
                Runnable runnable = new Runnable() { // from class: uwq
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (((Boolean) uws.this.a.get()).booleanValue()) {
                            Process.killProcess(Process.myPid());
                            System.exit(0);
                        }
                    }
                };
                long j = this.d;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                anic anicVar = (anic) this.c.get();
                ure.h(anicVar.schedule(new uwr(runnable, anicVar, j, timeUnit), j, timeUnit));
                b = true;
            }
        }
    }
}
