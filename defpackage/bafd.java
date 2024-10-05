package defpackage;

import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bafd implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ bafg b;

    public bafd(bafg bafgVar, long j) {
        this.b = bafgVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NetworkChangeNotifierAutoDetect.Observer observer;
        observer = this.b.b.mObserver;
        observer.onNetworkSoonToDisconnect(this.a);
    }
}
