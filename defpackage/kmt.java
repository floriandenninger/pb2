package defpackage;

import android.widget.ImageView;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kmt extends kic implements kig {
    public final axpg b;
    public final axpg c;
    public final axpg d;
    public final String e;
    public final String f;
    public ahvb g;
    public boolean i;
    public boolean j;
    public ayqx k;
    public final yzr l;
    private final boolean m;
    private final ahvu n;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    public ControlsState h = ControlsState.b();
    private ControlsOverlayStyle o = ControlsOverlayStyle.a;

    public kmt(ImageView imageView, aadw aadwVar, axpg axpgVar, axpg axpgVar2, axpg axpgVar3, axpg axpgVar4) {
        this.l = new yzr(imageView, imageView.getResources().getInteger(R.integer.fade_duration_fast), 4);
        this.b = axpgVar2;
        this.c = axpgVar4;
        this.d = axpgVar3;
        this.e = imageView.getResources().getString(R.string.single_loop_edu_snackbar_text);
        this.f = imageView.getResources().getString(R.string.single_loop_edu_snackbar_button_text).toUpperCase(imageView.getResources().getConfiguration().locale);
        asvu asvuVar = aadwVar.b().e;
        this.m = (asvuVar == null ? asvu.a : asvuVar).bC;
        imageView.setOnClickListener(new kmr(this, 0));
        this.n = new ahvu(imageView, imageView.getContext(), true);
        asvu asvuVar2 = aadwVar.b().e;
        if ((asvuVar2 == null ? asvu.a : asvuVar2).bc) {
            this.k = ((axzg) axpgVar.get()).a.a.Y(axzd.l).B().ax(new ayrs() { // from class: kms
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    kmt.this.j = ((Boolean) obj).booleanValue();
                }
            });
        }
    }

    @Override // defpackage.kic
    protected final void a(boolean z) {
        this.l.b(z);
    }

    @Override // defpackage.kig
    public final void i(ControlsOverlayStyle controlsOverlayStyle) {
        this.o = controlsOverlayStyle;
        u();
    }

    @Override // defpackage.kig
    public final /* synthetic */ void m(fhg fhgVar) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nA(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nB(zcp zcpVar) {
    }

    @Override // defpackage.kig
    public final void nC(boolean z) {
        this.s = z;
        v(false);
    }

    @Override // defpackage.kig
    public final void nD(boolean z) {
        this.p = z;
        u();
    }

    @Override // defpackage.kig
    public final void nF(ControlsState controlsState) {
        this.h = controlsState;
        this.n.a(controlsState);
        u();
    }

    @Override // defpackage.kig
    public final void nX(boolean z) {
        this.q = z;
        u();
    }

    @Override // defpackage.kig
    public final void nY(boolean z) {
        if (!this.m || this.t == z) {
            return;
        }
        this.t = z;
        v(true);
    }

    @Override // defpackage.kig
    public final void nz(boolean z) {
        b(z);
    }

    @Override // defpackage.kig
    public final void p(boolean z) {
        this.u = z;
        v(false);
    }

    @Override // defpackage.kig
    public final /* synthetic */ void q(boolean z) {
    }

    @Override // defpackage.kig
    public final void r(boolean z) {
        this.r = z;
        v(false);
    }

    @Override // defpackage.kig
    public final void s(boolean z) {
        f(z);
    }

    @Override // defpackage.kic
    protected final void t(boolean z) {
        this.l.c(z);
    }

    @Override // defpackage.kic
    protected final boolean w(boolean z) {
        if (this.r || this.s || this.t || this.u) {
            return false;
        }
        if (!z) {
            if (this.i && this.h.b) {
                return !this.p || this.q;
            }
            return false;
        }
        if ((this.h.k() || (this.i && this.h.b)) && this.o.t) {
            return !this.p || this.q;
        }
        return false;
    }
}
