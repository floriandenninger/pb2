package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.watch.engagementpanel.LinearScrollToItemLayoutManager;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ElementsSectionListFooterRendererOuterClass;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand;
import j$.util.Optional;
import j$.util.function.Consumer;
import j$.util.function.Supplier;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class npr extends noq implements nqe, nqf, flm, nvf, ypd {
    private final Set A;
    private FrameLayout B;
    private nqb C;
    private nqd D;
    private boolean E;
    private View F;
    private boolean G;
    private boolean H;
    private final boolean I;

    /* renamed from: J, reason: collision with root package name */
    private ntp f244J;
    private auop K;
    private final akht L;
    private final c M;
    private final ajyw N;
    private final ajyw O;
    private final aoae P;
    public final aasm d;
    public final nrp e;
    public final ypa f;
    public LoadingFrameLayout g;
    public FrameLayout h;
    public nqa i;
    public final nsq j;
    public nvg k;
    public lo l;
    public final oiy m;
    public final ogx n;
    public final ajoy o;
    private final Context p;
    private final azrw q;
    private final azrw r;
    private final aahd s;
    private final Set t;
    private final nrn u;
    private final ayqw v;
    private final nsm w;
    private final etv x;
    private final int y;
    private final fln z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npr(Context context, acra acraVar, nrp nrpVar, azrw azrwVar, azrw azrwVar2, akht akhtVar, ajyw ajywVar, c cVar, ajyw ajywVar2, aoae aoaeVar, ypa ypaVar, aahd aahdVar, nrn nrnVar, aadw aadwVar, aaea aaeaVar, nsq nsqVar, etv etvVar, fln flnVar, c cVar2, oiy oiyVar, ogx ogxVar, ajoy ajoyVar, aasm aasmVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        super(acraVar, aaeaVar);
        nsm b = cVar2.b(acraVar);
        this.p = context;
        this.e = nrpVar;
        this.q = azrwVar;
        this.r = azrwVar2;
        this.L = akhtVar;
        this.O = ajywVar;
        this.M = cVar;
        this.N = ajywVar2;
        this.d = aasmVar;
        this.P = aoaeVar;
        this.f = ypaVar;
        this.s = aahdVar;
        this.u = nrnVar;
        this.j = nsqVar;
        this.t = new aeb();
        this.v = new ayqw();
        this.z = flnVar;
        apxs apxsVar = aadwVar.b().z;
        this.I = (apxsVar == null ? apxs.a : apxsVar).h;
        this.y = context.getResources().getDimensionPixelSize(R.dimen.engagement_panel_scroll_cancel_padding);
        this.G = true;
        this.w = b;
        this.x = etvVar;
        this.m = oiyVar;
        this.n = ogxVar;
        this.o = ajoyVar;
        this.A = new HashSet();
    }

    private final void I() {
        this.t.clear();
        nvg nvgVar = this.k;
        if (nvgVar != null) {
            nvgVar.oT();
            this.k = null;
        }
        this.f.m(this);
    }

    private final void J(Class cls, Supplier supplier, Object obj, boolean z) {
        nvg nvgVar;
        if (cls.isInstance(this.k)) {
            nvgVar = (nvg) cls.cast(this.k);
        } else {
            this.t.clear();
            nvg nvgVar2 = this.k;
            if (nvgVar2 != null) {
                nvgVar2.oT();
            }
            nvgVar = (nvg) supplier.get();
            g(nvgVar);
            Iterator it = this.A.iterator();
            while (it.hasNext()) {
                nvgVar.j((ajol) it.next());
            }
            if (this.g != null) {
                nvgVar.r();
            }
        }
        this.k = nvgVar;
        nvgVar.k(obj, z);
    }

    private final void K(Consumer consumer) {
        nvg nvgVar = this.k;
        if (nvgVar != null) {
            consumer.accept(nvgVar);
        }
    }

    private final void L() {
        if (this.g != null) {
            return;
        }
        this.g = new LoadingFrameLayout(this.p);
        LayoutInflater.from(this.p).inflate(R.layout.default_engagement_panel, this.g);
        this.h = (FrameLayout) this.g.findViewById(R.id.content);
        FrameLayout frameLayout = (FrameLayout) this.g.findViewById(R.id.footer);
        this.B = frameLayout;
        nqa nqaVar = this.i;
        if (nqaVar != null) {
            frameLayout.addView(((npz) nqaVar).a);
        }
    }

    private final void M(aqrm aqrmVar) {
        nqa nqaVar = this.i;
        if (nqaVar == null && aqrmVar == null) {
            return;
        }
        if (nqaVar == null) {
            npz i = this.N.i(this.a, this.c, new npy() { // from class: npl
                @Override // defpackage.npy
                public final void a() {
                    npr nprVar = npr.this;
                    nqa nqaVar2 = nprVar.i;
                    nprVar.j.f(nqaVar2 != null ? ((npz) nqaVar2).a.getHeight() : 0);
                }
            });
            this.i = i;
            FrameLayout frameLayout = this.B;
            if (frameLayout != null) {
                frameLayout.addView(i.a);
            }
        }
        g(this.i);
        ((npz) this.i).a(aqrmVar);
    }

    private final void N() {
        if (this.g == null) {
            return;
        }
        FrameLayout frameLayout = this.h;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        K(new Consumer() { // from class: npp
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                FrameLayout frameLayout2;
                npr nprVar = npr.this;
                final nvg nvgVar = (nvg) obj;
                if (nprVar.g == null || (frameLayout2 = nprVar.h) == null) {
                    return;
                }
                frameLayout2.addView(nvgVar.m());
                LoadingFrameLayout loadingFrameLayout = nprVar.g;
                nvgVar.getClass();
                loadingFrameLayout.f(new akdd() { // from class: npn
                    @Override // defpackage.akdd
                    public final void qJ() {
                        nvg.this.s();
                    }
                });
                Optional d = nprVar.d();
                if (d.isPresent()) {
                    nprVar.j.e(nprVar.g, (RecyclerView) d.get());
                    ((RecyclerView) d.get()).U = nprVar.l;
                }
                nprVar.f.m(nprVar);
                if (nvgVar.n().h()) {
                    nprVar.f.i(nprVar, nvgVar.n().c());
                }
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
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
            if (r0 == 0) goto L44
            aqtr r1 = r4.f
            if (r1 != 0) goto Ld
            aqtr r1 = defpackage.aqtr.a
        Ld:
            aqtr r2 = r0.f
            if (r2 != 0) goto L13
            aqtr r2 = defpackage.aqtr.a
        L13:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L44
            aqtq r1 = r4.g
            if (r1 != 0) goto L1f
            aqtq r1 = defpackage.aqtq.a
        L1f:
            aqtq r2 = r0.g
            if (r2 != 0) goto L25
            aqtq r2 = defpackage.aqtq.a
        L25:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L44
            aulq r1 = r4.h
            if (r1 != 0) goto L31
            aulq r1 = defpackage.aulq.a
        L31:
            aulq r0 = r0.h
            if (r0 != 0) goto L37
            aulq r0 = defpackage.aulq.a
        L37:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3e
            goto L44
        L3e:
            asht r6 = r3.c
            r3.q(r4, r6)
            goto L53
        L44:
            asht r0 = r3.c
            r3.q(r4, r0)
            if (r6 == 0) goto L50
            iwu r6 = defpackage.iwu.o
            r3.K(r6)
        L50:
            r3.N()
        L53:
            if (r5 == 0) goto L8a
            boolean r6 = r3.H
            if (r6 == 0) goto L85
            nsm r6 = r3.w
            r6.d()
            nsm r6 = r3.w
            r6.f()
            nsm r6 = r3.w
            asht r0 = r3.c
            r6.g(r4, r0)
            nsm r4 = r3.w
            r4.e(r5)
            java.util.Set r4 = r3.t
            java.util.Iterator r4 = r4.iterator()
        L75:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L8a
            java.lang.Object r5 = r4.next()
            nrg r5 = (defpackage.nrg) r5
            r5.oX()
            goto L75
        L85:
            nsm r4 = r3.w
            r4.f()
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npr.A(aqts, apxf, boolean):void");
    }

    @Override // defpackage.nqg
    public final void B() {
        Iterator it = this.t.iterator();
        while (it.hasNext()) {
            ((nrg) it.next()).oT();
        }
        I();
        this.z.b(this);
        aqts aqtsVar = this.b;
        if (aqtsVar != null && (aqtsVar.c & 32768) != 0) {
            aahd aahdVar = this.s;
            apxf apxfVar = aqtsVar.r;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.a(apxfVar);
        }
        this.w.c();
    }

    @Override // defpackage.nqg
    public final void C() {
        String i;
        this.w.d();
        this.H = false;
        aqts aqtsVar = this.b;
        if (aqtsVar != null) {
            this.s.b(aqtsVar.p);
        }
        Iterator it = this.t.iterator();
        while (it.hasNext()) {
            ((nrg) it.next()).d();
        }
        if (aqtsVar != null && (i = oba.i(aqtsVar)) != null && this.P.H(i)) {
            this.P.G(i);
        }
        this.v.c();
    }

    @Override // defpackage.nqg
    public final void D(apxf apxfVar) {
        aqts aqtsVar = this.b;
        aqtsVar.getClass();
        this.w.e(apxfVar);
        this.H = true;
        this.s.b(aqtsVar.o);
        for (nrg nrgVar : this.t) {
            nrgVar.h();
            nrgVar.oX();
        }
        this.v.c();
        String i = oba.i(aqtsVar);
        if (i != null) {
            this.j.g(aqtsVar);
            this.v.d(this.u.a(aqtsVar).i(aypg.LATEST).h(oba.f(this.j.a())).s(new nsg(i, 1)).X(new ayrs() { // from class: npo
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    npr nprVar = npr.this;
                    int i2 = ((ntw) obj).b;
                    Optional d = nprVar.d();
                    if (d.isPresent()) {
                        wd wdVar = ((RecyclerView) d.get()).n;
                        if (wdVar instanceof LinearScrollToItemLayoutManager) {
                            nprVar.j.i();
                            ((LinearScrollToItemLayoutManager) wdVar).bA((RecyclerView) d.get(), i2);
                        }
                    }
                }
            }));
            if (aqtsVar.t) {
                this.P.F(i);
            }
        }
        if (this.I) {
            this.x.b();
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
        this.K = auopVar;
    }

    @Override // defpackage.nqe
    public final void E(ajce ajceVar) {
        K(new nvn(ajceVar, 1));
    }

    @Override // defpackage.nqg
    public final void F(nqd nqdVar) {
        this.D = nqdVar;
    }

    @Override // defpackage.nqf
    public final void G() {
        K(iwu.n);
    }

    @Override // defpackage.nvf
    public final void H(aqrm aqrmVar) {
        aqts aqtsVar = this.b;
        if (aqtsVar != null) {
            aulq aulqVar = aqtsVar.h;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(ElementsSectionListFooterRendererOuterClass.elementsSectionListFooterRenderer)) {
                return;
            }
        }
        M(aqrmVar);
    }

    @Override // defpackage.noq
    public final LoadingFrameLayout a() {
        L();
        return this.g;
    }

    @Override // defpackage.nqg
    public final nqb b() {
        return this.C;
    }

    @Override // defpackage.noq
    public final Optional d() {
        nvg nvgVar = this.k;
        return nvgVar == null ? Optional.empty() : Optional.ofNullable((RecyclerView) nvgVar.o().f());
    }

    public final void e(aqtr aqtrVar) {
        aqtu aqtuVar;
        aqtu aqtuVar2;
        if (aqtrVar.b == 50631000) {
            this.C = (nqb) this.r.get();
        }
        if (aqtrVar.b == 184740635) {
            this.C = this.M.c((apbr) aqtrVar.c);
        }
        if (aqtrVar.b == 195013039) {
            this.C = this.L.e(this.a, (apbo) aqtrVar.c);
        }
        if (aqtrVar.b == 194605894) {
            this.C = this.O.j(this.a, this.c, (apbq) aqtrVar.c);
        }
        nqb nqbVar = this.C;
        int i = aqtrVar.b;
        if (i != 138681548) {
            if (nqbVar != null) {
                return;
            } else {
                nqbVar = null;
            }
        }
        if (nqbVar instanceof nrx) {
            nrx nrxVar = (nrx) nqbVar;
            if (i == 138681548) {
                aqtuVar2 = (aqtu) aqtrVar.c;
            } else {
                aqtuVar2 = aqtu.a;
            }
            nrxVar.q(aqtuVar2);
            return;
        }
        nrx nrxVar2 = (nrx) this.q.get();
        if (aqtrVar.b == 138681548) {
            aqtuVar = (aqtu) aqtrVar.c;
        } else {
            aqtuVar = aqtu.a;
        }
        nrxVar2.q(aqtuVar);
        nrxVar2.h = this.a;
        this.C = nrxVar2;
    }

    @Override // defpackage.noq
    public final void g(nrg nrgVar) {
        this.t.add(nrgVar);
    }

    @Override // defpackage.noq
    public final void h(ntp ntpVar) {
        this.f244J = ntpVar;
    }

    @Override // defpackage.noq
    public final void i(lo loVar) {
        if (this.l == null) {
            Optional d = d();
            if (d.isPresent()) {
                ((RecyclerView) d.get()).U = loVar;
            }
            this.l = loVar;
        }
    }

    @Override // defpackage.flm
    public final void kG() {
        ntp ntpVar = this.f244J;
        if (ntpVar != null) {
            ntpVar.i();
        }
    }

    @Override // defpackage.flm
    public final void kH() {
        ntp ntpVar = this.f244J;
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
            LoadingFrameLayout loadingFrameLayout = this.g;
            if (loadingFrameLayout == null || loadingFrameLayout.e != 1) {
                return null;
            }
            loadingFrameLayout.a();
            return null;
        }
        if (i == 1) {
            ajtv ajtvVar = (ajtv) obj;
            LoadingFrameLayout loadingFrameLayout2 = this.g;
            if (loadingFrameLayout2 == null || loadingFrameLayout2.e != 1) {
                return null;
            }
            loadingFrameLayout2.b(ajtvVar.c(), ajtvVar.d());
            return null;
        }
        if (i == 2) {
            ajtw ajtwVar = (ajtw) obj;
            if (this.g == null || !ajtwVar.c()) {
                return null;
            }
            nvg nvgVar = this.k;
            if (nvgVar != null && nvgVar.u()) {
                return null;
            }
            this.g.c();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.nqg
    public final void n() {
        nqd nqdVar = this.D;
        if (nqdVar != null) {
            nqdVar.a();
        }
        Iterator it = this.t.iterator();
        while (it.hasNext()) {
            ((nrg) it.next()).oS();
        }
        lo loVar = this.l;
        if (loVar != null) {
            Optional d = d();
            if (d.isPresent()) {
                ((RecyclerView) d.get()).aF(loVar);
            }
            this.F = null;
        }
        aqts aqtsVar = this.b;
        if (aqtsVar != null && (aqtsVar.c & 16384) != 0) {
            aahd aahdVar = this.s;
            apxf apxfVar = aqtsVar.q;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.a(apxfVar);
        }
        this.j.j();
        if (this.I) {
            this.x.a();
        }
    }

    @Override // defpackage.nqg
    public final void o(apxf apxfVar) {
        L();
        K(iwu.p);
        N();
        nqb nqbVar = this.C;
        if (nqbVar != null) {
            nqbVar.h(this);
        }
        this.z.a(this);
        this.w.b();
    }

    @Override // defpackage.nqg
    public final View oO() {
        L();
        return this.g;
    }

    @Override // defpackage.nqg
    public final void oP(ajol ajolVar) {
        this.A.add(ajolVar);
        K(new nvo(ajolVar, 1));
    }

    @Override // defpackage.nop, defpackage.nqg
    public final void p() {
        final auop auopVar = this.K;
        if (auopVar == null) {
            return;
        }
        if ((auopVar.b & 1) != 0) {
            K(new Consumer() { // from class: npq
                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    auop auopVar2 = auop.this;
                    ((nvg) obj).v(auopVar2.c, (auopVar2.b & 4) != 0 ? auopVar2.d : 0, null);
                }

                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer.CC.$default$andThen(this, consumer);
                }
            });
        }
        this.K = null;
    }

    @Override // defpackage.nop, defpackage.nqg
    public final void q(aqts aqtsVar, asht ashtVar) {
        aqtt aqttVar;
        aqxd aqxdVar;
        aqtt aqttVar2;
        auov auovVar;
        super.q(aqtsVar, ashtVar);
        M(null);
        if (aqtsVar == null) {
            I();
            return;
        }
        this.j.d(aqtsVar);
        final int i = 0;
        final int i2 = 1;
        this.G = (aqtsVar.c & 128) == 0 || !aqtsVar.j;
        aqtr aqtrVar = aqtsVar.f;
        if (aqtrVar == null) {
            aqtrVar = aqtr.a;
        }
        e(aqtrVar);
        aqtq aqtqVar = aqtsVar.g;
        if (aqtqVar == null) {
            aqtqVar = aqtq.a;
        }
        if (aqtqVar.b == 49399797) {
            Supplier supplier = new Supplier(this) { // from class: npm
                public final /* synthetic */ npr a;

                {
                    this.a = this;
                }

                @Override // j$.util.function.Supplier
                public final Object get() {
                    int i3 = i2;
                    if (i3 == 0) {
                        npr nprVar = this.a;
                        ogx ogxVar = nprVar.n;
                        aasm aasmVar = nprVar.d;
                        nro a = nprVar.e.a(aasmVar, nprVar.a, nprVar);
                        Context context = (Context) ogxVar.b.get();
                        context.getClass();
                        azrw azrwVar = ogxVar.c;
                        aoae aoaeVar = (aoae) ogxVar.a.get();
                        aoaeVar.getClass();
                        return new nvq(context, azrwVar, aoaeVar, (oiy) ogxVar.d.get(), aasmVar, a, nprVar, null, null);
                    }
                    if (i3 == 1) {
                        npr nprVar2 = this.a;
                        oiy oiyVar = nprVar2.m;
                        aasm aasmVar2 = nprVar2.d;
                        return oiyVar.a(aasmVar2, nprVar2.e.a(aasmVar2, nprVar2.a, nprVar2), nprVar2);
                    }
                    npr nprVar3 = this.a;
                    ajoy ajoyVar = nprVar3.o;
                    acra acraVar = nprVar3.a;
                    itm itmVar = (itm) ajoyVar.a.get();
                    itmVar.getClass();
                    acraVar.getClass();
                    return new nvr(itmVar, nprVar3, acraVar);
                }
            };
            aqtq aqtqVar2 = aqtsVar.g;
            if (aqtqVar2 == null) {
                aqtqVar2 = aqtq.a;
            }
            if (aqtqVar2.b == 49399797) {
                auovVar = (auov) aqtqVar2.c;
            } else {
                auovVar = auov.a;
            }
            J(nvk.class, supplier, auovVar, this.G);
        } else {
            aqtq aqtqVar3 = aqtsVar.g;
            if (aqtqVar3 == null) {
                aqtqVar3 = aqtq.a;
            }
            if (aqtqVar3.b == 290136234) {
                aqttVar = (aqtt) aqtqVar3.c;
            } else {
                aqttVar = aqtt.a;
            }
            if (aqttVar.b.size() > 0) {
                Supplier supplier2 = new Supplier(this) { // from class: npm
                    public final /* synthetic */ npr a;

                    {
                        this.a = this;
                    }

                    @Override // j$.util.function.Supplier
                    public final Object get() {
                        int i3 = i;
                        if (i3 == 0) {
                            npr nprVar = this.a;
                            ogx ogxVar = nprVar.n;
                            aasm aasmVar = nprVar.d;
                            nro a = nprVar.e.a(aasmVar, nprVar.a, nprVar);
                            Context context = (Context) ogxVar.b.get();
                            context.getClass();
                            azrw azrwVar = ogxVar.c;
                            aoae aoaeVar = (aoae) ogxVar.a.get();
                            aoaeVar.getClass();
                            return new nvq(context, azrwVar, aoaeVar, (oiy) ogxVar.d.get(), aasmVar, a, nprVar, null, null);
                        }
                        if (i3 == 1) {
                            npr nprVar2 = this.a;
                            oiy oiyVar = nprVar2.m;
                            aasm aasmVar2 = nprVar2.d;
                            return oiyVar.a(aasmVar2, nprVar2.e.a(aasmVar2, nprVar2.a, nprVar2), nprVar2);
                        }
                        npr nprVar3 = this.a;
                        ajoy ajoyVar = nprVar3.o;
                        acra acraVar = nprVar3.a;
                        itm itmVar = (itm) ajoyVar.a.get();
                        itmVar.getClass();
                        acraVar.getClass();
                        return new nvr(itmVar, nprVar3, acraVar);
                    }
                };
                aqtq aqtqVar4 = aqtsVar.g;
                if (aqtqVar4 == null) {
                    aqtqVar4 = aqtq.a;
                }
                if (aqtqVar4.b != 290136234) {
                    aqttVar2 = aqtt.a;
                } else {
                    aqttVar2 = (aqtt) aqtqVar4.c;
                }
                J(nvq.class, supplier2, aqttVar2, this.G);
            } else {
                aqtq aqtqVar5 = aqtsVar.g;
                if (aqtqVar5 == null) {
                    aqtqVar5 = aqtq.a;
                }
                if (aqtqVar5.b != 371777145) {
                    I();
                } else {
                    final int i3 = 2;
                    Supplier supplier3 = new Supplier(this) { // from class: npm
                        public final /* synthetic */ npr a;

                        {
                            this.a = this;
                        }

                        @Override // j$.util.function.Supplier
                        public final Object get() {
                            int i32 = i3;
                            if (i32 == 0) {
                                npr nprVar = this.a;
                                ogx ogxVar = nprVar.n;
                                aasm aasmVar = nprVar.d;
                                nro a = nprVar.e.a(aasmVar, nprVar.a, nprVar);
                                Context context = (Context) ogxVar.b.get();
                                context.getClass();
                                azrw azrwVar = ogxVar.c;
                                aoae aoaeVar = (aoae) ogxVar.a.get();
                                aoaeVar.getClass();
                                return new nvq(context, azrwVar, aoaeVar, (oiy) ogxVar.d.get(), aasmVar, a, nprVar, null, null);
                            }
                            if (i32 == 1) {
                                npr nprVar2 = this.a;
                                oiy oiyVar = nprVar2.m;
                                aasm aasmVar2 = nprVar2.d;
                                return oiyVar.a(aasmVar2, nprVar2.e.a(aasmVar2, nprVar2.a, nprVar2), nprVar2);
                            }
                            npr nprVar3 = this.a;
                            ajoy ajoyVar = nprVar3.o;
                            acra acraVar = nprVar3.a;
                            itm itmVar = (itm) ajoyVar.a.get();
                            itmVar.getClass();
                            acraVar.getClass();
                            return new nvr(itmVar, nprVar3, acraVar);
                        }
                    };
                    aqtq aqtqVar6 = aqtsVar.g;
                    if (aqtqVar6 == null) {
                        aqtqVar6 = aqtq.a;
                    }
                    if (aqtqVar6.b == 371777145) {
                        aqxdVar = (aqxd) aqtqVar6.c;
                    } else {
                        aqxdVar = aqxd.a;
                    }
                    J(nvr.class, supplier3, aqxdVar, this.G);
                }
            }
        }
        this.w.g(aqtsVar, this.c);
        aulq aulqVar = aqtsVar.h;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(ElementsSectionListFooterRendererOuterClass.elementsSectionListFooterRenderer)) {
            aulq aulqVar2 = aqtsVar.h;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            M((aqrm) aulqVar2.pX(ElementsSectionListFooterRendererOuterClass.elementsSectionListFooterRenderer));
        }
    }

    @Override // defpackage.nop, defpackage.nqg
    public final void r(boolean z) {
        this.E = z;
    }

    @Override // defpackage.nop, defpackage.nqg
    public final boolean s() {
        nvg nvgVar = this.k;
        return nvgVar != null && nvgVar.t();
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
        Optional d = d();
        if (d.isPresent()) {
            wd wdVar = ((RecyclerView) d.get()).n;
            View view = this.F;
            if ((view == null && wdVar != null) || (view != null && wdVar != null && wd.bm(view) != 0)) {
                this.F = wdVar.S(0);
            }
            View view2 = this.F;
            if (view2 == null || view2.getTop() < (-this.y)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.nop, defpackage.nqg
    public final boolean y() {
        return this.E;
    }
}
