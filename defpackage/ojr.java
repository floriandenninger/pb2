package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.app.watch.engagementpanel.WatchEngagementPanelViewContainerController;
import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.FlexyBehavior;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.FullscreenExitController;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchContainerLayout;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.youtube.R;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ojr implements okf, obq, fgp, ypd {
    private final oqk A;
    public final obr b;
    public final fgq c;
    public NextGenWatchContainerLayout d;
    public boolean e;
    public boolean f;
    private final Activity g;
    private final fxp h;
    private final azrw i;
    private final ojz j;
    private final oju k;
    private final ojs l;
    private final nyk m;
    private final FullscreenExitController n;
    private final yqw o;
    private final ayqi p;
    private final WatchEngagementPanelViewContainerController q;
    private final aaea r;
    private gjz s;
    private NextGenWatchLayout t;
    private oen u;
    private boolean v;
    private int w;
    private int x;
    private final aadw y;
    private oqg z;

    public ojr(Activity activity, azrw azrwVar, ojz ojzVar, obr obrVar, aadw aadwVar, fxp fxpVar, oju ojuVar, ojs ojsVar, fgq fgqVar, nyk nykVar, FullscreenExitController fullscreenExitController, WatchEngagementPanelViewContainerController watchEngagementPanelViewContainerController, yqw yqwVar, ayqi ayqiVar, oqk oqkVar, aaea aaeaVar, byte[] bArr) {
        this.g = activity;
        this.i = azrwVar;
        this.j = ojzVar;
        this.b = obrVar;
        this.y = aadwVar;
        this.h = fxpVar;
        this.k = ojuVar;
        this.l = ojsVar;
        this.c = fgqVar;
        this.m = nykVar;
        this.n = fullscreenExitController;
        this.o = yqwVar;
        this.p = ayqiVar;
        this.r = aaeaVar;
        this.A = oqkVar;
        this.q = watchEngagementPanelViewContainerController;
    }

    private final void u(boolean z) {
        oqg oqgVar = this.z;
        if (oqgVar != null) {
            oqgVar.a.b(true);
        }
        q(3, z);
    }

    private final void v() {
        yny.z(this.d, yny.k(this.x + (this.c.g() == fhg.WATCH_WHILE_MAXIMIZED ? this.w : 0)), ViewGroup.MarginLayoutParams.class);
    }

    @Override // defpackage.fhb
    public final fha a(int i) {
        return this.k.a(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        if (r6.s.f() == false) goto L36;
     */
    @Override // defpackage.okf, defpackage.gjw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r6 = this;
            fgq r0 = r6.c
            fhg r0 = r0.g()
            boolean r0 = r0.b()
            if (r0 != 0) goto L77
            fgq r0 = r6.c
            fhg r0 = r0.g()
            fhg r1 = defpackage.fhg.NONE
            if (r0 == r1) goto L2a
            boolean r1 = r0.b()
            if (r1 != 0) goto L23
            boolean r0 = r0.h()
            if (r0 == 0) goto L23
            goto L2a
        L23:
            fgq r0 = r6.c
            fhg r0 = r0.g()
            goto L2c
        L2a:
            fhg r0 = defpackage.fhg.WATCH_WHILE_FULLSCREEN
        L2c:
            gjz r1 = r6.s
            boolean r2 = defpackage.etx.u(r0)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L37
            goto L60
        L37:
            gjr r2 = r1.c
            gjy r5 = r1.d
            int r5 = r5.a()
            zcp r1 = r1.a
            int r0 = r2.b(r0, r5, r1)
            r1 = 2
            if (r0 == r1) goto L59
            r1 = 3
            if (r0 == r1) goto L59
            r1 = 4
            if (r0 == r1) goto L52
            r1 = 5
            if (r0 == r1) goto L52
            goto L60
        L52:
            boolean r0 = defpackage.etx.s(r5)
            if (r0 != 0) goto L60
            goto L73
        L59:
            boolean r0 = defpackage.etx.t(r5)
            if (r0 != 0) goto L60
            goto L73
        L60:
            fgq r0 = r6.c
            fhg r0 = r0.g()
            fhg r1 = defpackage.fhg.WATCH_WHILE_MAXIMIZED
            if (r0 != r1) goto L74
            gjz r0 = r6.s
            boolean r0 = r0.f()
            if (r0 == 0) goto L73
            goto L74
        L73:
            r3 = 0
        L74:
            r6.u(r3)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ojr.b():void");
    }

    @Override // defpackage.okf, defpackage.gjw
    public final void c() {
        j(false);
    }

    @Override // defpackage.nnf
    public final void d(boolean z, int i) {
        atax ataxVar = this.y.b().n;
        if (ataxVar == null) {
            ataxVar = atax.a;
        }
        boolean z2 = ataxVar.k;
        if (true != z) {
            i = 0;
        }
        this.x = i;
        v();
        this.v = !z2 && z;
        s(2, i);
        if (z) {
            if (!z2 && this.v && this.b.f()) {
                h(false);
                return;
            }
            return;
        }
        if (z2 || ((ainy) this.i.get()).o() == null || !this.b.c()) {
            return;
        }
        m(false);
    }

    @Override // defpackage.fxl
    public final void e(int i) {
        NextGenWatchContainerLayout nextGenWatchContainerLayout = this.d;
        ojp ojpVar = new ojp(this, i);
        nextGenWatchContainerLayout.getClass();
        nextGenWatchContainerLayout.setTag(R.id.view_position_clip_supplier_tag, ojpVar);
        this.w = i;
        v();
    }

    @Override // defpackage.okf
    public final flr g() {
        return this.u;
    }

    @Override // defpackage.okf
    public final void h(boolean z) {
        q(0, z && this.c.g().h());
    }

    @Override // defpackage.okf
    public final void i() {
        u(false);
    }

    @Override // defpackage.okf
    public final void j(boolean z) {
        if (this.c.g().b()) {
            FullscreenExitController fullscreenExitController = this.n;
            int i = 1;
            if (fullscreenExitController.b) {
                i = 0;
            } else if (z && !fullscreenExitController.a) {
                i = 2;
            }
            q(i, false);
        }
    }

    @Override // defpackage.okf
    public final void k(View view, gjz gjzVar) {
        gjzVar.getClass();
        this.s = gjzVar;
        NextGenWatchContainerLayout nextGenWatchContainerLayout = (NextGenWatchContainerLayout) view.findViewById(R.id.next_gen_watch_container_layout);
        this.d = nextGenWatchContainerLayout;
        ViewGroup viewGroup = (ViewGroup) nextGenWatchContainerLayout.findViewById(R.id.watch_player);
        final NextGenWatchLayout nextGenWatchLayout = (NextGenWatchLayout) this.d.findViewById(R.id.next_gen_watch_layout);
        this.u = new oen(viewGroup, nextGenWatchLayout);
        final WatchEngagementPanelViewContainerController watchEngagementPanelViewContainerController = this.q;
        final int i = 0;
        final int i2 = 1;
        if (evr.aI(watchEngagementPanelViewContainerController.j)) {
            final RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(watchEngagementPanelViewContainerController.b).inflate(R.layout.engagement_panel_lower_view, (ViewGroup) null);
            final RelativeLayout relativeLayout2 = (RelativeLayout) LayoutInflater.from(watchEngagementPanelViewContainerController.b).inflate(R.layout.engagement_panel_root_view, (ViewGroup) null);
            ((nqp) watchEngagementPanelViewContainerController.c.get()).j(relativeLayout2, relativeLayout);
            watchEngagementPanelViewContainerController.h.d(watchEngagementPanelViewContainerController.g.ao().G().E(ayqr.a()).Y(new ayrs() { // from class: nux
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    if (i2 == 0) {
                        ((nqp) watchEngagementPanelViewContainerController.c.get()).s();
                        return;
                    }
                    WatchEngagementPanelViewContainerController watchEngagementPanelViewContainerController2 = watchEngagementPanelViewContainerController;
                    WatchNextResponseModel a = ((ahdv) obj).a();
                    if (a == null) {
                        ((nqp) watchEngagementPanelViewContainerController2.c.get()).s();
                        return;
                    }
                    ((nqp) watchEngagementPanelViewContainerController2.c.get()).k(a);
                    if (evr.ab(watchEngagementPanelViewContainerController2.d)) {
                        asfc asfcVar = a.a;
                        if ((asfcVar.b & 262144) != 0) {
                            gpg gpgVar = watchEngagementPanelViewContainerController2.f;
                            apxf apxfVar = asfcVar.v;
                            if (apxfVar == null) {
                                apxfVar = apxf.a;
                            }
                            gpgVar.a(apxfVar, new HashMap());
                        }
                    }
                }
            }, nua.f));
            watchEngagementPanelViewContainerController.h.d(watchEngagementPanelViewContainerController.g.G().h.Y(new ayrs() { // from class: nux
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    if (i == 0) {
                        ((nqp) watchEngagementPanelViewContainerController.c.get()).s();
                        return;
                    }
                    WatchEngagementPanelViewContainerController watchEngagementPanelViewContainerController2 = watchEngagementPanelViewContainerController;
                    WatchNextResponseModel a = ((ahdv) obj).a();
                    if (a == null) {
                        ((nqp) watchEngagementPanelViewContainerController2.c.get()).s();
                        return;
                    }
                    ((nqp) watchEngagementPanelViewContainerController2.c.get()).k(a);
                    if (evr.ab(watchEngagementPanelViewContainerController2.d)) {
                        asfc asfcVar = a.a;
                        if ((asfcVar.b & 262144) != 0) {
                            gpg gpgVar = watchEngagementPanelViewContainerController2.f;
                            apxf apxfVar = asfcVar.v;
                            if (apxfVar == null) {
                                apxfVar = apxf.a;
                            }
                            gpgVar.a(apxfVar, new HashMap());
                        }
                    }
                }
            }, nua.f));
            watchEngagementPanelViewContainerController.h.d(watchEngagementPanelViewContainerController.a.ax(new ayrs() { // from class: nuy
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    WatchEngagementPanelViewContainerController watchEngagementPanelViewContainerController2 = WatchEngagementPanelViewContainerController.this;
                    RelativeLayout relativeLayout3 = relativeLayout2;
                    RelativeLayout relativeLayout4 = relativeLayout;
                    nva nvaVar = (nva) obj;
                    nva nvaVar2 = watchEngagementPanelViewContainerController2.i;
                    if (nvaVar2 != null) {
                        String valueOf = String.valueOf(nvaVar2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                        sb.append("Detach from container: ");
                        sb.append(valueOf);
                        watchEngagementPanelViewContainerController2.g(sb.toString());
                        watchEngagementPanelViewContainerController2.i.w(relativeLayout3, relativeLayout4);
                    }
                    String valueOf2 = String.valueOf(nvaVar);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 21);
                    sb2.append("Attach to container: ");
                    sb2.append(valueOf2);
                    watchEngagementPanelViewContainerController2.g(sb2.toString());
                    nvaVar.v(relativeLayout3, relativeLayout4);
                    watchEngagementPanelViewContainerController2.i = nvaVar;
                }
            }));
            final nvd nvdVar = watchEngagementPanelViewContainerController.e;
            nvdVar.d.d(nvdVar.b.V(new ayrs() { // from class: nvb
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    if (i2 != 0) {
                        nvdVar.e = (nvc) obj;
                    } else {
                        nvdVar.f = (nvc) obj;
                    }
                }
            }));
            nvdVar.d.d(nvdVar.c.V(new ayrs() { // from class: nvb
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    if (i != 0) {
                        nvdVar.e = (nvc) obj;
                    } else {
                        nvdVar.f = (nvc) obj;
                    }
                }
            }));
            ((nqp) nvdVar.a.get()).g().a(nvdVar);
            ((nqp) nvdVar.a.get()).t(nvdVar);
        }
        final ViewGroup viewGroup2 = (ViewGroup) nextGenWatchLayout.findViewById(R.id.video_metadata_layout);
        final ojz ojzVar = this.j;
        final fxu fxuVar = nextGenWatchLayout.a;
        final FlexyBehavior l = nextGenWatchLayout.l();
        final nzl m = nextGenWatchLayout.m();
        ojzVar.d = new azrw() { // from class: ojy
            @Override // defpackage.azrw
            public final Object get() {
                ojz ojzVar2 = ojz.this;
                NextGenWatchLayout nextGenWatchLayout2 = nextGenWatchLayout;
                return ((ojb) ojzVar2.b.get()).m(nextGenWatchLayout2, viewGroup2, fxuVar, l, m, nextGenWatchLayout2);
            }
        };
        ojzVar.c = viewGroup2;
        ojzVar.e.sc(nextGenWatchLayout);
        if (ojz.c(ojzVar.a.g())) {
            ojzVar.b();
        } else {
            ojzVar.a.i(ojzVar);
        }
        viewGroup2.setTag(viewGroup2.getId(), this.j);
        fhg g = this.c.g();
        if (g.h() && !g.k()) {
            whu.B(this.g);
        }
        this.t = nextGenWatchLayout;
        if (!nextGenWatchLayout.C) {
            nextGenWatchLayout.C = true;
            nextGenWatchLayout.invalidate();
        }
        this.t.d(this.l);
        oel oelVar = nextGenWatchLayout.c;
        NextGenWatchContainerLayout nextGenWatchContainerLayout2 = this.d;
        nextGenWatchContainerLayout2.h.a = oelVar;
        nextGenWatchContainerLayout2.requestLayout();
        oju ojuVar = this.k;
        for (int i3 = 0; i3 < ojuVar.b.size(); i3++) {
            ojt ojtVar = (ojt) ojuVar.b.valueAt(i3);
            obp d = oelVar != null ? oelVar.d(ojtVar.a) : null;
            obp obpVar = ojtVar.c;
            if (obpVar != d) {
                if (obpVar != null) {
                    obpVar.L(ojtVar);
                }
                ojtVar.c = d;
                obp obpVar2 = ojtVar.c;
                if (obpVar2 != null) {
                    obpVar2.K(ojtVar);
                    ojtVar.b(ojtVar.c);
                }
            }
        }
        this.b.a(this);
        this.c.i(this);
        aypn aypnVar = this.m.a;
        if (evr.ao(this.y)) {
            aypnVar = aypnVar.h(wbs.M(this.o.a()));
        }
        aypnVar.n().X(new ayrs(this) { // from class: ojq
            public final /* synthetic */ ojr a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i == 0) {
                    ojr ojrVar = this.a;
                    zcp zcpVar = (zcp) obj;
                    boolean z = ojrVar.e;
                    boolean z2 = ojrVar.f;
                    boolean z3 = zcpVar instanceof zcs;
                    ojrVar.e = z3;
                    boolean z4 = zcpVar instanceof zcr;
                    ojrVar.f = z4;
                    if (z3 == z) {
                        return;
                    }
                    if (z2 && z3) {
                        return;
                    }
                    if ((z && z4) || !ojrVar.b.g() || ojrVar.b.f()) {
                        return;
                    }
                    if (ojrVar.e || !ojrVar.b.d()) {
                        ojrVar.l(false);
                        return;
                    }
                    return;
                }
                ojr ojrVar2 = this.a;
                odl odlVar = odl.UNFORCED;
                int ordinal = ((odl) obj).ordinal();
                if (ordinal == 1) {
                    ojrVar2.m(true);
                } else {
                    if (ordinal != 2) {
                        return;
                    }
                    ojrVar2.q(4, true);
                }
            }
        });
        this.A.a.ab(this.p).ax(new ayrs(this) { // from class: ojq
            public final /* synthetic */ ojr a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 == 0) {
                    ojr ojrVar = this.a;
                    zcp zcpVar = (zcp) obj;
                    boolean z = ojrVar.e;
                    boolean z2 = ojrVar.f;
                    boolean z3 = zcpVar instanceof zcs;
                    ojrVar.e = z3;
                    boolean z4 = zcpVar instanceof zcr;
                    ojrVar.f = z4;
                    if (z3 == z) {
                        return;
                    }
                    if (z2 && z3) {
                        return;
                    }
                    if ((z && z4) || !ojrVar.b.g() || ojrVar.b.f()) {
                        return;
                    }
                    if (ojrVar.e || !ojrVar.b.d()) {
                        ojrVar.l(false);
                        return;
                    }
                    return;
                }
                ojr ojrVar2 = this.a;
                odl odlVar = odl.UNFORCED;
                int ordinal = ((odl) obj).ordinal();
                if (ordinal == 1) {
                    ojrVar2.m(true);
                } else {
                    if (ordinal != 2) {
                        return;
                    }
                    ojrVar2.q(4, true);
                }
            }
        });
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aigr.class};
        }
        if (i == 0) {
            if (((aigr) obj).i != 6 || this.c.g().d()) {
                return null;
            }
            h(false);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.okf
    public final void l(boolean z) {
        if (!this.s.j(false)) {
            u(false);
        } else {
            r(z);
        }
    }

    @Override // defpackage.okf
    public final void m(boolean z) {
        boolean z2 = false;
        if (z && !this.c.g().b()) {
            z2 = true;
        }
        q(2, z2);
    }

    @Override // defpackage.obq
    public final void o(int i) {
        if (i == 2 && this.v) {
            h(false);
        }
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        v();
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }

    @Override // defpackage.okf
    public final void p() {
        if (this.c.g().g() || this.c.g().e()) {
            if (this.s.j(true)) {
                r(false);
            } else {
                u(false);
            }
        }
    }

    public final void q(int i, boolean z) {
        int i2;
        boolean z2;
        if (this.t != null) {
            if (evr.F(this.r) || !z) {
                this.t.p(i);
                return;
            }
            NextGenWatchLayout nextGenWatchLayout = this.t;
            int k = nextGenWatchLayout.k(i);
            if (nextGenWatchLayout.c.a.g() || !odd.b(32, k)) {
                i2 = nextGenWatchLayout.i(i, k);
            } else {
                nextGenWatchLayout.e.b(nextGenWatchLayout.k(2), k, 0.0f);
                nextGenWatchLayout.p(2);
                i2 = nextGenWatchLayout.j(2, 32, i, k);
            }
            if (i2 == 2) {
                nextGenWatchLayout.p(i);
                return;
            }
            obu obuVar = nextGenWatchLayout.z;
            obuVar.getClass();
            obuVar.f(i2 == 1 ? obuVar.d.c : 0.0f, new oej(nextGenWatchLayout));
            return;
        }
        NextGenWatchContainerLayout nextGenWatchContainerLayout = this.d;
        if (z && nextGenWatchContainerLayout.d.b == 0 && i == 1) {
            i = 1;
            z2 = true;
        } else {
            z2 = false;
        }
        nextGenWatchContainerLayout.d.h(i);
        if (z2) {
            odr odrVar = nextGenWatchContainerLayout.g;
            if (!odrVar.b()) {
                float height = (int) (odrVar.c.getHeight() * 0.66f);
                Animator[] animatorArr = {ObjectAnimator.ofFloat(odrVar.c.b, "translationY", height, 0.0f), ObjectAnimator.ofFloat(odrVar.c.c, "translationY", height, 0.0f), ObjectAnimator.ofFloat(odrVar.c.a, "alpha", 0.0f, 1.0f)};
                for (int i3 = 0; i3 < 3; i3++) {
                    animatorArr[i3].setDuration(odrVar.a).setInterpolator(new AccelerateDecelerateInterpolator());
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(animatorArr);
                animatorSet.addListener(odrVar);
                odrVar.b = animatorSet;
                odrVar.b.start();
            }
        }
        nextGenWatchContainerLayout.c();
    }

    final void r(boolean z) {
        q(1, z);
    }

    @Override // defpackage.okf
    public final void s(int i, int i2) {
        this.h.c(i, i2);
    }

    @Override // defpackage.okf
    public final void t(oqg oqgVar) {
        this.z = oqgVar;
    }
}
