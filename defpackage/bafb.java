package defpackage;

import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bafb implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ int b;
    final /* synthetic */ boolean c;
    final /* synthetic */ bafg d;

    public bafb(bafg bafgVar, long j, int i, boolean z) {
        this.d = bafgVar;
        this.a = j;
        this.b = i;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NetworkChangeNotifierAutoDetect.Observer observer;
        NetworkChangeNotifierAutoDetect.Observer observer2;
        NetworkChangeNotifierAutoDetect.Observer observer3;
        observer = this.d.b.mObserver;
        observer.onNetworkConnect(this.a, this.b);
        if (this.c) {
            observer2 = this.d.b.mObserver;
            observer2.onConnectionTypeChanged(this.b);
            observer3 = this.d.b.mObserver;
            observer3.purgeActiveNetworkList(new long[]{this.a});
        }
    }
}
