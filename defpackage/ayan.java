package defpackage;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayan {
    public static final axzi a = axzi.a("io.grpc.EquivalentAddressGroup.authorityOverride");
    public final List b;
    public final axzj c;
    private final int d;

    public ayan(SocketAddress socketAddress) {
        axzj axzjVar = axzj.a;
        List singletonList = Collections.singletonList(socketAddress);
        amkq.F(!singletonList.isEmpty(), "addrs is empty");
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(singletonList));
        this.b = unmodifiableList;
        axzjVar.getClass();
        this.c = axzjVar;
        this.d = unmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ayan)) {
            return false;
        }
        ayan ayanVar = (ayan) obj;
        if (this.b.size() != ayanVar.b.size()) {
            return false;
        }
        for (int i = 0; i < this.b.size(); i++) {
            if (!((SocketAddress) this.b.get(i)).equals(ayanVar.b.get(i))) {
                return false;
            }
        }
        return this.c.equals(ayanVar.c);
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 3 + String.valueOf(valueOf2).length());
        sb.append("[");
        sb.append(valueOf);
        sb.append("/");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
