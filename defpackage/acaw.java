package defpackage;

import android.hardware.display.VirtualDisplay;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acaw extends VirtualDisplay.Callback {
    final /* synthetic */ acay a;

    public acaw(acay acayVar) {
        this.a = acayVar;
    }

    @Override // android.hardware.display.VirtualDisplay.Callback
    public final void onStopped() {
        super.onStopped();
        yjk.e();
        if (this.a.d) {
            Log.e("VirtualDisplaySource", "Virtual display stopped unexpectedly");
            this.a.l(6);
        }
    }
}
