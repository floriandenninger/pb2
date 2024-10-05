package com.google.android.apps.youtube.app.common.ui.pip;

import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.util.Rational;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.pip.DefaultPipController;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import defpackage.aaea;
import defpackage.adlm;
import defpackage.adlr;
import defpackage.adlt;
import defpackage.afsi;
import defpackage.ahew;
import defpackage.aij;
import defpackage.ainy;
import defpackage.aiva;
import defpackage.aivb;
import defpackage.aixh;
import defpackage.amkq;
import defpackage.anaf;
import defpackage.anhy;
import defpackage.aok;
import defpackage.ayqw;
import defpackage.azrw;
import defpackage.ci;
import defpackage.ept;
import defpackage.evr;
import defpackage.fav;
import defpackage.fgq;
import defpackage.fhg;
import defpackage.gkh;
import defpackage.gku;
import defpackage.gkx;
import defpackage.gky;
import defpackage.gla;
import defpackage.gle;
import defpackage.ynm;
import defpackage.zfi;
import j$.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DefaultPipController implements gky {
    public static final Rational a = new Rational(16, 9);
    private final azrw A;
    private final azrw B;
    private final aaea C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    public final ci b;
    public final azrw c;
    public final azrw d;
    public final azrw e;
    public final azrw f;
    public final azrw g;
    public final azrw h;
    public final azrw i;
    public final azrw j;
    public aiva m;
    public View n;
    public adlr o;
    public View.OnLayoutChangeListener p;
    public boolean q;
    public boolean r;
    public PlayerResponseModel s;
    public boolean t;
    public boolean u;
    public boolean w;
    public boolean x;
    public gkh z;
    public final ayqw k = new ayqw();
    public fhg v = fhg.NONE;
    public Rational y = a;
    public final boolean l = aij.f();

    public DefaultPipController(ci ciVar, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, aaea aaeaVar) {
        this.b = ciVar;
        this.A = azrwVar;
        this.B = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
        this.e = azrwVar5;
        this.f = azrwVar6;
        this.g = azrwVar7;
        this.h = azrwVar8;
        this.i = azrwVar9;
        this.j = azrwVar10;
        this.C = aaeaVar;
    }

    private final void n(aixh aixhVar) {
        if (gle.d(aixhVar)) {
            if (aixhVar != null && gle.c(aixhVar.c())) {
                return;
            }
            if (aixhVar != null && gle.d(aixhVar) && gle.a(aixhVar.c())) {
                return;
            }
            ((gla) this.c.get()).a(aixhVar, ((ainy) this.e.get()).p(), ((ainy) this.e.get()).g());
        }
    }

    @Override // defpackage.gky
    public final anhy g(View view, fhg fhgVar) {
        boolean z = false;
        if (view == null || !this.q) {
            return anaf.O(false);
        }
        adlm g = ((adlt) this.h.get()).g();
        if (g == null || g.a() != 1) {
            aixh n = ((ainy) this.e.get()).n();
            gle gleVar = (gle) this.B.get();
            if (gleVar.a.isInPictureInPictureMode() || gleVar.a.isChangingConfigurations() || n == null || !gle.d(n) || !gle.b(n.c(), ((ainy) gleVar.b.get()).d(), ((fgq) gleVar.c.get()).g())) {
                if (n == null) {
                    return anaf.O(false);
                }
                n(n);
                return anaf.O(false);
            }
            PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
            builder.setAspectRatio(this.y);
            builder.setActions(((gku) this.d.get()).a());
            if (!evr.M(this.C)) {
                Rect rect = new Rect();
                view.getGlobalVisibleRect(rect);
                fav.A(this.y.floatValue(), rect, rect);
                builder.setSourceRectHint(rect);
            } else if (amkq.b(fhgVar, fhg.WATCH_WHILE_MAXIMIZED)) {
                Rect rect2 = new Rect();
                view.getRootView().getGlobalVisibleRect(rect2);
                fav.B(this.y.floatValue(), rect2, rect2);
                builder.setSourceRectHint(rect2);
            }
            ((gla) this.c.get()).b();
            try {
                z = this.b.enterPictureInPictureMode(builder.build());
            } catch (IllegalStateException e) {
                afsi.c(2, 25, "Error entering picture and picture", e);
            }
            return anaf.O(Boolean.valueOf(z));
        }
        return anaf.O(false);
    }

    @Override // defpackage.gky
    public final void h() {
        if (this.l && !this.G && this.v.h()) {
            n(((ainy) this.e.get()).n());
        }
    }

    @Override // defpackage.gky
    public final void i(boolean z) {
        if (z) {
            ((ainy) this.e.get()).W(2);
        } else if (this.D && !this.r) {
            ((ainy) this.e.get()).J();
        }
        gku gkuVar = (gku) this.d.get();
        if (z) {
            gkuVar.c();
        } else {
            gkuVar.d();
        }
        this.r = false;
    }

    @Override // defpackage.gky
    public final void j(boolean z) {
        if (!this.b.isInPictureInPictureMode() || this.x || this.F == z) {
            return;
        }
        boolean z2 = false;
        if (z && ((ainy) this.e.get()).d()) {
            z2 = true;
        }
        if (z2) {
            ((ainy) this.e.get()).a();
        } else if (!z && this.E && !((ainy) this.e.get()).d()) {
            ((ainy) this.e.get()).b();
        }
        this.E = z2;
        this.F = z;
    }

    public final void k(Function... functionArr) {
        PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
        boolean z = false;
        for (Function function : functionArr) {
            z |= ((Boolean) function.apply(builder)).booleanValue();
        }
        if (z) {
            this.b.setPictureInPictureParams(builder.build());
        }
    }

    @Override // defpackage.gky
    public final boolean l() {
        return this.l;
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    public final boolean m(PictureInPictureParams.Builder builder) {
        if (!this.l) {
            return false;
        }
        boolean z = this.G;
        boolean z2 = !this.t && gle.b(this.s, this.u, this.v);
        this.G = z2;
        if (z == z2) {
            return false;
        }
        builder.setAutoEnterEnabled(z2);
        return true;
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        View view;
        this.D = true;
        if (this.q) {
            this.k.c();
            aiva aivaVar = this.m;
            if (aivaVar != null) {
                ((aivb) this.g.get()).c(aivaVar);
            }
            adlr adlrVar = this.o;
            if (adlrVar != null) {
                ((adlt) this.h.get()).k(adlrVar);
                this.o = null;
            }
            View.OnLayoutChangeListener onLayoutChangeListener = this.p;
            if (onLayoutChangeListener != null && (view = this.n) != null) {
                view.removeOnLayoutChangeListener(onLayoutChangeListener);
                this.p = null;
                this.n = null;
            }
            ((gku) this.d.get()).y = null;
            gku gkuVar = (gku) this.d.get();
            gkuVar.d.k(gkuVar.q);
            ahew ahewVar = gkuVar.r;
            if (ahewVar != null) {
                gkuVar.c.c.a.remove(ahewVar);
            }
            gkuVar.e.c();
            gkuVar.d();
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.D = false;
        this.q = false;
        ynm.p(aokVar, ((gkx) this.A.get()).a(), ept.i, new zfi() { // from class: gkd
            @Override // defpackage.zfi
            public final void a(Object obj) {
                final DefaultPipController defaultPipController = DefaultPipController.this;
                final int i = 1;
                final int i2 = 0;
                boolean z = ((gkw) obj) == gkw.ENABLED;
                defaultPipController.q = z;
                if (z) {
                    final int i3 = 2;
                    defaultPipController.k(new gkg(defaultPipController, 2));
                    aiva aivaVar = defaultPipController.m;
                    if (aivaVar != null) {
                        ((aivb) defaultPipController.g.get()).a(aivaVar);
                    }
                    defaultPipController.k.d(((aioc) defaultPipController.f.get()).ao().G().Y(new ayrs() { // from class: gkf
                        @Override // defpackage.ayrs
                        public final void a(Object obj2) {
                            boolean z2;
                            View view;
                            int i4 = i2;
                            if (i4 == 0) {
                                DefaultPipController defaultPipController2 = defaultPipController;
                                ahdv ahdvVar = (ahdv) obj2;
                                if (defaultPipController2.b.isInPictureInPictureMode() && !gle.c(ahdvVar.b())) {
                                    ((ainy) defaultPipController2.e.get()).J();
                                    ((gla) defaultPipController2.c.get()).a(((ainy) defaultPipController2.e.get()).n(), ((ainy) defaultPipController2.e.get()).p(), ((ainy) defaultPipController2.e.get()).g());
                                }
                                if (ahdvVar.b() != null) {
                                    z2 = gle.a(ahdvVar.b());
                                } else {
                                    z2 = defaultPipController2.x;
                                }
                                defaultPipController2.x = z2;
                                defaultPipController2.s = ahdvVar.b();
                                defaultPipController2.k(new gkg(defaultPipController2, 1));
                                return;
                            }
                            if (i4 == 1) {
                                final DefaultPipController defaultPipController3 = defaultPipController;
                                defaultPipController3.v = (fhg) obj2;
                                defaultPipController3.k(new gkg(defaultPipController3, 1));
                                boolean z3 = defaultPipController3.w;
                                boolean z4 = defaultPipController3.v.m() || defaultPipController3.v == fhg.NONE;
                                defaultPipController3.w = z4;
                                if (z3 && !z4) {
                                    defaultPipController3.k(new gkg(defaultPipController3, 0));
                                }
                                if (defaultPipController3.n == null) {
                                    defaultPipController3.n = ((kcz) ((kch) defaultPipController3.i.get()).get()).aT;
                                    if (defaultPipController3.n == null) {
                                        return;
                                    }
                                    defaultPipController3.p = new View.OnLayoutChangeListener() { // from class: gkc
                                        @Override // android.view.View.OnLayoutChangeListener
                                        public final void onLayoutChange(View view2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                                            DefaultPipController defaultPipController4 = DefaultPipController.this;
                                            if (defaultPipController4.w) {
                                                return;
                                            }
                                            if (i5 == i9 && i7 == i11 && i6 == i10 && i8 == i12) {
                                                return;
                                            }
                                            defaultPipController4.k(new gkg(defaultPipController4, 0));
                                        }
                                    };
                                    View.OnLayoutChangeListener onLayoutChangeListener = defaultPipController3.p;
                                    if (onLayoutChangeListener == null || (view = defaultPipController3.n) == null) {
                                        return;
                                    }
                                    view.addOnLayoutChangeListener(onLayoutChangeListener);
                                    return;
                                }
                                return;
                            }
                            DefaultPipController defaultPipController4 = defaultPipController;
                            ahej ahejVar = (ahej) obj2;
                            boolean z5 = defaultPipController4.u;
                            boolean z6 = ahejVar.f() || ahejVar.c();
                            defaultPipController4.u = z6;
                            if (z5 != z6) {
                                defaultPipController4.k(new gkg(defaultPipController4, 1));
                            }
                        }
                    }, ggk.d));
                    if (defaultPipController.l) {
                        defaultPipController.o = new gki(defaultPipController);
                        adlr adlrVar = defaultPipController.o;
                        if (adlrVar != null) {
                            ((adlt) defaultPipController.h.get()).i(adlrVar);
                        }
                        defaultPipController.k.d(((aioc) defaultPipController.f.get()).G().i.G().Y(new ayrs() { // from class: gkf
                            @Override // defpackage.ayrs
                            public final void a(Object obj2) {
                                boolean z2;
                                View view;
                                int i4 = i3;
                                if (i4 == 0) {
                                    DefaultPipController defaultPipController2 = defaultPipController;
                                    ahdv ahdvVar = (ahdv) obj2;
                                    if (defaultPipController2.b.isInPictureInPictureMode() && !gle.c(ahdvVar.b())) {
                                        ((ainy) defaultPipController2.e.get()).J();
                                        ((gla) defaultPipController2.c.get()).a(((ainy) defaultPipController2.e.get()).n(), ((ainy) defaultPipController2.e.get()).p(), ((ainy) defaultPipController2.e.get()).g());
                                    }
                                    if (ahdvVar.b() != null) {
                                        z2 = gle.a(ahdvVar.b());
                                    } else {
                                        z2 = defaultPipController2.x;
                                    }
                                    defaultPipController2.x = z2;
                                    defaultPipController2.s = ahdvVar.b();
                                    defaultPipController2.k(new gkg(defaultPipController2, 1));
                                    return;
                                }
                                if (i4 == 1) {
                                    final DefaultPipController defaultPipController3 = defaultPipController;
                                    defaultPipController3.v = (fhg) obj2;
                                    defaultPipController3.k(new gkg(defaultPipController3, 1));
                                    boolean z3 = defaultPipController3.w;
                                    boolean z4 = defaultPipController3.v.m() || defaultPipController3.v == fhg.NONE;
                                    defaultPipController3.w = z4;
                                    if (z3 && !z4) {
                                        defaultPipController3.k(new gkg(defaultPipController3, 0));
                                    }
                                    if (defaultPipController3.n == null) {
                                        defaultPipController3.n = ((kcz) ((kch) defaultPipController3.i.get()).get()).aT;
                                        if (defaultPipController3.n == null) {
                                            return;
                                        }
                                        defaultPipController3.p = new View.OnLayoutChangeListener() { // from class: gkc
                                            @Override // android.view.View.OnLayoutChangeListener
                                            public final void onLayoutChange(View view2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                                                DefaultPipController defaultPipController4 = DefaultPipController.this;
                                                if (defaultPipController4.w) {
                                                    return;
                                                }
                                                if (i5 == i9 && i7 == i11 && i6 == i10 && i8 == i12) {
                                                    return;
                                                }
                                                defaultPipController4.k(new gkg(defaultPipController4, 0));
                                            }
                                        };
                                        View.OnLayoutChangeListener onLayoutChangeListener = defaultPipController3.p;
                                        if (onLayoutChangeListener == null || (view = defaultPipController3.n) == null) {
                                            return;
                                        }
                                        view.addOnLayoutChangeListener(onLayoutChangeListener);
                                        return;
                                    }
                                    return;
                                }
                                DefaultPipController defaultPipController4 = defaultPipController;
                                ahej ahejVar = (ahej) obj2;
                                boolean z5 = defaultPipController4.u;
                                boolean z6 = ahejVar.f() || ahejVar.c();
                                defaultPipController4.u = z6;
                                if (z5 != z6) {
                                    defaultPipController4.k(new gkg(defaultPipController4, 1));
                                }
                            }
                        }, ggk.d));
                        defaultPipController.k.d(((fgq) defaultPipController.j.get()).h().B().ay(new ayrs() { // from class: gkf
                            @Override // defpackage.ayrs
                            public final void a(Object obj2) {
                                boolean z2;
                                View view;
                                int i4 = i;
                                if (i4 == 0) {
                                    DefaultPipController defaultPipController2 = defaultPipController;
                                    ahdv ahdvVar = (ahdv) obj2;
                                    if (defaultPipController2.b.isInPictureInPictureMode() && !gle.c(ahdvVar.b())) {
                                        ((ainy) defaultPipController2.e.get()).J();
                                        ((gla) defaultPipController2.c.get()).a(((ainy) defaultPipController2.e.get()).n(), ((ainy) defaultPipController2.e.get()).p(), ((ainy) defaultPipController2.e.get()).g());
                                    }
                                    if (ahdvVar.b() != null) {
                                        z2 = gle.a(ahdvVar.b());
                                    } else {
                                        z2 = defaultPipController2.x;
                                    }
                                    defaultPipController2.x = z2;
                                    defaultPipController2.s = ahdvVar.b();
                                    defaultPipController2.k(new gkg(defaultPipController2, 1));
                                    return;
                                }
                                if (i4 == 1) {
                                    final DefaultPipController defaultPipController3 = defaultPipController;
                                    defaultPipController3.v = (fhg) obj2;
                                    defaultPipController3.k(new gkg(defaultPipController3, 1));
                                    boolean z3 = defaultPipController3.w;
                                    boolean z4 = defaultPipController3.v.m() || defaultPipController3.v == fhg.NONE;
                                    defaultPipController3.w = z4;
                                    if (z3 && !z4) {
                                        defaultPipController3.k(new gkg(defaultPipController3, 0));
                                    }
                                    if (defaultPipController3.n == null) {
                                        defaultPipController3.n = ((kcz) ((kch) defaultPipController3.i.get()).get()).aT;
                                        if (defaultPipController3.n == null) {
                                            return;
                                        }
                                        defaultPipController3.p = new View.OnLayoutChangeListener() { // from class: gkc
                                            @Override // android.view.View.OnLayoutChangeListener
                                            public final void onLayoutChange(View view2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                                                DefaultPipController defaultPipController4 = DefaultPipController.this;
                                                if (defaultPipController4.w) {
                                                    return;
                                                }
                                                if (i5 == i9 && i7 == i11 && i6 == i10 && i8 == i12) {
                                                    return;
                                                }
                                                defaultPipController4.k(new gkg(defaultPipController4, 0));
                                            }
                                        };
                                        View.OnLayoutChangeListener onLayoutChangeListener = defaultPipController3.p;
                                        if (onLayoutChangeListener == null || (view = defaultPipController3.n) == null) {
                                            return;
                                        }
                                        view.addOnLayoutChangeListener(onLayoutChangeListener);
                                        return;
                                    }
                                    return;
                                }
                                DefaultPipController defaultPipController4 = defaultPipController;
                                ahej ahejVar = (ahej) obj2;
                                boolean z5 = defaultPipController4.u;
                                boolean z6 = ahejVar.f() || ahejVar.c();
                                defaultPipController4.u = z6;
                                if (z5 != z6) {
                                    defaultPipController4.k(new gkg(defaultPipController4, 1));
                                }
                            }
                        }, ggk.d));
                    }
                    if (defaultPipController.z != null) {
                        ((gku) defaultPipController.d.get()).y = defaultPipController.z;
                    }
                    final gku gkuVar = (gku) defaultPipController.d.get();
                    gkuVar.d.b(gkuVar.q);
                    ahew ahewVar = gkuVar.r;
                    if (ahewVar != null) {
                        gkuVar.c.r(ahewVar);
                    }
                    gkuVar.e.c();
                    gkuVar.e.d(gkuVar.a.G().i.G().Y(new ayrs() { // from class: gkl
                        @Override // defpackage.ayrs
                        public final void a(Object obj2) {
                            boolean z2;
                            gkh gkhVar;
                            int i4 = i2;
                            if (i4 == 0) {
                                gku gkuVar2 = gkuVar;
                                ahej ahejVar = (ahej) obj2;
                                if (amkq.b(gkuVar2.s, ahejVar)) {
                                    return;
                                }
                                gkuVar2.s = ahejVar;
                                gkh gkhVar2 = gkuVar2.y;
                                if (gkhVar2 == null || gkuVar2.u) {
                                    return;
                                }
                                gkhVar2.a();
                                return;
                            }
                            if (i4 != 1) {
                                gku gkuVar3 = gkuVar;
                                gkh gkhVar3 = gkuVar3.y;
                                if (gkhVar3 == null || gkuVar3.u || gkuVar3.v) {
                                    return;
                                }
                                gkhVar3.a();
                                return;
                            }
                            gku gkuVar4 = gkuVar;
                            ahef ahefVar = (ahef) obj2;
                            boolean z3 = gkuVar4.x;
                            gkuVar4.x = gle.c(ahefVar.b());
                            boolean z4 = gkuVar4.v;
                            gkuVar4.v = ahefVar.c().a(aign.PLAYBACK_INTERRUPTED, aign.INTERSTITIAL_REQUESTED, aign.INTERSTITIAL_PLAYING);
                            boolean z5 = gkuVar4.w;
                            if (ahefVar.b() != null) {
                                z2 = gle.a(ahefVar.b());
                            } else {
                                z2 = gkuVar4.w;
                            }
                            gkuVar4.w = z2;
                            if ((z4 == gkuVar4.v && z5 == z2 && z3 == gkuVar4.x) || (gkhVar = gkuVar4.y) == null || gkuVar4.u) {
                                return;
                            }
                            gkhVar.a();
                        }
                    }, ggk.e));
                    gkuVar.e.d(gkuVar.a.G().a.G().Y(new ayrs() { // from class: gkl
                        @Override // defpackage.ayrs
                        public final void a(Object obj2) {
                            boolean z2;
                            gkh gkhVar;
                            int i4 = i;
                            if (i4 == 0) {
                                gku gkuVar2 = gkuVar;
                                ahej ahejVar = (ahej) obj2;
                                if (amkq.b(gkuVar2.s, ahejVar)) {
                                    return;
                                }
                                gkuVar2.s = ahejVar;
                                gkh gkhVar2 = gkuVar2.y;
                                if (gkhVar2 == null || gkuVar2.u) {
                                    return;
                                }
                                gkhVar2.a();
                                return;
                            }
                            if (i4 != 1) {
                                gku gkuVar3 = gkuVar;
                                gkh gkhVar3 = gkuVar3.y;
                                if (gkhVar3 == null || gkuVar3.u || gkuVar3.v) {
                                    return;
                                }
                                gkhVar3.a();
                                return;
                            }
                            gku gkuVar4 = gkuVar;
                            ahef ahefVar = (ahef) obj2;
                            boolean z3 = gkuVar4.x;
                            gkuVar4.x = gle.c(ahefVar.b());
                            boolean z4 = gkuVar4.v;
                            gkuVar4.v = ahefVar.c().a(aign.PLAYBACK_INTERRUPTED, aign.INTERSTITIAL_REQUESTED, aign.INTERSTITIAL_PLAYING);
                            boolean z5 = gkuVar4.w;
                            if (ahefVar.b() != null) {
                                z2 = gle.a(ahefVar.b());
                            } else {
                                z2 = gkuVar4.w;
                            }
                            gkuVar4.w = z2;
                            if ((z4 == gkuVar4.v && z5 == z2 && z3 == gkuVar4.x) || (gkhVar = gkuVar4.y) == null || gkuVar4.u) {
                                return;
                            }
                            gkhVar.a();
                        }
                    }, ggk.e));
                    gkuVar.e.d(gkuVar.b.d.G().Y(new ayrs() { // from class: gkl
                        @Override // defpackage.ayrs
                        public final void a(Object obj2) {
                            boolean z2;
                            gkh gkhVar;
                            int i4 = i3;
                            if (i4 == 0) {
                                gku gkuVar2 = gkuVar;
                                ahej ahejVar = (ahej) obj2;
                                if (amkq.b(gkuVar2.s, ahejVar)) {
                                    return;
                                }
                                gkuVar2.s = ahejVar;
                                gkh gkhVar2 = gkuVar2.y;
                                if (gkhVar2 == null || gkuVar2.u) {
                                    return;
                                }
                                gkhVar2.a();
                                return;
                            }
                            if (i4 != 1) {
                                gku gkuVar3 = gkuVar;
                                gkh gkhVar3 = gkuVar3.y;
                                if (gkhVar3 == null || gkuVar3.u || gkuVar3.v) {
                                    return;
                                }
                                gkhVar3.a();
                                return;
                            }
                            gku gkuVar4 = gkuVar;
                            ahef ahefVar = (ahef) obj2;
                            boolean z3 = gkuVar4.x;
                            gkuVar4.x = gle.c(ahefVar.b());
                            boolean z4 = gkuVar4.v;
                            gkuVar4.v = ahefVar.c().a(aign.PLAYBACK_INTERRUPTED, aign.INTERSTITIAL_REQUESTED, aign.INTERSTITIAL_PLAYING);
                            boolean z5 = gkuVar4.w;
                            if (ahefVar.b() != null) {
                                z2 = gle.a(ahefVar.b());
                            } else {
                                z2 = gkuVar4.w;
                            }
                            gkuVar4.w = z2;
                            if ((z4 == gkuVar4.v && z5 == z2 && z3 == gkuVar4.x) || (gkhVar = gkuVar4.y) == null || gkuVar4.u) {
                                return;
                            }
                            gkhVar.a();
                        }
                    }, ggk.e));
                    gkuVar.c();
                }
            }
        });
    }
}
