package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;
import com.google.protos.youtube.api.innertube.SponsorshipsRenderers;
import com.google.protos.youtube.api.innertube.YpcOffersEndpoint$YPCOffersEndpoint;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yiz extends yif implements View.OnClickListener, yfi, ypd {
    public auxf ae;
    public LoadingFrameLayout af;
    public acra ag;
    public acqz ah;
    public zaw ai;
    public ajoy aj;
    public ypa ak;
    public azrw al;
    public azrw am;
    public ci an;
    public aarr ao;
    public aaea ap;
    public aypn aq;
    public ajxj ar;
    public aoae as;
    public aaxn at;
    private Context au;
    private apxf av;
    private Toolbar aw;
    private ajuw ax;

    @Override // defpackage.ce
    public final void X() {
        this.as.p(this);
        this.ak.m(this);
        super.X();
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        this.as.o(this);
        this.ak.g(this);
    }

    public final void aH() {
        aqyg aqygVar;
        auxf auxfVar = this.ae;
        if (auxfVar == null || this.af == null) {
            return;
        }
        aulq aulqVar = auxfVar.e;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        auwu auwuVar = (auwu) ahbj.n(aulqVar, SponsorshipsRenderers.sponsorshipsAppBarRenderer);
        whu.I(this.aw, auwuVar != null);
        if (auwuVar != null) {
            Toolbar toolbar = this.aw;
            if ((auwuVar.b & 1) != 0) {
                aqygVar = auwuVar.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            toolbar.x(ajcq.b(aqygVar));
            aulq aulqVar2 = auwuVar.d;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            atdc atdcVar = (atdc) ahbj.n(aulqVar2, MenuRendererOuterClass.menuRenderer);
            View findViewById = this.af.findViewById(R.id.contextual_menu_anchor);
            whu.I(findViewById, atdcVar != null);
            if (atdcVar != null) {
                if ((atdcVar.b & 256) != 0) {
                    aott aottVar = atdcVar.i;
                    if (aottVar == null) {
                        aottVar = aott.a;
                    }
                    aots aotsVar = aottVar.c;
                    if (aotsVar == null) {
                        aotsVar = aots.a;
                    }
                    findViewById.setContentDescription(aotsVar.c);
                }
                ajuw ajuwVar = (ajuw) this.am.get();
                this.ax = ajuwVar;
                ajuwVar.d(findViewById, atdcVar, atdcVar, this.ag);
            }
        }
        aask aaskVar = new aask(1);
        Context context = this.au;
        acra acraVar = this.ag;
        yja yjaVar = new yja(context, acraVar, this.aj, aaskVar, this.ak, this.ar.a(aaskVar, acraVar), this.ai, this.al, this.ap, this.aq);
        ((FrameLayout) this.af.findViewById(R.id.offer_view)).addView(yjaVar.a);
        ajok ajokVar = new ajok();
        ajokVar.a(this.ag);
        yjaVar.oB(ajokVar, this.ae);
        this.af.a();
    }

    @Override // defpackage.yfi
    public final void g() {
    }

    @Override // defpackage.yfi
    public final void h() {
        dismiss();
    }

    @Override // defpackage.yif, defpackage.bv, defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        this.au = context;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{yid.class};
        }
        if (i == 0) {
            dismiss();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.yfi
    public final void mJ(asfw asfwVar) {
        if (asfwVar != null && wcy.h(asfwVar) != null) {
            yjj.g(asfwVar).qh(this.an.getSupportFragmentManager(), "sponsorships_dialog");
        }
        dismiss();
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        auxf auxfVar;
        super.mR(bundle);
        this.ag = this.ah.mM();
        try {
            this.av = (apxf) aonm.parseFrom(apxf.a, this.m.getByteArray("get_offers_command"), aomw.b());
        } catch (aoob e) {
            Log.e("SponsorshipsOffer", "Failed to deserialize offers command.", e);
        }
        if (this.m.containsKey("get_offers_response")) {
            asga asgaVar = (asga) this.ao.a(this.m.getByteArray("get_offers_response"), asga.a);
            if (asgaVar == null) {
                Log.e("SponsorshipsOffer", "Failed to deserialize offer list renderer.");
            } else {
                asfq asfqVar = asgaVar.d;
                if (asfqVar == null) {
                    asfqVar = asfq.a;
                }
                if (asfqVar.c == 204280949) {
                    asfq asfqVar2 = asgaVar.d;
                    if (asfqVar2 == null) {
                        asfqVar2 = asfq.a;
                    }
                    if (asfqVar2.c == 204280949) {
                        auxfVar = (auxf) asfqVar2.d;
                    } else {
                        auxfVar = auxf.a;
                    }
                    this.ae = auxfVar;
                }
            }
        }
        o(0, R.style.Sponsorships_FullScreen);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) layoutInflater.inflate(R.layout.sponsorships_offer_dialog_layout, viewGroup, false);
        this.af = loadingFrameLayout;
        if (loadingFrameLayout.getLayoutParams() == null) {
            this.af.setLayoutParams(new we(-1, -1));
        }
        Toolbar toolbar = (Toolbar) this.af.findViewById(R.id.toolbar);
        this.aw = toolbar;
        toolbar.r(this);
        zau zauVar = new zau(this.au);
        Toolbar toolbar2 = this.aw;
        toolbar2.q(zauVar.b(toolbar2.e(), wbs.W(this.au, R.attr.ytIconActiveOther).orElse(0)));
        if (this.ae != null) {
            aH();
        } else if (this.af != null && this.av != null) {
            abdz s = this.at.s();
            s.d((YpcOffersEndpoint$YPCOffersEndpoint) this.av.pX(YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint));
            apxf apxfVar = this.av;
            if ((apxfVar.b & 1) == 0) {
                s.m(aaef.b);
            } else {
                s.m(apxfVar.c.I());
            }
            this.af.c();
            this.at.t(s, new yiy(this));
        }
        return this.af;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dismiss();
    }
}
