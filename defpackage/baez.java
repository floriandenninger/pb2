package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.StrictMode;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import org.chromium.net.NetworkChangeNotifierAutoDetect;
import org.webrtc.Logging;
import org.webrtc.NetworkChangeDetector$ConnectionType;
import org.webrtc.NetworkChangeDetector$IPAddress;
import org.webrtc.NetworkChangeDetector$NetworkInformation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baez {
    public final ConnectivityManager a;

    public baez(Context context, byte[] bArr) {
        this.a = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public static final boolean g(Network network) {
        Socket socket = new Socket();
        try {
            try {
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                baec baecVar = new baec(null, vmPolicy);
                try {
                    network.bindSocket(socket);
                    baecVar.close();
                    try {
                        socket.close();
                        return true;
                    } catch (IOException unused) {
                        return true;
                    }
                } catch (Throwable th) {
                    try {
                        baecVar.close();
                    } catch (Throwable unused2) {
                    }
                    throw th;
                }
            } catch (IOException unused3) {
                return false;
            }
        } catch (IOException unused4) {
            socket.close();
            return false;
        } catch (Throwable th2) {
            try {
                socket.close();
            } catch (IOException unused5) {
            }
            throw th2;
        }
    }

    private static final bapj l(NetworkInfo networkInfo) {
        return (networkInfo == null || !networkInfo.isConnected()) ? new bapj(false, -1, -1, -1, -1) : new bapj(true, networkInfo.getType(), networkInfo.getSubtype(), -1, -1);
    }

    public final int a(Network network) {
        NetworkInfo d = d(network);
        if (d == null || !d.isConnected()) {
            return 6;
        }
        return NetworkChangeNotifierAutoDetect.convertToConnectionType(d.getType(), d.getSubtype());
    }

    public final Network b() {
        Network network;
        if (Build.VERSION.SDK_INT >= 23) {
            network = this.a.getActiveNetwork();
            if (network != null) {
                return network;
            }
        } else {
            network = null;
        }
        NetworkInfo activeNetworkInfo = this.a.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return null;
        }
        for (Network network2 : NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(this, null)) {
            NetworkInfo e = e(network2);
            if (e != null && (e.getType() == activeNetworkInfo.getType() || e.getType() == 17)) {
                network = network2;
            }
        }
        return network;
    }

    public final NetworkCapabilities c(Network network) {
        for (int i = 0; i < 2; i++) {
            try {
                return this.a.getNetworkCapabilities(network);
            } catch (SecurityException unused) {
            }
        }
        return null;
    }

    public final NetworkInfo d(Network network) {
        NetworkInfo e = e(network);
        return (e == null || e.getType() != 17) ? e : this.a.getActiveNetworkInfo();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final NetworkInfo e(Network network) {
        try {
            try {
                return this.a.getNetworkInfo(network);
            } catch (NullPointerException unused) {
                return null;
            }
        } catch (NullPointerException unused2) {
            return this.a.getNetworkInfo(network);
        }
    }

    public final void f(ConnectivityManager.NetworkCallback networkCallback) {
        this.a.unregisterNetworkCallback(networkCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final NetworkChangeDetector$NetworkInformation h(Network network) {
        ConnectivityManager connectivityManager;
        bapj l;
        bapj bapjVar;
        NetworkInfo activeNetworkInfo;
        NetworkChangeDetector$NetworkInformation networkChangeDetector$NetworkInformation = null;
        networkChangeDetector$NetworkInformation = null;
        if (network != null && (connectivityManager = this.a) != null) {
            LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
            if (linkProperties == null) {
                String valueOf = String.valueOf(network.toString());
                Logging.d("NetworkMonitorAutoDetect", valueOf.length() != 0 ? "Detected unknown network: ".concat(valueOf) : new String("Detected unknown network: "));
                return null;
            }
            if (linkProperties.getInterfaceName() != null) {
                ConnectivityManager connectivityManager2 = this.a;
                if (connectivityManager2 == null) {
                    l = new bapj(false, -1, -1, -1, -1);
                } else {
                    NetworkInfo networkInfo = connectivityManager2.getNetworkInfo(network);
                    if (networkInfo == null) {
                        String valueOf2 = String.valueOf(network.toString());
                        Logging.d("NetworkMonitorAutoDetect", valueOf2.length() != 0 ? "Couldn't retrieve information from network ".concat(valueOf2) : new String("Couldn't retrieve information from network "));
                        l = new bapj(false, -1, -1, -1, -1);
                    } else if (networkInfo.getType() != 17) {
                        NetworkCapabilities networkCapabilities = this.a.getNetworkCapabilities(network);
                        if (networkCapabilities == null || !networkCapabilities.hasTransport(4)) {
                            l = l(networkInfo);
                        } else {
                            bapjVar = new bapj(networkInfo.isConnected(), 17, -1, networkInfo.getType(), networkInfo.getSubtype());
                            l = bapjVar;
                        }
                    } else if (networkInfo.getType() == 17) {
                        if (Build.VERSION.SDK_INT < 23 || !network.equals(this.a.getActiveNetwork()) || (activeNetworkInfo = this.a.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() == 17) {
                            bapjVar = new bapj(networkInfo.isConnected(), 17, -1, -1, -1);
                            l = bapjVar;
                        } else {
                            l = new bapj(networkInfo.isConnected(), 17, -1, activeNetworkInfo.getType(), activeNetworkInfo.getSubtype());
                        }
                    } else {
                        l = l(networkInfo);
                    }
                }
                final NetworkChangeDetector$ConnectionType b = bapm.b(l);
                if (b == NetworkChangeDetector$ConnectionType.CONNECTION_NONE) {
                    String network2 = network.toString();
                    StringBuilder sb = new StringBuilder(String.valueOf(network2).length() + 24);
                    sb.append("Network ");
                    sb.append(network2);
                    sb.append(" is disconnected");
                    Logging.a("NetworkMonitorAutoDetect", sb.toString());
                    return null;
                }
                if (b == NetworkChangeDetector$ConnectionType.CONNECTION_UNKNOWN || b == NetworkChangeDetector$ConnectionType.CONNECTION_UNKNOWN_CELLULAR) {
                    String network3 = network.toString();
                    String valueOf3 = String.valueOf(b);
                    int i = l.b;
                    int i2 = l.c;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(network3).length() + 84 + String.valueOf(valueOf3).length());
                    sb2.append("Network ");
                    sb2.append(network3);
                    sb2.append(" connection type is ");
                    sb2.append(valueOf3);
                    sb2.append(" because it has type ");
                    sb2.append(i);
                    sb2.append(" and subtype ");
                    sb2.append(i2);
                    Logging.a("NetworkMonitorAutoDetect", sb2.toString());
                }
                final NetworkChangeDetector$ConnectionType c = l.b != 17 ? NetworkChangeDetector$ConnectionType.CONNECTION_NONE : bapm.c(l.a, l.d, l.e);
                final String interfaceName = linkProperties.getInterfaceName();
                final long a = bapm.a(network);
                final NetworkChangeDetector$IPAddress[] networkChangeDetector$IPAddressArr = new NetworkChangeDetector$IPAddress[linkProperties.getLinkAddresses().size()];
                Iterator<LinkAddress> it = linkProperties.getLinkAddresses().iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    final byte[] address = it.next().getAddress().getAddress();
                    networkChangeDetector$IPAddressArr[i3] = new Object(address) { // from class: org.webrtc.NetworkChangeDetector$IPAddress
                        public final byte[] a;

                        {
                            this.a = address;
                        }

                        private byte[] getAddress() {
                            return this.a;
                        }
                    };
                    i3++;
                }
                networkChangeDetector$NetworkInformation = new Object(interfaceName, b, c, a, networkChangeDetector$IPAddressArr) { // from class: org.webrtc.NetworkChangeDetector$NetworkInformation
                    public final String a;
                    public final NetworkChangeDetector$ConnectionType b;
                    public final NetworkChangeDetector$ConnectionType c;
                    public final long d;
                    public final NetworkChangeDetector$IPAddress[] e;

                    {
                        this.a = interfaceName;
                        this.b = b;
                        this.c = c;
                        this.d = a;
                        this.e = networkChangeDetector$IPAddressArr;
                    }

                    private NetworkChangeDetector$ConnectionType getConnectionType() {
                        return this.b;
                    }

                    private long getHandle() {
                        return this.d;
                    }

                    private NetworkChangeDetector$IPAddress[] getIpAddresses() {
                        return this.e;
                    }

                    private String getName() {
                        return this.a;
                    }

                    private NetworkChangeDetector$ConnectionType getUnderlyingConnectionTypeForVpn() {
                        return this.c;
                    }
                };
            } else {
                String valueOf4 = String.valueOf(network.toString());
                Logging.d("NetworkMonitorAutoDetect", valueOf4.length() != 0 ? "Null interface name for network ".concat(valueOf4) : new String("Null interface name for network "));
                return null;
            }
        }
        return networkChangeDetector$NetworkInformation;
    }

    public final bapj i() {
        ConnectivityManager connectivityManager = this.a;
        return connectivityManager == null ? new bapj(false, -1, -1, -1, -1) : l(connectivityManager.getActiveNetworkInfo());
    }

    public final void j(ConnectivityManager.NetworkCallback networkCallback) {
        if (k()) {
            Logging.a("NetworkMonitorAutoDetect", "Unregister network callback");
            this.a.unregisterNetworkCallback(networkCallback);
        }
    }

    public final boolean k() {
        return this.a != null;
    }

    baez() {
        this.a = null;
    }

    public baez(Context context) {
        this.a = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public baez(Context context, char[] cArr) {
        this.a = (ConnectivityManager) context.getSystemService("connectivity");
    }
}
