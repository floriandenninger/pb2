package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;
import com.google.android.apps.youtube.app.extensions.reel.common.browse.ReelBrowseFragmentControllerImpl;
import com.google.android.apps.youtube.app.extensions.reel.common.browse.ReelBrowseFragmentFeedController;
import com.google.android.apps.youtube.app.extensions.reel.common.browse.ReelBrowseFragmentToolbarController;
import com.google.android.libraries.youtube.common.ui.RtlAwareViewPager;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hbx extends hbs implements hcf, haz {
    public ReelBrowseFragmentToolbarController ae;
    public ReelBrowseFragmentFeedController af;
    public hcd ag;
    public Context ah;
    public acqz ai;
    public LoadingFrameLayout aj;
    public aaea ak;
    public ReelBrowseFragmentControllerImpl al;
    public akht am;
    private Object an;

    public static hbx aH(apxf apxfVar) {
        hbx hbxVar = new hbx();
        Bundle bundle = new Bundle();
        bundle.putByteArray("ReelBrowseFragmentCommandKey", apxfVar.toByteArray());
        bundle.putInt("ReelBrowseFragmentBackgroundColor", R.attr.ytBrandBackgroundSolid);
        hbxVar.af(bundle);
        return hbxVar;
    }

    @Override // defpackage.hcf
    public final void aI() {
        ci C = C();
        if (C == null) {
            return;
        }
        this.ai.mM().t();
        C.onBackPressed();
    }

    @Override // defpackage.ce
    public final void aa(View view, Bundle bundle) {
        BrowseResponseModel browseResponseModel;
        hcb hcbVar;
        Bundle bundle2 = this.m;
        if (bundle2 == null) {
            zga.b("No arguments set - these are required for ReelBrowseFragment.");
            return;
        }
        byte[] byteArray = bundle2.getByteArray("ReelBrowseFragmentCommandKey");
        if (byteArray == null) {
            zga.b("No browse command set in ReelBrowseFragment arguments. This is required.");
            return;
        }
        TypedValue typedValue = new TypedValue();
        this.ah.getTheme().resolveAttribute(bundle2.getInt("ReelBrowseFragmentBackgroundColor", R.attr.ytBrandBackgroundSolid), typedValue, true);
        view.findViewById(R.id.reel_pivot_root_view).setBackgroundColor(typedValue.data);
        final apxf c = aahg.c(byteArray);
        this.aj = (LoadingFrameLayout) view.findViewById(R.id.reel_browse_loading_frame_layout);
        akht akhtVar = this.am;
        aaue aaueVar = (aaue) akhtVar.a.get();
        aaueVar.getClass();
        Executor executor = (Executor) akhtVar.e.get();
        executor.getClass();
        acqz acqzVar = (acqz) akhtVar.d.get();
        acqzVar.getClass();
        fgz fgzVar = (fgz) akhtVar.b.get();
        fgzVar.getClass();
        acsy acsyVar = (acsy) akhtVar.c.get();
        acsyVar.getClass();
        this.al = new ReelBrowseFragmentControllerImpl(aaueVar, executor, acqzVar, fgzVar, acsyVar, this);
        this.X.b(this.al);
        this.X.b(this.ae);
        this.X.b(this.af);
        Object obj = this.an;
        if (obj instanceof hbw) {
            hbw hbwVar = (hbw) obj;
            browseResponseModel = hbwVar.a;
            hcbVar = hbwVar.b;
            if (hbwVar.c.isPresent()) {
                aujs aujsVar = this.ak.a().u;
                if (aujsVar == null) {
                    aujsVar = aujs.a;
                }
                if (aujsVar.m) {
                    aong aongVar = (aong) c.toBuilder();
                    aonk aonkVar = atmb.b;
                    aone builder = ((atmc) c.pX(atmb.b)).toBuilder();
                    String str = (String) hbwVar.c.get();
                    builder.copyOnWrite();
                    atmc atmcVar = (atmc) builder.instance;
                    atmcVar.b |= 32;
                    atmcVar.f = str;
                    aongVar.e(aonkVar, (atmc) builder.build());
                    c = (apxf) aongVar.build();
                }
            }
        } else {
            browseResponseModel = null;
            hcbVar = null;
        }
        this.ae.a = (Toolbar) view.findViewById(R.id.toolbar);
        final ReelBrowseFragmentFeedController reelBrowseFragmentFeedController = this.af;
        reelBrowseFragmentFeedController.f = reelBrowseFragmentFeedController.g.a(reelBrowseFragmentFeedController.a.mM(), "");
        reelBrowseFragmentFeedController.b.h(reelBrowseFragmentFeedController, ReelBrowseFragmentFeedController.class);
        reelBrowseFragmentFeedController.e = new lvi(new axpg() { // from class: hca
            @Override // defpackage.axpg
            public final Object get() {
                return ReelBrowseFragmentFeedController.this.d;
            }
        }, new ibi((AppTabsBar) view.findViewById(R.id.tabs_bar), 1), new nvl((ConstraintLayout) view.findViewById(R.id.tabs_constraint_layout), 1), (RtlAwareViewPager) view.findViewById(R.id.reel_browse_tabs_view_pager));
        hcd hcdVar = this.ag;
        hcdVar.a.c((FrameLayout) view.findViewById(R.id.footer_container), ajxa.WI, null, hcdVar.b.mM());
        this.aj.f(new akdd() { // from class: hbv
            @Override // defpackage.akdd
            public final void qJ() {
                hbx hbxVar = hbx.this;
                hbxVar.al.g(c);
            }
        });
        this.ai.mM().e(acsb.b(6827), acrs.DEFAULT, c, adyu.cg(c, asit.b), adyu.cg(c, asit.a));
        this.ai.mM().n(new acqx(acsb.c(22156)));
        if (browseResponseModel == null) {
            this.al.g(c);
        } else {
            ReelBrowseFragmentControllerImpl reelBrowseFragmentControllerImpl = this.al;
            if (reelBrowseFragmentControllerImpl.c != null) {
                reelBrowseFragmentControllerImpl.b = browseResponseModel;
                reelBrowseFragmentControllerImpl.h(browseResponseModel);
                reelBrowseFragmentControllerImpl.i(browseResponseModel);
                reelBrowseFragmentControllerImpl.j(browseResponseModel);
            }
            if (hcbVar != null) {
                this.af.g(this.ah, hcbVar.b, hcbVar);
            }
            this.aj.a();
        }
        etx.K(view);
    }

    @Override // defpackage.haz
    public final Object l() {
        hbw hbwVar = new hbw();
        ReelBrowseFragmentControllerImpl reelBrowseFragmentControllerImpl = this.al;
        if (reelBrowseFragmentControllerImpl != null) {
            hbwVar.a = reelBrowseFragmentControllerImpl.b;
        }
        ReelBrowseFragmentFeedController reelBrowseFragmentFeedController = this.af;
        if (reelBrowseFragmentFeedController != null) {
            hcb hcbVar = null;
            if (reelBrowseFragmentFeedController.f != null && reelBrowseFragmentFeedController.e != null) {
                amrw h = amrz.h();
                amrp f = amru.f();
                for (nmp nmpVar : reelBrowseFragmentFeedController.f.i()) {
                    hcc hccVar = new hcc();
                    hccVar.a = nmpVar.c.ph();
                    hccVar.b = nmpVar.c.K.n.P();
                    aame aameVar = new aame(nmpVar.a);
                    h.g(aameVar, hccVar);
                    f.h(aameVar);
                }
                hcb hcbVar2 = new hcb();
                hcbVar2.a = h.c();
                hcbVar2.b = f.g();
                hcbVar2.c = reelBrowseFragmentFeedController.f.a();
                hcbVar = hcbVar2;
            }
            hbwVar.b = hcbVar;
        }
        acqz acqzVar = this.ai;
        if (acqzVar != null && acqzVar.mM() != null) {
            hbwVar.c = Optional.ofNullable(this.ai.mM().k());
        }
        return hbwVar;
    }

    @Override // defpackage.haz
    public final void m(Object obj) {
        this.an = obj;
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return LayoutInflater.from(this.ah).inflate(R.layout.reel_browse_root_view, viewGroup, false);
    }
}
