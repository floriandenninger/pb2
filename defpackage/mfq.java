package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.SectionListRendererOuterClass;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mfq extends mfn {
    public mfs ae;
    public gjp af;
    public aahd ag;
    public aren ah;
    public mfr ai;
    private ViewGroup aj;
    private View ak;
    private final mfo al = new mfo();

    private static int aI() {
        return Math.max(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels);
    }

    private final void aJ(View view) {
        ((ViewGroup) this.aj.findViewById(R.id.home_ads_content)).addView(view);
    }

    private final void aK() {
        ((ViewGroup) this.aj.findViewById(R.id.home_ads_content)).removeAllViews();
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [ajos, java.lang.Object] */
    public final void aH() {
        if (this.aj == null || this.ah == null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(qR());
        mfs mfsVar = this.ae;
        mft mftVar = new mft(this.ah, mfsVar.a, mfsVar.h, mfsVar.b.mM(), ((ajvb) mfsVar.c.get()).get(), mfsVar.d.a(aasm.n, mfsVar.b.mM()), mfsVar.e, mfsVar.f, (ajdw) mfsVar.g.get(), null, null);
        mftVar.a = (ViewGroup) LayoutInflater.from(mftVar.c).inflate(R.layout.home_ads_panel, frameLayout);
        aren arenVar = mftVar.b;
        if ((arenVar.b & 2) != 0) {
            aulq aulqVar = arenVar.d;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(ElementRendererOuterClass.elementRenderer)) {
                ajok ajokVar = new ajok();
                ajokVar.g(new HashMap());
                ajokVar.a(mftVar.d);
                asht ashtVar = ajokVar.c;
                if (ashtVar != null) {
                    ajokVar.c = ashtVar;
                }
                aulq aulqVar2 = mftVar.b.d;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                aqrf aqrfVar = (aqrf) aulqVar2.pX(ElementRendererOuterClass.elementRenderer);
                mftVar.i.oB(ajokVar, ajds.a(aqrfVar));
                ((ViewGroup) mftVar.a.findViewById(R.id.home_ads_panel_header)).addView(mftVar.i.a());
            }
        }
        aren arenVar2 = mftVar.b;
        if ((arenVar2.b & 4) != 0) {
            aulq aulqVar3 = arenVar2.e;
            if (aulqVar3 == null) {
                aulqVar3 = aulq.a;
            }
            if (aulqVar3.pY(SectionListRendererOuterClass.sectionListRenderer)) {
                RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(mftVar.c).inflate(R.layout.section_list, (ViewGroup) null, false);
                gmk a = mftVar.j.a(null, null, recyclerView, aasm.n, mftVar.f, mftVar.d, mftVar.e, ajxa.WI, ajwk.d, ajhb.ENGAGEMENT, mftVar.g, mftVar.c);
                aulq aulqVar4 = mftVar.b.e;
                if (aulqVar4 == null) {
                    aulqVar4 = aulq.a;
                }
                a.M(new aamd((auov) aulqVar4.pX(SectionListRendererOuterClass.sectionListRenderer)));
                ((ViewGroup) mftVar.a.findViewById(R.id.home_ads_panel_content)).addView(recyclerView);
            }
        }
        aK();
        if (this.ak == null) {
            this.ak = frameLayout;
            aJ(frameLayout);
            return;
        }
        frameLayout.setVisibility(8);
        View view = this.ak;
        this.ak = frameLayout;
        aJ(frameLayout);
        aJ(view);
        mfo mfoVar = this.al;
        View view2 = this.ak;
        mfoVar.b = new yzr(view, 500L, mfoVar.a, 8);
        mfoVar.c = new yzr(view2, 500L, mfoVar.a, 8);
        mfoVar.b.b(true);
        mfoVar.c.c(true);
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        o(0, R.style.HomeAdsDialog);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.af.d(3);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.home_ads_panel_bottom_sheet, viewGroup);
        this.aj = viewGroup2;
        viewGroup2.setMinimumHeight(aI());
        aH();
        return this.aj;
    }

    @Override // defpackage.bv, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        aren arenVar = this.ah;
        if ((arenVar.b & 8) != 0) {
            aahd aahdVar = this.ag;
            apxf apxfVar = arenVar.f;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.a(apxfVar);
        }
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.af.d(3);
    }

    @Override // defpackage.bv, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.af.d(0);
        mfr mfrVar = this.ai;
        if (mfrVar != null) {
            mfrVar.c.clear();
        }
        aK();
        this.aj = null;
    }

    @Override // defpackage.algk, defpackage.nh, defpackage.bv
    public final Dialog oq(Bundle bundle) {
        Dialog oq = super.oq(bundle);
        ((algj) oq).a().F((int) Math.floor(aI() * 0.9f));
        return oq;
    }
}
