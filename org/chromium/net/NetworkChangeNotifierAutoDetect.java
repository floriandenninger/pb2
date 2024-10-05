package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import defpackage.ayeq;
import defpackage.baex;
import defpackage.baey;
import defpackage.baez;
import defpackage.bafa;
import defpackage.bafg;
import defpackage.bafh;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class NetworkChangeNotifierAutoDetect extends BroadcastReceiver {
    private static final String TAG = "NetworkChangeNotifierAutoDetect";
    private static final int UNKNOWN_LINK_SPEED = -1;
    private baez mConnectivityManagerDelegate;
    private ConnectivityManager.NetworkCallback mDefaultNetworkCallback;
    private final Handler mHandler;
    private boolean mIgnoreNextBroadcast;
    private final NetworkConnectivityIntentFilter mIntentFilter;
    private final Looper mLooper;
    private bafg mNetworkCallback;
    private NetworkRequest mNetworkRequest;
    private NetworkState mNetworkState;
    private final Observer mObserver;
    private boolean mRegisterNetworkCallbackFailed;
    private boolean mRegistered;
    private final RegistrationPolicy mRegistrationPolicy;
    private boolean mShouldSignalObserver;
    private bafh mWifiManagerDelegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class NetworkConnectivityIntentFilter extends IntentFilter {
        public NetworkConnectivityIntentFilter() {
            addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class NetworkState {
        private final boolean mConnected;
        private final boolean mIsPrivateDnsActive;
        private final String mNetworkIdentifier;
        private final String mPrivateDnsServerName;
        private final int mSubtype;
        private final int mType;

        public NetworkState(boolean z, int i, int i2, String str, boolean z2, String str2) {
            this.mConnected = z;
            this.mType = i;
            this.mSubtype = i2;
            this.mNetworkIdentifier = str == null ? "" : str;
            this.mIsPrivateDnsActive = z2;
            this.mPrivateDnsServerName = str2 == null ? "" : str2;
        }

        public int getConnectionSubtype() {
            if (!isConnected()) {
                return 1;
            }
            int networkType = getNetworkType();
            if (networkType != 0 && networkType != 4 && networkType != 5) {
                return 0;
            }
            switch (getNetworkSubType()) {
                case 1:
                    return 7;
                case 2:
                    return 8;
                case 3:
                    return 9;
                case 4:
                    return 5;
                case 5:
                    return 10;
                case 6:
                    return 11;
                case 7:
                    return 6;
                case 8:
                    return 14;
                case 9:
                    return 15;
                case 10:
                    return 12;
                case 11:
                    return 4;
                case 12:
                    return 13;
                case 13:
                    return 18;
                case 14:
                    return 16;
                case 15:
                    return 17;
                default:
                    return 0;
            }
        }

        public int getConnectionType() {
            if (isConnected()) {
                return NetworkChangeNotifierAutoDetect.convertToConnectionType(getNetworkType(), getNetworkSubType());
            }
            return 6;
        }

        public String getNetworkIdentifier() {
            return this.mNetworkIdentifier;
        }

        public int getNetworkSubType() {
            return this.mSubtype;
        }

        public int getNetworkType() {
            return this.mType;
        }

        public String getPrivateDnsServerName() {
            return this.mPrivateDnsServerName;
        }

        public boolean isConnected() {
            return this.mConnected;
        }

        public boolean isPrivateDnsActive() {
            return this.mIsPrivateDnsActive;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface Observer {
        void onConnectionSubtypeChanged(int i);

        void onConnectionTypeChanged(int i);

        void onNetworkConnect(long j, int i);

        void onNetworkDisconnect(long j);

        void onNetworkSoonToDisconnect(long j);

        void purgeActiveNetworkList(long[] jArr);
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public abstract class RegistrationPolicy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private NetworkChangeNotifierAutoDetect mNotifier;

        protected abstract void destroy();

        /* JADX INFO: Access modifiers changed from: protected */
        public void init(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
            this.mNotifier = networkChangeNotifierAutoDetect;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void register() {
            this.mNotifier.register();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void unregister() {
            this.mNotifier.unregister();
        }
    }

    public NetworkChangeNotifierAutoDetect(Observer observer, RegistrationPolicy registrationPolicy) {
        Looper myLooper = Looper.myLooper();
        this.mLooper = myLooper;
        this.mHandler = new Handler(myLooper);
        this.mObserver = observer;
        this.mConnectivityManagerDelegate = new baez(ayeq.a);
        if (Build.VERSION.SDK_INT < 23) {
            this.mWifiManagerDelegate = new bafh(ayeq.a);
        }
        this.mNetworkCallback = new bafg(this);
        this.mNetworkRequest = new NetworkRequest.Builder().addCapability(12).removeCapability(15).build();
        if (Build.VERSION.SDK_INT >= 30) {
            this.mDefaultNetworkCallback = new baey(this);
        } else {
            this.mDefaultNetworkCallback = Build.VERSION.SDK_INT >= 28 ? new bafa(this) : null;
        }
        this.mNetworkState = getCurrentNetworkState();
        this.mIntentFilter = new NetworkConnectivityIntentFilter();
        this.mIgnoreNextBroadcast = false;
        this.mShouldSignalObserver = false;
        this.mRegistrationPolicy = registrationPolicy;
        registrationPolicy.init(this);
        this.mShouldSignalObserver = true;
    }

    private void assertOnThread() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectionTypeChanged() {
        connectionTypeChangedTo(getCurrentNetworkState());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectionTypeChangedTo(NetworkState networkState) {
        if (networkState.getConnectionType() != this.mNetworkState.getConnectionType() || !networkState.getNetworkIdentifier().equals(this.mNetworkState.getNetworkIdentifier()) || networkState.isPrivateDnsActive() != this.mNetworkState.isPrivateDnsActive() || !networkState.getPrivateDnsServerName().equals(this.mNetworkState.getPrivateDnsServerName())) {
            this.mObserver.onConnectionTypeChanged(networkState.getConnectionType());
        }
        if (networkState.getConnectionType() != this.mNetworkState.getConnectionType() || networkState.getConnectionSubtype() != this.mNetworkState.getConnectionSubtype()) {
            this.mObserver.onConnectionSubtypeChanged(networkState.getConnectionSubtype());
        }
        this.mNetworkState = networkState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int convertToConnectionType(int i, int i2) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i != 4 && i != 5) {
                if (i == 6) {
                    return 5;
                }
                if (i != 7) {
                    return i != 9 ? 0 : 1;
                }
                return 7;
            }
        }
        if (i2 == 20) {
            return 8;
        }
        switch (i2) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 3;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 4;
            case 13:
                return 5;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Network[] getAllNetworksFiltered(baez baezVar, Network network) {
        NetworkCapabilities c;
        Network[] allNetworks = baezVar.a.getAllNetworks();
        if (allNetworks == null) {
            allNetworks = new Network[0];
        }
        int i = 0;
        for (Network network2 : allNetworks) {
            if (!network2.equals(network) && (c = baezVar.c(network2)) != null && c.hasCapability(12)) {
                if (c.hasTransport(4)) {
                    if (baez.g(network2)) {
                        return new Network[]{network2};
                    }
                } else {
                    allNetworks[i] = network2;
                    i++;
                }
            }
        }
        return (Network[]) Arrays.copyOf(allNetworks, i);
    }

    public static long networkToNetId(Network network) {
        return Build.VERSION.SDK_INT >= 23 ? network.getNetworkHandle() : Integer.parseInt(network.toString());
    }

    private boolean onThread() {
        return this.mLooper == Looper.myLooper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnThread(final Runnable runnable) {
        if (onThread()) {
            runnable.run();
        } else {
            this.mHandler.post(new Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    NetworkChangeNotifierAutoDetect.this.m192x7a563379(runnable);
                }
            });
        }
    }

    public void destroy() {
        this.mRegistrationPolicy.destroy();
        unregister();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.chromium.net.NetworkChangeNotifierAutoDetect.NetworkState getCurrentNetworkState() {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.NetworkChangeNotifierAutoDetect.getCurrentNetworkState():org.chromium.net.NetworkChangeNotifierAutoDetect$NetworkState");
    }

    public long getDefaultNetId() {
        Network b = this.mConnectivityManagerDelegate.b();
        if (b == null) {
            return -1L;
        }
        return networkToNetId(b);
    }

    public long[] getNetworksAndTypes() {
        Network[] allNetworksFiltered = getAllNetworksFiltered(this.mConnectivityManagerDelegate, null);
        int length = allNetworksFiltered.length;
        long[] jArr = new long[length + length];
        int i = 0;
        for (Network network : allNetworksFiltered) {
            int i2 = i + 1;
            jArr[i] = networkToNetId(network);
            i = i2 + 1;
            jArr[i2] = this.mConnectivityManagerDelegate.a(r5);
        }
        return jArr;
    }

    RegistrationPolicy getRegistrationPolicy() {
        return this.mRegistrationPolicy;
    }

    boolean isReceiverRegisteredForTesting() {
        return this.mRegistered;
    }

    /* renamed from: lambda$runOnThread$0$org-chromium-net-NetworkChangeNotifierAutoDetect, reason: not valid java name */
    public /* synthetic */ void m192x7a563379(Runnable runnable) {
        if (this.mRegistered) {
            runnable.run();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        runOnThread(new baex(this));
    }

    public void register() {
        NetworkCapabilities c;
        if (this.mRegistered) {
            connectionTypeChanged();
            return;
        }
        if (this.mShouldSignalObserver) {
            connectionTypeChanged();
        }
        ConnectivityManager.NetworkCallback networkCallback = this.mDefaultNetworkCallback;
        if (networkCallback != null) {
            try {
                this.mConnectivityManagerDelegate.a.registerDefaultNetworkCallback(networkCallback, this.mHandler);
            } catch (RuntimeException unused) {
                this.mDefaultNetworkCallback = null;
            }
        }
        if (this.mDefaultNetworkCallback == null) {
            this.mIgnoreNextBroadcast = ayeq.a.registerReceiver(this, this.mIntentFilter) != null;
        }
        this.mRegistered = true;
        bafg bafgVar = this.mNetworkCallback;
        if (bafgVar != null) {
            Network[] allNetworksFiltered = getAllNetworksFiltered(bafgVar.b.mConnectivityManagerDelegate, null);
            bafgVar.a = null;
            if (allNetworksFiltered.length == 1 && (c = bafgVar.b.mConnectivityManagerDelegate.c(allNetworksFiltered[0])) != null && c.hasTransport(4)) {
                bafgVar.a = allNetworksFiltered[0];
            }
            try {
                baez baezVar = this.mConnectivityManagerDelegate;
                NetworkRequest networkRequest = this.mNetworkRequest;
                bafg bafgVar2 = this.mNetworkCallback;
                Handler handler = this.mHandler;
                if (Build.VERSION.SDK_INT >= 26) {
                    baezVar.a.registerNetworkCallback(networkRequest, bafgVar2, handler);
                } else {
                    baezVar.a.registerNetworkCallback(networkRequest, bafgVar2);
                }
            } catch (RuntimeException unused2) {
                this.mRegisterNetworkCallbackFailed = true;
                this.mNetworkCallback = null;
            }
            if (this.mRegisterNetworkCallbackFailed || !this.mShouldSignalObserver) {
                return;
            }
            Network[] allNetworksFiltered2 = getAllNetworksFiltered(this.mConnectivityManagerDelegate, null);
            long[] jArr = new long[allNetworksFiltered2.length];
            for (int i = 0; i < allNetworksFiltered2.length; i++) {
                jArr[i] = networkToNetId(allNetworksFiltered2[i]);
            }
            this.mObserver.purgeActiveNetworkList(jArr);
        }
    }

    public boolean registerNetworkCallbackFailed() {
        return this.mRegisterNetworkCallbackFailed;
    }

    void setConnectivityManagerDelegateForTests(baez baezVar) {
        this.mConnectivityManagerDelegate = baezVar;
    }

    void setWifiManagerDelegateForTests(bafh bafhVar) {
        this.mWifiManagerDelegate = bafhVar;
    }

    public void unregister() {
        if (this.mRegistered) {
            this.mRegistered = false;
            bafg bafgVar = this.mNetworkCallback;
            if (bafgVar != null) {
                this.mConnectivityManagerDelegate.f(bafgVar);
            }
            ConnectivityManager.NetworkCallback networkCallback = this.mDefaultNetworkCallback;
            if (networkCallback != null) {
                this.mConnectivityManagerDelegate.f(networkCallback);
            } else {
                ayeq.a.unregisterReceiver(this);
            }
        }
    }
}
