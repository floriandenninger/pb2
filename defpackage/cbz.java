package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cbz extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ cca a;

    public cbz(cca ccaVar) {
        this.a = ccaVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        ajbh X = ajbh.X();
        int i = cca.g;
        String.format("Network capabilities changed: %s", networkCapabilities);
        X.T(new Throwable[0]);
        cca ccaVar = this.a;
        ccaVar.g(ccaVar.b());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        ajbh X = ajbh.X();
        int i = cca.g;
        X.T(new Throwable[0]);
        cca ccaVar = this.a;
        ccaVar.g(ccaVar.b());
    }
}
