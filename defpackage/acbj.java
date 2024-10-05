package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acbj implements Runnable {
    final /* synthetic */ acbp a;
    private final /* synthetic */ int b;

    public acbj(acbp acbpVar, int i) {
        this.b = i;
        this.a = acbpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        acbv acbvVar;
        if (this.b == 0) {
            acbl acblVar = this.a.g;
            if (acblVar == null || (acbvVar = ((acbd) acblVar).f) == null) {
                return;
            }
            acbvVar.f(0);
            return;
        }
        acbp acbpVar = this.a;
        acbl acblVar2 = acbpVar.g;
        if (acblVar2 != null) {
            int i = acbpVar.i;
            acbd acbdVar = (acbd) acblVar2;
            acbv acbvVar2 = acbdVar.f;
            if (acbvVar2 == null) {
                return;
            }
            try {
                amkq.E(true);
                acbv.i(acbvVar2.a, 2, 0, 4, 3, 0);
                acbvVar2.a.putInt(i);
                acbvVar2.g(acbvVar2.a);
                acbvVar2.f(4);
                acbp acbpVar2 = ((acbd) acblVar2).e;
                if (acbpVar2 != null) {
                    acbpVar2.l(i);
                }
            } catch (Exception e) {
                Log.e("RtmpConnection", "Error sending acknowledgment", e);
                acbc acbcVar = acbdVar.b;
                if (acbcVar != null) {
                    acbcVar.p();
                }
            }
        }
    }
}
