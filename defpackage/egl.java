package defpackage;

import java.io.File;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class egl implements Runnable {
    final /* synthetic */ egm a;

    public egl(egm egmVar) {
        this.a = egmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        egm egmVar = this.a;
        egmVar.a.getApplicationContext();
        if (egmVar.h == null) {
            egmVar.h = new faa((zfy) egmVar.f.get());
        }
        if (egmVar.h.a()) {
            try {
                if (((Boolean) ((aadr) egmVar.b.get()).b().get()).booleanValue()) {
                    yjk.E((File) this.a.d.get());
                }
            } catch (InterruptedException | ExecutionException e) {
                afsi.c(2, 18, "Failed to get the fail safe status", e);
            }
        }
    }
}
