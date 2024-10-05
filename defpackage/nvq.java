package defpackage;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;
import com.google.android.libraries.youtube.common.ui.RtlAwareViewPager;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.EngagementPanelSectionListRendererOuterClass;
import com.google.protos.youtube.api.innertube.SectionListRendererOuterClass;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nvq extends nve implements gaa {
    private final Context d;
    private final aasm e;
    private final azrw f;
    private final nro g;
    private final nvf h;
    private final List i = new ArrayList();
    private gab j;
    private LinearLayout k;
    private final oiy l;
    private final aoae m;

    public nvq(Context context, azrw azrwVar, aoae aoaeVar, oiy oiyVar, aasm aasmVar, nro nroVar, nvf nvfVar, byte[] bArr, byte[] bArr2) {
        this.d = context;
        this.f = azrwVar;
        this.m = aoaeVar;
        this.l = oiyVar;
        this.e = aasmVar;
        this.g = nroVar;
        this.h = nvfVar;
    }

    private final int a() {
        gab gabVar = this.j;
        if (gabVar == null) {
            return -1;
        }
        return gabVar.a();
    }

    private final nvk f() {
        int a = a();
        if (a < 0 || a >= this.i.size()) {
            return null;
        }
        return (nvk) this.i.get(a);
    }

    private final void g(Consumer consumer) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            consumer.accept((nvk) it.next());
        }
    }

    private final void i() {
        g(iwu.r);
        this.i.clear();
        gab gabVar = this.j;
        if (gabVar != null) {
            gabVar.f();
        }
    }

    private final void w() {
        if (this.k == null || this.j == null) {
            LayoutInflater from = LayoutInflater.from(this.d);
            ConstraintLayout constraintLayout = (ConstraintLayout) from.inflate(R.layout.tabs_bar, (ViewGroup) null);
            AppTabsBar appTabsBar = (AppTabsBar) constraintLayout.findViewById(R.id.tabs_bar);
            appTabsBar.d((zau) this.f.get());
            appTabsBar.p(gfw.k(R.attr.ytTextPrimary).le(this.d));
            appTabsBar.e(gfw.k(R.attr.ytTextPrimary).le(this.d), gfw.k(R.attr.ytTextSecondary).le(this.d));
            RtlAwareViewPager rtlAwareViewPager = (RtlAwareViewPager) from.inflate(R.layout.engagement_panel_view_pager, (ViewGroup) null);
            LinearLayout linearLayout = new LinearLayout(this.d);
            this.k = linearLayout;
            linearLayout.setOrientation(1);
            this.k.addView(constraintLayout);
            this.k.addView(rtlAwareViewPager);
            lvi lviVar = new lvi(nvm.a, new ibi(appTabsBar, 2), new nvl(constraintLayout, 0), rtlAwareViewPager);
            this.j = lviVar;
            lviVar.e(this);
            x();
        }
    }

    private final void x() {
        Object obj;
        i();
        if (this.j == null || (obj = this.b) == null) {
            return;
        }
        aqtt aqttVar = (aqtt) obj;
        int size = aqttVar.b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            EngagementPanelSectionListRendererOuterClass.EngagementPanelTabRenderer engagementPanelTabRenderer = (EngagementPanelSectionListRendererOuterClass.EngagementPanelTabRenderer) ((aulq) aqttVar.b.get(i2)).pX(EngagementPanelSectionListRendererOuterClass.EngagementPanelTabRenderer.engagementPanelTabRenderer);
            if (true == engagementPanelTabRenderer.c) {
                i = i2;
            }
            List list = this.i;
            nvk a = this.l.a(this.e, this.g, this.h);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                a.j((ajol) it.next());
            }
            aulq aulqVar = engagementPanelTabRenderer.d;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            a.k((auov) aulqVar.pX(SectionListRendererOuterClass.sectionListRenderer), this.c);
            a.g();
            ajwi ajwiVar = a.f;
            ajwiVar.getClass();
            fxv fxvVar = new fxv(ajwiVar.K);
            fzy fzyVar = new fzy();
            fzyVar.a = a.m();
            fzyVar.b(fxvVar);
            gab gabVar = this.j;
            String str = engagementPanelTabRenderer.b;
            this.m.c(engagementPanelTabRenderer, gabVar.c(str, str, false, fzyVar.a()));
            list.add(a);
        }
        this.j.k(i);
    }

    @Override // defpackage.gaa
    public final void b(int i, boolean z) {
        if (i < 0 || i >= this.i.size()) {
            return;
        }
        nvk nvkVar = (nvk) this.i.get(i);
        nvkVar.h();
        ajwi ajwiVar = nvkVar.f;
        if (ajwiVar != null) {
            ajwiVar.J();
        }
        this.h.H(nvkVar.a());
    }

    @Override // defpackage.nrg
    public final void d() {
        oW(a());
    }

    @Override // defpackage.gaa
    public final void e(float f) {
    }

    @Override // defpackage.nrg
    public final void h() {
        b(a(), false);
    }

    @Override // defpackage.nve, defpackage.nvg
    public final void j(ajol ajolVar) {
        super.j(ajolVar);
        g(new nvo(ajolVar, 0));
    }

    @Override // defpackage.nve, defpackage.nvg
    public final /* bridge */ /* synthetic */ void k(Object obj, boolean z) {
        super.k((aqtt) obj, z);
        x();
    }

    @Override // defpackage.nvg, defpackage.ajxa
    public final void lo() {
        g(nvp.b);
    }

    @Override // defpackage.nvg
    public final View m() {
        w();
        return this.k;
    }

    @Override // defpackage.nvg
    public final ammv n() {
        return amlr.a;
    }

    @Override // defpackage.nvg
    public final ammv o() {
        nvk f = f();
        return f == null ? amlr.a : f.o();
    }

    @Override // defpackage.nrg
    public final void oS() {
        g(iwu.q);
    }

    @Override // defpackage.nrg
    public final void oT() {
        i();
        gab gabVar = this.j;
        if (gabVar != null) {
            gabVar.g(this);
        }
    }

    @Override // defpackage.gaa
    public final boolean oW(int i) {
        if (i < 0 || i >= this.i.size()) {
            return true;
        }
        nvk nvkVar = (nvk) this.i.get(i);
        nvkVar.d();
        ajwi ajwiVar = nvkVar.f;
        if (ajwiVar == null) {
            return true;
        }
        ajwiVar.E();
        return true;
    }

    @Override // defpackage.gaa
    public final void ov(int i) {
        f();
    }

    @Override // defpackage.nvg
    public final void p(ajce ajceVar) {
        nvn nvnVar = new nvn(ajceVar, 0);
        nvk f = f();
        if (f != null) {
            nvnVar.accept(f);
        }
    }

    @Override // defpackage.nvg
    public final void q() {
        g(iwu.s);
    }

    @Override // defpackage.nvg
    public final void r() {
        w();
    }

    @Override // defpackage.nvg
    public final void s() {
        g(nvp.a);
    }

    @Override // defpackage.nvg
    public final boolean t() {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            if (!((nvk) it.next()).t()) {
                return false;
            }
        }
        return !this.i.isEmpty();
    }

    @Override // defpackage.nvg
    public final boolean u() {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            if (((nvk) it.next()).u()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ajwo
    public final boolean v(String str, int i, Runnable runnable) {
        nvk f = f();
        return f != null && f.v(str, i, runnable);
    }
}
