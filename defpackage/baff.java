package defpackage;

import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class baff implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ bafg b;

    public baff(bafg bafgVar, int i) {
        this.b = bafgVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NetworkChangeNotifierAutoDetect.Observer observer;
        observer = this.b.b.mObserver;
        observer.onConnectionTypeChanged(this.a);
    }
}
