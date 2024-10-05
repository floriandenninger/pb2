package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yni implements anhh {
    final /* synthetic */ ynl a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ ynk c;

    public yni(ynl ynlVar, Runnable runnable, ynk ynkVar) {
        this.a = ynlVar;
        this.b = runnable;
        this.c = ynkVar;
    }

    @Override // defpackage.anhh
    public final void b(Object obj) {
        this.a.a(obj);
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        Runnable runnable = this.b;
        if (runnable == null || !(th instanceof CancellationException)) {
            this.c.b(th);
        } else {
            runnable.run();
        }
    }
}
