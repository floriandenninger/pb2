package defpackage;

import java.net.NetworkInterface;
import java.util.Enumeration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ysu {
    public final NetworkInterface a;

    public ysu(NetworkInterface networkInterface) {
        this.a = networkInterface;
    }

    public final String a() {
        return this.a.getDisplayName();
    }

    public final String b() {
        return this.a.getName();
    }

    public final Enumeration c() {
        return this.a.getInetAddresses();
    }

    public final boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
