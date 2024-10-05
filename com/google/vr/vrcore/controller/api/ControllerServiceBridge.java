package com.google.vr.vrcore.controller.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import defpackage.aone;
import defpackage.axhh;
import defpackage.axhr;
import defpackage.axhs;
import defpackage.axht;
import defpackage.axhu;
import defpackage.axhv;
import defpackage.axhw;
import defpackage.axhx;
import defpackage.axhy;
import defpackage.ecr;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ControllerServiceBridge implements ServiceConnection {
    public static final /* synthetic */ int h = 0;
    private static final AtomicInteger i = new AtomicInteger(-1);
    public final Context a;
    public final Handler b;
    final String c;
    public final SparseArray d;
    public axht e;
    public boolean f;
    public axhu g;
    private final int j;
    private final axhv k;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface Callbacks {
        void onControllerEventPacket(ControllerEventPacket controllerEventPacket);

        void onControllerEventPacket2(ControllerEventPacket2 controllerEventPacket2);

        void onControllerRecentered(ControllerOrientationEvent controllerOrientationEvent);

        void onControllerStateChanged(int i, int i2);

        void onServiceConnected(int i);

        void onServiceDisconnected();

        void onServiceFailed();

        void onServiceInitFailed(int i);

        void onServiceUnavailable();
    }

    public ControllerServiceBridge(Context context, Callbacks callbacks, int i2) {
        ControllerListenerOptions controllerListenerOptions = new ControllerListenerOptions(i2);
        SparseArray sparseArray = new SparseArray();
        this.d = sparseArray;
        this.a = context.getApplicationContext();
        int i3 = 0;
        axht axhtVar = new axht(callbacks, controllerListenerOptions, 0);
        this.e = axhtVar;
        sparseArray.put(axhtVar.c, axhtVar);
        this.b = new Handler(Looper.getMainLooper());
        this.k = new axhv(this, 0);
        try {
            i3 = VrCoreUtils.getVrCoreClientApiVersion(context);
        } catch (axhh unused) {
        }
        this.j = i3;
        int incrementAndGet = i.incrementAndGet();
        StringBuilder sb = new StringBuilder(30);
        sb.append("VrCtl.ServiceBridge");
        sb.append(incrementAndGet);
        this.c = sb.toString();
    }

    public static final void d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("This should be running on the main thread.");
        }
    }

    private final boolean e(int i2, axht axhtVar) {
        try {
            axhu axhuVar = this.g;
            String str = this.c;
            axhv axhvVar = new axhv(axhtVar, 1);
            Parcel pn = axhuVar.pn();
            pn.writeInt(i2);
            pn.writeString(str);
            ecr.i(pn, axhvVar);
            Parcel po = axhuVar.po(5, pn);
            boolean j = ecr.j(po);
            po.recycle();
            return j;
        } catch (RemoteException e) {
            Log.w("VrCtl.ServiceBridge", "RemoteException while registering listener.", e);
            return false;
        }
    }

    public final void a() {
        d();
        if (this.f) {
            d();
            axhu axhuVar = this.g;
            if (axhuVar != null) {
                try {
                    String str = this.c;
                    Parcel pn = axhuVar.pn();
                    pn.writeString(str);
                    Parcel po = axhuVar.po(6, pn);
                    ecr.j(po);
                    po.recycle();
                } catch (RemoteException e) {
                    Log.w("VrCtl.ServiceBridge", "RemoteException while unregistering listeners.", e);
                }
            }
            if (this.j >= 21) {
                try {
                    axhu axhuVar2 = this.g;
                    if (axhuVar2 != null) {
                        axhv axhvVar = this.k;
                        Parcel pn2 = axhuVar2.pn();
                        ecr.i(pn2, axhvVar);
                        Parcel po2 = axhuVar2.po(9, pn2);
                        boolean j = ecr.j(po2);
                        po2.recycle();
                        if (!j) {
                            Log.w("VrCtl.ServiceBridge", "Failed to unregister remote service listener.");
                        }
                    }
                } catch (RemoteException e2) {
                    String valueOf = String.valueOf(e2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55);
                    sb.append("Exception while unregistering remote service listener: ");
                    sb.append(valueOf);
                    Log.w("VrCtl.ServiceBridge", sb.toString());
                }
            }
            this.a.unbindService(this);
            this.g = null;
            this.f = false;
            return;
        }
        Log.w("VrCtl.ServiceBridge", "Service is already unbound.");
    }

    public final void b() {
        this.e.a.onServiceConnected(1);
        axht axhtVar = this.e;
        if (!e(axhtVar.c, axhtVar)) {
            Log.w("VrCtl.ServiceBridge", "Failed to register service listener.");
            this.e.a.onServiceFailed();
            a();
        } else {
            SparseArray sparseArray = this.d;
            axht axhtVar2 = this.e;
            sparseArray.put(axhtVar2.c, axhtVar2);
        }
    }

    public final void c(int i2, ControllerRequest controllerRequest) {
        d();
        axhu axhuVar = this.g;
        if (axhuVar != null) {
            try {
                Parcel pn = axhuVar.pn();
                pn.writeInt(i2);
                ecr.g(pn, controllerRequest);
                axhuVar.pp(11, pn);
                return;
            } catch (RemoteException e) {
                Log.w("VrCtl.ServiceBridge", "RemoteException while vibrating the controller.", e);
                return;
            }
        }
        Log.w("VrCtl.ServiceBridge", "Vibration cancelled: service not connected");
    }

    public void controllerHapticsEffect(int i2, int i3, int i4) {
        aone createBuilder = axhy.a.createBuilder();
        aone createBuilder2 = axhw.a.createBuilder();
        createBuilder2.copyOnWrite();
        axhw axhwVar = (axhw) createBuilder2.instance;
        axhwVar.b |= 1;
        axhwVar.c = i3;
        createBuilder2.copyOnWrite();
        axhw axhwVar2 = (axhw) createBuilder2.instance;
        axhwVar2.b |= 2;
        axhwVar2.d = i4;
        axhw axhwVar3 = (axhw) createBuilder2.build();
        createBuilder.copyOnWrite();
        axhy axhyVar = (axhy) createBuilder.instance;
        axhwVar3.getClass();
        axhyVar.d = axhwVar3;
        axhyVar.b |= 2;
        axhy axhyVar2 = (axhy) createBuilder.build();
        ControllerRequest controllerRequest = new ControllerRequest();
        controllerRequest.c(axhyVar2);
        this.b.post(new axhs(this, i2, controllerRequest, 1));
    }

    public boolean createAndConnectController(int i2, Callbacks callbacks, int i3) {
        ControllerListenerOptions controllerListenerOptions = new ControllerListenerOptions(i3);
        d();
        if (this.g == null) {
            return false;
        }
        axht axhtVar = new axht(callbacks, controllerListenerOptions, i2);
        if (e(axhtVar.c, axhtVar)) {
            if (axhtVar.c == 0) {
                this.e = axhtVar;
            }
            this.d.put(i2, axhtVar);
            return true;
        }
        if (i2 == 0) {
            Log.e("VrCtl.ServiceBridge", "Failed to connect controller 0.");
            i2 = 0;
        }
        this.d.remove(i2);
        return false;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        axhu axhuVar;
        String str;
        d();
        if (this.f) {
            if (iBinder == null) {
                axhuVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.controller.api.IControllerService");
                if (queryLocalInterface instanceof axhu) {
                    axhuVar = (axhu) queryLocalInterface;
                } else {
                    axhuVar = new axhu(iBinder);
                }
            }
            this.g = axhuVar;
            try {
                Parcel pn = axhuVar.pn();
                pn.writeInt(25);
                Parcel po = axhuVar.po(1, pn);
                int readInt = po.readInt();
                po.recycle();
                if (readInt != 0) {
                    if (readInt == 0) {
                        str = "SUCCESS";
                    } else if (readInt == 1) {
                        str = "FAILED_UNSUPPORTED";
                    } else if (readInt == 2) {
                        str = "FAILED_NOT_AUTHORIZED";
                    } else if (readInt != 3) {
                        StringBuilder sb = new StringBuilder(45);
                        sb.append("[UNKNOWN CONTROLLER INIT RESULT: ");
                        sb.append(readInt);
                        sb.append("]");
                        str = sb.toString();
                    } else {
                        str = "FAILED_CLIENT_OBSOLETE";
                    }
                    String valueOf = String.valueOf(str);
                    Log.e("VrCtl.ServiceBridge", valueOf.length() != 0 ? "initialize() returned error: ".concat(valueOf) : new String("initialize() returned error: "));
                    this.e.a.onServiceInitFailed(readInt);
                    a();
                    return;
                }
                if (this.j >= 21) {
                    try {
                        axhu axhuVar2 = this.g;
                        axhv axhvVar = this.k;
                        Parcel pn2 = axhuVar2.pn();
                        ecr.i(pn2, axhvVar);
                        Parcel po2 = axhuVar2.po(8, pn2);
                        boolean j = ecr.j(po2);
                        po2.recycle();
                        if (!j) {
                            Log.e("VrCtl.ServiceBridge", "Failed to register remote service listener.");
                            this.e.a.onServiceInitFailed(0);
                            a();
                            return;
                        }
                    } catch (RemoteException e) {
                        String valueOf2 = String.valueOf(e);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 53);
                        sb2.append("Exception while registering remote service listener: ");
                        sb2.append(valueOf2);
                        Log.w("VrCtl.ServiceBridge", sb2.toString());
                    }
                }
                b();
            } catch (RemoteException e2) {
                Log.e("VrCtl.ServiceBridge", "Failed to call initialize() on controller service (RemoteException).", e2);
                this.e.a.onServiceFailed();
                a();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        d();
        this.g = null;
        this.e.a.onServiceDisconnected();
    }

    public void requestBind() {
        this.b.post(new axhr(this, 1));
    }

    public void requestUnbind() {
        this.b.post(new axhr(this, 0));
    }

    public void vibrateController(int i2, int i3, int i4, int i5) {
        aone createBuilder = axhy.a.createBuilder();
        aone createBuilder2 = axhx.a.createBuilder();
        createBuilder2.copyOnWrite();
        axhx axhxVar = (axhx) createBuilder2.instance;
        axhxVar.b |= 1;
        axhxVar.c = i3;
        createBuilder2.copyOnWrite();
        axhx axhxVar2 = (axhx) createBuilder2.instance;
        axhxVar2.b |= 2;
        axhxVar2.d = i4;
        createBuilder2.copyOnWrite();
        axhx axhxVar3 = (axhx) createBuilder2.instance;
        axhxVar3.b |= 4;
        axhxVar3.e = i5;
        axhx axhxVar4 = (axhx) createBuilder2.build();
        createBuilder.copyOnWrite();
        axhy axhyVar = (axhy) createBuilder.instance;
        axhxVar4.getClass();
        axhyVar.c = axhxVar4;
        axhyVar.b |= 1;
        axhy axhyVar2 = (axhy) createBuilder.build();
        ControllerRequest controllerRequest = new ControllerRequest();
        controllerRequest.c(axhyVar2);
        this.b.post(new axhs(this, i2, controllerRequest, 0));
    }
}
