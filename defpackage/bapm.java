package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.wifi.WifiInfo;
import android.os.Build;
import org.webrtc.Logging;
import org.webrtc.NetworkChangeDetector$ConnectionType;
import org.webrtc.NetworkMonitor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bapm extends BroadcastReceiver implements bapf {
    public final Context a;
    public final ConnectivityManager.NetworkCallback b;
    public final ConnectivityManager.NetworkCallback c;
    public bapl d;
    public boolean e;
    public final bapg f;
    public final baez g;
    private final IntentFilter h;
    private NetworkChangeDetector$ConnectionType i;
    private String j;
    private final axqi k;

    public bapm(bapg bapgVar, Context context) {
        this.f = bapgVar;
        this.a = context;
        ConnectivityManager.NetworkCallback networkCallback = null;
        baez baezVar = new baez(context, (char[]) null);
        this.g = baezVar;
        this.k = new axqi(context);
        bapj i = baezVar.i();
        this.i = b(i);
        this.j = e(i);
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        this.h = intentFilter;
        if (!this.e) {
            this.e = true;
            context.registerReceiver(this, intentFilter);
        }
        if (!baezVar.k()) {
            this.b = null;
            this.c = null;
            return;
        }
        ConnectivityManager.NetworkCallback networkCallback2 = new ConnectivityManager.NetworkCallback();
        try {
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addCapability(12).addTransportType(0);
            baezVar.a.requestNetwork(builder.build(), networkCallback2);
            networkCallback = networkCallback2;
        } catch (SecurityException unused) {
            Logging.d("NetworkMonitorAutoDetect", "Unable to obtain permission to request a cellular network.");
        }
        this.b = networkCallback;
        bapk bapkVar = new bapk(this);
        this.c = bapkVar;
        this.g.a.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), bapkVar);
    }

    public static long a(Network network) {
        return Build.VERSION.SDK_INT >= 23 ? network.getNetworkHandle() : Integer.parseInt(network.toString());
    }

    public static NetworkChangeDetector$ConnectionType b(bapj bapjVar) {
        return c(bapjVar.a, bapjVar.b, bapjVar.c);
    }

    public static NetworkChangeDetector$ConnectionType c(boolean z, int i, int i2) {
        if (!z) {
            return NetworkChangeDetector$ConnectionType.CONNECTION_NONE;
        }
        if (i == 0) {
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    return NetworkChangeDetector$ConnectionType.CONNECTION_2G;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    return NetworkChangeDetector$ConnectionType.CONNECTION_3G;
                case 13:
                case 18:
                    return NetworkChangeDetector$ConnectionType.CONNECTION_4G;
                case 19:
                default:
                    return NetworkChangeDetector$ConnectionType.CONNECTION_UNKNOWN_CELLULAR;
                case 20:
                    return NetworkChangeDetector$ConnectionType.CONNECTION_5G;
            }
        }
        if (i == 1) {
            return NetworkChangeDetector$ConnectionType.CONNECTION_WIFI;
        }
        if (i == 6) {
            return NetworkChangeDetector$ConnectionType.CONNECTION_4G;
        }
        if (i == 7) {
            return NetworkChangeDetector$ConnectionType.CONNECTION_BLUETOOTH;
        }
        if (i == 9) {
            return NetworkChangeDetector$ConnectionType.CONNECTION_ETHERNET;
        }
        if (i == 17) {
            return NetworkChangeDetector$ConnectionType.CONNECTION_VPN;
        }
        return NetworkChangeDetector$ConnectionType.CONNECTION_UNKNOWN;
    }

    private final String e(bapj bapjVar) {
        Intent registerReceiver;
        WifiInfo wifiInfo;
        String ssid;
        return (b(bapjVar) != NetworkChangeDetector$ConnectionType.CONNECTION_WIFI || (registerReceiver = this.k.a.registerReceiver(null, new IntentFilter("android.net.wifi.STATE_CHANGE"))) == null || (wifiInfo = (WifiInfo) registerReceiver.getParcelableExtra("wifiInfo")) == null || (ssid = wifiInfo.getSSID()) == null) ? "" : ssid;
    }

    public final bapj d() {
        return this.g.i();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        bapj d = d();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            NetworkChangeDetector$ConnectionType b = b(d);
            String e = e(d);
            if (b == this.i && e.equals(this.j)) {
                return;
            }
            this.i = b;
            this.j = e;
            String valueOf = String.valueOf(b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
            sb.append("Network connectivity changed, type is: ");
            sb.append(valueOf);
            Logging.a("NetworkMonitorAutoDetect", sb.toString());
            NetworkMonitor networkMonitor = this.f.a;
            networkMonitor.a = b;
            networkMonitor.b();
        }
    }
}
