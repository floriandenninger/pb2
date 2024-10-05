package defpackage;

import android.hardware.display.DisplayManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zmo implements DisplayManager.DisplayListener {
    final /* synthetic */ zmq a;

    public zmo(zmq zmqVar) {
        this.a = zmqVar;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        zmq zmqVar = this.a;
        ci C = zmqVar.C();
        if (zmqVar.C() == null) {
            return;
        }
        int d = zmq.d(C);
        if (zmqVar.a != null && Math.abs(zmqVar.b - d) == 180) {
            zmqVar.a.e(d);
        }
        zmqVar.b = d;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
