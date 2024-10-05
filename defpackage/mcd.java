package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.commerce.red.entity.LayerableFilterEntityController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ChipCloudRendererOuterClass;
import com.google.protos.youtube.api.innertube.FeedFilterChipBarRendererOuterClass;
import com.google.protos.youtube.api.innertube.FilterChipTransformCommandOuterClass$FilterChipTransformCommand;
import j$.util.Collection;
import j$.util.function.Consumer;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mcd implements mbn {
    private aone A;
    private aone B;
    private aone C;
    public final ajpd a;
    public final aahd b;
    final mck c;
    ammv d;
    public boolean e;
    public ammv f;
    final RecyclerView g;
    aamd h;
    public acra i;
    public ammv j;
    public azrl k;
    public ajwx l;
    private final Context m;
    private final LinearLayoutManager n;
    private final ajox o;
    private final fyd p;
    private final String q;
    private final LayerableFilterEntityController r;
    private final axpg s;
    private final ajdw t;
    private final boolean u;
    private final boolean v;
    private final LinearLayout w;
    private final LinearLayout x;
    private View y;
    private boolean z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [ajos, java.lang.Object] */
    public mcd(Activity activity, LinearLayout linearLayout, ajvb ajvbVar, aahd aahdVar, ajoy ajoyVar, ajpt ajptVar, String str, aadw aadwVar, axpg axpgVar, ajdw ajdwVar, LayerableFilterEntityController layerableFilterEntityController) {
        this.m = activity;
        boolean as = evr.as(aadwVar);
        this.u = as;
        boolean at = evr.at(aadwVar);
        this.v = at;
        LinearLayout linearLayout2 = as ? (LinearLayout) linearLayout.findViewById(R.id.chip_bar_container) : linearLayout;
        this.w = linearLayout2;
        LinearLayout linearLayout3 = as ? (LinearLayout) linearLayout.findViewById(R.id.overlay_container) : null;
        this.x = linearLayout3;
        this.i = acra.l;
        this.f = amlr.a;
        this.d = amlr.a;
        this.b = aahdVar;
        this.q = str;
        this.s = axpgVar;
        this.t = ajdwVar;
        this.r = layerableFilterEntityController;
        RecyclerView recyclerView = new RecyclerView(activity);
        this.g = recyclerView;
        recyclerView.ae(ajptVar);
        Resources resources = activity.getResources();
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, resources.getDimensionPixelSize(R.dimen.filter_bar_height)));
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.filter_bar_start_end_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.filter_bar_top_bottom_padding);
        recyclerView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        recyclerView.setClipToPadding(false);
        recyclerView.setImportantForAccessibility(1);
        recyclerView.setFocusable(true);
        recyclerView.setContentDescription(resources.getString(R.string.accessibility_feed_filter_bar_content_description));
        linearLayout2.addView(recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.n = linearLayoutManager;
        linearLayoutManager.ab(0);
        recyclerView.af(linearLayoutManager);
        recyclerView.v(new zbn(recyclerView, true));
        ajox b = ajoyVar.b(ajvbVar.get(), new ViewGroup.LayoutParams(-2, -2));
        this.o = b;
        ajpd ajpdVar = new ajpd();
        this.a = ajpdVar;
        b.h(ajpdVar);
        this.p = new fyd(activity.getResources().getDimensionPixelSize(R.dimen.filter_bar_chip_padding));
        this.z = false;
        this.e = false;
        this.c = (at && mcy.e(str) && linearLayout3 != null) ? new mce(recyclerView, linearLayout3, this.i) : new mci();
    }

    private final boolean A(aamd aamdVar) {
        aqwh aqwhVar;
        atlx atlxVar;
        if (mcy.f(this.q)) {
            if (mcy.d(aamdVar)) {
                auou auouVar = aamdVar.a.g;
                if (auouVar == null) {
                    auouVar = auou.a;
                }
                if (auouVar.b == 256220752) {
                    atlxVar = (atlx) auouVar.c;
                } else {
                    atlxVar = atlx.a;
                }
                aulq aulqVar = atlxVar.d;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                aqwhVar = (aqwh) aulqVar.pX(FeedFilterChipBarRendererOuterClass.feedFilterChipBarRenderer);
            }
            aqwhVar = null;
        } else {
            auou auouVar2 = aamdVar.a.g;
            if (auouVar2 == null) {
                auouVar2 = auou.a;
            }
            if (auouVar2.b == 213380311) {
                auou auouVar3 = aamdVar.a.g;
                if (auouVar3 == null) {
                    auouVar3 = auou.a;
                }
                if (auouVar3.b == 213380311) {
                    aqwhVar = (aqwh) auouVar3.c;
                } else {
                    aqwhVar = aqwh.a;
                }
            }
            aqwhVar = null;
        }
        if (aqwhVar == null) {
            return false;
        }
        this.c.g(false);
        this.d = amlr.a;
        this.e = false;
        boolean D = D(aqwhVar.toBuilder());
        if (n() || aqwhVar.e) {
            this.h = null;
        } else {
            this.h = aamdVar;
        }
        return D;
    }

    private final aone B() {
        LinearLayout linearLayout;
        if (this.v && (linearLayout = this.x) != null) {
            linearLayout.setVisibility(8);
        }
        aone aoneVar = this.B;
        int min = aoneVar != null ? Math.min(((aqwh) aoneVar.instance).c.size(), 10) : 10;
        aone aoneVar2 = this.C;
        if (aoneVar2 == null || ((aqwh) aoneVar2.instance).c.size() != min) {
            aone createBuilder = aqwh.a.createBuilder();
            for (int i = 0; i < min; i++) {
                aone createBuilder2 = aptg.a.createBuilder();
                aone createBuilder3 = apti.a.createBuilder();
                apth apthVar = apth.STYLE_HOME_FILTER;
                createBuilder3.copyOnWrite();
                apti aptiVar = (apti) createBuilder3.instance;
                aptiVar.c = apthVar.p;
                aptiVar.b |= 1;
                createBuilder2.copyOnWrite();
                aptg aptgVar = (aptg) createBuilder2.instance;
                apti aptiVar2 = (apti) createBuilder3.build();
                aptiVar2.getClass();
                aptgVar.e = aptiVar2;
                aptgVar.b |= 1;
                createBuilder2.copyOnWrite();
                aptg aptgVar2 = (aptg) createBuilder2.instance;
                aptgVar2.b |= 256;
                aptgVar2.i = false;
                aptg aptgVar3 = (aptg) createBuilder2.build();
                aong aongVar = (aong) aulq.a.createBuilder();
                aongVar.e(ChipCloudRendererOuterClass.chipCloudChipRenderer, aptgVar3);
                createBuilder.af(aongVar);
            }
            return createBuilder;
        }
        return this.C;
    }

    private final void C(aone aoneVar) {
        RecyclerView recyclerView = this.g;
        vw vwVar = recyclerView.m;
        ajox ajoxVar = this.o;
        if (vwVar != ajoxVar) {
            recyclerView.ac(ajoxVar);
            this.g.aB(this.p);
            this.o.rU(new ajol() { // from class: mbv
                @Override // defpackage.ajol
                public final void a(ajok ajokVar, ajng ajngVar, int i) {
                    final mcd mcdVar = mcd.this;
                    if (mcdVar.l == null) {
                        zga.b("Skipping present context decoration when sectionListController is not set.");
                        return;
                    }
                    ajokVar.a(mcdVar.i);
                    ammv s = mcdVar.s(i);
                    if (s.h()) {
                        amru amruVar = fro.a;
                        apti aptiVar = ((aptg) s.c()).e;
                        if (aptiVar == null) {
                            aptiVar = apti.a;
                        }
                        apth b = apth.b(aptiVar.c);
                        if (b == null) {
                            b = apth.STYLE_UNKNOWN;
                        }
                        if (amruVar.contains(b)) {
                            return;
                        }
                        if (mcdVar.w(i)) {
                            fro.g(ajokVar, new View.OnClickListener() { // from class: mbs
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    mcd mcdVar2 = mcd.this;
                                    if (!mcdVar2.j.h()) {
                                        zga.l("Default chip handler shouldn't fire if default chip not present.");
                                        return;
                                    }
                                    if (!mcdVar2.f.h()) {
                                        zga.l("Default chip should always be selected when no current selection exists.");
                                        return;
                                    }
                                    if (((Integer) mcdVar2.f.c()).equals(mcdVar2.j.c())) {
                                        zga.l("Should not be possible for Default chip to be selected when already selected.");
                                        return;
                                    }
                                    mcdVar2.g.ak(0);
                                    mcdVar2.v(((Integer) mcdVar2.j.c()).intValue(), true);
                                    mcdVar2.v(((Integer) mcdVar2.f.c()).intValue(), false);
                                    int intValue = ((Integer) mcdVar2.f.c()).intValue();
                                    mcdVar2.f = amlr.a;
                                    azrl azrlVar = mcdVar2.k;
                                    if (azrlVar != null) {
                                        ammv j = ammv.j(Integer.valueOf(intValue));
                                        amlr amlrVar = amlr.a;
                                        ammv ammvVar = mcdVar2.d;
                                        azrlVar.c(mbm.e(j, amlrVar, ammvVar, ammvVar));
                                    }
                                    if (mcdVar2.d.h() && mcdVar2.x(amlr.a)) {
                                        return;
                                    }
                                    mcdVar2.u();
                                }
                            });
                        } else {
                            fro.f(ajokVar, new ajof() { // from class: mbu
                                @Override // defpackage.ajof
                                public final boolean h(View view) {
                                    mcd mcdVar2 = mcd.this;
                                    int c = mcdVar2.g.c(view);
                                    boolean z = true;
                                    if (c != -1) {
                                        mcdVar2.g.ak(c);
                                        ammv ammvVar = mcdVar2.f;
                                        mcdVar2.f = ammv.j(Integer.valueOf(c));
                                        if (ammvVar.h() && ((Integer) ammvVar.c()).intValue() == c) {
                                            mcdVar2.f = amlr.a;
                                        }
                                        if (mcdVar2.f.h()) {
                                            mcdVar2.v(((Integer) mcdVar2.f.c()).intValue(), true);
                                        }
                                        if (ammvVar.h()) {
                                            mcdVar2.v(((Integer) ammvVar.c()).intValue(), false);
                                        }
                                        if (!ammvVar.h() || ((Integer) ammvVar.c()).intValue() != c) {
                                            if (!ammvVar.h()) {
                                                mcdVar2.t();
                                            }
                                            if (!mcdVar2.d.h() || !mcdVar2.x(amlr.a)) {
                                                z = false;
                                            }
                                        } else {
                                            mcdVar2.t();
                                            if (!mcdVar2.d.h() || !mcdVar2.x(amlr.a)) {
                                                mcdVar2.u();
                                            }
                                        }
                                        azrl azrlVar = mcdVar2.k;
                                        if (azrlVar != null) {
                                            ammv ammvVar2 = mcdVar2.f;
                                            ammv ammvVar3 = mcdVar2.d;
                                            azrlVar.c(mbm.e(ammvVar, ammvVar2, ammvVar3, ammvVar3));
                                        }
                                    }
                                    return z;
                                }
                            });
                        }
                        ajokVar.g(amrz.k("sectionListController", mcdVar.l));
                    }
                }
            });
        }
        this.A = aoneVar;
        this.a.clear();
        this.j = amlr.a;
        int i = 0;
        int i2 = 0;
        for (aulq aulqVar : Collections.unmodifiableList(((aqwh) aoneVar.instance).c)) {
            if (aulqVar.pY(ChipCloudRendererOuterClass.chipCloudChipRenderer)) {
                aptg aptgVar = (aptg) aulqVar.pX(ChipCloudRendererOuterClass.chipCloudChipRenderer);
                int i3 = aptgVar.b;
                if ((i3 & 2) != 0) {
                    if ((i3 & 16) != 0) {
                        apxf apxfVar = aptgVar.g;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        if (apxfVar.equals(apxf.a)) {
                        }
                    }
                    ammv j = ammv.j(Integer.valueOf(i2));
                    this.j = j;
                    int intValue = ((Integer) j.c()).intValue();
                    aong aongVar = (aong) aulq.a.createBuilder();
                    aonk aonkVar = ChipCloudRendererOuterClass.chipCloudChipRenderer;
                    aone builder = aptgVar.toBuilder();
                    apxf apxfVar2 = apxf.a;
                    builder.copyOnWrite();
                    aptg aptgVar2 = (aptg) builder.instance;
                    apxfVar2.getClass();
                    aptgVar2.g = apxfVar2;
                    aptgVar2.b |= 16;
                    aongVar.e(aonkVar, (aptg) builder.build());
                    aoneVar.ag(intValue, aongVar);
                    break;
                }
                continue;
            }
            i2++;
        }
        for (aulq aulqVar2 : Collections.unmodifiableList(((aqwh) aoneVar.instance).c)) {
            if (aulqVar2.pY(ChipCloudRendererOuterClass.chipCloudChipRenderer)) {
                aptg aptgVar3 = (aptg) aulqVar2.pX(ChipCloudRendererOuterClass.chipCloudChipRenderer);
                this.a.add(aptgVar3);
                if (aptgVar3.i && !w(i)) {
                    this.f = ammv.j(Integer.valueOf(i));
                }
            } else if (aulqVar2.pY(ButtonRendererOuterClass.buttonRenderer)) {
                this.a.add(aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer));
            } else if (aulqVar2.pY(ChipCloudRendererOuterClass.chipDividerRenderer)) {
                this.a.add(aulqVar2.pX(ChipCloudRendererOuterClass.chipDividerRenderer));
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0143 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0144 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean D(defpackage.aone r7) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mcd.D(aone):boolean");
    }

    private final void y() {
        this.B = null;
        this.h = null;
        this.f = amlr.a;
        this.g.aE(this.p);
        this.g.ac(null);
        this.a.clear();
    }

    private final void z(final int i, boolean z, long j) {
        if (i < 0 || i >= this.a.size()) {
            return;
        }
        aptg aptgVar = (aptg) s(i).c();
        boolean z2 = aptgVar.i;
        aone builder = aptgVar.toBuilder();
        builder.copyOnWrite();
        aptg aptgVar2 = (aptg) builder.instance;
        aptgVar2.b |= 256;
        aptgVar2.i = z;
        aptg aptgVar3 = (aptg) builder.build();
        this.a.n(i, aptgVar3);
        if (zev.e(this.m) && z && !z2) {
            this.g.postDelayed(new Runnable() { // from class: mbx
                @Override // java.lang.Runnable
                public final void run() {
                    View S;
                    mcd mcdVar = mcd.this;
                    int i2 = i;
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mcdVar.g.n;
                    if (linearLayoutManager == null || (S = linearLayoutManager.S(i2)) == null) {
                        return;
                    }
                    S.requestFocus();
                    S.sendAccessibilityEvent(8);
                }
            }, j);
        }
        aone aoneVar = this.A;
        if (aoneVar != null) {
            aong aongVar = (aong) aulq.a.createBuilder();
            aongVar.e(ChipCloudRendererOuterClass.chipCloudChipRenderer, aptgVar3);
            aoneVar.ag(i, aongVar);
        }
    }

    @Override // defpackage.fzo
    public final void a() {
        aone aoneVar = this.B;
        if (aoneVar != null) {
            this.i.u(new acqx(((aqwh) aoneVar.instance).f), null);
            aone aoneVar2 = this.B;
            if (aoneVar2 == null || this.e) {
                return;
            }
            aqwh aqwhVar = (aqwh) aoneVar2.instance;
            if ((aqwhVar.b & 512) != 0) {
                aahd aahdVar = this.b;
                apxf apxfVar = aqwhVar.h;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.a(apxfVar);
                this.e = true;
            }
        }
    }

    @Override // defpackage.mbn
    public final ajxe b() {
        aone aoneVar = this.B;
        ammv ammvVar = this.f;
        ammv ammvVar2 = this.d;
        ammv a = this.c.a();
        aamd aamdVar = this.h;
        LinearLayoutManager linearLayoutManager = this.n;
        boolean z = this.z;
        boolean z2 = this.e;
        aone aoneVar2 = this.C;
        aone aoneVar3 = this.A;
        boolean z3 = false;
        if (aoneVar3 != null && aoneVar3 == aoneVar2) {
            z3 = true;
        }
        return new mcc(aoneVar, ammvVar, ammvVar2, a, aamdVar, linearLayoutManager, z, z2, aoneVar2, z3, this.a);
    }

    @Override // defpackage.mbn
    public final amsx c() {
        ammv ammvVar;
        aone aoneVar;
        final amsv i = amsx.i();
        Collection.EL.stream(this.a).filter(jzf.f).map(jyr.q).filter(jzf.g).map(jyr.r).forEach(new Consumer() { // from class: mbz
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                amsv.this.c((String) obj);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
        if (!this.u || this.v || (aoneVar = this.B) == null) {
            ammvVar = amlr.a;
        } else {
            aulq aulqVar = ((aqwh) aoneVar.instance).g;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            aulqVar.getClass();
            if (aulqVar.pY(FeedFilterChipBarRendererOuterClass.a)) {
                aqwg aqwgVar = (aqwg) aulqVar.pX(FeedFilterChipBarRendererOuterClass.a);
                ammvVar = (aqwgVar.b & 4) != 0 ? ammv.j(aqwgVar.e) : amlr.a;
            } else {
                ammvVar = amlr.a;
            }
        }
        if (ammvVar.h()) {
            i.c((String) ammvVar.c());
        }
        return i.g();
    }

    @Override // defpackage.mbn
    public final aypy d() {
        azrl azrlVar = this.k;
        return azrlVar == null ? aypy.I() : azrlVar.Y(luw.i);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d8  */
    @Override // defpackage.mbn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.google.protos.youtube.api.innertube.FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand r8) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mcd.e(com.google.protos.youtube.api.innertube.FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand):void");
    }

    @Override // defpackage.mbn
    public final void f(final FilterChipTransformCommandOuterClass$FilterChipTransformCommand filterChipTransformCommandOuterClass$FilterChipTransformCommand) {
        final ammv ammvVar;
        if (this.l == null || this.A == null) {
            return;
        }
        String str = filterChipTransformCommandOuterClass$FilterChipTransformCommand.c;
        int i = 0;
        while (true) {
            if (i < this.a.size()) {
                ammv s = s(i);
                if (s.h() && ((aptg) s.c()).m.equals(str)) {
                    ammvVar = ammv.j(Integer.valueOf(i));
                    break;
                }
                i++;
            } else {
                afsi.b(2, 25, String.format("chip index not in adapter", new Object[0]));
                ammvVar = amlr.a;
                break;
            }
        }
        if (ammvVar.h()) {
            this.g.ak(((Integer) ammvVar.c()).intValue());
            ammv ammvVar2 = this.f;
            this.f = ammv.j((Integer) ammvVar.c());
            if (ammvVar2.h()) {
                v(((Integer) ammvVar2.c()).intValue(), false);
            } else if (this.j.h()) {
                v(((Integer) this.j.c()).intValue(), false);
            }
            z(((Integer) ammvVar.c()).intValue(), true, 150L);
            azrl azrlVar = this.k;
            if (azrlVar != null) {
                ammv ammvVar3 = this.f;
                ammv ammvVar4 = this.d;
                azrlVar.c(mbm.e(ammvVar2, ammvVar3, ammvVar4, ammvVar4));
            }
            this.g.postDelayed(new Runnable() { // from class: mby
                @Override // java.lang.Runnable
                public final void run() {
                    mcd mcdVar = mcd.this;
                    ammv ammvVar5 = ammvVar;
                    FilterChipTransformCommandOuterClass$FilterChipTransformCommand filterChipTransformCommandOuterClass$FilterChipTransformCommand2 = filterChipTransformCommandOuterClass$FilterChipTransformCommand;
                    ammv s2 = mcdVar.s(((Integer) ammvVar5.c()).intValue());
                    aahd aahdVar = mcdVar.b;
                    apxf apxfVar = ((aptg) s2.c()).g;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.c(apxfVar, amrz.k("sectionListController", mcdVar.l));
                    if ((filterChipTransformCommandOuterClass$FilterChipTransformCommand2.b & 16) != 0) {
                        aahd aahdVar2 = mcdVar.b;
                        apxf apxfVar2 = filterChipTransformCommandOuterClass$FilterChipTransformCommand2.d;
                        if (apxfVar2 == null) {
                            apxfVar2 = apxf.a;
                        }
                        aahdVar2.a(apxfVar2);
                    }
                }
            }, 550L);
        }
    }

    @Override // defpackage.mbn
    public final void g(asmo asmoVar) {
        String str;
        ammv ammvVar;
        ammv ammvVar2;
        arka arkaVar;
        if ((asmoVar.c & 1) != 0) {
            String str2 = asmoVar.d;
            if (this.d.h()) {
                arjp arjpVar = (arjp) this.d.c();
                if (arjpVar.b == 347924010) {
                    arkaVar = (arka) arjpVar.c;
                } else {
                    arkaVar = arka.a;
                }
                str = (String) arkaVar.b.get(0);
            } else {
                str = "";
            }
            boolean z = !str2.equals(str);
            ammv ammvVar3 = this.d;
            if (z) {
                aone createBuilder = arjp.a.createBuilder();
                aone createBuilder2 = arka.a.createBuilder();
                createBuilder2.copyOnWrite();
                arka arkaVar2 = (arka) createBuilder2.instance;
                str2.getClass();
                aony aonyVar = arkaVar2.b;
                if (!aonyVar.c()) {
                    arkaVar2.b = aonm.mutableCopy(aonyVar);
                }
                arkaVar2.b.add(str2);
                arka arkaVar3 = (arka) createBuilder2.build();
                createBuilder.copyOnWrite();
                arjp arjpVar2 = (arjp) createBuilder.instance;
                arkaVar3.getClass();
                arjpVar2.c = arkaVar3;
                arjpVar2.b = 347924010;
                ammvVar = ammv.j((arjp) createBuilder.build());
            } else {
                ammvVar = amlr.a;
            }
            this.d = ammvVar;
            this.c.c(z);
            azrl azrlVar = this.k;
            if (azrlVar != null) {
                ammv ammvVar4 = this.f;
                azrlVar.c(mbm.e(ammvVar4, ammvVar4, ammvVar3, this.d));
            }
            if (this.d.h() || this.f.h()) {
                if (z) {
                    if ((asmoVar.c & 2) != 0) {
                        apxf apxfVar = asmoVar.e;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        ammvVar2 = ammv.j(apxfVar);
                    } else {
                        ammvVar2 = amlr.a;
                    }
                } else if ((asmoVar.c & 4) != 0) {
                    apxf apxfVar2 = asmoVar.f;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                    ammvVar2 = ammv.j(apxfVar2);
                } else {
                    ammvVar2 = amlr.a;
                }
                x(ammvVar2);
                return;
            }
            if ((asmoVar.c & 4) != 0) {
                aahd aahdVar = this.b;
                apxf apxfVar3 = asmoVar.f;
                if (apxfVar3 == null) {
                    apxfVar3 = apxf.a;
                }
                aahdVar.a(apxfVar3);
            }
            u();
        }
    }

    @Override // defpackage.mbn
    public final void h() {
        azrl azrlVar = this.k;
        if (azrlVar != null) {
            azrlVar.sh();
        }
        y();
        this.z = false;
    }

    @Override // defpackage.mbn
    public final void i() {
        View view;
        azrl azrlVar = this.k;
        if (azrlVar != null) {
            azrlVar.sh();
        }
        LinearLayout linearLayout = this.x;
        if (linearLayout != null && (view = this.y) != null) {
            linearLayout.removeView(view);
        }
        this.c.b();
        this.w.removeView(this.g);
        this.z = false;
        this.e = false;
        this.l = null;
    }

    @Override // defpackage.mbn
    public final void j() {
        if (this.z) {
            this.z = false;
            aone aoneVar = this.B;
            if (aoneVar != null) {
                C(aoneVar);
            }
        }
    }

    @Override // defpackage.mbn
    public final void k() {
        this.z = true;
        aone aoneVar = this.C;
        if (aoneVar != null) {
            C(aoneVar);
        }
    }

    @Override // defpackage.mbn
    public final boolean l(aamd aamdVar, ajwx ajwxVar, acra acraVar) {
        this.i = acraVar;
        if (this.v) {
            this.c.e(acraVar);
        }
        this.k = azrl.e();
        this.l = ajwxVar;
        return A(aamdVar);
    }

    @Override // defpackage.mbn
    public final boolean m() {
        return this.z;
    }

    @Override // defpackage.mbn
    public final boolean n() {
        return this.f.h() || this.d.h();
    }

    @Override // defpackage.mbn
    public final boolean o() {
        return this.z || !(this.B == null || this.a.isEmpty());
    }

    @Override // defpackage.mbn
    public final boolean p() {
        if (!n() || this.z) {
            return false;
        }
        if (this.u && !this.f.h()) {
            return false;
        }
        ammv ammvVar = this.f;
        amlr amlrVar = amlr.a;
        this.f = amlrVar;
        azrl azrlVar = this.k;
        if (azrlVar != null) {
            ammv ammvVar2 = this.d;
            azrlVar.c(mbm.e(ammvVar, amlrVar, ammvVar2, ammvVar2));
        }
        v(((Integer) ammvVar.c()).intValue(), false);
        t();
        u();
        return true;
    }

    @Override // defpackage.mbn
    public final boolean q(ajxe ajxeVar, ajwx ajwxVar, acra acraVar) {
        this.i = acraVar;
        this.l = ajwxVar;
        if (!(ajxeVar instanceof mcc)) {
            return false;
        }
        mcc mccVar = (mcc) ajxeVar;
        this.h = mccVar.d;
        this.f = mccVar.a;
        this.d = mccVar.b;
        this.e = mccVar.g;
        this.k = azrl.e();
        aone aoneVar = mccVar.h;
        boolean z = true;
        if (aoneVar != null && mccVar.f) {
            this.B = aoneVar;
            this.C = mccVar.i;
            this.C = B();
            k();
            this.n.Y(mccVar.e);
        } else {
            if (aoneVar == null) {
                return false;
            }
            this.c.g(true);
            z = D(mccVar.h);
            if (mccVar.c.h()) {
                this.c.d((mcj) mccVar.c.c());
            }
            this.n.Y(mccVar.e);
        }
        return z;
    }

    @Override // defpackage.mbn
    public final boolean r(aamd aamdVar) {
        if (!this.z) {
            return false;
        }
        this.z = false;
        y();
        this.d = amlr.a;
        azrl azrlVar = this.k;
        if (azrlVar != null) {
            azrlVar.c(mbm.e(amlr.a, amlr.a, amlr.a, amlr.a));
        }
        this.e = false;
        return A(aamdVar);
    }

    public final ammv s(int i) {
        boolean z = false;
        if (i >= 0 && i < this.a.size()) {
            z = true;
        }
        amkq.H(z, "chip index %s not in adapter", i);
        return this.a.get(i) instanceof aptg ? ammv.j((aptg) this.a.get(i)) : amlr.a;
    }

    public final void t() {
        if (this.j.h()) {
            v(((Integer) this.j.c()).intValue(), !this.f.h());
            if (this.f.h()) {
                return;
            }
            this.g.ak(0);
        }
    }

    public final void u() {
        aone aoneVar;
        ajwx ajwxVar = this.l;
        if (ajwxVar == null || (aoneVar = this.B) == null) {
            return;
        }
        aamd aamdVar = this.h;
        if (aamdVar != null) {
            ajwxVar.M(aamdVar);
            return;
        }
        aqwh aqwhVar = (aqwh) aoneVar.instance;
        if ((aqwhVar.b & 1) != 0) {
            aahd aahdVar = this.b;
            apxf apxfVar = aqwhVar.d;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, amrz.k("sectionListController", this.l));
        }
    }

    public final void v(int i, boolean z) {
        z(i, z, 200L);
    }

    public final boolean w(int i) {
        return this.j.h() && ((Integer) this.j.c()).intValue() == i;
    }

    public final boolean x(ammv ammvVar) {
        ajwx ajwxVar;
        Object j;
        if (!this.u || (ajwxVar = this.l) == null) {
            return false;
        }
        mcb mcbVar = new mcb(this, ammvVar);
        ammv b = this.f.b(new amml() { // from class: mbw
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                return mcd.this.s(((Integer) obj).intValue()).b(loc.n).a(amlr.a);
            }
        });
        aone aoneVar = this.B;
        if (aoneVar == null) {
            j = amlr.a;
        } else {
            apxf apxfVar = ((aqwh) aoneVar.instance).d;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            j = ammv.j(apxfVar);
        }
        ammv ammvVar2 = (ammv) b.e(j);
        final arjp arjpVar = (arjp) this.d.f();
        if (!ammvVar2.h()) {
            return false;
        }
        BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint = (BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint) ((apxf) ammvVar2.c()).pX(BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.browseSectionListReloadEndpoint);
        aply aplyVar = browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.c;
        if (aplyVar == null) {
            aplyVar = aply.a;
        }
        if ((aplyVar.b & 1) == 0) {
            return false;
        }
        aply aplyVar2 = browseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.c;
        if (aplyVar2 == null) {
            aplyVar2 = aply.a;
        }
        aulm aulmVar = aplyVar2.c;
        if (aulmVar == null) {
            aulmVar = aulm.a;
        }
        ajwxVar.ll(aulmVar, new zfi() { // from class: mbt
            @Override // defpackage.zfi
            public final void a(Object obj) {
                arjp arjpVar2 = arjp.this;
                aaqh aaqhVar = (aaqh) obj;
                if (!(aaqhVar instanceof aauc) || arjpVar2 == null) {
                    return;
                }
                ((aauc) aaqhVar).t = arjpVar2;
            }
        }, mcbVar, (apxf) ammvVar2.c());
        return true;
    }
}
