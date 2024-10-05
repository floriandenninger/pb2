package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.app.watch.engagementpanel.util.InterceptTouchListenerLinearLayout;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nqw implements nqp {
    private nqg A;
    private final aadw B;
    private yzr C;
    private final axzf D;
    public final nrf a;
    public final nrq b;
    public final nrk c;
    public final nwx d;
    public final boolean e;
    public final aaea f;
    public final aahd g;
    public RelativeLayout h;
    private final Activity i;
    private final acrt j;
    private final acrt k;
    private final nuo l;
    private final int m;
    private final nql n;
    private final nri o;
    private final nuv p;
    private final nra q;
    private final ammv r;
    private final ammv s;
    private final num t;
    private FrameLayout u;
    private RelativeLayout v;
    private InterceptTouchListenerLinearLayout w;
    private nqn x;
    private boolean y;
    private boolean z;

    public nqw(Activity activity, nwx nwxVar, acrt acrtVar, acrt acrtVar2, nuo nuoVar, nql nqlVar, nra nraVar, aaea aaeaVar, nrf nrfVar, nrq nrqVar, nrk nrkVar, aahd aahdVar, aadw aadwVar, ammv ammvVar, ammv ammvVar2, nri nriVar, nuv nuvVar, axzf axzfVar, num numVar, byte[] bArr, byte[] bArr2) {
        this.i = activity;
        this.d = nwxVar;
        this.j = acrtVar;
        this.k = acrtVar2;
        this.l = nuoVar;
        this.a = nrfVar;
        this.b = nrqVar;
        this.c = nrkVar;
        this.m = activity.getResources().getDimensionPixelSize(R.dimen.engagement_panel_header_drop_shadow_elevation);
        this.f = aaeaVar;
        this.n = nqlVar;
        this.o = nriVar;
        this.p = nuvVar;
        this.q = nraVar;
        this.g = aahdVar;
        this.B = aadwVar;
        this.e = evr.aG(aadwVar);
        this.r = ammvVar;
        this.s = ammvVar2;
        this.D = axzfVar;
        this.t = numVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.nqg I(defpackage.apxf r23, defpackage.nqd r24, boolean r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 1825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nqw.I(apxf, nqd, boolean, boolean, boolean):nqg");
    }

    private static apxf J(apxf apxfVar) {
        if (!apxfVar.pY(atmb.b)) {
            return apxfVar;
        }
        aong aongVar = (aong) apxfVar.toBuilder();
        aonk aonkVar = atmb.b;
        aone builder = ((atmc) apxfVar.pX(atmb.b)).toBuilder();
        builder.copyOnWrite();
        atmc atmcVar = (atmc) builder.instance;
        atmcVar.b &= -2;
        atmcVar.c = atmc.a.c;
        aongVar.e(aonkVar, (atmc) builder.build());
        return (apxf) aongVar.build();
    }

    private final void K(boolean z) {
        if (this.e) {
            if (z || !this.c.h(1)) {
                nrk nrkVar = this.c;
                int size = nrkVar.a.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        ((nrj) nrkVar.a.pop()).d();
                    }
                }
                nrkVar.c.c(amlr.a);
            }
            ammv b = this.c.b();
            L(b.h() ? ((nrb) b.c()).b : null, b.h());
            whu.B(this.i);
            return;
        }
        asvu asvuVar = this.B.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        if (asvuVar.aN) {
            ammv i = ammv.i(this.b.b.descendingIterator());
            if (i.h() && this.b.b() != 0) {
                while (((Iterator) i.c()).hasNext()) {
                    nrb nrbVar = (nrb) ((Iterator) i.c()).next();
                    if (nrbVar != null) {
                        nrbVar.a(4);
                    }
                    L(nrbVar == null ? null : nrbVar.b, false);
                }
                whu.B(this.i);
                return;
            }
            L(null, false);
            return;
        }
        nrb c = this.b.c();
        if (c != null) {
            c.a(4);
        }
        L(c != null ? c.b : null, false);
        whu.B(this.i);
    }

    private final void L(nqg nqgVar, boolean z) {
        nqg nqgVar2 = this.A;
        if (true != z) {
            nqgVar = null;
        }
        if (nqgVar2 == nqgVar) {
            return;
        }
        this.A = nqgVar;
        nuo nuoVar = this.l;
        nuoVar.d = nqgVar;
        Iterator it = nuoVar.a.iterator();
        while (it.hasNext()) {
            ((nun) it.next()).g(nqgVar);
        }
        nuoVar.b.c(ammv.i(nqgVar));
    }

    private final void M(List list) {
        aqts aqtsVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aqto aqtoVar = (aqto) it.next();
            if (aqtoVar.b == 138681066) {
                aqtsVar = (aqts) aqtoVar.c;
            } else {
                aqtsVar = aqts.b;
            }
            p(aqtsVar);
        }
    }

    private final void N(nrb nrbVar) {
        boolean z;
        nqb b = nrbVar.b.b();
        if (b != null) {
            if (this.e) {
                z = this.c.f();
            } else {
                z = this.b.b() > 1;
            }
            b.e(z);
        }
        nrbVar.a(2);
        acra E = E();
        if (E != null) {
            E.n(new acqx(acsb.c(31880)));
        }
        L(nrbVar.b, true);
        num numVar = this.t;
        oba.h(numVar.b);
        azap azapVar = new azap(numVar.a, null, 1);
        ayrv ayrvVar = aynu.o;
        numVar.b = azapVar.V(nua.e);
        whu.B(this.i);
    }

    @Override // defpackage.nqp
    public final void A(apxf apxfVar) {
        d(apxfVar, null);
    }

    @Override // defpackage.nqp
    public final void B(apxf apxfVar) {
        oba.r(this, apxfVar, null, false);
    }

    @Override // defpackage.nqp
    public final yzr C() {
        if (this.C == null) {
            nqv nqvVar = new nqv(this);
            nqvVar.l(nqvVar.a.d.a.b(null));
            this.C = nqvVar;
        }
        return this.C;
    }

    @Override // defpackage.nqp
    public final /* synthetic */ void D(aqts aqtsVar) {
        oba.s(this, aqtsVar, null, true);
    }

    public final acra E() {
        nrb c = this.e ? (nrb) this.c.b().f() : this.b.c();
        if (c != null) {
            return c.b.j();
        }
        return null;
    }

    final ammv F(String str) {
        return ammv.i(this.a.a(str)).b(mjy.e);
    }

    public final void G(boolean z, boolean z2) {
        ammv c = this.c.c();
        if (this.v == null || !c.h() || this.p.b != nuu.PORTRAIT_WATCH_PANEL) {
            K(z);
            return;
        }
        nqg nqgVar = ((nrb) c.c()).b;
        if (z2) {
            this.x.h(nqgVar);
            return;
        }
        this.c.h(2);
        this.x.i(nqgVar);
        L(nqgVar, true);
        whu.B(this.i);
    }

    public final void H(boolean z) {
        if (this.w == null) {
            return;
        }
        if (this.D.c().booleanValue()) {
            this.w.setElevation(0.0f);
        } else {
            this.w.setElevation(z ? this.m : 0.0f);
        }
    }

    @Override // defpackage.nqp
    public final View a() {
        return this.u;
    }

    @Override // defpackage.nqp
    public final nqg b(String str) {
        nrb a = this.a.a(str);
        if (a == null) {
            return null;
        }
        return a.b;
    }

    @Override // defpackage.nqp
    public final nqg c() {
        if (this.e) {
            return (nqg) this.c.b().b(mjy.g).f();
        }
        nrb c = this.b.c();
        if (c != null) {
            return c.b;
        }
        return null;
    }

    @Override // defpackage.nqp
    public final nqg d(apxf apxfVar, nqd nqdVar) {
        return I(this.k.h(J(apxfVar)), nqdVar, false, false, false);
    }

    @Override // defpackage.nqp
    public final /* synthetic */ nqg e(apxf apxfVar, nqd nqdVar, boolean z) {
        return oba.r(this, apxfVar, nqdVar, z);
    }

    @Override // defpackage.nqp
    public final nqg f(apxf apxfVar, nqd nqdVar, boolean z, boolean z2) {
        return I(this.j.h(J(apxfVar)), nqdVar, true, z, z2);
    }

    @Override // defpackage.nqp
    public final nuo g() {
        return this.l;
    }

    @Override // defpackage.nqp
    public final nwx h() {
        return this.d;
    }

    @Override // defpackage.nqp
    public final String i() {
        if (this.e) {
            return (String) this.c.b().b(mjy.f).f();
        }
        nrb c = this.b.c();
        if (c != null) {
            return c.a;
        }
        return null;
    }

    @Override // defpackage.nqp
    public final void j(RelativeLayout relativeLayout, RelativeLayout relativeLayout2) {
        relativeLayout.getClass();
        if (this.h != relativeLayout) {
            this.z = false;
        }
        this.h = relativeLayout;
        this.v = relativeLayout2;
        if (this.r.h()) {
            final nur nurVar = (nur) this.r.c();
            if (evr.aI(nurVar.d)) {
                aypn.e(nurVar.c.a, nurVar.b.b, new ayro() { // from class: nup
                    @Override // defpackage.ayro
                    public final Object a(Object obj, Object obj2) {
                        return nur.this.a((nuu) obj, (ammv) obj2);
                    }
                }).E(nurVar.a).X(new ayrs() { // from class: nuq
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        nqp nqpVar = nqp.this;
                        ammv ammvVar = (ammv) obj;
                        if (ammvVar.h()) {
                            String str = (String) ammvVar.c();
                            while (nqpVar.i() != null && !Objects.equals(nqpVar.i(), str)) {
                                nqpVar.l();
                            }
                            nqpVar.m(new exk(str, 2));
                        }
                    }
                });
            }
        }
        this.y = true;
    }

    @Override // defpackage.nqp
    public final void k(WatchNextResponseModel watchNextResponseModel) {
        asfc asfcVar = watchNextResponseModel.a;
        if (asfcVar.q.size() > 0) {
            M(asfcVar.q);
        }
        if (asfcVar.r.size() > 0) {
            M(asfcVar.r);
        }
        if (this.s.h()) {
            ((nub) this.s.c()).a();
        }
    }

    @Override // defpackage.nqp
    public final void l() {
        m(mjw.j);
    }

    @Override // defpackage.nqp
    public final void m(ammy ammyVar) {
        n(ammyVar, true);
    }

    @Override // defpackage.nqp
    public final void n(ammy ammyVar, boolean z) {
        nrb c;
        if (this.e) {
            if (this.c.a() == 0) {
                return;
            }
        } else if (this.b.b() == 0) {
            return;
        }
        String i = i();
        if (i == null || ammyVar.a(i)) {
            if (!this.e ? this.b.h(z) : this.c.i()) {
                if (this.e) {
                    c = (nrb) this.c.b().f();
                } else {
                    c = this.b.c();
                }
                if (c == null) {
                    return;
                }
                N(c);
                nqb b = c.b.b();
                if (b != null) {
                    H(b.l());
                    return;
                }
                return;
            }
            K(true);
        }
    }

    @Override // defpackage.nqp
    public final void o() {
        G(false, true);
    }

    @Override // defpackage.nqp
    public final void p(aqts aqtsVar) {
        boolean z = false;
        if ((aqtsVar.c & 262144) != 0 && aqtsVar.u) {
            z = true;
        }
        oba.s(this, aqtsVar, null, z);
    }

    @Override // defpackage.nqp
    public final void q(aqts aqtsVar, asht ashtVar) {
        boolean z = false;
        if ((aqtsVar.c & 262144) != 0 && aqtsVar.u) {
            z = true;
        }
        oba.s(this, aqtsVar, ashtVar, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nqp
    public final void r(aqts aqtsVar, asht ashtVar, boolean z, apxf apxfVar, boolean z2) {
        boolean z3;
        nqg a;
        auov auovVar;
        String i = oba.i(aqtsVar);
        if (ammx.e(i)) {
            return;
        }
        if (z || !this.a.b(i)) {
            nrb a2 = this.a.b(i) ? this.a.a(i) : null;
            if (a2 != null && a2.b.w(aqtsVar, apxfVar)) {
                if (apxfVar != null) {
                    a2.e = apxfVar;
                    return;
                }
                return;
            }
            nra nraVar = this.q;
            if (evr.bV(aqtsVar) != null) {
                a = (nqg) nraVar.a.get();
            } else {
                aqtq aqtqVar = aqtsVar.g;
                if (aqtqVar == null) {
                    aqtqVar = aqtq.a;
                }
                if (aqtqVar.b == 49399797) {
                    aqtq aqtqVar2 = aqtsVar.g;
                    if (aqtqVar2 == null) {
                        aqtqVar2 = aqtq.a;
                    }
                    if (aqtqVar2.b == 49399797) {
                        auovVar = (auov) aqtqVar2.c;
                    } else {
                        auovVar = auov.a;
                    }
                    if (auovVar.d.size() > 0 && (((auoy) auovVar.d.get(0)).e & 256) != 0) {
                        a = (nqg) nraVar.f.get();
                    }
                }
                if ((aqtsVar.c & 4194304) != 0) {
                    a = (nqg) nraVar.j.get();
                } else {
                    aqtq aqtqVar3 = aqtsVar.g;
                    if (aqtqVar3 == null) {
                        aqtqVar3 = aqtq.a;
                    }
                    if (aqtqVar3.b == 154115041) {
                        a = (nqg) nraVar.g.get();
                    } else {
                        aqtq aqtqVar4 = aqtsVar.g;
                        if (aqtqVar4 == null) {
                            aqtqVar4 = aqtq.a;
                        }
                        if (aqtqVar4.b != 371777145) {
                            Boolean bool = Boolean.TRUE;
                            aqvj aqvjVar = nraVar.l.a.b().C;
                            if (aqvjVar == null) {
                                aqvjVar = aqvj.a;
                            }
                            if (aqvjVar.a(45358147L)) {
                                aoot aootVar = aqvjVar.b;
                                if (!aootVar.containsKey(45358147L)) {
                                    throw new IllegalArgumentException();
                                }
                                aqvk aqvkVar = (aqvk) aootVar.get(45358147L);
                                z3 = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
                            } else {
                                z3 = false;
                            }
                            if (bool.equals(z3)) {
                                if ((aocz.bl(aqtsVar.m) != 0 ? r12 : 1) - 1 == 2) {
                                    a = nraVar.k.b(nraVar.d);
                                } else {
                                    a = nraVar.k.b(z2 ? nraVar.e : nraVar.c);
                                }
                            } else {
                                if ((aocz.bl(aqtsVar.m) != 0 ? r12 : 1) - 1 == 2) {
                                    a = nraVar.b.a(nraVar.d);
                                } else {
                                    a = nraVar.b.a(z2 ? nraVar.e : nraVar.c);
                                }
                            }
                        } else {
                            a = (nqg) nraVar.h.get();
                        }
                    }
                }
            }
            if (nraVar.i.h()) {
                a.oP((ajol) nraVar.i.c());
            }
            a.q(aqtsVar, ashtVar);
            nrf nrfVar = this.a;
            a.oP(new nrd(i, 2));
            nre nreVar = (nre) nrfVar.c.put(i, new nre(nrfVar, i, a));
            if (nreVar != null) {
                nreVar.b();
            }
        }
    }

    @Override // defpackage.nqp
    public final void s() {
        nrf nrfVar = this.a;
        HashSet hashSet = new HashSet();
        for (nre nreVar : nrfVar.c.values()) {
            if (!nrfVar.e.H(nreVar.a)) {
                hashSet.add(nreVar.a);
                nreVar.b();
            }
        }
        nrfVar.c.keySet().removeAll(hashSet);
        nrb c = this.b.c();
        boolean z = false;
        boolean z2 = !this.e && (this.b.b() > 1 || c == null || this.a.a(c.a) == null || c.c == 5);
        ammv b = this.c.b();
        if (this.e && (this.c.a() > 1 || !b.h() || this.a.a(((nrb) b.c()).a) == null || ((nrb) b.c()).c == 5)) {
            z = true;
        }
        if (z2 || z) {
            this.b.d();
            nrk nrkVar = this.c;
            Iterator it = nrkVar.a.iterator();
            while (it.hasNext()) {
                nrj nrjVar = (nrj) it.next();
                Iterator it2 = nrjVar.b.iterator();
                while (it2.hasNext()) {
                    ((nrb) it2.next()).a(5);
                }
                nrjVar.b.clear();
                nrjVar.a.clear();
            }
            nrkVar.a.clear();
            nrkVar.c.c(amlr.a);
            nql nqlVar = this.n;
            if (nqlVar.m != null) {
                nqlVar.n.j(nqlVar);
                ((LinearLayout) nqlVar.m.b).animate().cancel();
                ((FrameLayout) nqlVar.n.b).animate().cancel();
                ((LinearLayout) nqlVar.o.b).animate().cancel();
                nqlVar.e(null);
                nqlVar.f(null);
            }
            RelativeLayout relativeLayout = this.h;
            if (relativeLayout != null) {
                relativeLayout.animate().cancel();
            }
            K(true);
        }
    }

    @Override // defpackage.nqp
    public final void t(nqn nqnVar) {
        this.x = nqnVar;
    }

    @Override // defpackage.nqp
    public final void u(String str, boolean z) {
        nrb a = this.a.a(str);
        if (a == null) {
            return;
        }
        nqo nqoVar = z ? nqo.ACTIVELY_ENGAGING : nqo.NOT_ENGAGING;
        if (nqoVar == a.d) {
            return;
        }
        a.d = nqoVar;
        acra j = a.b.j();
        asuh cf = adyu.cf(a.b.l());
        if (j == null || cf == null) {
            return;
        }
        if ((cf.c & 1) != 0) {
            acqx acqxVar = new acqx(cf.d);
            nqo nqoVar2 = a.d;
            aone createBuilder = asht.a.createBuilder();
            aone createBuilder2 = ashn.a.createBuilder();
            String str2 = a.a;
            createBuilder2.copyOnWrite();
            ashn ashnVar = (ashn) createBuilder2.instance;
            str2.getClass();
            ashnVar.b |= 1;
            ashnVar.c = str2;
            boolean z2 = nqoVar2 == nqo.ACTIVELY_ENGAGING;
            createBuilder2.copyOnWrite();
            ashn ashnVar2 = (ashn) createBuilder2.instance;
            ashnVar2.b |= 2;
            ashnVar2.d = z2;
            createBuilder.copyOnWrite();
            asht ashtVar = (asht) createBuilder.instance;
            ashn ashnVar3 = (ashn) createBuilder2.build();
            ashnVar3.getClass();
            ashtVar.A = ashnVar3;
            ashtVar.c |= 131072;
            j.w(acqxVar, (asht) createBuilder.build());
        }
    }

    @Override // defpackage.nqp
    public final boolean v(String str) {
        if (!this.e) {
            return this.b.g(str);
        }
        nrj nrjVar = (nrj) this.c.a.peek();
        return nrjVar != null && nrjVar.h(str);
    }

    @Override // defpackage.nqp
    public final boolean w(String str) {
        return this.a.b(str);
    }

    @Override // defpackage.nqp
    public final boolean x() {
        return this.A != null;
    }

    @Override // defpackage.nqp
    public final boolean y(HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint) {
        String str = hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c == 1 ? (String) hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.d : "";
        String i = i();
        if (!hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.e || ammx.e(i) || !amkq.b(i, str) || F(i).f() != nqo.ACTIVELY_ENGAGING) {
            return false;
        }
        if ((hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.b & 8) != 0) {
            aahd aahdVar = this.g;
            apxf apxfVar = hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.f;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.a(apxfVar);
        }
        return true;
    }

    @Override // defpackage.nqp
    public final boolean z(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) {
        String i = i();
        if (!showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.i || ammx.e(i) || F(i).f() != nqo.ACTIVELY_ENGAGING) {
            return false;
        }
        if ((showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.b & 256) == 0) {
            return true;
        }
        aahd aahdVar = this.g;
        apxf apxfVar = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.j;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.a(apxfVar);
        return true;
    }
}
