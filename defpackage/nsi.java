package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.youtube.app.watch.engagementpanel.LinearScrollToItemLayoutManager;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nsi extends noq implements ajxa, nqe, nqf, flm, ypd {
    private final nsm A;
    private final etv B;
    private final int C;
    private final fln D;
    private Cfor E;
    private nqb F;
    private aamd G;
    private final Set H;
    private nqd I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f246J;
    private View K;
    private boolean L;
    private boolean M;
    private final boolean N;
    private final boolean O;
    private auop P;
    private lo Q;
    private final lwk R;
    private final akht S;
    private final c T;
    private final ajyw U;
    private final aoae V;
    private final ajoy W;
    public final nrn d;
    public final ayqw e;
    public LoadingFrameLayout f;
    public SwipeRefreshLayout g;
    public RecyclerView h;
    public ajwi i;
    public nqa j;
    public LinearScrollToItemLayoutManager k;
    public final nsq l;
    public final azqy m;
    public ntp n;
    public final ajyw o;
    private final Context p;
    private final aasm q;
    private final azrw r;
    private final azrw s;
    private final azrw t;
    private final nrp v;
    private final sxw w;
    private final ypa x;
    private final aahd y;
    private final Set z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsi(Context context, acra acraVar, nrp nrpVar, azrw azrwVar, ajoy ajoyVar, azrw azrwVar2, azrw azrwVar3, akht akhtVar, ajyw ajywVar, c cVar, lwk lwkVar, ajyw ajywVar2, sxw sxwVar, aoae aoaeVar, ypa ypaVar, aahd aahdVar, nrn nrnVar, aadw aadwVar, aaea aaeaVar, nsq nsqVar, etv etvVar, fln flnVar, c cVar2, aasm aasmVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        super(acraVar, aaeaVar);
        nsm b = cVar2.b(acraVar);
        this.p = context;
        this.v = nrpVar;
        this.r = azrwVar;
        this.W = ajoyVar;
        this.s = azrwVar2;
        this.t = azrwVar3;
        this.S = akhtVar;
        this.U = ajywVar;
        this.T = cVar;
        this.R = lwkVar;
        this.o = ajywVar2;
        this.q = aasmVar;
        this.w = sxwVar;
        this.V = aoaeVar;
        this.x = ypaVar;
        this.y = aahdVar;
        this.d = nrnVar;
        this.l = nsqVar;
        this.z = new aeb();
        this.e = new ayqw();
        this.D = flnVar;
        apxs apxsVar = aadwVar.b().z;
        this.N = (apxsVar == null ? apxs.a : apxsVar).h;
        asvu asvuVar = aadwVar.b().e;
        this.O = (asvuVar == null ? asvu.a : asvuVar).cM;
        this.C = context.getResources().getDimensionPixelSize(R.dimen.engagement_panel_scroll_cancel_padding);
        this.L = true;
        this.A = b;
        this.B = etvVar;
        this.m = azqy.ap();
        this.H = new HashSet();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.nop, defpackage.nqg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(defpackage.aqts r4, defpackage.apxf r5, boolean r6) {
        /*
            r3 = this;
            r4.getClass()
            aqts r0 = r3.b
            if (r0 == 0) goto L32
            aqtr r1 = r4.f
            if (r1 != 0) goto Ld
            aqtr r1 = defpackage.aqtr.a
        Ld:
            aqtr r2 = r0.f
            if (r2 != 0) goto L13
            aqtr r2 = defpackage.aqtr.a
        L13:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L32
            aqtq r1 = r4.g
            if (r1 != 0) goto L1f
            aqtq r1 = defpackage.aqtq.a
        L1f:
            aqtq r0 = r0.g
            if (r0 != 0) goto L25
            aqtq r0 = defpackage.aqtq.a
        L25:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2c
            goto L32
        L2c:
            asht r6 = r3.c
            super.q(r4, r6)
            goto L51
        L32:
            java.util.Set r0 = r3.z
            r0.clear()
            asht r0 = r3.c
            r3.q(r4, r0)
            if (r6 == 0) goto L43
            ajwi r4 = r3.i
            r4.l()
        L43:
            ajwi r4 = r3.i
            aamd r6 = r3.G
            r4.M(r6)
            ajwi r4 = r3.i
            boolean r6 = r3.L
            r4.P(r6)
        L51:
            if (r5 == 0) goto L8d
            boolean r4 = r3.M
            if (r4 == 0) goto L88
            nsm r4 = r3.A
            r4.d()
            nsm r4 = r3.A
            r4.f()
            aqts r4 = r3.b
            r4.getClass()
            nsm r6 = r3.A
            asht r0 = r3.c
            r6.g(r4, r0)
            nsm r4 = r3.A
            r4.e(r5)
            java.util.Set r4 = r3.z
            java.util.Iterator r4 = r4.iterator()
        L78:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L8d
            java.lang.Object r5 = r4.next()
            nrg r5 = (defpackage.nrg) r5
            r5.oX()
            goto L78
        L88:
            nsm r4 = r3.A
            r4.f()
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nsi.A(aqts, apxf, boolean):void");
    }

    @Override // defpackage.nqg
    public final void B() {
        Iterator it = this.z.iterator();
        while (it.hasNext()) {
            ((nrg) it.next()).oT();
        }
        this.z.clear();
        ajwi ajwiVar = this.i;
        if (ajwiVar != null) {
            ajwiVar.j();
        }
        Cfor cfor = this.E;
        if (cfor != null) {
            cfor.b();
        }
        this.D.b(this);
        this.x.m(this);
        aqts aqtsVar = this.b;
        if (aqtsVar != null && (aqtsVar.c & 32768) != 0) {
            aahd aahdVar = this.y;
            apxf apxfVar = aqtsVar.r;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.a(apxfVar);
        }
        this.A.c();
    }

    @Override // defpackage.nqg
    public final void C() {
        String i;
        this.A.d();
        this.M = false;
        this.g.l(false);
        this.g.clearAnimation();
        aqts aqtsVar = this.b;
        if (aqtsVar != null) {
            this.y.b(aqtsVar.p);
        }
        Iterator it = this.z.iterator();
        while (it.hasNext()) {
            ((nrg) it.next()).d();
        }
        if (aqtsVar != null && (i = oba.i(aqtsVar)) != null && this.V.H(i)) {
            this.V.G(i);
        }
        this.e.c();
    }

    @Override // defpackage.nqg
    public final void D(apxf apxfVar) {
        aqts aqtsVar = this.b;
        aqtsVar.getClass();
        this.A.e(apxfVar);
        this.M = true;
        this.y.b(aqtsVar.o);
        for (nrg nrgVar : this.z) {
            nrgVar.h();
            nrgVar.oX();
        }
        this.e.c();
        String i = oba.i(aqtsVar);
        if (i != null) {
            this.l.g(aqtsVar);
            this.e.d(this.d.a(aqtsVar).i(aypg.LATEST).h(oba.f(this.l.a())).s(new nsg(i, 2)).X(new nsf(this, 0)));
            if (aqtsVar.t) {
                this.V.F(i);
            }
        }
        if (this.N) {
            this.B.b();
        }
        auop auopVar = null;
        if (apxfVar.pY(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)) {
            ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) apxfVar.pX(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint);
            autu autuVar = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.l;
            if (autuVar == null) {
                autuVar = autu.a;
            }
            if (autuVar.b == 3) {
                autu autuVar2 = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.l;
                if (autuVar2 == null) {
                    autuVar2 = autu.a;
                }
                if (autuVar2.b == 3) {
                    auopVar = (auop) autuVar2.c;
                } else {
                    auopVar = auop.a;
                }
            }
        } else if (apxfVar.pY(ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.toggleEngagementPanelCommand)) {
            ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand = (ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand) apxfVar.pX(ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.toggleEngagementPanelCommand);
            autu autuVar3 = toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.e;
            if (autuVar3 == null) {
                autuVar3 = autu.a;
            }
            if (autuVar3.b == 3) {
                autu autuVar4 = toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.e;
                if (autuVar4 == null) {
                    autuVar4 = autu.a;
                }
                if (autuVar4.b == 3) {
                    auopVar = (auop) autuVar4.c;
                } else {
                    auopVar = auop.a;
                }
            }
        }
        this.P = auopVar;
    }

    @Override // defpackage.nqe
    public final void E(ajce ajceVar) {
        ajwi ajwiVar = this.i;
        if (ajwiVar != null) {
            ajwiVar.lt(ajceVar);
        }
    }

    @Override // defpackage.nqg
    public final void F(nqd nqdVar) {
        this.I = nqdVar;
    }

    @Override // defpackage.nqf
    public final void G() {
        ajwi ajwiVar = this.i;
        if (ajwiVar == null) {
            return;
        }
        ajwiVar.lo();
    }

    public final void H(int i) {
        LinearScrollToItemLayoutManager linearScrollToItemLayoutManager = this.k;
        if (linearScrollToItemLayoutManager == null) {
            return;
        }
        this.l.i();
        linearScrollToItemLayoutManager.bA(this.h, i);
    }

    @Override // defpackage.noq
    public final LoadingFrameLayout a() {
        LoadingFrameLayout loadingFrameLayout = this.f;
        loadingFrameLayout.getClass();
        return loadingFrameLayout;
    }

    @Override // defpackage.nqg
    public final nqb b() {
        return this.F;
    }

    @Override // defpackage.noq
    public final Optional d() {
        RecyclerView recyclerView = this.h;
        recyclerView.getClass();
        return Optional.of(recyclerView);
    }

    @Override // defpackage.noq
    public final void g(nrg nrgVar) {
        this.z.add(nrgVar);
    }

    @Override // defpackage.noq
    public final void h(ntp ntpVar) {
        this.n = ntpVar;
    }

    @Override // defpackage.noq
    public final void i(lo loVar) {
        if (this.Q == null) {
            this.h.aD(loVar);
            this.Q = loVar;
        }
    }

    @Override // defpackage.flm
    public final void kG() {
        ntp ntpVar = this.n;
        if (ntpVar != null) {
            ntpVar.i();
        }
    }

    @Override // defpackage.flm
    public final void kH() {
        ntp ntpVar = this.n;
        if (ntpVar != null) {
            ntpVar.l();
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ajtr.class, ajtv.class, ajtw.class};
        }
        if (i == 0) {
            LoadingFrameLayout loadingFrameLayout = this.f;
            if (loadingFrameLayout.e != 1) {
                return null;
            }
            loadingFrameLayout.a();
            return null;
        }
        if (i == 1) {
            ajtv ajtvVar = (ajtv) obj;
            LoadingFrameLayout loadingFrameLayout2 = this.f;
            if (loadingFrameLayout2.e != 1) {
                return null;
            }
            loadingFrameLayout2.b(ajtvVar.c(), ajtvVar.d());
            return null;
        }
        if (i == 2) {
            if (!((ajtw) obj).c() || this.g.b) {
                return null;
            }
            this.f.c();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.ajxa
    public final void lo() {
        this.i.lo();
    }

    @Override // defpackage.ajxa
    public final boolean lp() {
        return false;
    }

    @Override // defpackage.nqg
    public final void n() {
        nqd nqdVar = this.I;
        if (nqdVar != null) {
            nqdVar.a();
        }
        Iterator it = this.z.iterator();
        while (it.hasNext()) {
            ((nrg) it.next()).oS();
        }
        lo loVar = this.Q;
        if (loVar != null) {
            this.h.aF(loVar);
            this.Q = null;
            this.K = null;
        }
        aqts aqtsVar = this.b;
        if (aqtsVar != null && (aqtsVar.c & 16384) != 0) {
            aahd aahdVar = this.y;
            apxf apxfVar = aqtsVar.q;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.a(apxfVar);
        }
        this.l.j();
        if (this.N) {
            this.B.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [ajos, java.lang.Object] */
    @Override // defpackage.nqg
    public final void o(apxf apxfVar) {
        if (this.g == null) {
            RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(this.p).inflate(R.layout.section_list, (ViewGroup) null, false);
            this.h = recyclerView;
            recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: nsb
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    nsi nsiVar = nsi.this;
                    int abs = Math.abs(i3 - i);
                    int abs2 = Math.abs(i4 - i2);
                    azqy azqyVar = nsiVar.m;
                    boolean z = false;
                    if (view.getVisibility() == 0 && abs > 0 && abs2 > 0) {
                        z = true;
                    }
                    azqyVar.c(Boolean.valueOf(z));
                }
            });
            LinearScrollToItemLayoutManager q = LinearScrollToItemLayoutManager.q(this.p);
            this.k = q;
            this.h.af(q);
            xu xuVar = (xu) this.h.E;
            if (xuVar != null) {
                xuVar.x();
            }
            SwipeRefreshLayout swipeRefreshLayout = new SwipeRefreshLayout(this.p);
            this.g = swipeRefreshLayout;
            swipeRefreshLayout.j(wbs.W(this.p, R.attr.ytTextPrimary).orElse(-16777216));
            this.g.k(wbs.W(this.p, R.attr.ytTextPrimaryInverse).orElse(-1));
            this.g.setBackgroundColor(wbs.W(this.p, R.attr.ytBrandBackgroundSolid).orElse(-16777216));
            this.g.addView(this.h);
            LoadingFrameLayout loadingFrameLayout = new LoadingFrameLayout(this.p);
            this.f = loadingFrameLayout;
            loadingFrameLayout.addView(this.g);
            nqa nqaVar = this.j;
            if (nqaVar != null) {
                this.f.addView(((npz) nqaVar).a);
            }
            this.f.f(new akdd() { // from class: nsd
                @Override // defpackage.akdd
                public final void qJ() {
                    nsi.this.i.ln();
                }
            });
            this.E = this.W.K(this.g);
            lwk lwkVar = this.R;
            RecyclerView recyclerView2 = this.h;
            aasm aasmVar = this.q;
            gmk b = lwkVar.b(recyclerView2, aasmVar, this.v.a(aasmVar, this.a, this), this.a, ((ajvb) this.r.get()).get(), this, this.E, ajhb.ENGAGEMENT, this.w, this.p, nsm.a());
            this.i = b;
            this.E.d(b);
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                this.i.u((ajol) it.next());
            }
            this.H.clear();
            this.l.e(this.f, this.h);
            this.i.y(new nsh(this));
        }
        this.x.i(this, this.i.G);
        this.i.M(this.G);
        this.i.P(this.L);
        this.F.h(this);
        this.D.a(this);
        this.A.b();
    }

    @Override // defpackage.nqg
    public final View oO() {
        return this.f;
    }

    @Override // defpackage.nqg
    public final void oP(ajol ajolVar) {
        if (ajolVar == null) {
            return;
        }
        ajwi ajwiVar = this.i;
        if (ajwiVar != null) {
            ajwiVar.u(ajolVar);
        } else {
            this.H.add(ajolVar);
        }
    }

    @Override // defpackage.nop, defpackage.nqg
    public final void p() {
        final auop auopVar = this.P;
        if (auopVar == null) {
            return;
        }
        if ((auopVar.b & 1) != 0) {
            this.h.requestLayout();
            this.m.s(niy.h).V(false).h(niy.i).e().R(new ayrm() { // from class: nse
                @Override // defpackage.ayrm
                public final void a() {
                    nsi nsiVar = nsi.this;
                    auop auopVar2 = auopVar;
                    nsiVar.i.v(auopVar2.c, (auopVar2.b & 4) != 0 ? auopVar2.d : 0, null);
                }
            });
        }
        this.P = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.nop, defpackage.nqg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(defpackage.aqts r5, defpackage.asht r6) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nsi.q(aqts, asht):void");
    }

    @Override // defpackage.nop, defpackage.nqg
    public final void r(boolean z) {
        this.f246J = z;
    }

    @Override // defpackage.nop, defpackage.nqg
    public final boolean s() {
        return this.E.b != 3;
    }

    @Override // defpackage.nop, defpackage.nqg
    public final boolean w(aqts aqtsVar, apxf apxfVar) {
        A(aqtsVar, apxfVar, true);
        return true;
    }

    @Override // defpackage.nop, defpackage.nqg
    public final boolean x() {
        aqts aqtsVar = this.b;
        if (aqtsVar == null) {
            return true;
        }
        int bm = aocz.bm(aqtsVar.n);
        if (bm == 0) {
            bm = 1;
        }
        int i = bm - 1;
        if (i != 2) {
            return i != 3;
        }
        wd wdVar = this.h.n;
        View view = this.K;
        if (view == null || (wdVar != null && wd.bm(view) != 0)) {
            this.K = wdVar.S(0);
        }
        View view2 = this.K;
        return view2 == null || view2.getTop() < (-this.C);
    }

    @Override // defpackage.nop, defpackage.nqg
    public final boolean y() {
        return this.f246J;
    }
}
