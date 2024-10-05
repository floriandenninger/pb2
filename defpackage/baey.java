package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baey extends ConnectivityManager.NetworkCallback {
    LinkProperties a;
    NetworkCapabilities b;
    final /* synthetic */ NetworkChangeNotifierAutoDetect c;

    public baey(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.c = networkChangeNotifierAutoDetect;
    }

    private final NetworkChangeNotifierAutoDetect.NetworkState a(Network network) {
        int i;
        int i2;
        if (this.b.hasTransport(1) || this.b.hasTransport(5)) {
            i = 1;
        } else {
            if (this.b.hasTransport(0)) {
                NetworkInfo e = this.c.mConnectivityManagerDelegate.e(network);
                i2 = e != null ? e.getSubtype() : -1;
                i = 0;
                return new NetworkChangeNotifierAutoDetect.NetworkState(true, i, i2, String.valueOf(NetworkChangeNotifierAutoDetect.networkToNetId(network)), this.a.isPrivateDnsActive(), this.a.getPrivateDnsServerName());
            }
            if (this.b.hasTransport(3)) {
                i = 9;
            } else if (this.b.hasTransport(2)) {
                i = 7;
            } else if (this.b.hasTransport(4)) {
                NetworkInfo d = this.c.mConnectivityManagerDelegate.d(network);
                i = d != null ? d.getType() : 17;
            } else {
                i = -1;
            }
        }
        i2 = -1;
        return new NetworkChangeNotifierAutoDetect.NetworkState(true, i, i2, String.valueOf(NetworkChangeNotifierAutoDetect.networkToNetId(network)), this.a.isPrivateDnsActive(), this.a.getPrivateDnsServerName());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.a = null;
        this.b = null;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean z;
        this.b = networkCapabilities;
        z = this.c.mRegistered;
        if (!z || this.a == null || this.b == null) {
            return;
        }
        this.c.connectionTypeChangedTo(a(network));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        boolean z;
        this.a = linkProperties;
        z = this.c.mRegistered;
        if (!z || this.a == null || this.b == null) {
            return;
        }
        this.c.connectionTypeChangedTo(a(network));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        boolean z;
        this.a = null;
        this.b = null;
        z = this.c.mRegistered;
        if (z) {
            this.c.connectionTypeChangedTo(new NetworkChangeNotifierAutoDetect.NetworkState(false, -1, -1, null, false, ""));
        }
    }
}
