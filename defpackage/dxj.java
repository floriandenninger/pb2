package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dxj {
    final dyu a;
    final dxk b;
    public final dxk c;
    final amsj d;

    public dxj() {
        dyu dyuVar = new dyu();
        this.a = dyuVar;
        dxk dxkVar = new dxk(null, dyuVar);
        this.c = dxkVar;
        this.b = dxkVar.a();
        amsj amsjVar = new amsj((short[]) null);
        this.d = amsjVar;
        dxkVar.g("require", new dxv(amsjVar, null, null));
        amsjVar.s("internal.platform", gip.b);
        dxkVar.g("runtime.counter", new dyg(Double.valueOf(0.0d)));
    }

    public final dxk a() {
        return this.b.a();
    }

    public final dyn b(dxk dxkVar, rll... rllVarArr) {
        dyn dynVar = dyn.f;
        for (rll rllVar : rllVarArr) {
            dynVar = esv.s(rllVar);
            esv.H(this.c);
            if ((dynVar instanceof dyo) || (dynVar instanceof dym)) {
                dynVar = this.a.a(dxkVar, dynVar);
            }
        }
        return dynVar;
    }

    public final void c(String str, Callable callable) {
        this.d.s(str, callable);
    }
}
