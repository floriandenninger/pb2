package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kpt extends fmv implements kig, aida {
    public final fna h;
    public final boolean i;
    public boolean j;
    public fhg k;
    private final ahtp l;
    private final aicz m;
    private final fng n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;

    public kpt(Context context, ahtp ahtpVar, aicz aiczVar, aadw aadwVar, knm knmVar, fna fnaVar, fmy fmyVar, ahub ahubVar, fng fngVar, int i) {
        super(context, fnaVar, fngVar);
        this.h = fnaVar;
        this.n = fngVar;
        this.l = ahtpVar;
        this.m = aiczVar;
        asvu asvuVar = aadwVar.b().e;
        this.i = (asvuVar == null ? asvu.a : asvuVar).aF;
        fnaVar.kR(ahtpVar);
        fnaVar.kR(ahubVar);
        fnaVar.w(i);
        fnaVar.v(fmyVar);
        aiczVar.c.a(this);
        knmVar.d.y().X(new ayrs() { // from class: kps
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                kpt kptVar = kpt.this;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (kptVar.j == booleanValue) {
                    return;
                }
                kptVar.j = booleanValue;
                kptVar.f();
            }
        });
    }

    private final void u(boolean z) {
        f();
        if (this.q) {
            if (z && !this.o && w()) {
                k(true);
            } else if (this.p || !w()) {
                b(false);
            } else {
                k(false);
            }
            if (!this.w || this.x) {
                return;
            }
            this.n.a(false);
            return;
        }
        if (this.u) {
            k(false);
            return;
        }
        if (!z || this.o) {
            if (!this.o || !this.t) {
                b(false);
                return;
            } else {
                k(false);
                return;
            }
        }
        b(true);
    }

    private final void v() {
        boolean z = true;
        if (!this.k.b() && !this.v) {
            z = false;
        }
        if (this.f == z) {
            return;
        }
        this.f = z;
        super.nR();
        super.t(false);
    }

    private final boolean w() {
        return !this.m.c.d() && (!this.r || this.s);
    }

    @Override // defpackage.aida
    public final void d(int i, int i2, int i3) {
        if (i != i2) {
            u(false);
        }
    }

    public final void f() {
        if (this.q) {
            nQ(1);
        } else if (this.j) {
            nQ(3);
        } else {
            nQ(0);
        }
    }

    @Override // defpackage.fmv, defpackage.fmf
    public final void i(ControlsOverlayStyle controlsOverlayStyle) {
        super.i(controlsOverlayStyle);
        if (this.o == controlsOverlayStyle.v) {
            if (this.p == (controlsOverlayStyle == ControlsOverlayStyle.j)) {
                return;
            }
        }
        this.o = controlsOverlayStyle.v;
        this.p = controlsOverlayStyle == ControlsOverlayStyle.j;
        u(false);
    }

    @Override // defpackage.fmf
    public final void j(long j, long j2, long j3, long j4) {
        super.j(j, j2, j3, j4);
        ahtp ahtpVar = this.l;
        if (ahtpVar.h) {
            return;
        }
        ahtpVar.j(j, 1);
    }

    @Override // defpackage.kig
    public final void m(fhg fhgVar) {
        this.k = fhgVar;
        v();
    }

    @Override // defpackage.kig
    public final void nA(boolean z) {
        if (z) {
            nP(0.5f);
        } else {
            nP(1.0f);
        }
    }

    @Override // defpackage.kig
    public final void nB(zcp zcpVar) {
        boolean z = this.v;
        boolean z2 = zcpVar instanceof zcs;
        this.v = z2;
        if (z == z2) {
            return;
        }
        v();
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nC(boolean z) {
    }

    @Override // defpackage.kig
    public final void nD(boolean z) {
        if (this.r == z) {
            return;
        }
        this.r = z;
        u(false);
    }

    @Override // defpackage.kig
    public final void nF(ControlsState controlsState) {
        if (this.t == controlsState.j()) {
            return;
        }
        this.t = controlsState.j();
        u(false);
    }

    @Override // defpackage.aida
    public final void nW(float f, boolean z) {
        nP(1.0f - aii.d(f));
    }

    @Override // defpackage.kig
    public final void nX(boolean z) {
        if (this.s == z) {
            return;
        }
        this.s = z;
        u(false);
    }

    @Override // defpackage.kig
    public final void nY(boolean z) {
        if (this.u == z) {
            return;
        }
        this.u = z;
        u(false);
    }

    @Override // defpackage.kig
    public final void nz(boolean z) {
        if (this.q) {
            this.q = false;
            u(z);
        }
    }

    @Override // defpackage.kig
    public final void p(boolean z) {
        if (this.w == z) {
            return;
        }
        this.w = z;
        u(false);
    }

    @Override // defpackage.kig
    public final /* synthetic */ void q(boolean z) {
    }

    @Override // defpackage.kig
    public final void r(boolean z) {
        if (this.x == z) {
            return;
        }
        this.x = z;
        if (this.w && z) {
            this.n.f(false);
        }
        ((kpy) this.n).h.c(Boolean.valueOf(z));
    }

    @Override // defpackage.kig
    public final void s(boolean z) {
        if (this.q) {
            return;
        }
        this.q = true;
        u(z);
    }
}
