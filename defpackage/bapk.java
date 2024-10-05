package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Iterator;
import org.webrtc.Logging;
import org.webrtc.NetworkChangeDetector$NetworkInformation;
import org.webrtc.NetworkMonitor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bapk extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ bapm a;

    public bapk(bapm bapmVar) {
        this.a = bapmVar;
    }

    private final void a(Network network) {
        NetworkChangeDetector$NetworkInformation h = this.a.g.h(network);
        if (h != null) {
            NetworkMonitor networkMonitor = this.a.f.a;
            Iterator it = networkMonitor.a().iterator();
            while (it.hasNext()) {
                networkMonitor.nativeNotifyOfNetworkConnect(((Long) it.next()).longValue(), h);
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        String valueOf = String.valueOf(network.toString());
        Logging.a("NetworkMonitorAutoDetect", valueOf.length() != 0 ? "Network becomes available: ".concat(valueOf) : new String("Network becomes available: "));
        a(network);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        String valueOf = String.valueOf(networkCapabilities.toString());
        Logging.a("NetworkMonitorAutoDetect", valueOf.length() != 0 ? "capabilities changed: ".concat(valueOf) : new String("capabilities changed: "));
        a(network);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        Logging.a("NetworkMonitorAutoDetect", "link properties changed");
        a(network);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLosing(Network network, int i) {
        String network2 = network.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(network2).length() + 42);
        sb.append("Network ");
        sb.append(network2);
        sb.append(" is about to lose in ");
        sb.append(i);
        sb.append("ms");
        Logging.a("NetworkMonitorAutoDetect", sb.toString());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        String network2 = network.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(network2).length() + 24);
        sb.append("Network ");
        sb.append(network2);
        sb.append(" is disconnected");
        Logging.a("NetworkMonitorAutoDetect", sb.toString());
        bapg bapgVar = this.a.f;
        long a = bapm.a(network);
        NetworkMonitor networkMonitor = bapgVar.a;
        Iterator it = networkMonitor.a().iterator();
        while (it.hasNext()) {
            networkMonitor.nativeNotifyOfNetworkDisconnect(((Long) it.next()).longValue(), a);
        }
    }
}
