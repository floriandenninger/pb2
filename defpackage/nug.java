package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.EngagementPanelTitleHeaderRendererOuterClass;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand;
import com.google.protos.youtube.api.innertube.YpcOffersEndpoint$YPCOffersEndpoint;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nug extends nop implements yfi {
    public final Context d;
    public final zaw e;
    public final ajoy f;
    public final aasm g;
    public final ypa h;
    public final ajxj i;
    public final azrw j;
    public final aaea k;
    public final aypn l;
    public final ajok m;
    public nrx n;
    public nqc o;
    public final aoae p;
    private final azrw q;
    private final ci r;
    private final akcy s;
    private LoadingFrameLayout t;
    private final aaxn u;

    public nug(Context context, azrw azrwVar, acqz acqzVar, zaw zawVar, aaxn aaxnVar, ajoy ajoyVar, jas jasVar, ypa ypaVar, ajxj ajxjVar, azrw azrwVar2, aoae aoaeVar, ci ciVar, aaea aaeaVar, aypn aypnVar, akcy akcyVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(acqzVar.mM(), aaeaVar);
        this.d = context;
        this.q = azrwVar;
        this.e = zawVar;
        this.u = aaxnVar;
        this.f = ajoyVar;
        this.g = jasVar;
        this.h = ypaVar;
        this.i = ajxjVar;
        this.j = azrwVar2;
        this.p = aoaeVar;
        this.r = ciVar;
        this.k = aaeaVar;
        this.l = aypnVar;
        this.s = akcyVar;
        this.m = new ajok();
    }

    private final nrx e() {
        nrx nrxVar = this.n;
        if (nrxVar != null) {
            return nrxVar;
        }
        nrx nrxVar2 = (nrx) this.q.get();
        this.n = nrxVar2;
        nrxVar2.h = this.a;
        return nrxVar2;
    }

    private static auwq f(apxf apxfVar) {
        if (!apxfVar.pY(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)) {
            return null;
        }
        ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) apxfVar.pX(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint);
        autu autuVar = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.l;
        if (autuVar == null) {
            autuVar = autu.a;
        }
        if (autuVar.b != 1) {
            return null;
        }
        autu autuVar2 = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.l;
        if (autuVar2 == null) {
            autuVar2 = autu.a;
        }
        if (autuVar2.b == 1) {
            return (auwq) autuVar2.c;
        }
        return auwq.a;
    }

    @Override // defpackage.nqg
    public final void B() {
    }

    @Override // defpackage.nqg
    public final void C() {
    }

    @Override // defpackage.nqg
    public final void D(apxf apxfVar) {
        this.p.o(this);
        this.s.f();
    }

    @Override // defpackage.nqg
    public final void F(nqd nqdVar) {
    }

    @Override // defpackage.nqg
    public final nqb b() {
        return e();
    }

    public final LoadingFrameLayout c() {
        if (this.t == null) {
            LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) LayoutInflater.from(this.d).inflate(R.layout.sponsorships_engagement_panel, (ViewGroup) null, false).findViewById(R.id.loading_layout);
            this.t = loadingFrameLayout;
            loadingFrameLayout.c();
        }
        return this.t;
    }

    public final void d() {
        nqc nqcVar = this.o;
        if (nqcVar != null) {
            nqcVar.a();
        }
    }

    @Override // defpackage.yfi
    public final void g() {
    }

    @Override // defpackage.yfi
    public final void h() {
        d();
    }

    @Override // defpackage.yfi
    public final void mJ(asfw asfwVar) {
        if (asfwVar != null && wcy.h(asfwVar) != null) {
            yjj.g(asfwVar).qh(this.r.getSupportFragmentManager(), "sponsorships_dialog");
        }
        d();
    }

    @Override // defpackage.nqg
    public final void n() {
        LoadingFrameLayout loadingFrameLayout = this.t;
        if (loadingFrameLayout != null) {
            loadingFrameLayout.post(new Runnable() { // from class: nue
                @Override // java.lang.Runnable
                public final void run() {
                    nug nugVar = nug.this;
                    nugVar.p.p(nugVar);
                }
            });
        }
    }

    @Override // defpackage.nqg
    public final void o(apxf apxfVar) {
        auwq f;
        aulq aulqVar;
        auwq f2;
        if (apxfVar == null) {
            return;
        }
        if (!apxfVar.pY(ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.showSponsorshipsEngagementPanelCommand)) {
            if (!apxfVar.pY(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)) {
                return;
            }
            autu autuVar = ((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) apxfVar.pX(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)).l;
            if (autuVar == null) {
                autuVar = autu.a;
            }
            if (autuVar.b != 1) {
                return;
            }
        }
        apxf apxfVar2 = null;
        if (apxfVar.pY(ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.showSponsorshipsEngagementPanelCommand)) {
            ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand = (ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand) apxfVar.pX(ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.showSponsorshipsEngagementPanelCommand);
            if ((showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.b & 2) != 0) {
                aulqVar = showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.d;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
            }
            aulqVar = null;
        } else {
            if (apxfVar.pY(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint) && (f = f(apxfVar)) != null && (1 & f.b) != 0) {
                aulqVar = f.c;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
            }
            aulqVar = null;
        }
        if (aulqVar != null) {
            e().q((aqtu) aulqVar.pX(EngagementPanelTitleHeaderRendererOuterClass.engagementPanelTitleRenderer));
            e().b();
        }
        if (apxfVar.pY(ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.showSponsorshipsEngagementPanelCommand)) {
            ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand2 = (ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand) apxfVar.pX(ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.showSponsorshipsEngagementPanelCommand);
            if ((showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand2.b & 4) != 0 && (apxfVar2 = showSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand2.e) == null) {
                apxfVar2 = apxf.a;
            }
        } else if (apxfVar.pY(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint) && (f2 = f(apxfVar)) != null && (f2.b & 2) != 0 && (apxfVar2 = f2.d) == null) {
            apxfVar2 = apxf.a;
        }
        if (apxfVar2 != null && apxfVar2.pY(YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint)) {
            abdz s = this.u.s();
            s.d((YpcOffersEndpoint$YPCOffersEndpoint) apxfVar2.pX(YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint));
            s.m(evr.bo(apxfVar2));
            c().c();
            this.u.t(s, new nuf(this));
        }
    }

    @Override // defpackage.nqg
    public final View oO() {
        return c();
    }

    @Override // defpackage.nqg
    public final void oP(ajol ajolVar) {
    }
}
