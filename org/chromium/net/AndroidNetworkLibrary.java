package org.chromium.net;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.TransportInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import defpackage.ayeq;
import defpackage.baeo;
import defpackage.baeq;
import java.io.FileDescriptor;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URLConnection;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Enumeration;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
class AndroidNetworkLibrary {
    private static Boolean a;
    private static Boolean b;

    AndroidNetworkLibrary() {
    }

    private static WifiInfo a() {
        TransportInfo transportInfo;
        if (!b()) {
            Intent registerReceiver = ayeq.a.registerReceiver(null, new IntentFilter("android.net.wifi.STATE_CHANGE"));
            if (registerReceiver != null) {
                return (WifiInfo) registerReceiver.getParcelableExtra("wifiInfo");
            }
            return null;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            ConnectivityManager connectivityManager = (ConnectivityManager) ayeq.a.getSystemService("connectivity");
            for (Network network : connectivityManager.getAllNetworks()) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities != null && networkCapabilities.hasTransport(1) && (transportInfo = networkCapabilities.getTransportInfo()) != null && (transportInfo instanceof WifiInfo)) {
                    return (WifiInfo) transportInfo;
                }
            }
            return null;
        }
        return ((WifiManager) ayeq.a.getSystemService("wifi")).getConnectionInfo();
    }

    public static void addTestRootCertificate(byte[] bArr) {
        X509Util.addTestRootCertificate(bArr);
    }

    private static boolean b() {
        if (b == null) {
            b = Boolean.valueOf(ayeq.w(ayeq.a, "android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()) == 0);
        }
        return b.booleanValue();
    }

    public static void clearTestRootCertificates() {
        X509Util.clearTestRootCertificates();
    }

    public static DnsStatus getDnsStatus(Network network) {
        ConnectivityManager connectivityManager;
        if (a == null) {
            a = Boolean.valueOf(ayeq.w(ayeq.a, "android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0);
        }
        if (!a.booleanValue() || (connectivityManager = (ConnectivityManager) ayeq.a.getSystemService("connectivity")) == null) {
            return null;
        }
        if (network == null) {
            network = connectivityManager.getActiveNetwork();
        }
        if (network == null) {
            return null;
        }
        try {
            LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
            if (linkProperties == null) {
                return null;
            }
            List<InetAddress> dnsServers = linkProperties.getDnsServers();
            String domains = linkProperties.getDomains();
            if (Build.VERSION.SDK_INT >= 28) {
                return new DnsStatus(dnsServers, linkProperties.isPrivateDnsActive(), linkProperties.getPrivateDnsServerName(), domains);
            }
            return new DnsStatus(dnsServers, false, "", domains);
        } catch (RuntimeException unused) {
            return null;
        }
    }

    private static boolean getIsCaptivePortal() {
        ConnectivityManager connectivityManager;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        return (Build.VERSION.SDK_INT < 23 || (connectivityManager = (ConnectivityManager) ayeq.a.getSystemService("connectivity")) == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(17)) ? false : true;
    }

    private static boolean getIsRoaming() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ayeq.a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        return activeNetworkInfo.isRoaming();
    }

    public static String getMimeTypeFromExtension(String str) {
        return URLConnection.guessContentTypeFromName("foo." + str);
    }

    private static String getNetworkOperator() {
        return AndroidTelephonyManagerBridge.getInstance().getNetworkOperator();
    }

    private static String getSimOperator() {
        return AndroidTelephonyManagerBridge.getInstance().getSimOperator();
    }

    public static String getWifiSSID() {
        String ssid;
        WifiInfo a2 = a();
        return (a2 == null || (ssid = a2.getSSID()) == null || ssid.equals("<unknown ssid>")) ? "" : ssid;
    }

    public static int getWifiSignalLevel(int i) {
        int intExtra;
        int calculateSignalLevel;
        if (ayeq.a == null || ayeq.a.getContentResolver() == null) {
            return -1;
        }
        if (!b()) {
            try {
                Intent registerReceiver = ayeq.a.registerReceiver(null, new IntentFilter("android.net.wifi.RSSI_CHANGED"));
                if (registerReceiver == null) {
                    return -1;
                }
                intExtra = registerReceiver.getIntExtra("newRssi", CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
            } catch (IllegalArgumentException unused) {
            }
        } else {
            WifiInfo a2 = a();
            if (a2 == null) {
                return -1;
            }
            intExtra = a2.getRssi();
        }
        if (intExtra != Integer.MIN_VALUE && (calculateSignalLevel = WifiManager.calculateSignalLevel(intExtra, i)) >= 0 && calculateSignalLevel < i) {
            return calculateSignalLevel;
        }
        return -1;
    }

    public static boolean haveOnlyLoopbackAddresses() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return false;
            }
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                try {
                    if (nextElement.isUp() && !nextElement.isLoopback()) {
                        return false;
                    }
                } catch (SocketException unused) {
                }
            }
            return true;
        } catch (Exception e) {
            Log.w("AndroidNetworkLibrary", "could not get network interfaces: " + e);
            return false;
        }
    }

    private static boolean isCleartextPermitted(String str) {
        try {
            return NetworkSecurityPolicyProxy.getInstance().isCleartextTrafficPermitted(str);
        } catch (IllegalArgumentException unused) {
            return NetworkSecurityPolicyProxy.getInstance().isCleartextTrafficPermitted();
        }
    }

    private static boolean reportBadDefaultNetwork() {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT < 23 || (connectivityManager = (ConnectivityManager) ayeq.a.getSystemService("connectivity")) == null) {
            return false;
        }
        connectivityManager.reportNetworkConnectivity(null, false);
        return true;
    }

    private static void tagSocket(int i, int i2, int i3) {
        ParcelFileDescriptor adoptFd;
        FileDescriptor fileDescriptor;
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        if (i3 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(i3);
        }
        if (i2 != -1) {
            ThreadStatsUid.set(i2);
        }
        if (Build.VERSION.SDK_INT < 23) {
            fileDescriptor = baeo.a(i);
            adoptFd = null;
        } else {
            adoptFd = ParcelFileDescriptor.adoptFd(i);
            fileDescriptor = adoptFd.getFileDescriptor();
        }
        baeq baeqVar = new baeq(fileDescriptor);
        TrafficStats.tagSocket(baeqVar);
        baeqVar.close();
        if (adoptFd != null) {
            adoptFd.detachFd();
        }
        if (i3 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(threadStatsTag);
        }
        if (i2 != -1) {
            ThreadStatsUid.clear();
        }
    }

    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2) {
        try {
            return X509Util.verifyServerCertificates(bArr, str, str2);
        } catch (IllegalArgumentException unused) {
            return new AndroidCertVerifyResult(-1);
        } catch (KeyStoreException unused2) {
            return new AndroidCertVerifyResult(-1);
        } catch (NoSuchAlgorithmException unused3) {
            return new AndroidCertVerifyResult(-1);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class NetworkSecurityPolicyProxy {
        private static NetworkSecurityPolicyProxy sInstance = new NetworkSecurityPolicyProxy();

        public static NetworkSecurityPolicyProxy getInstance() {
            return sInstance;
        }

        public static void setInstanceForTesting(NetworkSecurityPolicyProxy networkSecurityPolicyProxy) {
            sInstance = networkSecurityPolicyProxy;
        }

        public boolean isCleartextTrafficPermitted() {
            if (Build.VERSION.SDK_INT < 23) {
                return true;
            }
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }

        public boolean isCleartextTrafficPermitted(String str) {
            return Build.VERSION.SDK_INT < 24 ? isCleartextTrafficPermitted() : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
    }
}
