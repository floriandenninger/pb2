package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.youtube.app.watch.engagementpanel.LinearScrollToItemLayoutManager;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ElementsSectionListFooterRendererOuterClass;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nvk extends nve implements ajxa {
    public final azqy d = azqy.ap();
    public final nvf e;
    public ajwi f;
    public RecyclerView g;
    private final Context h;
    private final acra i;
    private final azrw j;
    private final sxw k;
    private final aasm l;
    private final nro m;
    private Cfor n;
    private SwipeRefreshLayout o;
    private final lwk p;
    private final ajoy q;

    public nvk(Context context, acra acraVar, azrw azrwVar, lwk lwkVar, ajoy ajoyVar, sxw sxwVar, aasm aasmVar, nro nroVar, nvf nvfVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.h = context;
        this.i = acraVar;
        this.j = azrwVar;
        this.p = lwkVar;
        this.q = ajoyVar;
        this.k = sxwVar;
        this.l = aasmVar;
        this.m = nroVar;
        this.e = nvfVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aqrm a() {
        Object obj = this.b;
        if (obj == null) {
            return null;
        }
        auov auovVar = (auov) obj;
        if ((auovVar.c & 32) != 0) {
            aulq aulqVar = auovVar.k;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(ElementsSectionListFooterRendererOuterClass.elementsSectionListFooterRenderer)) {
                aulq aulqVar2 = auovVar.k;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                return (aqrm) aulqVar2.pX(ElementsSectionListFooterRendererOuterClass.elementsSectionListFooterRenderer);
            }
        }
        return null;
    }

    @Override // defpackage.nrg
    public final void d() {
        SwipeRefreshLayout swipeRefreshLayout = this.o;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.l(false);
            this.o.clearAnimation();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [ajos, java.lang.Object] */
    public final void g() {
        if (this.o == null || this.g == null || this.n == null || this.f == null) {
            RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(this.h).inflate(R.layout.section_list, (ViewGroup) null, false);
            this.g = recyclerView;
            recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: nvh
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    nvk nvkVar = nvk.this;
                    int abs = Math.abs(i3 - i);
                    int abs2 = Math.abs(i4 - i2);
                    azqy azqyVar = nvkVar.d;
                    boolean z = false;
                    if (view.getVisibility() == 0 && abs > 0 && abs2 > 0) {
                        z = true;
                    }
                    azqyVar.c(Boolean.valueOf(z));
                }
            });
            this.g.af(LinearScrollToItemLayoutManager.q(this.h));
            xu xuVar = (xu) this.g.E;
            if (xuVar != null) {
                xuVar.x();
            }
            SwipeRefreshLayout swipeRefreshLayout = new SwipeRefreshLayout(this.h);
            this.o = swipeRefreshLayout;
            swipeRefreshLayout.j(wbs.W(this.h, R.attr.ytTextPrimary).orElse(-16777216));
            this.o.k(wbs.W(this.h, R.attr.ytTextPrimaryInverse).orElse(-1));
            this.o.setBackgroundColor(wbs.W(this.h, R.attr.ytBrandBackgroundSolid).orElse(-16777216));
            this.o.addView(this.g);
            this.n = this.q.K(this.o);
            gmk b = this.p.b(this.g, this.l, this.m, this.i, ((ajvb) this.j.get()).get(), this, this.n, ajhb.ENGAGEMENT, this.k, this.h, nsm.a());
            this.f = b;
            this.n.d(b);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                this.f.u((ajol) it.next());
            }
            this.a.clear();
            this.f.y(new nvj(this));
            Object obj = this.b;
            if (obj != null) {
                this.f.M(new aamd((auov) obj));
                this.f.P(this.c);
            }
        }
    }

    @Override // defpackage.nrg
    public final void h() {
        ajwi ajwiVar = this.f;
        if (ajwiVar != null) {
            ajwiVar.c();
        }
    }

    @Override // defpackage.nve, defpackage.nvg
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void k(auov auovVar, boolean z) {
        super.k(auovVar, z);
        ajwi ajwiVar = this.f;
        if (ajwiVar == null) {
            return;
        }
        if (auovVar != null) {
            ajwiVar.M(new aamd(auovVar));
            this.f.P(z);
        } else {
            ajwiVar.h();
        }
    }

    @Override // defpackage.nve, defpackage.nvg
    public final void j(ajol ajolVar) {
        ajwi ajwiVar = this.f;
        if (ajwiVar != null) {
            ajwiVar.u(ajolVar);
        } else {
            super.j(ajolVar);
        }
    }

    @Override // defpackage.nvg, defpackage.ajxa
    public final void lo() {
        ajwi ajwiVar = this.f;
        if (ajwiVar != null) {
            ajwiVar.lo();
        }
    }

    @Override // defpackage.ajxa
    public final boolean lp() {
        return false;
    }

    @Override // defpackage.nvg
    public final View m() {
        g();
        return this.o;
    }

    @Override // defpackage.nvg
    public final ammv n() {
        ajwi ajwiVar = this.f;
        return ajwiVar == null ? amlr.a : ammv.j(ajwiVar.G);
    }

    @Override // defpackage.nvg
    public final ammv o() {
        return ammv.i(this.g);
    }

    @Override // defpackage.nrg
    public final void oS() {
    }

    @Override // defpackage.nrg
    public final void oT() {
        ajwi ajwiVar = this.f;
        if (ajwiVar != null) {
            ajwiVar.j();
        }
        Cfor cfor = this.n;
        if (cfor != null) {
            cfor.b();
        }
    }

    @Override // defpackage.nvg
    public final void p(ajce ajceVar) {
        ajwi ajwiVar = this.f;
        if (ajwiVar != null) {
            ajwiVar.lt(ajceVar);
        }
    }

    @Override // defpackage.nvg
    public final void q() {
        ajwi ajwiVar = this.f;
        if (ajwiVar != null) {
            ajwiVar.l();
        }
    }

    @Override // defpackage.nvg
    public final void r() {
        g();
    }

    @Override // defpackage.nvg
    public final void s() {
        ajwi ajwiVar = this.f;
        if (ajwiVar != null) {
            ajwiVar.ln();
        }
    }

    @Override // defpackage.nvg
    public final boolean t() {
        Cfor cfor = this.n;
        return (cfor == null || cfor.b == 3) ? false : true;
    }

    @Override // defpackage.nvg
    public final boolean u() {
        SwipeRefreshLayout swipeRefreshLayout = this.o;
        return swipeRefreshLayout != null && swipeRefreshLayout.b;
    }

    @Override // defpackage.ajwo
    public final boolean v(final String str, final int i, final Runnable runnable) {
        RecyclerView recyclerView = this.g;
        if (recyclerView == null) {
            return false;
        }
        recyclerView.requestLayout();
        this.d.s(niy.m).V(false).h(niy.n).e().R(new ayrm() { // from class: nvi
            @Override // defpackage.ayrm
            public final void a() {
                nvk nvkVar = nvk.this;
                String str2 = str;
                int i2 = i;
                Runnable runnable2 = runnable;
                ajwi ajwiVar = nvkVar.f;
                if (ajwiVar != null) {
                    ajwiVar.v(str2, i2, runnable2);
                }
            }
        });
        return true;
    }
}
