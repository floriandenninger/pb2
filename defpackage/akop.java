package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akop extends dha {

    @dnt(a = 13)
    awsy a;

    public akop() {
        super("AnalyticsChart");
    }

    @Override // defpackage.dhk
    protected final int F() {
        return 3;
    }

    @Override // defpackage.dhk
    protected final Object L(Context context) {
        return new FrameLayout(context);
    }

    @Override // defpackage.dhk
    public final void R(dhe dheVar, dhi dhiVar, int i, int i2, dlo dloVar) {
        awsy awsyVar = this.a;
        double d = dheVar.b.getResources().getDisplayMetrics().density;
        double d2 = awsyVar.c;
        Double.isNaN(d2);
        Double.isNaN(d);
        dloVar.a = (int) Math.floor(d2 * d);
        double d3 = awsyVar.d;
        Double.isNaN(d3);
        Double.isNaN(d);
        dloVar.b = (int) Math.floor(d3 * d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dhk
    protected final void S(dhe dheVar, Object obj) {
        FrameLayout frameLayout;
        rvu rvuVar;
        rvu rvuVar2;
        int i;
        List list;
        int i2;
        String str;
        awsy awsyVar;
        List list2;
        List list3;
        aonp aonpVar;
        aonp aonpVar2;
        int i3;
        FrameLayout frameLayout2 = (FrameLayout) obj;
        awsy awsyVar2 = this.a;
        awtn awtnVar = awsyVar2.e;
        if (awtnVar == null) {
            awtnVar = awtn.a;
        }
        if (awtnVar.c == 1) {
            Context context = dheVar.b;
            float f = context.getResources().getDisplayMetrics().density;
            float f2 = context.getResources().getDisplayMetrics().scaledDensity;
            awtn awtnVar2 = awsyVar2.e;
            if (awtnVar2 == null) {
                awtnVar2 = awtn.a;
            }
            if (awtnVar2.c == 1) {
                awtn awtnVar3 = awsyVar2.e;
                if (awtnVar3 == null) {
                    awtnVar3 = awtn.a;
                }
                if ((awtnVar3.c == 1 ? (awth) awtnVar3.d : awth.a).b.isEmpty()) {
                    frameLayout = frameLayout2;
                    rvuVar2 = null;
                } else {
                    awtn awtnVar4 = awsyVar2.e;
                    if (awtnVar4 == null) {
                        awtnVar4 = awtn.a;
                    }
                    awth awthVar = awtnVar4.c == 1 ? (awth) awtnVar4.d : awth.a;
                    aonp aonpVar3 = ((awti) awthVar.b.get(0)).c;
                    awtn awtnVar5 = awsyVar2.e;
                    if (awtnVar5 == null) {
                        awtnVar5 = awtn.a;
                    }
                    List list4 = (List) Collection.EL.stream((awtnVar5.c == 1 ? (awth) awtnVar5.d : awth.a).b).map(aidk.i).collect(Collectors.toList());
                    awtn awtnVar6 = awsyVar2.e;
                    if (awtnVar6 == null) {
                        awtnVar6 = awtn.a;
                    }
                    List list5 = (List) Collection.EL.stream((awtnVar6.c == 1 ? (awth) awtnVar6.d : awth.a).b).map(aidk.j).collect(Collectors.toList());
                    awtn awtnVar7 = awsyVar2.e;
                    if (awtnVar7 == null) {
                        awtnVar7 = awtn.a;
                    }
                    List list6 = (List) Collection.EL.stream((awtnVar7.c == 1 ? (awth) awtnVar7.d : awth.a).b).map(aidk.g).collect(Collectors.toList());
                    awtn awtnVar8 = awsyVar2.e;
                    if (awtnVar8 == null) {
                        awtnVar8 = awtn.a;
                    }
                    List list7 = (List) Collection.EL.stream((awtnVar8.c == 1 ? (awth) awtnVar8.d : awth.a).b).filter(nty.q).map(aidk.h).collect(Collectors.toList());
                    awsz awszVar = awthVar.c;
                    if (awszVar == null) {
                        awszVar = awsz.a;
                    }
                    aonp aonpVar4 = awszVar.c;
                    awsz awszVar2 = awthVar.c;
                    if (awszVar2 == null) {
                        awszVar2 = awsz.a;
                    }
                    aonp aonpVar5 = awszVar2.d;
                    rve rveVar = new rve(context);
                    ahbx.A(rveVar);
                    frameLayout = frameLayout2;
                    awtj awtjVar = ((awti) awthVar.b.get(0)).e;
                    if (awtjVar == null) {
                        awtjVar = awtj.a;
                    }
                    if ((awtjVar.b & 1) != 0) {
                        awtj awtjVar2 = ((awti) awthVar.b.get(0)).e;
                        if (awtjVar2 == null) {
                            awtjVar2 = awtj.a;
                        }
                        i2 = awtjVar2.c;
                    } else {
                        i2 = 2;
                    }
                    ((ruv) rveVar).e = 0;
                    rveVar.d.b = (int) (i2 * f);
                    ((rxn) rveVar.a()).i(0);
                    awtg awtgVar = awthVar.d;
                    if (awtgVar == null) {
                        awtgVar = awtg.a;
                    }
                    if (awtgVar.d.size() == 0) {
                        ((rxn) rveVar.a()).setVisibility(8);
                        awsyVar = awsyVar2;
                        str = "empty";
                        list2 = list7;
                        list3 = list6;
                        aonpVar = aonpVar3;
                        aonpVar2 = aonpVar4;
                    } else {
                        final awtg awtgVar2 = awthVar.d;
                        if (awtgVar2 == null) {
                            awtgVar2 = awtg.a;
                        }
                        rxn rxnVar = new rxn(context);
                        str = "empty";
                        awsyVar = awsyVar2;
                        list2 = list7;
                        list3 = list6;
                        ryh ryhVar = new ryh(new ryo[]{new ryo(new rys()), new ryo(new ryn()), new ryo(new ryr()), new ryo(new ryj()), new ryo(new ryl()), new ryo(new rym())});
                        rxnVar.m();
                        rxnVar.b = ryhVar;
                        TreeMap w = rwh.w();
                        aonpVar = aonpVar3;
                        rwh.h(60000L, new ryq("mm", "h mm", 10), w);
                        rwh.h(3600000L, new ryk(), w);
                        rwh.h(82800000L, new ryq("d", "MMM d", 2), w);
                        aonpVar2 = aonpVar4;
                        rwh.h(2419200000L, new ryq("MMM", "MMM yyyy", 1), w);
                        rwh.h(31536000000L, new ryq("yyyy", "yyyy", 1), w);
                        sbt.c(!w.isEmpty(), "At least one timeFormatter is needed to build a DateTimeTickFormatter");
                        rxnVar.c = new ryi(w);
                        rxnVar.j();
                        float b = rwq.b(context, 10.0f);
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, rum.a, 0, 0);
                        rxnVar.i(obtainStyledAttributes.getDimensionPixelSize(5, (int) b));
                        obtainStyledAttributes.recycle();
                        rzm.b(rxnVar);
                        if ("DEFAULT".equals(((ruo) rveVar).b)) {
                            String str2 = ((ruo) rveVar).b;
                            if (str2 != null) {
                                rveVar.removeView(rveVar.b(str2));
                            }
                            ((ruo) rveVar).b = null;
                        }
                        ((ruo) rveVar).a.put("DEFAULT", rxnVar);
                        rxs rxsVar = new rxs(awtgVar2.d, 0);
                        rxn rxnVar2 = (rxn) rveVar.a();
                        rxnVar2.k(new ryc());
                        rxnVar2.b = rxsVar;
                        rxnVar2.c = new rxu() { // from class: akor
                            @Override // defpackage.rxu
                            public final List a(List list8) {
                                awtg awtgVar3 = awtg.this;
                                return (awtgVar3.b == 2 ? (awtf) awtgVar3.c : awtf.a).b;
                            }
                        };
                        rxn rxnVar3 = (rxn) rveVar.a();
                        rxnVar3.i(0);
                        rxr rxrVar = rxnVar3.d;
                        rxrVar.a();
                        rxrVar.c = (int) (f * 12.0f);
                        rxrVar.c(f2 * 12.0f);
                        rxrVar.b(ahbx.x(rveVar.getContext()));
                        rxrVar.f();
                        rxrVar.d = 0.0f;
                    }
                    awtk awtkVar = awthVar.e;
                    if (awtkVar == null) {
                        awtkVar = awtk.a;
                    }
                    if (awtkVar.d.size() == 0) {
                        rveVar.c().setVisibility(8);
                    } else {
                        awtk awtkVar2 = awthVar.e;
                        if (awtkVar2 == null) {
                            awtkVar2 = awtk.a;
                        }
                        rxu B = akbc.B(awtkVar2);
                        rxn c = rveVar.c();
                        c.k(new akou());
                        c.b = new rxs(awtkVar2.d, 0);
                        c.c = B;
                        c.i((int) f);
                        rxr rxrVar2 = c.d;
                        rxrVar2.f();
                        rxrVar2.c = (int) (f * 12.0f);
                        rxrVar2.c(f2 * 12.0f);
                        rxrVar2.e(ahbx.y(rveVar.getContext()));
                        rxrVar2.b(ahbx.x(rveVar.getContext()));
                    }
                    if (list4.isEmpty()) {
                        aonp aonpVar6 = aonpVar;
                        rveVar.d.a = false;
                        awsy awsyVar3 = awsyVar;
                        awtn awtnVar9 = awsyVar3.e;
                        if (awtnVar9 == null) {
                            awtnVar9 = awtn.a;
                        }
                        if ((awtnVar9.b & 4) != 0) {
                            awtn awtnVar10 = awsyVar3.e;
                            if (awtnVar10 == null) {
                                awtnVar10 = awtn.a;
                            }
                            String str3 = awtnVar10.e;
                            rveVar.t(new rzp(rveVar.getContext(), str3, ahbx.x(context)));
                            rveVar.setContentDescription(str3);
                        }
                        rveVar.n(rwh.C(str, aonpVar6, Arrays.asList(new Double[aonpVar6.size()])));
                    } else {
                        if (list4.size() == 1 && aonpVar2.size() == ((List) list4.get(0)).size() && aonpVar5.size() == ((List) list4.get(0)).size()) {
                            sag sagVar = rveVar.d;
                            sagVar.e = true;
                            sagVar.g = true;
                            List list8 = (List) list4.get(0);
                            Integer num = (Integer) list5.get(0);
                            awsz awszVar3 = awthVar.c;
                            if (awszVar3 == null) {
                                awszVar3 = awsz.a;
                            }
                            if ((awszVar3.b & 1) != 0) {
                                awsz awszVar4 = awthVar.c;
                                if (awszVar4 == null) {
                                    awszVar4 = awsz.a;
                                }
                                i3 = awszVar4.e;
                            } else {
                                i3 = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                            }
                            aonp aonpVar7 = aonpVar;
                            sba C = rwh.C("lower", aonpVar7, aonpVar2);
                            C.g(saf.f, Integer.valueOf(rwh.F(i3, 0)));
                            C.g(saf.a, 0);
                            sba C2 = rwh.C("upper", aonpVar7, ahbx.B(aonpVar5, aonpVar2));
                            C2.g(saf.f, Integer.valueOf(i3));
                            C2.g(saf.a, 0);
                            sba C3 = rwh.C("target", aonpVar7, ahbx.B(list8, aonpVar5));
                            C3.h(num);
                            C3.g(saf.f, Integer.valueOf(rwh.F(num.intValue(), 0)));
                            if (ahbx.C(C3, list8, (awtm) list3.get(0))) {
                                rveVar.t(new rvo(rveVar.getContext()));
                            } else {
                                ahbx.D(rveVar);
                            }
                            ArrayList z = rwh.z(4);
                            z.add(C);
                            z.add(C2);
                            z.add(C3);
                            rveVar.w(z);
                        } else {
                            List list9 = list3;
                            aonp aonpVar8 = aonpVar;
                            awtj awtjVar3 = ((awti) awthVar.b.get(0)).e;
                            if (awtjVar3 == null) {
                                awtjVar3 = awtj.a;
                            }
                            rveVar.d.e = (awtjVar3.b & 4) != 0;
                            ArrayList aO = amkq.aO();
                            for (int i4 = 0; i4 < list4.size(); i4++) {
                                List list10 = (List) list4.get(i4);
                                int intValue = ((Integer) list5.get(i4)).intValue();
                                StringBuilder sb = new StringBuilder(18);
                                sb.append("target_");
                                sb.append(i4);
                                sba C4 = rwh.C(sb.toString(), aonpVar8, list10);
                                C4.h(Integer.valueOf(intValue));
                                sax saxVar = saf.f;
                                awtj awtjVar4 = ((awti) awthVar.b.get(i4)).e;
                                if (awtjVar4 == null) {
                                    awtjVar4 = awtj.a;
                                }
                                C4.g(saxVar, Integer.valueOf(awtjVar4.e));
                                aO.add(C4);
                                if (aO.size() == list9.size()) {
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 >= list9.size()) {
                                            rveVar.t(new rvo(rveVar.getContext()));
                                            break;
                                        } else {
                                            if (!ahbx.C((sba) aO.get(i5), (List) Collection.EL.stream(((sba) aO.get(i5)).a).map(aidk.f).collect(Collectors.toList()), (awtm) list9.get(i5))) {
                                                ahbx.D(rveVar);
                                                break;
                                            }
                                            i5++;
                                        }
                                    }
                                } else {
                                    ahbx.D(rveVar);
                                }
                            }
                            rveVar.w(aO);
                        }
                        if (!list2.isEmpty()) {
                            Context context2 = rveVar.getContext();
                            if (!zev.f(context2)) {
                                sae saeVar = new sae(context2);
                                saeVar.a.setColor(wbs.Q(context2, R.attr.yt10PercentLayer));
                                saeVar.c = 2;
                                if (rveVar.d.e) {
                                    saeVar.b = 0.0f;
                                }
                                rveVar.u(saeVar, "dot_follow");
                                ahbx.z(rveVar, new akos(context2, (List) Collection.EL.stream(list2).map(aidk.k).collect(Collectors.toList())));
                            }
                        }
                    }
                    rvuVar2 = rveVar;
                }
            } else {
                frameLayout = frameLayout2;
                rvuVar = null;
                rvuVar2 = rvuVar;
            }
        } else {
            frameLayout = frameLayout2;
            rvuVar = null;
            Context context3 = dheVar.b;
            float f3 = context3.getResources().getDisplayMetrics().density;
            float f4 = context3.getResources().getDisplayMetrics().scaledDensity;
            awtn awtnVar11 = awsyVar2.e;
            if (awtnVar11 == null) {
                awtnVar11 = awtn.a;
            }
            awta awtaVar = awtnVar11.c == 2 ? (awta) awtnVar11.d : awta.a;
            awtn awtnVar12 = awsyVar2.e;
            if (awtnVar12 == null) {
                awtnVar12 = awtn.a;
            }
            if (awtnVar12.c == 2 && awtaVar.c.size() != 0) {
                aony aonyVar = awtaVar.c;
                rvuVar2 = new rvu(context3);
                ahbx.A(rvuVar2);
                List list11 = (List) Collection.EL.stream(aonyVar).map(aidk.c).collect(Collectors.toList());
                awtc awtcVar = awtaVar.e;
                if (awtcVar == null) {
                    awtcVar = awtc.a;
                }
                if (awtcVar.b) {
                    i = 1;
                } else {
                    i = 1;
                    rvuVar2.C.a = true;
                }
                if ((awtaVar.b & i) != 0) {
                    awtk awtkVar3 = awtaVar.d;
                    if (awtkVar3 == null) {
                        awtkVar3 = awtk.a;
                    }
                    rxu B2 = akbc.B(awtkVar3);
                    rxn c2 = rvuVar2.c();
                    c2.k(new akou());
                    c2.i((int) f3);
                    c2.b = new rxs(awtkVar3.d, 0);
                    c2.c = B2;
                    rxr rxrVar3 = c2.d;
                    rxrVar3.f();
                    rxrVar3.c = (int) (f3 * 12.0f);
                    rxrVar3.c(f4 * 12.0f);
                    rxrVar3.e(ahbx.y(context3));
                    rxrVar3.b(ahbx.x(context3));
                } else {
                    rvuVar2.c().setVisibility(8);
                }
                final aony aonyVar2 = awtaVar.c;
                awtc awtcVar2 = awtaVar.e;
                if (awtcVar2 == null) {
                    awtcVar2 = awtc.a;
                }
                if (Collection.EL.stream(aonyVar2).noneMatch(nty.l)) {
                    ((rxp) rvuVar2.a()).setVisibility(8);
                } else {
                    rxp rxpVar = (rxp) rvuVar2.a();
                    int t = awxr.t(awtcVar2.c);
                    rxpVar.k((t != 0 && t == 3) ? new ryc() : new ryd());
                    rxpVar.b = new rxs((List) Collection.EL.stream(aonyVar2).filter(nty.m).map(aidk.c).collect(Collectors.toList()), 0);
                    rxpVar.c = new rxu() { // from class: akon
                        @Override // defpackage.rxu
                        public final List a(List list12) {
                            return (List) Collection.EL.stream(aonyVar2).map(aidk.d).filter(nty.p).collect(Collectors.toList());
                        }
                    };
                    rxp rxpVar2 = (rxp) rvuVar2.a();
                    rxpVar2.i(0);
                    rxr rxrVar4 = rxpVar2.d;
                    rxrVar4.c = (int) (f3 * 12.0f);
                    rxrVar4.c(f4 * 12.0f);
                    rxrVar4.b(ahbx.x(context3));
                    rxrVar4.d = 0.0f;
                    rxrVar4.f();
                    rxrVar4.a();
                }
                if (Collection.EL.stream(aonyVar).anyMatch(nty.n)) {
                    rvuVar2.setImportantForAccessibility(2);
                    ArrayList aO2 = amkq.aO();
                    HashMap aI = amkq.aI();
                    for (int i6 = 0; i6 < aonyVar.size(); i6++) {
                        for (awtd awtdVar : ((awtb) awtaVar.c.get(i6)).e) {
                            Integer valueOf = Integer.valueOf((awtdVar.b & 2) != 0 ? awtdVar.d : -16777216);
                            if (aI.containsKey(valueOf)) {
                                list = (List) aI.get(valueOf);
                            } else {
                                Double[] dArr = new Double[list11.size()];
                                Arrays.fill(dArr, Double.valueOf(0.0d));
                                List asList = Arrays.asList(dArr);
                                aI.put(valueOf, asList);
                                list = asList;
                            }
                            list.set(i6, Double.valueOf(awtdVar.c));
                        }
                    }
                    int i7 = 0;
                    for (Integer num2 : aI.keySet()) {
                        List list12 = (List) aI.get(num2);
                        int i8 = i7 + 1;
                        StringBuilder sb2 = new StringBuilder(16);
                        sb2.append("data_");
                        sb2.append(i7);
                        sba D = rwh.D(sb2.toString(), list11, list12);
                        D.h(num2);
                        aO2.add(D);
                        i7 = i8;
                    }
                    Optional max = Collection.EL.stream(aonyVar).map(aidk.e).max(Comparator$CC.naturalOrder());
                    if (max.isPresent() && ((Integer) max.get()).intValue() > 0) {
                        ArrayList arrayList = new ArrayList();
                        int i9 = 0;
                        boolean z2 = false;
                        while (i9 < ((Integer) max.get()).intValue()) {
                            arrayList.add(new ArrayList());
                            boolean z3 = z2;
                            for (int i10 = 0; i10 < aonyVar.size(); i10++) {
                                if ((((awtd) ((awtb) aonyVar.get(i10)).e.get(i9)).b & 4) != 0) {
                                    ((List) arrayList.get(i9)).add(((awtd) ((awtb) aonyVar.get(i10)).e.get(i9)).e);
                                    z3 = true;
                                }
                            }
                            i9++;
                            z2 = z3;
                        }
                        if (z2) {
                            Context context4 = rvuVar2.getContext();
                            if (!zev.f(context4)) {
                                ahbx.z(rvuVar2, new akos(context4, arrayList));
                            }
                        }
                    }
                    rvuVar2.w(aO2);
                } else {
                    awtn awtnVar13 = awsyVar2.e;
                    if (awtnVar13 == null) {
                        awtnVar13 = awtn.a;
                    }
                    if ((awtnVar13.b & 4) != 0) {
                        awtn awtnVar14 = awsyVar2.e;
                        if (awtnVar14 == null) {
                            awtnVar14 = awtn.a;
                        }
                        String str4 = awtnVar14.e;
                        rvuVar2.t(new rzp(context3, str4, ahbx.x(context3)));
                        rvuVar2.setContentDescription(str4);
                    }
                    rvuVar2.n(rwh.E("empty"));
                    rvuVar2.n(rwh.D("empty", list11, Arrays.asList(new Double[list11.size()])));
                }
            }
            rvuVar2 = rvuVar;
        }
        if (rvuVar2 != null) {
            frameLayout.removeAllViews();
            frameLayout.addView(rvuVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean Z() {
        return true;
    }

    @Override // defpackage.dhk
    public final int aj() {
        return 3;
    }

    @Override // defpackage.dha
    /* renamed from: e */
    public final boolean f(dha dhaVar) {
        if (this == dhaVar) {
            return true;
        }
        if (dhaVar == null || getClass() != dhaVar.getClass()) {
            return false;
        }
        akop akopVar = (akop) dhaVar;
        if (this.k == akopVar.k) {
            return true;
        }
        awsy awsyVar = this.a;
        return awsyVar == null ? akopVar.a == null : awsyVar.equals(akopVar.a);
    }

    @Override // defpackage.dha, defpackage.div
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((dha) obj);
    }
}
