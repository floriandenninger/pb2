package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import com.google.vr.vrcore.controller.api.ControllerEventPacket;
import com.google.vr.vrcore.controller.api.ControllerEventPacket2;
import com.google.vr.vrcore.controller.api.ControllerListenerOptions;
import com.google.vr.vrcore.controller.api.ControllerOrientationEvent;
import com.google.vr.vrcore.controller.api.ControllerServiceBridge;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axhv extends ecq implements IInterface {
    private final WeakReference a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axhv(axht axhtVar, int i) {
        super("com.google.vr.vrcore.controller.api.IControllerListener");
        this.b = i;
        this.a = new WeakReference(axhtVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axhv(ControllerServiceBridge controllerServiceBridge, int i) {
        super("com.google.vr.vrcore.controller.api.IControllerServiceListener");
        this.b = i;
        this.a = new WeakReference(controllerServiceBridge);
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (this.b == 0) {
            if (i == 1) {
                parcel2.writeNoException();
                parcel2.writeInt(25);
                return true;
            }
            if (i != 2) {
                return false;
            }
            int readInt = parcel.readInt();
            ControllerServiceBridge controllerServiceBridge = (ControllerServiceBridge) this.a.get();
            if (controllerServiceBridge == null || readInt != 1) {
                return true;
            }
            controllerServiceBridge.b.post(new axhr(controllerServiceBridge, 2));
            return true;
        }
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeInt(25);
            return true;
        }
        if (i != 2) {
            switch (i) {
                case 9:
                    axht axhtVar = (axht) this.a.get();
                    ControllerListenerOptions controllerListenerOptions = axhtVar == null ? null : axhtVar.b;
                    parcel2.writeNoException();
                    ecr.h(parcel2, controllerListenerOptions);
                    break;
                case 10:
                    ControllerEventPacket controllerEventPacket = (ControllerEventPacket) ecr.a(parcel, ControllerEventPacket.CREATOR);
                    axht axhtVar2 = (axht) this.a.get();
                    if (axhtVar2 != null) {
                        controllerEventPacket.e(axhtVar2.c);
                        axhtVar2.a.onControllerEventPacket(controllerEventPacket);
                        controllerEventPacket.d();
                        return true;
                    }
                    break;
                case 11:
                    ControllerOrientationEvent controllerOrientationEvent = (ControllerOrientationEvent) ecr.a(parcel, ControllerOrientationEvent.CREATOR);
                    axht axhtVar3 = (axht) this.a.get();
                    if (axhtVar3 != null) {
                        controllerOrientationEvent.e = axhtVar3.c;
                        axhtVar3.a.onControllerRecentered(controllerOrientationEvent);
                        return true;
                    }
                    break;
                case 12:
                    ControllerEventPacket2 controllerEventPacket2 = (ControllerEventPacket2) ecr.a(parcel, ControllerEventPacket2.CREATOR);
                    axht axhtVar4 = (axht) this.a.get();
                    if (axhtVar4 != null) {
                        int i3 = ControllerServiceBridge.h;
                        if (controllerEventPacket2.g != 0) {
                            long a = ControllerEventPacket2.a() - controllerEventPacket2.g;
                            if (a > 300) {
                                StringBuilder sb = new StringBuilder(122);
                                sb.append("Experiencing large controller packet delivery time between service and  client: timestamp diff in ms: ");
                                sb.append(a);
                                Log.w("VrCtl.ServiceBridge", sb.toString());
                            }
                        }
                        controllerEventPacket2.e(axhtVar4.c);
                        axhtVar4.a.onControllerEventPacket2(controllerEventPacket2);
                        controllerEventPacket2.d();
                        break;
                    }
                    break;
                default:
                    return false;
            }
        } else {
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            axht axhtVar5 = (axht) this.a.get();
            if (axhtVar5 != null) {
                axhtVar5.a.onControllerStateChanged(readInt2, readInt3);
                return true;
            }
        }
        return true;
    }
}
