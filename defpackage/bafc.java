package defpackage;

import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bafc implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ int b;
    final /* synthetic */ bafg c;

    public bafc(bafg bafgVar, long j, int i) {
        this.c = bafgVar;
        this.a = j;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NetworkChangeNotifierAutoDetect.Observer observer;
        observer = this.c.b.mObserver;
        observer.onNetworkConnect(this.a, this.b);
    }
}
