package defpackage;

import java.util.TimerTask;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class qil extends TimerTask {
    final /* synthetic */ qio a;

    public qil(qio qioVar) {
        this.a = qioVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        qoi qoiVar;
        qio qioVar = this.a;
        if (qioVar.h.isEmpty() || qioVar.i != null || qioVar.b == 0) {
            return;
        }
        qjk qjkVar = qioVar.c;
        int[] k = qko.k(qioVar.h);
        qip.as("Must be called from the main thread.");
        if (!qjkVar.l()) {
            qoiVar = qjk.v();
        } else {
            qiv qivVar = new qiv(qjkVar, k);
            qjk.u(qivVar);
            qoiVar = qivVar;
        }
        qioVar.i = qoiVar;
        qioVar.i.g(new qik(qioVar, 0));
        qioVar.h.clear();
    }
}
