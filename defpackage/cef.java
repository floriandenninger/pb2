package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cef implements Runnable {
    final /* synthetic */ ceg a;
    final /* synthetic */ cex b;

    public cef(ceg cegVar, cex cexVar) {
        this.a = cegVar;
        this.b = cexVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            byt bytVar = (byt) this.b.get();
            if (bytVar != null) {
                ajbh X = ajbh.X();
                int i = ceg.g;
                String.format("Updating notification for %s", this.a.b.d);
                X.T(new Throwable[0]);
                ceg cegVar = this.a;
                ListenableWorker listenableWorker = cegVar.c;
                listenableWorker.e = true;
                cex cexVar = cegVar.f;
                byu byuVar = cegVar.d;
                Context context = cegVar.a;
                UUID d = listenableWorker.d();
                cex h = cex.h();
                ((cei) byuVar).c.a(new ceh((cei) byuVar, h, d, bytVar, context));
                cexVar.g(h);
                return;
            }
            throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", this.a.b.d));
        } catch (Throwable th) {
            this.a.f.f(th);
        }
    }
}
