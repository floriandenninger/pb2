package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ean extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ eao a;

    public ean(eao eaoVar) {
        this.a = eaoVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (eao.class) {
            this.a.a = networkCapabilities;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (eao.class) {
            this.a.a = null;
        }
    }
}
