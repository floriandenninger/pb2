package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class him implements awh {
    public boolean a;
    private pnu b;
    private final hir c;
    private boolean d;

    public him(hir hirVar) {
        this.c = hirVar;
    }

    @Override // defpackage.awh
    public final int a(pms pmsVar) {
        if ("audio/raw".equals(pmsVar.n) && pts.U(pmsVar.C)) {
            return pmsVar.C == 2 ? 2 : 1;
        }
        return 0;
    }

    @Override // defpackage.awh
    public final long b(boolean z) {
        return 0L;
    }

    @Override // defpackage.awh
    public final pnu c() {
        return this.b;
    }

    @Override // defpackage.awh
    public final void d() {
    }

    @Override // defpackage.awh
    public final void e() {
        this.c.n();
    }

    @Override // defpackage.awh
    public final void f() {
    }

    @Override // defpackage.awh
    public final void g() {
    }

    @Override // defpackage.awh
    public final void h() {
    }

    @Override // defpackage.awh
    public final void i() {
        this.c.p();
        this.d = true;
    }

    @Override // defpackage.awh
    public final void j() {
        this.d = false;
    }

    @Override // defpackage.awh
    public final void k(asd asdVar) {
    }

    @Override // defpackage.awh
    public final void l(int i) {
    }

    @Override // defpackage.awh
    public final void m(ase aseVar) {
    }

    @Override // defpackage.awh
    public final void n(awe aweVar) {
    }

    @Override // defpackage.awh
    public final void o(pnu pnuVar) {
        this.b = pnuVar;
    }

    @Override // defpackage.awh
    public final void p(boolean z) {
    }

    @Override // defpackage.awh
    public final void q(float f) {
    }

    @Override // defpackage.awh
    public final boolean r(ByteBuffer byteBuffer, long j, int i) {
        this.c.q(byteBuffer, this.a);
        return !byteBuffer.hasRemaining();
    }

    @Override // defpackage.awh
    public final boolean s() {
        return false;
    }

    @Override // defpackage.awh
    public final boolean t() {
        return this.d && this.c.h();
    }

    @Override // defpackage.awh
    public final boolean u(pms pmsVar) {
        return a(pmsVar) != 0;
    }

    @Override // defpackage.awh
    public final void v(pms pmsVar, int[] iArr) {
        hir hirVar = this.c;
        hirVar.g = pmsVar.A;
        hirVar.o();
        if (pmsVar.B == hirVar.h) {
            hirVar.j = null;
            return;
        }
        try {
            hirVar.j = new axe();
            axe axeVar = hirVar.j;
            axeVar.b = hirVar.h;
            axeVar.a(new avp(pmsVar.B, hirVar.g, pmsVar.C));
            hirVar.j.c();
        } catch (avq unused) {
            hirVar.j = null;
        }
    }
}
