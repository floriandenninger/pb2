package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yru extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ yrv a;

    public yru(yrv yrvVar) {
        this.a = yrvVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        yrv yrvVar = this.a;
        yrvVar.a.e(networkCapabilities);
        ((yrn) yrvVar.b.get()).b(yrvVar.o(), yrvVar.p(), yrvVar.q(), yrvVar.i(), yrvVar.a());
    }
}
