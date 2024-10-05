package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rxg extends rwy implements rxd {
    private float a;

    @Override // defpackage.rxd
    public final rxf a() {
        if (f() == null) {
            return null;
        }
        return new rxf(f(), n(), this.a);
    }

    @Override // defpackage.rxd
    public final void b(rxf rxfVar) {
        if (rxfVar == null) {
            return;
        }
        this.a = rxfVar.c;
        p(rxfVar.a);
        o(rxfVar.b);
    }

    @Override // defpackage.rxd
    public final void c(float f) {
        this.a = f;
    }

    @Override // defpackage.rxd
    public final void d() {
    }
}
