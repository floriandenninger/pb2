package defpackage;

import java.net.SocketAddress;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayjk {
    public List a;
    public int b;
    public int c;

    public ayjk(List list) {
        this.a = list;
    }

    public final SocketAddress a() {
        return (SocketAddress) ((ayan) this.a.get(this.b)).b.get(this.c);
    }

    public final void b() {
        this.b = 0;
        this.c = 0;
    }
}
