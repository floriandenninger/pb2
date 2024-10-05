package org.chromium.net;

import J.N;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import defpackage.ayeq;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class NetworkActivationRequest extends ConnectivityManager.NetworkCallback {
    private final ConnectivityManager mConnectivityManager;
    private long mNativePtr;
    private final Object mNativePtrLock = new Object();

    private NetworkActivationRequest(long j, int i) {
        ConnectivityManager connectivityManager = (ConnectivityManager) ayeq.a.getSystemService("connectivity");
        this.mConnectivityManager = connectivityManager;
        if (connectivityManager != null) {
            try {
                connectivityManager.requestNetwork(new NetworkRequest.Builder().addTransportType(i).addCapability(12).build(), this);
                this.mNativePtr = j;
            } catch (SecurityException unused) {
            }
        }
    }

    public static NetworkActivationRequest createMobileNetworkRequest(long j) {
        return new NetworkActivationRequest(j, 0);
    }

    private void unregister() {
        long j;
        synchronized (this.mNativePtrLock) {
            j = this.mNativePtr;
            this.mNativePtr = 0L;
        }
        if (j != 0) {
            this.mConnectivityManager.unregisterNetworkCallback(this);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        synchronized (this.mNativePtrLock) {
            long j = this.mNativePtr;
            if (j != 0) {
                N.MJRUHS0T(j, NetworkChangeNotifierAutoDetect.networkToNetId(network));
            }
        }
    }
}
