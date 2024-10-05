package defpackage;

import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amid implements Runnable {
    final /* synthetic */ amig a;

    public amid(amig amigVar) {
        this.a = amigVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (!this.a.c.isShutdown()) {
            try {
                try {
                    amie amieVar = ((amif) this.a.b.remove()).a;
                    int i = amie.b;
                    amieVar.o(null);
                } catch (RejectedExecutionException e) {
                    Iterator it = amig.a.keySet().iterator();
                    while (it.hasNext()) {
                        ((amif) it.next()).a.e(e);
                    }
                    return;
                }
            } catch (InterruptedException unused) {
                this.a.c.execute(this);
                return;
            } catch (Throwable th) {
                try {
                    this.a.c.execute(this);
                } catch (RejectedExecutionException e2) {
                    Iterator it2 = amig.a.keySet().iterator();
                    while (it2.hasNext()) {
                        ((amif) it2.next()).a.e(e2);
                    }
                }
                throw th;
            }
        }
        try {
            this.a.c.execute(this);
        } catch (RejectedExecutionException e3) {
            Iterator it3 = amig.a.keySet().iterator();
            while (it3.hasNext()) {
                ((amif) it3.next()).a.e(e3);
            }
        }
    }
}
