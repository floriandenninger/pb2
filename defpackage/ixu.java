package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.YpcOffersListDialogFragmentController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint;
import com.google.protos.youtube.api.innertube.YpcOffersEndpoint$YPCOffersEndpoint;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ixu extends ivv implements mxy, ybl {
    public aaxn aA;
    private TextView aB;
    private View aC;
    private RecyclerView aD;
    private View aE;
    private ygy aF;
    private zfk aG;
    private String aH = null;
    public Activity ae;
    public aahd af;
    public afsy ag;
    public aftn ah;
    public acqz ai;
    public zaw aj;
    public azrw ak;
    public ajoy al;
    public fma am;
    apxf an;
    public String ao;
    public AlertDialog ap;
    public TextView aq;
    public EditText ar;
    public AlertDialog as;
    public ajpd at;
    public YpcOffersListDialogFragmentController au;
    public akht av;
    public zzw aw;
    public ajyw ax;
    public aoae ay;
    public aoae az;

    @Override // defpackage.ivv, defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        this.ae = activity;
    }

    public final ygy aH() {
        if (this.aF == null) {
            this.aF = new ygy(this.ae, this.aj);
        }
        return this.aF;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aI() {
        this.aE.setVisibility(8);
        this.aD.setVisibility(0);
        this.aD.setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aJ() {
        auwo auwoVar;
        if (this.an == null) {
            zga.b("No navigation endpoint provided.");
            dismiss();
        }
        if (this.an.pY(YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint)) {
            aL(null);
            return;
        }
        if (this.an.pY(ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.managePurchaseEndpoint)) {
            ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint managePurchaseEndpointOuterClass$ManagePurchaseEndpoint = (ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint) this.an.pX(ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.managePurchaseEndpoint);
            asxx asxxVar = managePurchaseEndpointOuterClass$ManagePurchaseEndpoint.b;
            if (asxxVar == null) {
                asxxVar = asxx.a;
            }
            if (asxxVar.b == 173521720) {
                asxx asxxVar2 = managePurchaseEndpointOuterClass$ManagePurchaseEndpoint.b;
                if (asxxVar2 == null) {
                    asxxVar2 = asxx.a;
                }
                if (asxxVar2.b == 173521720) {
                    auwoVar = (auwo) asxxVar2.c;
                } else {
                    auwoVar = auwo.a;
                }
                aK();
                aI();
                aM("");
                this.at.add(auwoVar);
                return;
            }
            return;
        }
        String valueOf = String.valueOf(this.an);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
        sb.append("Unknown navigation endpoint provided: ");
        sb.append(valueOf);
        zga.b(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aK() {
        if (this.at == null) {
            ajnq ajnqVar = new ajnq();
            ajnqVar.f(awgq.class, new ajou(this.ak));
            final int i = 1;
            ajnqVar.f(atcp.class, new ajoq(this) { // from class: ixq
                public final /* synthetic */ ixu a;

                {
                    this.a = this;
                }

                @Override // defpackage.ajoq
                public final ajom b(ViewGroup viewGroup) {
                    int i2 = i;
                    if (i2 == 0) {
                        final ixu ixuVar = this.a;
                        zzw zzwVar = ixuVar.aw;
                        ybo yboVar = new ybo() { // from class: ixp
                            @Override // defpackage.ybo
                            public final void a() {
                                ixu.this.dismiss();
                            }
                        };
                        aoae aoaeVar = ixuVar.az;
                        Context context = (Context) zzwVar.b.get();
                        context.getClass();
                        aahd aahdVar = (aahd) zzwVar.a.get();
                        aahdVar.getClass();
                        aoae aoaeVar2 = (aoae) zzwVar.c.get();
                        aoaeVar2.getClass();
                        ajyw ajywVar = (ajyw) zzwVar.d.get();
                        ajywVar.getClass();
                        aoaeVar.getClass();
                        return new yci(context, aahdVar, aoaeVar2, ajywVar, viewGroup, yboVar, aoaeVar, null, null, null, null, null, null);
                    }
                    if (i2 != 1) {
                        ixu ixuVar2 = this.a;
                        ajyw ajywVar2 = ixuVar2.ax;
                        Context context2 = (Context) ajywVar2.a.get();
                        context2.getClass();
                        yfl yflVar = (yfl) ajywVar2.b.get();
                        ajoy ajoyVar = (ajoy) ajywVar2.c.get();
                        viewGroup.getClass();
                        return new ycn(context2, yflVar, ajoyVar, viewGroup, ixuVar2, null, null, null, null);
                    }
                    final ixu ixuVar3 = this.a;
                    akht akhtVar = ixuVar3.av;
                    ybo yboVar2 = new ybo() { // from class: ixp
                        @Override // defpackage.ybo
                        public final void a() {
                            ixu.this.dismiss();
                        }
                    };
                    Context context3 = (Context) akhtVar.a.get();
                    context3.getClass();
                    aahd aahdVar2 = (aahd) akhtVar.b.get();
                    aahdVar2.getClass();
                    aoae aoaeVar3 = (aoae) akhtVar.e.get();
                    aoaeVar3.getClass();
                    zzw zzwVar2 = (zzw) akhtVar.c.get();
                    zzwVar2.getClass();
                    ajyw ajywVar3 = (ajyw) akhtVar.d.get();
                    ajywVar3.getClass();
                    return new ybt(context3, viewGroup, aahdVar2, aoaeVar3, zzwVar2, ajywVar3, yboVar2, null, null, null, null, null, null);
                }
            });
            final int i2 = 0;
            ajnqVar.f(auwo.class, new ajoq(this) { // from class: ixq
                public final /* synthetic */ ixu a;

                {
                    this.a = this;
                }

                @Override // defpackage.ajoq
                public final ajom b(ViewGroup viewGroup) {
                    int i22 = i2;
                    if (i22 == 0) {
                        final ixu ixuVar = this.a;
                        zzw zzwVar = ixuVar.aw;
                        ybo yboVar = new ybo() { // from class: ixp
                            @Override // defpackage.ybo
                            public final void a() {
                                ixu.this.dismiss();
                            }
                        };
                        aoae aoaeVar = ixuVar.az;
                        Context context = (Context) zzwVar.b.get();
                        context.getClass();
                        aahd aahdVar = (aahd) zzwVar.a.get();
                        aahdVar.getClass();
                        aoae aoaeVar2 = (aoae) zzwVar.c.get();
                        aoaeVar2.getClass();
                        ajyw ajywVar = (ajyw) zzwVar.d.get();
                        ajywVar.getClass();
                        aoaeVar.getClass();
                        return new yci(context, aahdVar, aoaeVar2, ajywVar, viewGroup, yboVar, aoaeVar, null, null, null, null, null, null);
                    }
                    if (i22 != 1) {
                        ixu ixuVar2 = this.a;
                        ajyw ajywVar2 = ixuVar2.ax;
                        Context context2 = (Context) ajywVar2.a.get();
                        context2.getClass();
                        yfl yflVar = (yfl) ajywVar2.b.get();
                        ajoy ajoyVar = (ajoy) ajywVar2.c.get();
                        viewGroup.getClass();
                        return new ycn(context2, yflVar, ajoyVar, viewGroup, ixuVar2, null, null, null, null);
                    }
                    final ixu ixuVar3 = this.a;
                    akht akhtVar = ixuVar3.av;
                    ybo yboVar2 = new ybo() { // from class: ixp
                        @Override // defpackage.ybo
                        public final void a() {
                            ixu.this.dismiss();
                        }
                    };
                    Context context3 = (Context) akhtVar.a.get();
                    context3.getClass();
                    aahd aahdVar2 = (aahd) akhtVar.b.get();
                    aahdVar2.getClass();
                    aoae aoaeVar3 = (aoae) akhtVar.e.get();
                    aoaeVar3.getClass();
                    zzw zzwVar2 = (zzw) akhtVar.c.get();
                    zzwVar2.getClass();
                    ajyw ajywVar3 = (ajyw) akhtVar.d.get();
                    ajywVar3.getClass();
                    return new ybt(context3, viewGroup, aahdVar2, aoaeVar3, zzwVar2, ajywVar3, yboVar2, null, null, null, null, null, null);
                }
            });
            final int i3 = 2;
            ajnqVar.f(avkt.class, new ajoq(this) { // from class: ixq
                public final /* synthetic */ ixu a;

                {
                    this.a = this;
                }

                @Override // defpackage.ajoq
                public final ajom b(ViewGroup viewGroup) {
                    int i22 = i3;
                    if (i22 == 0) {
                        final ixu ixuVar = this.a;
                        zzw zzwVar = ixuVar.aw;
                        ybo yboVar = new ybo() { // from class: ixp
                            @Override // defpackage.ybo
                            public final void a() {
                                ixu.this.dismiss();
                            }
                        };
                        aoae aoaeVar = ixuVar.az;
                        Context context = (Context) zzwVar.b.get();
                        context.getClass();
                        aahd aahdVar = (aahd) zzwVar.a.get();
                        aahdVar.getClass();
                        aoae aoaeVar2 = (aoae) zzwVar.c.get();
                        aoaeVar2.getClass();
                        ajyw ajywVar = (ajyw) zzwVar.d.get();
                        ajywVar.getClass();
                        aoaeVar.getClass();
                        return new yci(context, aahdVar, aoaeVar2, ajywVar, viewGroup, yboVar, aoaeVar, null, null, null, null, null, null);
                    }
                    if (i22 != 1) {
                        ixu ixuVar2 = this.a;
                        ajyw ajywVar2 = ixuVar2.ax;
                        Context context2 = (Context) ajywVar2.a.get();
                        context2.getClass();
                        yfl yflVar = (yfl) ajywVar2.b.get();
                        ajoy ajoyVar = (ajoy) ajywVar2.c.get();
                        viewGroup.getClass();
                        return new ycn(context2, yflVar, ajoyVar, viewGroup, ixuVar2, null, null, null, null);
                    }
                    final ixu ixuVar3 = this.a;
                    akht akhtVar = ixuVar3.av;
                    ybo yboVar2 = new ybo() { // from class: ixp
                        @Override // defpackage.ybo
                        public final void a() {
                            ixu.this.dismiss();
                        }
                    };
                    Context context3 = (Context) akhtVar.a.get();
                    context3.getClass();
                    aahd aahdVar2 = (aahd) akhtVar.b.get();
                    aahdVar2.getClass();
                    aoae aoaeVar3 = (aoae) akhtVar.e.get();
                    aoaeVar3.getClass();
                    zzw zzwVar2 = (zzw) akhtVar.c.get();
                    zzwVar2.getClass();
                    ajyw ajywVar3 = (ajyw) akhtVar.d.get();
                    ajywVar3.getClass();
                    return new ybt(context3, viewGroup, aahdVar2, aoaeVar3, zzwVar2, ajywVar3, yboVar2, null, null, null, null, null, null);
                }
            });
            ajnqVar.f(awgt.class, new mxx(this.ae, this));
            ajnqVar.f(mom.class, new whk((Context) this.ae, 1, (byte[]) null));
            ajox a = this.al.a(ajnqVar);
            ajpd ajpdVar = new ajpd();
            a.h(ajpdVar);
            a.rU(new ajnw(this.ai.mM()));
            this.aD.ac(a);
            this.at = ajpdVar;
        }
        this.at.clear();
    }

    public final void aL(String str) {
        this.aE.setVisibility(0);
        this.aD.setVisibility(4);
        this.aD.setClickable(false);
        apxf apxfVar = this.an;
        if (apxfVar == null || !apxfVar.pY(YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint)) {
            zga.b("Invalid navigation endpoint provided.");
            dismiss();
            return;
        }
        abdz s = this.aA.s();
        s.d((YpcOffersEndpoint$YPCOffersEndpoint) this.an.pX(YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint));
        s.m(evr.bo(this.an));
        if (!TextUtils.isEmpty(str)) {
            s.a = abdz.i(str);
        }
        this.ao = str;
        this.aA.t(s, new ixt(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aM(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.aB.setVisibility(8);
            this.aC.setVisibility(8);
        } else {
            this.aC.setVisibility(0);
            this.aB.setVisibility(0);
            this.aB.setText(charSequence);
        }
    }

    public final void aN(awgt awgtVar) {
        awgk awgkVar;
        CharSequence charSequence;
        aK();
        this.at.addAll(wcy.j(awgtVar));
        awgs awgsVar = awgtVar.f;
        if (awgsVar == null) {
            awgsVar = awgs.a;
        }
        CharSequence charSequence2 = null;
        if ((awgsVar.b & 1) != 0) {
            awgs awgsVar2 = awgtVar.f;
            if (awgsVar2 == null) {
                awgsVar2 = awgs.a;
            }
            awgkVar = awgsVar2.c;
            if (awgkVar == null) {
                awgkVar = awgk.a;
            }
        } else {
            awgkVar = null;
        }
        aqyg aqygVar = awgtVar.e;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        if (!TextUtils.isEmpty(ajcq.b(aqygVar)) && awgkVar != null) {
            this.at.add(awgtVar);
        }
        if (awgtVar.g.size() > 0 || awgtVar.i.size() > 0) {
            ajpd ajpdVar = this.at;
            CharSequence[] l = wcy.l(awgtVar.g, this.af);
            CharSequence[] l2 = wcy.l(awgtVar.i, this.af);
            CharSequence concat = TextUtils.concat(System.getProperty("line.separator"), System.getProperty("line.separator"));
            if (l != null) {
                for (CharSequence charSequence3 : l) {
                    charSequence2 = TextUtils.isEmpty(charSequence2) ? charSequence3 : TextUtils.concat(charSequence2, concat, charSequence3);
                }
            }
            if (l2 != null) {
                charSequence = charSequence2;
                for (CharSequence charSequence4 : l2) {
                    charSequence = TextUtils.isEmpty(charSequence) ? charSequence4 : TextUtils.concat(charSequence, concat, charSequence4);
                }
            } else {
                charSequence = charSequence2;
            }
            ajpdVar.add(new mom(charSequence2, charSequence));
        }
        aI();
        aqyg aqygVar2 = awgtVar.c;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        aM(ajcq.b(aqygVar2));
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mD() {
        super.mD();
        this.am.b(this.aH);
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        o(1, 0);
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mS() {
        super.mS();
        this.aH = this.am.a();
        if (!this.ag.t()) {
            this.d.hide();
            this.ah.c(this.ae, null, new ixs(this));
        } else {
            aJ();
        }
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mg(layoutInflater, viewGroup, bundle);
        if (bundle == null) {
            bundle = this.m;
        }
        this.an = aahg.b(bundle.getByteArray("navigation_endpoint"));
        this.aG = this.ay.q(new ixr(this));
        View inflate = layoutInflater.inflate(R.layout.ypc_offers_list_item, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.offers);
        this.aD = recyclerView;
        recyclerView.af(new LinearLayoutManager());
        this.aB = (TextView) inflate.findViewById(R.id.title);
        this.aC = inflate.findViewById(R.id.separator);
        this.aE = inflate.findViewById(R.id.progress);
        aM(null);
        return inflate;
    }

    @Override // defpackage.bv, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.au.h(this);
        yem yemVar = (yem) this.aG;
        aoae aoaeVar = yemVar.b;
        aoaeVar.b.remove(yemVar.a);
        amxd listIterator = amsx.p(this.az.b).listIterator();
        while (listIterator.hasNext()) {
            ((DialogInterface.OnDismissListener) listIterator.next()).onDismiss(dialogInterface);
        }
    }
}
