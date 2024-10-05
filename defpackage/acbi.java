package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acbi implements Runnable {
    final /* synthetic */ Throwable a;
    final /* synthetic */ acbp b;

    public acbi(acbp acbpVar, Throwable th) {
        this.b = acbpVar;
        this.a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        acbl acblVar = this.b.g;
        if (acblVar != null) {
            Log.e("RtmpConnection", "RTMP input stream experienced an error", this.a);
            acbc acbcVar = ((acbd) acblVar).b;
            if (acbcVar != null) {
                acbcVar.p();
            }
        }
    }
}
