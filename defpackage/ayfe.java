package defpackage;

import java.net.InetSocketAddress;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayfe extends aybw {
    public final CronetEngine a;
    public final aylb b;
    public ayoi c;
    public int d;

    private ayfe(String str, int i, CronetEngine cronetEngine) {
        this.c = ayoj.a;
        this.d = 4194304;
        this.b = new aylb(InetSocketAddress.createUnresolved(str, i), ayiu.c(str, i), new ayer(this));
        this.a = cronetEngine;
    }

    public static ayfe a(String str, int i, CronetEngine cronetEngine) {
        cronetEngine.getClass();
        return new ayfe(str, i, cronetEngine);
    }

    @Override // defpackage.aybw
    public final aybv c() {
        return this.b.c();
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("delegate", this.b);
        return Y.toString();
    }

    protected ayfe() {
    }
}
