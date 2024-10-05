package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EdgeEffect;
import com.google.android.apps.youtube.app.common.player.overlay.YouTubePlayerOverlaysLayout;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateScrollSelectionController;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlayerLayout;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlayerOverlayLayout;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController;
import com.google.android.apps.youtube.app.common.util.AccessibilityStateReceiver;
import com.google.android.apps.youtube.app.offline.controller.OfflineSlimStatusBarConnectivityController;
import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;
import com.google.android.youtube.R;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ooc implements zbk, jgf, flm, fgp, ahor, ety {
    public boolean A;
    public fhd B;
    public InlinePlaybackController C;
    public final aadw D;
    public final lso E;
    public final kch F;
    public final omx G;
    private final azrw H;
    private final azrw I;

    /* renamed from: J, reason: collision with root package name */
    private final ScrollSelectionController f251J;
    private final ActiveStateScrollSelectionController K;
    private final fgj L;
    private final fwo M;
    private final gjz N;
    private final azrw O;
    private final azrw P;
    private final aivb Q;
    private final kda R;
    private final YouTubePlayerOverlaysLayout S;
    private final kct T;
    private final adlt U;
    private final axpg V;
    private final gfz W;
    private final nym X;
    private final Set Y;
    private final ong Z;
    public final euc a;
    private final azrw aa;
    private final oqi ab;
    private final azrw ac;
    private final axpg ae;
    private View af;
    private InlinePlayerLayout ag;
    private aifp ah;
    private final ahwy ai;
    private final nbm aj;
    private final lkb ak;
    public final onm b;
    public final okf c;
    public final fgq d;
    public final kbv e;
    public final aaea f;
    public final gky g;
    public final ajdh h;
    public final aasd i;
    public final ypa j;
    public final flu k;
    public final ahqr l;
    public final acra m;
    public final axpg n;
    public final azrw o;
    public final aioc p;
    public final zaz q;
    public final fln r;
    public final azrs s;
    public final aifk t;
    public final gop u;
    public final slr v;
    public boolean z;
    public final ayqw w = new ayqw();
    public final ayqw x = new ayqw();
    public final ayqw y = new ayqw();
    private final ayqw ad = new ayqw();

    public ooc(euc eucVar, azrw azrwVar, azrw azrwVar2, onm onmVar, ScrollSelectionController scrollSelectionController, ActiveStateScrollSelectionController activeStateScrollSelectionController, fgj fgjVar, fwo fwoVar, okf okfVar, fgq fgqVar, gjz gjzVar, kbv kbvVar, azrw azrwVar3, aadw aadwVar, aaea aaeaVar, gky gkyVar, azrw azrwVar4, ajdh ajdhVar, aasd aasdVar, aivb aivbVar, lso lsoVar, kda kdaVar, YouTubePlayerOverlaysLayout youTubePlayerOverlaysLayout, kct kctVar, ypa ypaVar, adlt adltVar, flu fluVar, axpg axpgVar, gfz gfzVar, ahqr ahqrVar, ahwy ahwyVar, acra acraVar, nym nymVar, axpg axpgVar2, kch kchVar, azrw azrwVar5, Set set, ong ongVar, aioc aiocVar, zaz zazVar, fln flnVar, azrw azrwVar6, oqi oqiVar, azrs azrsVar, lkb lkbVar, aifk aifkVar, azrw azrwVar7, gop gopVar, omx omxVar, nbm nbmVar, slr slrVar, axpg axpgVar3, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = eucVar;
        this.H = azrwVar2;
        this.I = azrwVar;
        this.b = onmVar;
        this.f251J = scrollSelectionController;
        this.K = activeStateScrollSelectionController;
        this.L = fgjVar;
        this.M = fwoVar;
        this.c = okfVar;
        this.d = fgqVar;
        this.N = gjzVar;
        this.e = kbvVar;
        this.O = azrwVar3;
        this.D = aadwVar;
        this.f = aaeaVar;
        this.g = gkyVar;
        this.P = azrwVar4;
        this.h = ajdhVar;
        this.i = aasdVar;
        this.Q = aivbVar;
        this.E = lsoVar;
        this.R = kdaVar;
        this.S = youTubePlayerOverlaysLayout;
        this.T = kctVar;
        this.j = ypaVar;
        this.U = adltVar;
        this.k = fluVar;
        this.V = axpgVar;
        this.W = gfzVar;
        this.l = ahqrVar;
        this.ai = ahwyVar;
        this.m = acraVar;
        this.X = nymVar;
        this.n = axpgVar2;
        this.F = kchVar;
        this.o = azrwVar5;
        this.Y = set;
        this.Z = ongVar;
        this.p = aiocVar;
        this.q = zazVar;
        this.r = flnVar;
        this.aa = azrwVar6;
        this.ab = oqiVar;
        this.s = azrsVar;
        this.ak = lkbVar;
        this.t = aifkVar;
        this.ac = azrwVar7;
        this.u = gopVar;
        this.G = omxVar;
        this.aj = nbmVar;
        this.v = slrVar;
        this.ae = axpgVar3;
    }

    @Override // defpackage.ety
    @Deprecated
    public final zcd a() {
        return this.ag.c;
    }

    @Override // defpackage.ety
    public final acra d() {
        return this.m;
    }

    @Override // defpackage.ety
    @Deprecated
    public final aifp e() {
        if (this.ah == null) {
            this.ah = new aifp(this.c.a(1), this.c.a(2), this.ag.d, this.c.a(0));
        }
        return this.ah;
    }

    @Override // defpackage.ety, defpackage.nnb
    public final void f() {
        this.c.h(true);
    }

    @Override // defpackage.ety
    public final void g(fhd fhdVar) {
        m(fhdVar, Optional.empty());
    }

    @Override // defpackage.ety
    public final boolean h() {
        return this.d.g().b();
    }

    @Override // defpackage.ety
    public final boolean i() {
        fhg g = this.d.g();
        return g.i() || g.b();
    }

    @Override // defpackage.ety
    public final boolean j() {
        return this.d.g().k();
    }

    @Override // defpackage.ety, defpackage.fgo
    public final boolean k() {
        return this.d.g().h();
    }

    @Override // defpackage.flm
    public final void kG() {
        this.ad.c();
    }

    @Override // defpackage.flm
    public final void kH() {
        x();
        this.ad.g(this.Q.kI(this.p));
    }

    @Override // defpackage.ety
    public final boolean l() {
        return this.d.g().m();
    }

    @Override // defpackage.etz
    public final void m(fhd fhdVar, Optional optional) {
        this.B = null;
        WatchDescriptor watchDescriptor = fhdVar.a;
        PlaybackStartDescriptor playbackStartDescriptor = watchDescriptor.a;
        if ((this.U.g() != null || this.U.o()) && !adtt.a(playbackStartDescriptor.k())) {
            atax ataxVar = this.D.b().n;
            if (ataxVar == null) {
                ataxVar = atax.a;
            }
            if (!ataxVar.l && !((owl) watchDescriptor.b.instance).g) {
                if (this.aj.b()) {
                    this.B = fhdVar;
                    return;
                }
                WatchDescriptor watchDescriptor2 = fhdVar.a;
                amkq.O(!this.aj.b(), "showRemoteWatchDialogFragment called while paused.");
                ((ixk) this.ac.get()).a(watchDescriptor2, this.a.getSupportFragmentManager());
                this.j.d(new ahda());
                return;
            }
        }
        ojc ojcVar = (ojc) this.aa.get();
        if (ojcVar.b) {
            ojcVar.e(fhdVar, optional);
        } else {
            ojcVar.c = fhdVar;
        }
    }

    @Override // defpackage.ahor
    public final void n(boolean z) {
        if (z) {
            this.c.i();
        } else {
            this.c.p();
        }
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oQ(fhg fhgVar) {
    }

    @Override // defpackage.fgp
    public final void oR(fhg fhgVar, fhg fhgVar2) {
        x();
        if (fhgVar.b() != fhgVar2.b()) {
            this.a.mF();
            this.a.closeOptionsMenu();
            View view = this.af;
            if (view != null) {
                zev.d(view);
            }
        }
        if (this.C != null && fhgVar2 == fhg.NONE) {
            this.C.d.sendEmptyMessage(1);
        }
        if (!i()) {
            this.b.p = false;
            PaneDescriptor a = ((giv) this.I.get()).a();
            if (a != null && this.ak.m(a) && !this.L.l()) {
                ((giv) this.I.get()).d(((gji) this.H.get()).k());
            }
        }
        this.M.d();
    }

    @Override // defpackage.nnc
    public final void p(boolean z) {
        if (z) {
            this.c.b();
        } else {
            this.c.c();
        }
    }

    @Override // defpackage.jgf
    public final void pk() {
        this.c.h(false);
    }

    @Override // defpackage.jgf
    public final void pl(boolean z) {
        this.c.l(z);
    }

    @Override // defpackage.nnd
    public final void q() {
        if (k()) {
            this.c.l(true);
        }
    }

    @Override // defpackage.nne
    public final void r(int i, int i2) {
        if (i != 2 || k()) {
            this.c.m(i2 + (-1) == 0);
        }
    }

    public final void s(View view, ViewGroup viewGroup, fxn fxnVar, Bundle bundle) {
        if (bundle != null) {
            this.z = bundle.getBoolean("IS_IN_PICTURE_IN_PICTURE", false);
        }
        this.af = view;
        this.q.e(this);
        InlinePlayerLayout inlinePlayerLayout = (InlinePlayerLayout) this.a.findViewById(R.id.inline_player_container);
        this.ag = inlinePlayerLayout;
        axpg axpgVar = this.ae;
        if (Build.VERSION.SDK_INT > 30) {
            inlinePlayerLayout.setWillNotDraw(false);
            inlinePlayerLayout.a = new EdgeEffect(inlinePlayerLayout.getContext());
            inlinePlayerLayout.b = new EdgeEffect(inlinePlayerLayout.getContext());
            ((njx) axpgVar.get()).b(1, inlinePlayerLayout, inlinePlayerLayout.a);
            ((njx) axpgVar.get()).b(3, inlinePlayerLayout, inlinePlayerLayout.b);
        }
        zcd zcdVar = this.ag.c;
        viewGroup.getClass();
        View a = zcdVar.a();
        zcdVar.d();
        zcdVar.a = viewGroup;
        if (a != null) {
            zcdVar.c(a);
        }
        if (evr.aC(this.D)) {
            InlinePlayerOverlayLayout inlinePlayerOverlayLayout = (InlinePlayerOverlayLayout) ((ViewStub) this.a.findViewById(R.id.inline_player_overlay_container_stub)).inflate();
            InlinePlayerLayout inlinePlayerLayout2 = this.ag;
            if (inlinePlayerLayout2 != null) {
                inlinePlayerLayout2.e = inlinePlayerOverlayLayout;
                inlinePlayerOverlayLayout.a = inlinePlayerLayout2.c;
                inlinePlayerOverlayLayout.addView(inlinePlayerOverlayLayout.d);
            }
        }
        this.c.k(view, this.N);
        fxnVar.a(this.c);
        ((ojc) this.aa.get()).a(new oob(this));
        if (this.ag != null) {
            kda kdaVar = this.R;
            flr g = this.c.g();
            InlinePlayerLayout inlinePlayerLayout3 = this.ag;
            View findViewById = this.a.findViewById(R.id.player_fragment_container);
            YouTubePlayerOverlaysLayout youTubePlayerOverlaysLayout = this.S;
            kdaVar.d = new flr[2];
            kdaVar.a = 0;
            kdaVar.b = findViewById;
            kdaVar.c = youTubePlayerOverlaysLayout;
            flr[] flrVarArr = kdaVar.d;
            g.getClass();
            flrVarArr[0] = g;
            inlinePlayerLayout3.getClass();
            flrVarArr[1] = inlinePlayerLayout3;
            flrVarArr[0].b(findViewById, youTubePlayerOverlaysLayout);
        }
        kct kctVar = this.T;
        kch kchVar = this.F;
        kchVar.getClass();
        amkq.N(kctVar.a == null);
        kctVar.a = kchVar;
        this.d.i(this);
        this.d.i(this.R);
        InlinePlayerLayout inlinePlayerLayout4 = this.ag;
        if (inlinePlayerLayout4 != null) {
            this.d.i(inlinePlayerLayout4);
        }
        this.d.i(this.k);
        this.d.i(this.Z);
        kbv kbvVar = this.e;
        if (kbvVar instanceof OfflineSlimStatusBarConnectivityController) {
            this.d.i((OfflineSlimStatusBarConnectivityController) kbvVar);
        }
        this.l.i();
        x();
        this.x.g(this.ai.kI(this.p));
        this.f251J.m(this.af);
        this.K.m(this.af);
        this.C = (InlinePlaybackController) this.V.get();
        gfz gfzVar = this.W;
        AccessibilityStateReceiver accessibilityStateReceiver = gfzVar.c;
        accessibilityStateReceiver.i();
        accessibilityStateReceiver.a.add(gfzVar);
        gfzVar.b.g(gfzVar);
        gfzVar.d.c(gfzVar);
        gfzVar.b.f(gfzVar);
        gfzVar.f = gfzVar.a.getResources().getConfiguration().orientation == 1;
        ((jgb) this.n.get()).b();
        Iterator it = this.Y.iterator();
        while (it.hasNext()) {
            ((fks) it.next()).l();
        }
        this.r.a(this);
    }

    public final void t(boolean z) {
        ahos ahosVar = (ahos) this.P.get();
        ahosVar.h = z;
        ahoq ahoqVar = ahosVar.e;
        if (ahoqVar != null) {
            ahoqVar.b(ahosVar.j());
        }
        this.ab.a();
    }

    public final void u(boolean z) {
        this.A = this.z != z;
        if (z) {
            this.s.c(true);
        }
        y(z);
        if (!z) {
            this.s.c(false);
        }
        this.g.i(z);
    }

    public final void v() {
        this.A = false;
    }

    @Override // defpackage.zbk
    public final void w() {
        if (this.d.g().g()) {
            ((ahhc) this.O.get()).j();
            return;
        }
        if (h()) {
            euc eucVar = this.a;
            boolean z = false;
            if (Build.VERSION.SDK_INT >= 24 && eucVar.isInMultiWindowMode()) {
                z = true;
            }
            boolean z2 = !this.q.m();
            if (z || z2) {
                return;
            }
            this.F.get().m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void x() {
        if (this.c != null) {
            if (this.d.g().d()) {
                this.l.t(this.a.mM());
            } else {
                this.l.s(this.m);
            }
        }
        nym nymVar = this.X;
        nymVar.a.i(nymVar);
    }

    public final void y(boolean z) {
        if (this.A) {
            if (z) {
                this.c.i();
                this.h.c();
                this.v.a();
                return;
            }
            this.c.p();
        }
    }
}
