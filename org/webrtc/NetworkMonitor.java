package org.webrtc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build;
import defpackage.baez;
import defpackage.bapf;
import defpackage.bapg;
import defpackage.baph;
import defpackage.bapi;
import defpackage.bapl;
import defpackage.bapm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class NetworkMonitor {
    private bapf e;
    private final Object d = new Object();
    private final ArrayList b = new ArrayList();
    private final ArrayList c = new ArrayList();
    private int f = 0;
    public volatile NetworkChangeDetector$ConnectionType a = NetworkChangeDetector$ConnectionType.CONNECTION_UNKNOWN;

    private static int androidSdkInt() {
        return Build.VERSION.SDK_INT;
    }

    public static NetworkMonitor getInstance() {
        return baph.a;
    }

    private native void nativeNotifyConnectionTypeChanged(long j);

    private native void nativeNotifyOfActiveNetworkList(long j, NetworkChangeDetector$NetworkInformation[] networkChangeDetector$NetworkInformationArr);

    private native void nativeNotifyOfNetworkPreference(long j, NetworkChangeDetector$ConnectionType networkChangeDetector$ConnectionType, int i);

    private boolean networkBindingSupported() {
        boolean z;
        synchronized (this.d) {
            bapf bapfVar = this.e;
            z = false;
            if (bapfVar != null && ((bapm) bapfVar).g.k()) {
                z = true;
            }
        }
        return z;
    }

    private void startMonitoring(Context context, long j) {
        ArrayList arrayList;
        ArrayList arrayList2;
        StringBuilder sb = new StringBuilder(58);
        sb.append("Start monitoring with native observer ");
        sb.append(j);
        Logging.a("NetworkMonitor", sb.toString());
        if (context == null) {
            context = ContextUtils.getApplicationContext();
        }
        synchronized (this.d) {
            this.f++;
            if (this.e == null) {
                this.e = new bapm(new bapg(this), context);
            }
            this.a = bapm.b(((bapm) this.e).d());
        }
        synchronized (this.b) {
            this.b.add(Long.valueOf(j));
        }
        synchronized (this.d) {
            bapf bapfVar = this.e;
            arrayList = null;
            if (bapfVar != null) {
                baez baezVar = ((bapm) bapfVar).g;
                if (baezVar.k()) {
                    arrayList2 = new ArrayList();
                    ConnectivityManager connectivityManager = baezVar.a;
                    for (Network network : connectivityManager == null ? new Network[0] : connectivityManager.getAllNetworks()) {
                        NetworkChangeDetector$NetworkInformation h = baezVar.h(network);
                        if (h != null) {
                            arrayList2.add(h);
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 != null) {
                    arrayList = new ArrayList(arrayList2);
                }
            }
        }
        if (arrayList != null && arrayList.size() != 0) {
            nativeNotifyOfActiveNetworkList(j, (NetworkChangeDetector$NetworkInformation[]) arrayList.toArray(new NetworkChangeDetector$NetworkInformation[arrayList.size()]));
        }
        b();
    }

    private void stopMonitoring(long j) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("Stop monitoring with native observer ");
        sb.append(j);
        Logging.a("NetworkMonitor", sb.toString());
        synchronized (this.d) {
            int i = this.f - 1;
            this.f = i;
            if (i == 0) {
                Object obj = this.e;
                ConnectivityManager.NetworkCallback networkCallback = ((bapm) obj).c;
                if (networkCallback != null) {
                    ((bapm) obj).g.j(networkCallback);
                }
                ConnectivityManager.NetworkCallback networkCallback2 = ((bapm) obj).b;
                if (networkCallback2 != null) {
                    ((bapm) obj).g.j(networkCallback2);
                }
                bapl baplVar = ((bapm) obj).d;
                if (((bapm) obj).e) {
                    ((bapm) obj).e = false;
                    ((bapm) obj).a.unregisterReceiver((BroadcastReceiver) obj);
                }
                this.e = null;
            }
        }
        synchronized (this.b) {
            this.b.remove(Long.valueOf(j));
        }
    }

    public final List a() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList(this.b);
        }
        return arrayList;
    }

    public final void b() {
        ArrayList arrayList;
        Iterator it = a().iterator();
        while (it.hasNext()) {
            nativeNotifyConnectionTypeChanged(((Long) it.next()).longValue());
        }
        synchronized (this.c) {
            arrayList = new ArrayList(this.c);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bapi) arrayList.get(i)).a();
        }
    }

    public native void nativeNotifyOfNetworkConnect(long j, NetworkChangeDetector$NetworkInformation networkChangeDetector$NetworkInformation);

    public native void nativeNotifyOfNetworkDisconnect(long j, long j2);
}
