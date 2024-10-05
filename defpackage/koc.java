package defpackage;

import com.google.android.apps.youtube.app.player.autonav.AutonavToggleController;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class koc implements kig {
    public final kdh a;
    public final AutonavToggleController b;
    public koa c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    private final adlt j;
    private final boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;

    public koc(adlt adltVar, kdh kdhVar, AutonavToggleController autonavToggleController, aadw aadwVar) {
        this.j = adltVar;
        this.a = kdhVar;
        this.b = autonavToggleController;
        asvu asvuVar = aadwVar.b().e;
        this.k = (asvuVar == null ? asvu.a : asvuVar).bC;
    }

    public static void b(fya fyaVar, int i) {
        if (fyaVar == null) {
            return;
        }
        fyaVar.m(i);
    }

    public static void d(yzr yzrVar, int i) {
        yzrVar.d = i;
    }

    private final void e() {
        this.c.f.a(this.l, false);
        this.c.b.b(false);
        this.c.e.b(false);
        this.c.a.b(false);
        this.c.d.b(false);
        this.c.g.b(false);
        this.a.l(false, false);
        this.b.l(false, false);
    }

    private final void f() {
        if (this.r) {
            if (this.n) {
                this.n = false;
            }
        } else if (!this.s && !this.t && !this.u) {
            boolean z = this.e && this.p && !this.q && this.n;
            this.a.l(z, false);
            this.b.l((!this.f || this.q || u()) ? false : true, false);
            this.c.b.a(this.p && !this.q && (!z || this.d), false);
            boolean z2 = !z;
            this.c.e.a(z2, false);
            this.c.c.a(z2, false);
            this.c.a.a((this.l || z || this.n) ? false : true, false);
            this.c.f.a(!this.q && this.m, false);
            this.c.g.a(this.h, false);
            this.c.d.a((this.q || !this.m || this.n || !this.p || u() || !this.g || z) ? false : true, false);
            return;
        }
        t();
        this.c.e.b(false);
        this.c.f.b(false);
        this.c.g.b(false);
        this.c.d.b(false);
        this.c.a.b(false);
        this.c.b.b(false);
        this.a.l(false, false);
        this.b.l(false, false);
    }

    private final void t() {
        x(this.c.d);
        x(this.c.a);
        x(this.c.f);
        x(this.c.e);
        x(this.c.b);
    }

    private final boolean u() {
        return this.j.f() == 0 || this.j.f() == 1;
    }

    private static final void v(fya fyaVar) {
        if (fyaVar.o()) {
            fyaVar.l(false, true);
        }
    }

    private static final void w(fya fyaVar) {
        if (fyaVar.o()) {
            fyaVar.l(false, false);
            fyaVar.l(true, true);
        }
    }

    private static final void x(yzr yzrVar) {
        if (yzrVar.f()) {
            yzrVar.b.animate().cancel();
        }
    }

    private static final void y(yzr yzrVar) {
        if (yzrVar.f()) {
            yzrVar.a(false, true);
        }
    }

    private static final void z(yzr yzrVar) {
        if (yzrVar.f()) {
            yzrVar.a(false, false);
            yzrVar.a(true, true);
        }
    }

    public final void a() {
        if (this.c == null) {
            return;
        }
        if (this.o) {
            f();
        } else {
            e();
        }
    }

    @Override // defpackage.kig
    public final void i(ControlsOverlayStyle controlsOverlayStyle) {
        this.q = ControlsOverlayStyle.a(controlsOverlayStyle);
        a();
    }

    @Override // defpackage.kig
    public final void m(fhg fhgVar) {
        this.p = fhgVar.b();
        a();
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nA(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nB(zcp zcpVar) {
    }

    @Override // defpackage.kig
    public final void nC(boolean z) {
        if (this.s != z) {
            this.s = z;
            a();
        }
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nD(boolean z) {
    }

    @Override // defpackage.kig
    public final void nF(ControlsState controlsState) {
        if (this.l == controlsState.i() && this.m == controlsState.j()) {
            if (this.n == (controlsState.a == ahvo.ENDED)) {
                return;
            }
        }
        this.l = controlsState.i();
        this.m = controlsState.j();
        this.n = controlsState.a == ahvo.ENDED;
        a();
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nX(boolean z) {
    }

    @Override // defpackage.kig
    public final void nY(boolean z) {
        if (!this.k || this.u == z) {
            return;
        }
        this.u = z;
        a();
    }

    @Override // defpackage.kig
    public final void nz(boolean z) {
        if (z) {
            y(this.c.a);
            y(this.c.f);
            y(this.c.e);
            y(this.c.b);
            y(this.c.d);
            y(this.c.g);
            v(this.a);
            v(this.b);
            return;
        }
        t();
        this.o = false;
        e();
    }

    @Override // defpackage.kig
    public final void p(boolean z) {
        if (this.t == z) {
            return;
        }
        this.t = z;
        a();
    }

    @Override // defpackage.kig
    public final /* synthetic */ void q(boolean z) {
    }

    @Override // defpackage.kig
    public final void r(boolean z) {
        if (this.r != z) {
            this.r = z;
            a();
        }
    }

    @Override // defpackage.kig
    public final void s(boolean z) {
        this.o = true;
        f();
        if (z) {
            z(this.c.a);
            z(this.c.f);
            z(this.c.e);
            z(this.c.d);
            z(this.c.b);
            z(this.c.g);
            w(this.a);
            w(this.b);
        }
    }
}
