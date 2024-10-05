package org.chromium.net;

import J.N;
import defpackage.baea;
import defpackage.baew;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class NetworkChangeNotifier {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static NetworkChangeNotifier sInstance;
    private NetworkChangeNotifierAutoDetect mAutoDetector;
    private int mCurrentConnectionType = 0;
    private final ArrayList mNativeChangeNotifiers = new ArrayList();
    private final baea mConnectionTypeObservers = new baea();

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface ConnectionTypeObserver {
        void onConnectionTypeChanged(int i);
    }

    protected NetworkChangeNotifier() {
    }

    public static void addConnectionTypeObserver(ConnectionTypeObserver connectionTypeObserver) {
        getInstance().addConnectionTypeObserverInternal(connectionTypeObserver);
    }

    private void addConnectionTypeObserverInternal(ConnectionTypeObserver connectionTypeObserver) {
        this.mConnectionTypeObservers.d(connectionTypeObserver);
    }

    private void destroyAutoDetector() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        if (networkChangeNotifierAutoDetect != null) {
            networkChangeNotifierAutoDetect.destroy();
            this.mAutoDetector = null;
        }
    }

    public static void fakeConnectionSubtypeChanged(int i) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfConnectionSubtypeChange(i);
    }

    public static void fakeDefaultNetwork(long j, int i) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfConnectionTypeChange(i, j);
    }

    public static void fakeNetworkConnected(long j, int i) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfNetworkConnect(j, i);
    }

    public static void fakeNetworkDisconnected(long j) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfNetworkDisconnect(j);
    }

    public static void fakeNetworkSoonToBeDisconnected(long j) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfNetworkSoonToDisconnect(j);
    }

    public static void fakePurgeActiveNetworkList(long[] jArr) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversToPurgeActiveNetworkList(jArr);
    }

    public static void forceConnectivityState(boolean z) {
        setAutoDetectConnectivityState(false);
        getInstance().forceConnectivityStateInternal(z);
    }

    private void forceConnectivityStateInternal(boolean z) {
        if ((this.mCurrentConnectionType != 6) != z) {
            updateCurrentConnectionType(true != z ? 6 : 0);
            notifyObserversOfConnectionSubtypeChange(!z ? 1 : 0);
        }
    }

    public static NetworkChangeNotifierAutoDetect getAutoDetectorForTest() {
        return getInstance().mAutoDetector;
    }

    public static NetworkChangeNotifier getInstance() {
        return sInstance;
    }

    public static NetworkChangeNotifier init() {
        if (sInstance == null) {
            sInstance = new NetworkChangeNotifier();
        }
        return sInstance;
    }

    public static boolean isInitialized() {
        return sInstance != null;
    }

    public static boolean isOnline() {
        return getInstance().getCurrentConnectionType() != 6;
    }

    public static void registerToReceiveNotificationsAlways() {
        getInstance().setAutoDetectConnectivityStateInternal(true, new RegistrationPolicyAlwaysRegister());
    }

    public static void removeConnectionTypeObserver(ConnectionTypeObserver connectionTypeObserver) {
        getInstance().removeConnectionTypeObserverInternal(connectionTypeObserver);
    }

    private void removeConnectionTypeObserverInternal(ConnectionTypeObserver connectionTypeObserver) {
        this.mConnectionTypeObservers.c(connectionTypeObserver);
    }

    public static void resetInstanceForTests(NetworkChangeNotifier networkChangeNotifier) {
        sInstance = networkChangeNotifier;
    }

    public static void setAutoDetectConnectivityState(NetworkChangeNotifierAutoDetect.RegistrationPolicy registrationPolicy) {
        getInstance().setAutoDetectConnectivityStateInternal(true, registrationPolicy);
    }

    private void setAutoDetectConnectivityStateInternal(boolean z, NetworkChangeNotifierAutoDetect.RegistrationPolicy registrationPolicy) {
        if (z) {
            if (this.mAutoDetector == null) {
                NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = new NetworkChangeNotifierAutoDetect(new baew(this), registrationPolicy);
                this.mAutoDetector = networkChangeNotifierAutoDetect;
                NetworkChangeNotifierAutoDetect.NetworkState currentNetworkState = networkChangeNotifierAutoDetect.getCurrentNetworkState();
                updateCurrentConnectionType(currentNetworkState.getConnectionType());
                notifyObserversOfConnectionSubtypeChange(currentNetworkState.getConnectionSubtype());
                return;
            }
            return;
        }
        destroyAutoDetector();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCurrentConnectionType(int i) {
        this.mCurrentConnectionType = i;
        notifyObserversOfConnectionTypeChange(i);
    }

    public void addNativeObserver(long j) {
        this.mNativeChangeNotifiers.add(Long.valueOf(j));
    }

    public int getCurrentConnectionSubtype() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        if (networkChangeNotifierAutoDetect == null) {
            return 0;
        }
        return networkChangeNotifierAutoDetect.getCurrentNetworkState().getConnectionSubtype();
    }

    public int getCurrentConnectionType() {
        return this.mCurrentConnectionType;
    }

    public long getCurrentDefaultNetId() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        if (networkChangeNotifierAutoDetect == null) {
            return -1L;
        }
        return networkChangeNotifierAutoDetect.getDefaultNetId();
    }

    public long[] getCurrentNetworksAndTypes() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        return networkChangeNotifierAutoDetect == null ? new long[0] : networkChangeNotifierAutoDetect.getNetworksAndTypes();
    }

    public void notifyObserversOfConnectionSubtypeChange(int i) {
        ArrayList arrayList = this.mNativeChangeNotifiers;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            N.Mt26m31j(((Long) arrayList.get(i2)).longValue(), this, i);
        }
    }

    public void notifyObserversOfConnectionTypeChange(int i) {
        notifyObserversOfConnectionTypeChange(i, getCurrentDefaultNetId());
    }

    public void notifyObserversOfNetworkConnect(long j, int i) {
        ArrayList arrayList = this.mNativeChangeNotifiers;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            N.MBT1i5cd(((Long) arrayList.get(i2)).longValue(), this, j, i);
        }
    }

    public void notifyObserversOfNetworkDisconnect(long j) {
        ArrayList arrayList = this.mNativeChangeNotifiers;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            N.MDpuHJTB(((Long) arrayList.get(i)).longValue(), this, j);
        }
    }

    public void notifyObserversOfNetworkSoonToDisconnect(long j) {
        ArrayList arrayList = this.mNativeChangeNotifiers;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            N.MiJIMrTb(((Long) arrayList.get(i)).longValue(), this, j);
        }
    }

    public void notifyObserversToPurgeActiveNetworkList(long[] jArr) {
        ArrayList arrayList = this.mNativeChangeNotifiers;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            N.MpF$179U(((Long) arrayList.get(i)).longValue(), this, jArr);
        }
    }

    public boolean registerNetworkCallbackFailed() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        if (networkChangeNotifierAutoDetect == null) {
            return false;
        }
        return networkChangeNotifierAutoDetect.registerNetworkCallbackFailed();
    }

    public void removeNativeObserver(long j) {
        this.mNativeChangeNotifiers.remove(Long.valueOf(j));
    }

    private void notifyObserversOfConnectionTypeChange(int i, long j) {
        ArrayList arrayList = this.mNativeChangeNotifiers;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            N.MbPIImnU(((Long) arrayList.get(i2)).longValue(), this, i, j);
        }
        Iterator it = this.mConnectionTypeObservers.iterator();
        while (it.hasNext()) {
            ((ConnectionTypeObserver) it.next()).onConnectionTypeChanged(i);
        }
    }

    public static void setAutoDetectConnectivityState(boolean z) {
        getInstance().setAutoDetectConnectivityStateInternal(z, new RegistrationPolicyApplicationStatus());
    }
}
