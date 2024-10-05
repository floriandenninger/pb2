package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acbk implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ acbp c;

    public acbk(acbp acbpVar, int i, int i2) {
        this.c = acbpVar;
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        acbl acblVar = this.c.g;
        if (acblVar != null) {
            int i = this.a;
            int i2 = this.b;
            acbd acbdVar = (acbd) acblVar;
            acbv acbvVar = acbdVar.f;
            if (acbvVar == null) {
                return;
            }
            try {
                acbvVar.d(i, i2);
            } catch (Exception e) {
                Log.e("RtmpConnection", "Error setting window size", e);
                acbc acbcVar = acbdVar.b;
                if (acbcVar != null) {
                    acbcVar.p();
                }
            }
        }
    }
}
