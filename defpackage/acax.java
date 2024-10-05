package defpackage;

import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.util.Log;
import android.view.Display;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acax implements DisplayManager.DisplayListener {
    final /* synthetic */ acay a;

    public acax(acay acayVar) {
        this.a = acayVar;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        Display display;
        yjk.e();
        VirtualDisplay virtualDisplay = this.a.c;
        if (virtualDisplay != null && (display = virtualDisplay.getDisplay()) != null && this.a.d && display.getDisplayId() == i) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Unexpectedly lost the virtual display: ");
            sb.append(i);
            Log.e("VirtualDisplaySource", sb.toString());
            this.a.l(6);
        }
    }
}
