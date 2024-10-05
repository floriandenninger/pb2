package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;
import com.google.android.libraries.youtube.common.ui.RtlAwareViewPager;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ibm extends hzj {
    public aaue ae;
    public acra af;
    public ajxj ag;
    public ajoy ah;
    public zaw ai;
    public ypa aj;
    public ajvb ak;
    public Executor al;
    public Executor am;
    public gni an;
    public aaea ao;
    public aypn ap;
    public BrowseResponseModel aq;
    public CoordinatorLayout ar;
    public nmq as;
    public gab at;
    public LoadingFrameLayout au;
    public ajvd av;
    public final fzb aw = new ibl(0);
    public ogx ax;

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        o(2, R.style.ReelTheme_VideoPicker);
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mS() {
        super.mS();
        this.as.n();
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ContextThemeWrapper contextThemeWrapper;
        if (this.an.a() == gng.DARK) {
            contextThemeWrapper = new ContextThemeWrapper(qR(), R.style.ReelTheme_VideoPicker);
        } else {
            contextThemeWrapper = new ContextThemeWrapper(qR(), R.style.ReelTheme_VideoPicker_Light);
        }
        View inflate = LayoutInflater.from(contextThemeWrapper).inflate(R.layout.video_picker_fragment, (ViewGroup) null);
        this.ar = (CoordinatorLayout) inflate.findViewById(R.id.video_picker_coordinator_layout);
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) inflate.findViewById(R.id.video_picker_loading_layout);
        this.au = loadingFrameLayout;
        loadingFrameLayout.c();
        this.as = this.ax.a(this.af, "");
        AppTabsBar appTabsBar = (AppTabsBar) this.ar.findViewById(R.id.tabs_bar);
        RtlAwareViewPager rtlAwareViewPager = (RtlAwareViewPager) this.ar.findViewById(R.id.view_pager);
        this.av = this.ag.a(this.ae, this.af);
        final int i = 1;
        final int i2 = 0;
        this.at = new lvi(new axpg(this) { // from class: ibj
            public final /* synthetic */ ibm a;

            {
                this.a = this;
            }

            @Override // defpackage.axpg
            public final Object get() {
                return i != 0 ? this.a.aw : (ConstraintLayout) this.a.ar.findViewById(R.id.tabs_constraint_layout);
            }
        }, new ibi(appTabsBar, 0), new axpg(this) { // from class: ibj
            public final /* synthetic */ ibm a;

            {
                this.a = this;
            }

            @Override // defpackage.axpg
            public final Object get() {
                return i2 != 0 ? this.a.aw : (ConstraintLayout) this.a.ar.findViewById(R.id.tabs_constraint_layout);
            }
        }, rtlAwareViewPager);
        aauc f = this.ae.f();
        f.d("FEvideo_picker");
        f.m(aaef.b);
        f.s(3);
        ynm.k(this.ae.h(f, this.am), this.am, new ynk() { // from class: ibg
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                ibm.this.au.b(th.getLocalizedMessage(), true);
            }
        }, new ynl() { // from class: ibh
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                final ibm ibmVar = ibm.this;
                ibmVar.aq = (BrowseResponseModel) obj;
                ibmVar.al.execute(new Runnable() { // from class: ibk
                    /* JADX WARN: Type inference failed for: r22v0, types: [ajos, java.lang.Object] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        amru amruVar;
                        ViewGroup viewGroup2;
                        arjv arjvVar;
                        avzc avzcVar;
                        final ibm ibmVar2 = ibm.this;
                        ViewGroup viewGroup3 = null;
                        ibmVar2.af.G(acsb.b(6827), acrs.DEFAULT, null);
                        ibmVar2.af.n(new acqx(acsb.c(22156)));
                        ((acqq) ibmVar2.af).D(new acqx(ibmVar2.aq.d()));
                        BrowseResponseModel browseResponseModel = ibmVar2.aq;
                        if (browseResponseModel != null && (arjvVar = browseResponseModel.a) != null) {
                            arjq arjqVar = arjvVar.d;
                            if (arjqVar == null) {
                                arjqVar = arjq.a;
                            }
                            if (arjqVar.b == 156098381) {
                                arjq arjqVar2 = ibmVar2.aq.a.d;
                                if (arjqVar2 == null) {
                                    arjqVar2 = arjq.a;
                                }
                                if (arjqVar2.b == 156098381) {
                                    avzcVar = (avzc) arjqVar2.c;
                                } else {
                                    avzcVar = avzc.a;
                                }
                                TextView textView = (TextView) ibmVar2.ar.findViewById(R.id.video_picker_title);
                                aqyg aqygVar = avzcVar.b;
                                if (aqygVar == null) {
                                    aqygVar = aqyg.a;
                                }
                                textView.setText(ajcq.b(aqygVar));
                                ibmVar2.ar.findViewById(R.id.video_picker_exit).setOnClickListener(new View.OnClickListener() { // from class: ibf
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        ibm ibmVar3 = ibm.this;
                                        dd ddVar = ibmVar3.z;
                                        if (ddVar == null) {
                                            return;
                                        }
                                        dn k = ddVar.k();
                                        k.m(ibmVar3);
                                        k.a();
                                    }
                                });
                            }
                        }
                        amru g = ibmVar2.aq.g();
                        ArrayList arrayList = new ArrayList();
                        int size = g.size();
                        int i3 = 0;
                        while (i3 < size) {
                            aame aameVar = (aame) g.get(i3);
                            if (aameVar.a() == null) {
                                amruVar = g;
                                viewGroup2 = viewGroup3;
                            } else {
                                aveh avehVar = aameVar.a;
                                View inflate2 = ibmVar2.mP().inflate(R.layout.video_picker_recycler_view, viewGroup3);
                                RecyclerView recyclerView = (RecyclerView) inflate2.findViewById(R.id.section_list_contents);
                                ibmVar2.qR();
                                recyclerView.af(new LinearLayoutManager(1));
                                amruVar = g;
                                ajwi ajwiVar = new ajwi(null, recyclerView, ibmVar2.ah, new ajvq(), ibmVar2.ae, ibmVar2.aj, ibmVar2.av, ibmVar2.ai, ibmVar2.af, ibmVar2.ak.get(), ajxa.WI, ajwk.d, ibmVar2.ao, ibmVar2.ap);
                                ajpd ajpdVar = new ajpd();
                                if ((avehVar.b & 2048) != 0) {
                                    avef avefVar = avehVar.i;
                                    if (avefVar == null) {
                                        avefVar = avef.a;
                                    }
                                    ajpdVar.add(avefVar);
                                }
                                ajwiVar.L(ajpdVar);
                                ajwiVar.V(aameVar.a());
                                viewGroup2 = null;
                                arrayList.add(new nmp(avehVar, inflate2, ajwiVar, null));
                            }
                            i3++;
                            viewGroup3 = viewGroup2;
                            g = amruVar;
                        }
                        ibmVar2.as.m(ibmVar2.at, arrayList, 0);
                        ibmVar2.au.a();
                    }
                });
            }
        });
        return this.ar;
    }

    @Override // defpackage.bv, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        CoordinatorLayout coordinatorLayout = this.ar;
        if (coordinatorLayout != null && coordinatorLayout.getParent() != null) {
            ((ViewGroup) this.ar.getParent()).removeView(this.ar);
            this.ar = null;
        }
        super.onDismiss(dialogInterface);
    }
}
