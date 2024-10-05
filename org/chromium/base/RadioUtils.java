package org.chromium.base;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Process;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import defpackage.ayeq;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RadioUtils {
    private static Boolean a;
    private static Boolean b;

    private RadioUtils() {
    }

    private static int getCellDataActivity() {
        try {
            return ((TelephonyManager) ayeq.a.getSystemService("phone")).getDataActivity();
        } catch (SecurityException unused) {
            return -1;
        }
    }

    private static int getCellSignalLevel() {
        try {
            SignalStrength signalStrength = ((TelephonyManager) ayeq.a.getSystemService("phone")).getSignalStrength();
            if (signalStrength != null) {
                return signalStrength.getLevel();
            }
            return -1;
        } catch (SecurityException unused) {
            return -1;
        }
    }

    private static boolean isSupported() {
        if (Build.VERSION.SDK_INT >= 28) {
            if (a == null) {
                a = Boolean.valueOf(ayeq.w(ayeq.a, "android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0);
            }
            if (a.booleanValue()) {
                if (b == null) {
                    b = Boolean.valueOf(ayeq.w(ayeq.a, "android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()) == 0);
                }
                if (b.booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isWifiConnected() {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) ayeq.a.getSystemService("connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasTransport(1);
    }
}
