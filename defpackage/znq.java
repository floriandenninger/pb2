package defpackage;

import java.util.TimerTask;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class znq extends TimerTask {
    final /* synthetic */ znv a;

    public znq(znv znvVar) {
        this.a = znvVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.a.ap.obtainMessage(1).sendToTarget();
    }
}
