package defpackage;

import android.net.Network;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bafe implements Runnable {
    final /* synthetic */ Network a;
    final /* synthetic */ bafg b;

    public bafe(bafg bafgVar, Network network) {
        this.b = bafgVar;
        this.a = network;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NetworkChangeNotifierAutoDetect.Observer observer;
        observer = this.b.b.mObserver;
        observer.onNetworkDisconnect(NetworkChangeNotifierAutoDetect.networkToNetId(this.a));
    }
}
