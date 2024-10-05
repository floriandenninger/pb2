package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sfv implements ServiceConnection {
    public volatile int a = 0;
    final /* synthetic */ sfw b;

    public sfv(sfw sfwVar) {
        this.b = sfwVar;
    }

    public final void a() {
        this.b.f = null;
        this.a = 1;
        sgd sgdVar = this.b.e;
        boolean z = sgdVar.b;
        if (sgdVar.e == null) {
            ((amxh) ((amxh) sfw.a.g().g(amyj.a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector$AppIntegrationServiceConnection", "resetAndNotifyDisconnected", 204, "MaestroConnector.java")).q("#resetAndNotifyDisconnected(): callback is null when try to notify onServiceDisconnected.");
        } else {
            int i = gxd.b;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {
        ((amxh) ((amxh) sfw.a.d().g(amyj.a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector$AppIntegrationServiceConnection", "onServiceConnected", 136, "MaestroConnector.java")).s("#onServiceConnected(): %s", componentName);
        angq.a.execute(amjk.f(new Runnable() { // from class: sfu
            @Override // java.lang.Runnable
            public final void run() {
                sgb sgbVar;
                sgc sgcVar;
                sfv sfvVar = sfv.this;
                ComponentName componentName2 = componentName;
                IBinder iBinder2 = iBinder;
                if (componentName2 != null) {
                    String packageName = componentName2.getPackageName();
                    if ("com.google.android.googlequicksearchbox".equals(packageName) && sfvVar.b.d.a(packageName).b) {
                        if (iBinder2 == null) {
                            sgbVar = null;
                        } else {
                            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationService");
                            if (queryLocalInterface instanceof sgb) {
                                sgbVar = (sgb) queryLocalInterface;
                            } else {
                                sgbVar = new sgb(iBinder2);
                            }
                        }
                        try {
                            sfw sfwVar = sfvVar.b;
                            String packageName2 = sfwVar.b.getPackageName();
                            sgd sgdVar = sfvVar.b.e;
                            Parcel pn = sgbVar.pn();
                            pn.writeString(packageName2);
                            ecr.i(pn, sgdVar);
                            Parcel po = sgbVar.po(1, pn);
                            IBinder readStrongBinder = po.readStrongBinder();
                            if (readStrongBinder == null) {
                                sgcVar = null;
                            } else {
                                IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSession");
                                if (queryLocalInterface2 instanceof sgc) {
                                    sgcVar = (sgc) queryLocalInterface2;
                                } else {
                                    sgcVar = new sgc(readStrongBinder);
                                }
                            }
                            po.recycle();
                            sfwVar.f = sgcVar;
                            if (sfvVar.b.f != null) {
                                sfvVar.a = 3;
                                sft sftVar = sfvVar.b.c;
                                if (sftVar.c.c()) {
                                    try {
                                        sftVar.g(sftVar.e(sftVar.f()));
                                        sftVar.f = null;
                                    } catch (RemoteException unused) {
                                        Log.w("AssistantIntegClient", "#sendCurrentVoicePlateParamsAndCapabilities(): failed to send VoicePlateParams");
                                    }
                                }
                                if (sfvVar.b.e.e != null) {
                                    ((amxh) ((amxh) sfw.a.c().g(amyj.a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector$AppIntegrationServiceConnection", "sendToken", 157, "MaestroConnector.java")).q("#sendToken()");
                                    sfvVar.b.e.e.a();
                                    return;
                                } else {
                                    ((amxh) ((amxh) sfw.a.g().g(amyj.a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector$AppIntegrationServiceConnection", "verifyAndCallback", 190, "MaestroConnector.java")).q("#onServiceConnected(): callback is null when try to notify onServiceConnected.");
                                    return;
                                }
                            }
                            sfvVar.a();
                            return;
                        } catch (RemoteException unused2) {
                            ((amxh) ((amxh) sfw.a.g().g(amyj.a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector$AppIntegrationServiceConnection", "verifyAndCallback", 183, "MaestroConnector.java")).q("#onServiceConnected(): Failed to start session");
                            sfvVar.a();
                            return;
                        }
                    }
                }
                ((amxh) ((amxh) sfw.a.g().g(amyj.a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector$AppIntegrationServiceConnection", "verifyAndCallback", 169, "MaestroConnector.java")).q("#onServiceConnected(): Service signature is not matched");
                sfvVar.a();
            }
        }));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ((amxh) ((amxh) sfw.a.d().g(amyj.a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector$AppIntegrationServiceConnection", "onServiceDisconnected", 143, "MaestroConnector.java")).s("#onServiceDisconnected(): %s", componentName);
        boolean z = this.b.e.b;
        a();
    }
}
