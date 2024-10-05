package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayat extends aycw {
    private static final long serialVersionUID = 0;
    public final InetSocketAddress a;
    private final SocketAddress b;
    private final String c;
    private final String d;

    public ayat(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        socketAddress.getClass();
        inetSocketAddress.getClass();
        amkq.Q(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        this.b = socketAddress;
        this.a = inetSocketAddress;
        this.c = str;
        this.d = str2;
    }

    public static ayas a() {
        return new ayas();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ayat)) {
            return false;
        }
        ayat ayatVar = (ayat) obj;
        return amkq.b(this.b, ayatVar.b) && amkq.b(this.a, ayatVar.a) && amkq.b(this.c, ayatVar.c) && amkq.b(this.d, ayatVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d});
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("proxyAddr", this.b);
        Y.b("targetAddr", this.a);
        Y.b(wcy.USERNAME, this.c);
        Y.g("hasPassword", this.d != null);
        return Y.toString();
    }
}
