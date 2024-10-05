package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.vr.vrcore.controller.api.ControllerServiceBridge;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class axhr implements Runnable {
    public final /* synthetic */ ControllerServiceBridge a;
    private final /* synthetic */ int b;

    public /* synthetic */ axhr(ControllerServiceBridge controllerServiceBridge, int i) {
        this.b = i;
        this.a = controllerServiceBridge;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.a();
            return;
        }
        if (i == 1) {
            ControllerServiceBridge controllerServiceBridge = this.a;
            ControllerServiceBridge.d();
            if (controllerServiceBridge.f) {
                Log.w("VrCtl.ServiceBridge", "Service is already bound.");
                return;
            }
            Intent intent = new Intent("com.google.vr.vrcore.controller.BIND");
            intent.setPackage("com.google.vr.vrcore");
            if (!controllerServiceBridge.a.bindService(intent, controllerServiceBridge, 1)) {
                Log.w("VrCtl.ServiceBridge", "Bind failed. Service is not available.");
                controllerServiceBridge.e.a.onServiceUnavailable();
            }
            controllerServiceBridge.f = true;
            return;
        }
        ControllerServiceBridge controllerServiceBridge2 = this.a;
        ControllerServiceBridge.d();
        axhu axhuVar = controllerServiceBridge2.g;
        if (axhuVar != null) {
            try {
                Parcel po = axhuVar.po(10, axhuVar.pn());
                int readInt = po.readInt();
                po.recycle();
                if (readInt > 0) {
                    if (controllerServiceBridge2.f) {
                        controllerServiceBridge2.b();
                        return;
                    }
                    return;
                }
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54);
                sb.append("Remote exception while getting number of controllers: ");
                sb.append(valueOf);
                Log.w("VrCtl.ServiceBridge", sb.toString());
            }
        }
        int size = controllerServiceBridge2.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            axht axhtVar = (axht) controllerServiceBridge2.d.valueAt(i2);
            if (axhtVar != null) {
                axhtVar.a.onControllerStateChanged(i2, 0);
            }
        }
        ControllerServiceBridge.d();
        controllerServiceBridge2.d.clear();
        controllerServiceBridge2.e.a.onServiceDisconnected();
    }
}
