package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kly implements ahxe, kig, ahfc {
    public static final klw a;
    public final azrs b = azrh.e().aT();
    public final azrh c = azrh.e();
    public ahvc d;
    public ahxd e;
    private final boolean f;

    static {
        kma kmaVar = new kma();
        kmaVar.e(false);
        kmaVar.h(false);
        kmaVar.n(ahvo.NEW);
        kmaVar.f(false);
        kmaVar.b(false);
        kmaVar.c(false);
        kmaVar.l(false);
        kmaVar.j(false);
        kmaVar.i(false);
        kmaVar.m(ControlsOverlayStyle.a);
        kmaVar.g(false);
        kmaVar.k(false);
        kmaVar.d(false);
        a = klw.a(kmaVar.a(), false);
    }

    public kly(ahfd ahfdVar, aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        this.f = (asvuVar == null ? asvu.a : asvuVar).bC;
        ahfdVar.c(new zfi() { // from class: klv
            @Override // defpackage.zfi
            public final void a(Object obj) {
                kly klyVar = kly.this;
                klyVar.t(((Boolean) obj).booleanValue());
                klyVar.b.ad(kly.a, knl.a).B().ax(new acuk(klyVar.c, 1));
            }
        });
        ahfdVar.d(this);
    }

    private final void e(klz klzVar, Object obj, boolean z) {
        this.b.c(new klx(new klt(klzVar, obj), z));
    }

    @Override // defpackage.ahxe
    public final void b(boolean z) {
        d(klu.h, Boolean.valueOf(z));
    }

    public final void d(klz klzVar, Object obj) {
        e(klzVar, obj, false);
    }

    @Override // defpackage.kig
    public final void i(ControlsOverlayStyle controlsOverlayStyle) {
        d(klu.e, controlsOverlayStyle);
    }

    @Override // defpackage.kig
    public final void m(fhg fhgVar) {
        d(klu.k, Boolean.valueOf(fhgVar.b()));
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nA(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nB(zcp zcpVar) {
    }

    @Override // defpackage.kig
    public final void nC(boolean z) {
        d(klu.l, Boolean.valueOf(z));
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nD(boolean z) {
    }

    @Override // defpackage.kig
    public final void nF(ControlsState controlsState) {
        d(klu.f, controlsState.a);
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nX(boolean z) {
    }

    @Override // defpackage.kig
    public final void nY(boolean z) {
        if (this.f) {
            d(klu.b, Boolean.valueOf(z));
        }
    }

    @Override // defpackage.ahxe
    public final void ne(boolean z) {
        d(klu.g, Boolean.valueOf(z));
    }

    @Override // defpackage.kig
    public final void nz(boolean z) {
        e(klu.j, false, z);
    }

    @Override // defpackage.kig
    public final void p(boolean z) {
        d(klu.a, Boolean.valueOf(z));
    }

    @Override // defpackage.ahxe
    public final void pu(ahxd ahxdVar) {
        this.e = ahxdVar;
    }

    @Override // defpackage.kig
    public final void q(boolean z) {
        d(klu.c, Boolean.valueOf(z));
    }

    @Override // defpackage.kig
    public final void r(boolean z) {
        d(klu.d, Boolean.valueOf(z));
    }

    @Override // defpackage.kig
    public final void s(boolean z) {
        e(klu.j, true, z);
    }

    @Override // defpackage.ahfc
    public final void t(boolean z) {
        d(klu.i, Boolean.valueOf(z));
    }
}
