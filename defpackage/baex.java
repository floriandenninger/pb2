package defpackage;

import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baex implements Runnable {
    final /* synthetic */ NetworkChangeNotifierAutoDetect a;

    public baex(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.a = networkChangeNotifierAutoDetect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        z = this.a.mIgnoreNextBroadcast;
        if (z) {
            this.a.mIgnoreNextBroadcast = false;
        } else {
            this.a.connectionTypeChanged();
        }
    }
}
