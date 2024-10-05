package defpackage;

import java.net.MulticastSocket;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acyo implements Runnable {
    final /* synthetic */ MulticastSocket a;
    final /* synthetic */ acys b;

    public acyo(acys acysVar, MulticastSocket multicastSocket) {
        this.b = acysVar;
        this.a = multicastSocket;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.e(this.a);
    }
}
