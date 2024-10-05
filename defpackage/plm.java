package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class plm implements psx {
    public final pll b;
    public poe c;
    public psx d;
    public boolean f;
    public final ptl a = new ptl();
    public boolean e = true;

    public plm(pll pllVar) {
        this.b = pllVar;
    }

    public final void a() {
        this.f = false;
        this.a.c();
    }

    @Override // defpackage.psx
    public final long f() {
        if (this.e) {
            return this.a.f();
        }
        psx psxVar = this.d;
        pse.c(psxVar);
        return psxVar.f();
    }

    @Override // defpackage.psx
    public final pnu h() {
        psx psxVar = this.d;
        return psxVar != null ? psxVar.h() : this.a.a;
    }

    @Override // defpackage.psx
    public final void q(pnu pnuVar) {
        psx psxVar = this.d;
        if (psxVar != null) {
            psxVar.q(pnuVar);
            pnuVar = this.d.h();
        }
        this.a.q(pnuVar);
    }
}
