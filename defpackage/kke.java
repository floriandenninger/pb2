package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kke extends ahus implements fnp, nva, nsu, kut, nvc, zch, nsv, adlr, kig {
    public final adlt a;
    public final axpg b;
    public final azqv c;
    public final azqv d;
    public final Rect e;
    public boolean f;
    public boolean g;
    public nxr h;
    private final boolean i;
    private final fgq j;
    private final ayqw k;
    private final azqv l;
    private final azqv m;
    private final aypn n;
    private final aypn o;
    private boolean p;
    private WeakReference q;
    private CoordinatorLayout r;
    private yzr s;

    static {
        new nti(2);
    }

    public kke(Context context, fgq fgqVar, adlt adltVar, axpg axpgVar, aioc aiocVar, kih kihVar, aadw aadwVar, fno fnoVar) {
        super(context);
        this.b = axpgVar;
        this.i = evr.aI(aadwVar);
        this.j = fgqVar;
        this.a = adltVar;
        this.d = azqv.ap();
        azqv ap = azqv.ap();
        this.l = ap;
        azqv ap2 = azqv.ap();
        this.m = ap2;
        azqv ap3 = azqv.ap();
        this.c = ap3;
        this.k = new ayqw();
        this.e = new Rect();
        kihVar.a(this);
        final int i = 0;
        this.g = false;
        aypn h = aypn.e(aypn.z(false).j(aiocVar.G().b.A(khe.g)), ap3, epc.u).n().h(ntu.b);
        aypn h2 = aypn.g(fgqVar.h().i(aypg.LATEST), h, ap, ap2, new ayru() { // from class: kjz
            @Override // defpackage.ayru
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
                Boolean bool = (Boolean) obj2;
                Boolean bool2 = (Boolean) obj3;
                Boolean bool3 = (Boolean) obj4;
                boolean z = false;
                if (kke.this.mY((fhg) obj) && bool.booleanValue() && bool2.booleanValue() && bool3.booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }).n().q(new ayrs(this) { // from class: kkd
            public final /* synthetic */ kke a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i2 = i;
                if (i2 == 0) {
                    this.a.g = ((Boolean) obj).booleanValue();
                } else {
                    if (i2 == 1) {
                        kke kkeVar = this.a;
                        kkeVar.e.set((Rect) obj);
                        kkeVar.Z(2);
                        return;
                    }
                    kke kkeVar2 = this.a;
                    kkeVar2.f = ((Boolean) obj).booleanValue();
                    kkeVar2.Z(1);
                }
            }
        }).h(ntu.b);
        this.n = h2;
        final axpg axpgVar2 = new axpg() { // from class: kkb
            @Override // defpackage.axpg
            public final Object get() {
                final kke kkeVar = kke.this;
                return aypn.e(((nqp) kkeVar.b.get()).h().m, kkeVar.d, new ayro() { // from class: kkc
                    @Override // defpackage.ayro
                    public final Object a(Object obj, Object obj2) {
                        int i2;
                        kke kkeVar2 = kke.this;
                        Rect rect = (Rect) obj2;
                        float height = (rect.height() - ((Integer) obj).intValue()) / rect.height();
                        float width = rect.width() * height;
                        if (kkeVar2.B()) {
                            i2 = kkeVar2.e.right;
                        } else {
                            i2 = kkeVar2.e.left;
                        }
                        return new Rect((int) (i2 * height), 0, (int) yjk.y(width, 0.0f, rect.width()), 0);
                    }
                });
            }
        };
        this.o = h2.M(new ayrv() { // from class: kka
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                axpg axpgVar3 = axpg.this;
                if (((Boolean) obj).booleanValue()) {
                    return axpgVar3.get();
                }
                return aypn.z(new Rect());
            }
        }).h(ntu.b);
        final int i2 = 2;
        h.Y(new ayrs(this) { // from class: kkd
            public final /* synthetic */ kke a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i22 = i2;
                if (i22 == 0) {
                    this.a.g = ((Boolean) obj).booleanValue();
                } else {
                    if (i22 == 1) {
                        kke kkeVar = this.a;
                        kkeVar.e.set((Rect) obj);
                        kkeVar.Z(2);
                        return;
                    }
                    kke kkeVar2 = this.a;
                    kkeVar2.f = ((Boolean) obj).booleanValue();
                    kkeVar2.Z(1);
                }
            }
        }, kfe.f);
        final int i3 = 1;
        fnoVar.a.n().X(new ayrs(this) { // from class: kkd
            public final /* synthetic */ kke a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i22 = i3;
                if (i22 == 0) {
                    this.a.g = ((Boolean) obj).booleanValue();
                } else {
                    if (i22 == 1) {
                        kke kkeVar = this.a;
                        kkeVar.e.set((Rect) obj);
                        kkeVar.Z(2);
                        return;
                    }
                    kke kkeVar2 = this.a;
                    kkeVar2.f = ((Boolean) obj).booleanValue();
                    kkeVar2.Z(1);
                }
            }
        });
    }

    private final void D(boolean z) {
        this.p = z;
        Z(4);
    }

    @Override // defpackage.nsv
    public final boolean A() {
        return this.g;
    }

    public final boolean B() {
        return ld() != null && jw.e(ld()) == 1;
    }

    @Override // defpackage.nsu
    public final void C(nxr nxrVar) {
        this.h = nxrVar;
    }

    @Override // defpackage.ahuy
    public final /* bridge */ /* synthetic */ View a(Context context) {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.fullscreen_engagement_panel_overlay, (ViewGroup) null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(R.id.fullscreen_engagement_panel_holder);
        this.r = coordinatorLayout;
        coordinatorLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: kjy
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                kke kkeVar = kke.this;
                nxr nxrVar = kkeVar.h;
                if (nxrVar != null) {
                    nxrVar.a.c(new Rect(i, i2, i3, i4));
                }
                if (kkeVar.B()) {
                    i -= ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin;
                } else {
                    i3 += ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin;
                }
                kkeVar.d.c(new Rect(i, i2, i3, i4));
            }
        });
        yzr C = ((nqp) this.b.get()).C();
        this.s = C;
        C.h(this);
        this.m.c(Boolean.valueOf(this.s.f()));
        return frameLayout;
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new aivh(-1, -1, false);
    }

    @Override // defpackage.ahuy
    public final /* bridge */ /* synthetic */ void d(Context context, View view) {
        WeakReference weakReference;
        RelativeLayout relativeLayout;
        if (ab(8) && (weakReference = this.q) != null && (relativeLayout = (RelativeLayout) weakReference.get()) != null) {
            relativeLayout.setAlpha(1.0f);
            this.r.addView(relativeLayout);
            this.l.c(true);
            this.k.d(((nqp) this.b.get()).h().m.X(new nox(relativeLayout, 1)));
        }
        if (ab(1)) {
            this.r.setVisibility(true == this.f ? 0 : 8);
        }
        if (ab(2)) {
            yny.z(this.r, yny.o(this.e.left), ViewGroup.MarginLayoutParams.class);
            yny.z(this.r, yny.u(this.e.right), ViewGroup.MarginLayoutParams.class);
        }
        if (ab(4)) {
            this.r.setAlpha(true == this.p ? 0.3f : 1.0f);
            this.r.setImportantForAccessibility(true == this.p ? 4 : 1);
        }
    }

    @Override // defpackage.kig
    public final /* synthetic */ void i(ControlsOverlayStyle controlsOverlayStyle) {
    }

    @Override // defpackage.adlr
    public final void j(adlm adlmVar) {
    }

    @Override // defpackage.adlr
    public final void k(adlm adlmVar) {
        this.c.c(false);
    }

    @Override // defpackage.ahus
    public final ahux kU(Context context) {
        ahux kU = super.kU(context);
        kU.e = false;
        kU.b();
        return kU;
    }

    @Override // defpackage.adlr
    public final void l(adlm adlmVar) {
        this.c.c(true);
    }

    @Override // defpackage.kig
    public final /* synthetic */ void m(fhg fhgVar) {
    }

    @Override // defpackage.fnp
    public final boolean mY(fhg fhgVar) {
        return this.i && fhgVar == fhg.WATCH_WHILE_FULLSCREEN;
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nA(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nB(zcp zcpVar) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nC(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nD(boolean z) {
    }

    @Override // defpackage.zch
    public final void nE(int i, yzr yzrVar) {
        if (this.s.e()) {
            this.m.c(true);
        } else if (i == 0) {
            this.m.c(false);
        }
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nF(ControlsState controlsState) {
    }

    @Override // defpackage.fnp
    public final void nH(fhg fhgVar) {
        if (mY(fhgVar)) {
            aa();
        } else {
            X();
        }
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nX(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nY(boolean z) {
    }

    @Override // defpackage.ahuy
    public final boolean nt() {
        return mY(this.j.g());
    }

    @Override // defpackage.kig
    public final void nz(boolean z) {
        D(false);
    }

    @Override // defpackage.kig
    public final /* synthetic */ void p(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void q(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void r(boolean z) {
    }

    @Override // defpackage.kig
    public final void s(boolean z) {
        D(true);
    }

    @Override // defpackage.nsv
    public final aypn t() {
        return this.n;
    }

    @Override // defpackage.kut
    public final aypn u() {
        return this.o;
    }

    @Override // defpackage.nva
    public final void v(RelativeLayout relativeLayout, RelativeLayout relativeLayout2) {
        this.q = new WeakReference(relativeLayout);
        Z(8);
    }

    @Override // defpackage.nva
    public final void w(RelativeLayout relativeLayout, RelativeLayout relativeLayout2) {
        this.k.c();
        this.q = null;
        this.l.c(false);
        if (np()) {
            this.r.removeView(relativeLayout);
        }
    }

    @Override // defpackage.nvc
    public final void x(boolean z, zcg zcgVar) {
        yzr yzrVar = this.s;
        if (yzrVar == null) {
            return;
        }
        yzrVar.l(zcgVar);
        this.s.a(z, true);
    }

    @Override // defpackage.nvc
    public final /* synthetic */ void y(nqg nqgVar) {
    }

    @Override // defpackage.nvc
    public final /* synthetic */ void z(nqg nqgVar) {
    }
}
