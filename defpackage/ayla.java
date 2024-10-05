package defpackage;

import java.net.SocketAddress;
import java.net.URI;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayla extends aycl {
    final SocketAddress a;
    final String b;

    public ayla(SocketAddress socketAddress, String str) {
        this.a = socketAddress;
        this.b = str;
    }

    @Override // defpackage.aycl
    public final aycq a(URI uri, aycj aycjVar) {
        return new aykz(this);
    }

    @Override // defpackage.aycl
    public final String b() {
        return "directaddress";
    }
}
