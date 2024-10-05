package defpackage;

import android.content.res.Configuration;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ony implements gjd, gjb, giz, fxh, gji {
    private final nbm A;
    private final lkb B;
    private final lkb C;
    private final lkb D;
    private final axzg E;
    private final lkb F;
    private final lkb G;
    public final gje a;
    public PaneDescriptor b;
    public int c = 1;
    private final euc d;
    private final ScrollSelectionController e;
    private final okf f;
    private final kbv g;
    private final fcw h;
    private final ong i;
    private final fxj j;
    private final aaea k;
    private final azrw l;
    private final azrw m;
    private final azrw n;
    private final azrw o;
    private final azrw p;
    private final iyq q;
    private final its r;
    private final azrw s;
    private final okw t;
    private fzb u;
    private lza v;
    private View w;
    private final lso x;
    private final aadw y;
    private final rxm z;

    public ony(euc eucVar, gje gjeVar, ScrollSelectionController scrollSelectionController, okf okfVar, rxm rxmVar, kbv kbvVar, fcw fcwVar, lso lsoVar, ong ongVar, fxj fxjVar, aaea aaeaVar, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, lkb lkbVar, iyq iyqVar, its itsVar, lkb lkbVar2, lkb lkbVar3, lkb lkbVar4, lkb lkbVar5, azrw azrwVar6, nbm nbmVar, aadw aadwVar, okw okwVar, axzg axzgVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.e = scrollSelectionController;
        this.d = eucVar;
        this.a = gjeVar;
        this.f = okfVar;
        this.z = rxmVar;
        this.g = kbvVar;
        this.h = fcwVar;
        this.x = lsoVar;
        this.i = ongVar;
        this.j = fxjVar;
        this.k = aaeaVar;
        this.l = azrwVar;
        this.m = azrwVar2;
        this.n = azrwVar3;
        this.o = azrwVar4;
        this.p = azrwVar5;
        this.F = lkbVar;
        this.q = iyqVar;
        this.r = itsVar;
        this.D = lkbVar2;
        this.C = lkbVar3;
        this.B = lkbVar4;
        this.G = lkbVar5;
        this.s = azrwVar6;
        this.A = nbmVar;
        this.y = aadwVar;
        this.t = okwVar;
        this.E = axzgVar;
    }

    private final void x() {
        int Q;
        PaneDescriptor d = this.a.d();
        if (d == null) {
            return;
        }
        View view = this.w;
        if (view != null) {
            if (evr.bW(d.e(), this.k) - 1 == 3) {
                Q = wbs.Q(new ContextThemeWrapper(this.d, R.style.Theme_YouTube_Dark_Home), R.attr.ytBrandBackgroundSolid);
            } else {
                Q = wbs.Q(this.d, R.attr.ytBrandBackgroundSolid);
            }
            view.setBackgroundColor(Q);
        }
        if (this.C.d(d)) {
            this.h.a.d(new fcp());
        } else if (!this.G.m(d) && !this.r.h(d)) {
            this.h.a();
        }
        if (!((Boolean) this.E.v().aC(false)).booleanValue()) {
            this.e.i(null);
        }
        this.x.b();
        fzb fzbVar = this.u;
        if (fzbVar != null && !this.r.e(d)) {
            fzbVar.g();
        }
        ((ooc) this.l.get()).x();
    }

    @Override // defpackage.giv
    public final PaneDescriptor a() {
        return r();
    }

    @Override // defpackage.gjd
    public final void aJ(gjf gjfVar) {
        if (this.a.d() == null) {
            return;
        }
        x();
        int i = gjfVar.c;
        if (i == 0) {
            this.g.m(1 == ((this.c & 1) ^ 1));
        } else if (i == 1 || i == 2) {
            this.g.m(false);
        }
    }

    @Override // defpackage.giv
    public final aypy b() {
        return this.a.h();
    }

    @Override // defpackage.giv
    public final void c(boolean z) {
        if (this.a.J()) {
            return;
        }
        if (z) {
            this.d.finish();
        } else {
            v(k(), this.c | 2);
        }
    }

    @Override // defpackage.giv
    public final void d(PaneDescriptor paneDescriptor) {
        paneDescriptor.getClass();
        v(paneDescriptor, this.c | 1);
    }

    @Override // defpackage.fxh
    public final void e(Configuration configuration) {
        gir l = l();
        if (l == null) {
            return;
        }
        int aK = l.aK();
        if ((Math.min(configuration.screenWidthDp, configuration.screenHeightDp) < aK || l.bb()) && (Math.min(configuration.screenWidthDp, configuration.screenHeightDp) >= aK || !l.bb())) {
            return;
        }
        this.a.u();
    }

    @Override // defpackage.giz
    public final void f(int i, int i2) {
        if (this.a.d() == null) {
            return;
        }
        x();
        this.g.m(false);
    }

    @Override // defpackage.gjb
    public final void g(gir girVar) {
        lza lzaVar = this.v;
        if (lzaVar != null) {
            lzaVar.g(girVar);
        }
        this.d.mF();
        ((fzb) this.s.get()).j();
    }

    @Override // defpackage.gjc
    public final int h(PaneDescriptor paneDescriptor) {
        okw okwVar = this.t;
        ammv i = ammv.i(etx.w(paneDescriptor));
        if (!okwVar.d.E()) {
            return 1;
        }
        if (okwVar.a.isTaskRoot() || ((onk) okwVar.b.get()).f) {
            if (paneDescriptor != null && !okwVar.f.m(paneDescriptor) && !okwVar.e.l(paneDescriptor) && !paneDescriptor.k()) {
                oor oorVar = (oor) okwVar.c.get();
                oorVar.getClass();
                if (((Boolean) i.b(new onx(oorVar, 1)).e(true)).booleanValue()) {
                }
            }
            return 0;
        }
        return 1;
    }

    @Override // defpackage.gjc
    public final gix i(gix gixVar) {
        boolean z = true;
        int i = this.c & 1;
        if (((ooc) this.l.get()).i() && i != 0) {
            this.f.m(true);
        }
        if (gixVar.b != 0) {
            return gixVar;
        }
        PaneDescriptor d = this.a.d();
        PaneDescriptor paneDescriptor = gixVar.a;
        ammv i2 = ammv.i(etx.w(paneDescriptor));
        if ((this.c & 2) == 0 && !this.r.l(paneDescriptor) && (paneDescriptor == null || !paneDescriptor.k())) {
            oor oorVar = (oor) this.n.get();
            oorVar.getClass();
            if (!((Boolean) i2.b(new onx(oorVar, 0)).e(false)).booleanValue() && !gixVar.c) {
                z = false;
            }
        }
        if (d != null && d.equals(paneDescriptor) && !this.B.b(d) && (!this.r.e(d) || !its.d(d.e(), "SPunlimited"))) {
            if (z) {
                this.a.v();
            }
            giw a = gixVar.a();
            a.c(-1);
            return a.a();
        }
        ((oor) this.n.get()).p(paneDescriptor);
        giw a2 = gixVar.a();
        a2.b(z);
        return a2.a();
    }

    @Override // defpackage.gjc
    public final boolean j(PaneDescriptor paneDescriptor, PaneDescriptor paneDescriptor2) {
        ammy ammyVar = paneDescriptor2.c;
        if ((ammyVar != null && ammyVar.a(paneDescriptor)) || paneDescriptor.equals(paneDescriptor2) || paneDescriptor2.k() || this.r.l(paneDescriptor2) || this.G.m(paneDescriptor)) {
            return true;
        }
        if (this.D.h(paneDescriptor) && this.D.h(paneDescriptor2)) {
            return true;
        }
        if (this.r.g(paneDescriptor) && this.r.g(paneDescriptor2)) {
            return true;
        }
        if (this.B.b(paneDescriptor)) {
            if (paneDescriptor2.b.getBoolean("preserve_search_nav_history", false)) {
                return false;
            }
            apxf e = paneDescriptor.e();
            if (e != null && !((aunn) e.pX(SearchEndpointOuterClass.searchEndpoint)).f.isEmpty()) {
                return true;
            }
            if (this.B.b(paneDescriptor2)) {
                String g = paneDescriptor.g("search_query");
                return g != null && g.equals(paneDescriptor2.g("search_query"));
            }
        }
        return paneDescriptor.b.getBoolean("no_history", false);
    }

    @Override // defpackage.gji
    public final PaneDescriptor k() {
        PaneDescriptor b;
        if (!this.z.a) {
            return s();
        }
        if (((fjs) this.p.get()).h()) {
            if (evr.ap(this.y)) {
                iyq iyqVar = this.q;
                aone createBuilder = aplt.a.createBuilder();
                createBuilder.copyOnWrite();
                aplt apltVar = (aplt) createBuilder.instance;
                apltVar.b = 1 | apltVar.b;
                apltVar.c = "FElibrary";
                aplt apltVar2 = (aplt) createBuilder.build();
                aong aongVar = (aong) apxf.a.createBuilder();
                aongVar.e(BrowseEndpointOuterClass.browseEndpoint, apltVar2);
                return iyqVar.a((apxf) aongVar.build());
            }
            if (yjk.O(this.d) == 4) {
                lkb lkbVar = this.F;
                aone createBuilder2 = aplt.a.createBuilder();
                createBuilder2.copyOnWrite();
                aplt apltVar3 = (aplt) createBuilder2.instance;
                apltVar3.b = 1 | apltVar3.b;
                apltVar3.c = "FElibrary";
                aplt apltVar4 = (aplt) createBuilder2.build();
                aong aongVar2 = (aong) apxf.a.createBuilder();
                aongVar2.e(BrowseEndpointOuterClass.browseEndpoint, apltVar4);
                return lkbVar.k((apxf) aongVar2.build());
            }
            return this.D.e();
        }
        fap fapVar = (fap) this.o.get();
        try {
            if (!((fjs) this.p.get()).h()) {
                b = this.r.b(aahg.d("FEwhat_to_watch"), true);
            } else {
                fapVar.g();
                b = this.r.b(aahg.d("FElibrary"), true);
            }
            return b;
        } catch (IOException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb.append("Failed to get offline response: ");
            sb.append(valueOf);
            zga.b(sb.toString());
            return s();
        }
    }

    @Override // defpackage.gji
    public final gir l() {
        return this.a.f();
    }

    @Override // defpackage.gji
    public final gir m() {
        gir l = l();
        if (l == null) {
            return null;
        }
        if (evr.bA()) {
            if (!l.av()) {
                return null;
            }
        } else if (!l.at()) {
            return null;
        }
        return l;
    }

    @Override // defpackage.gji
    public final String n() {
        gir m = m();
        if (m != null) {
            PaneDescriptor.b(m);
            apxf e = PaneDescriptor.b(m).e();
            if (e != null && e.pY(SearchEndpointOuterClass.searchEndpoint)) {
                return ((aunn) e.pX(SearchEndpointOuterClass.searchEndpoint)).f;
            }
        }
        return null;
    }

    @Override // defpackage.gji
    public final void o() {
        this.a.v();
    }

    @Override // defpackage.gji
    public final void p() {
        this.a.w();
    }

    @Override // defpackage.gji
    public final void q() {
        w(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final PaneDescriptor r() {
        return this.a.d();
    }

    final PaneDescriptor s() {
        return this.r.b(aahg.a("FEwhat_to_watch"), true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t(int... iArr) {
        for (int i = 0; i <= 0; i++) {
            this.c = iArr[i] | this.c;
        }
    }

    public final void u(lza lzaVar, fzb fzbVar) {
        this.u = fzbVar;
        this.v = lzaVar;
        this.a.m(lzaVar);
        this.a.B(this);
        this.a.m(this);
        this.a.l(this);
        this.a.l(this.i);
        this.a.k(this);
        this.a.K(new onw(this));
        this.a.A(this.d.getClassLoader());
        this.j.f(this);
        this.w = this.d.findViewById(R.id.pane_fragment_container);
    }

    public final void v(PaneDescriptor paneDescriptor, int i) {
        boolean m = this.G.m(paneDescriptor);
        ook ookVar = (ook) this.m.get();
        if (!this.A.b() && (m || ookVar.l != 0)) {
            int i2 = this.c;
            this.c = i;
            if (paneDescriptor.b.getBoolean("detail_pane", false)) {
                this.a.r(paneDescriptor);
            } else {
                this.a.H(paneDescriptor);
            }
            this.c = i2;
            return;
        }
        this.b = paneDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w(boolean z) {
        PaneDescriptor r = r();
        int i = true != z ? 0 : 2;
        PaneDescriptor paneDescriptor = this.b;
        if (paneDescriptor != null) {
            v(paneDescriptor, this.c | i);
            this.b = null;
        } else if (z || r == null || this.G.m(r)) {
            v(k(), (this.c | i) & (-2));
        }
    }
}
