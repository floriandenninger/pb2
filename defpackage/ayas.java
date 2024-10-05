package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayas {
    public String a;
    public String b;
    private SocketAddress c;
    private InetSocketAddress d;

    public final ayat a() {
        return new ayat(this.c, this.d, this.a, this.b);
    }

    public final void b(SocketAddress socketAddress) {
        socketAddress.getClass();
        this.c = socketAddress;
    }

    public final void c(InetSocketAddress inetSocketAddress) {
        inetSocketAddress.getClass();
        this.d = inetSocketAddress;
    }
}
