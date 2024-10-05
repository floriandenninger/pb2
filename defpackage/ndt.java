package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MutedSparklesRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ndt implements ajom {
    private Object A;
    private augz B;
    private augm C;
    private apmg D;
    private atlt E;
    public final ndm a;
    public final nce b;
    public final View c;
    public boolean d;
    private final nah e;
    private final nbv f;
    private final nhb g;
    private final nbs h;
    private final View i;
    private final View j;
    private final View k;
    private final View l;
    private final View m;
    private final TextView n;
    private final TextView o;
    private final View p;
    private final TextView q;
    private final TextView r;
    private final RatingBar s;
    private final TextView t;
    private final View u;
    private final View v;
    private final View w;
    private final View x;
    private final View y;
    private acra z;

    /* JADX INFO: Access modifiers changed from: protected */
    public ndt(Context context, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, ajuw ajuwVar, wyz wyzVar, tdv tdvVar, wzq wzqVar, euv euvVar, ypa ypaVar, ViewGroup viewGroup, boolean z, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.promoted_sparkles_text_ctd_watch_15_click, viewGroup, false);
        this.c = inflate;
        View findViewById = inflate.findViewById(R.id.ad_view);
        this.i = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.content_layout);
        this.j = findViewById2;
        View findViewById3 = findViewById.findViewById(R.id.click_overlay);
        this.k = findViewById3;
        View findViewById4 = findViewById2.findViewById(R.id.content_background);
        this.l = findViewById4;
        View findViewById5 = findViewById2.findViewById(R.id.thumbnail_wrapper);
        this.m = findViewById5;
        TextView textView = (TextView) findViewById2.findViewById(R.id.title);
        this.n = textView;
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.description);
        this.o = textView2;
        View findViewById6 = findViewById2.findViewById(R.id.ad_attribution);
        this.p = findViewById6;
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.app_store_text);
        this.q = textView3;
        TextView textView4 = (TextView) findViewById2.findViewById(R.id.rating_text);
        this.r = textView4;
        RatingBar ratingBar = (RatingBar) findViewById2.findViewById(R.id.rating);
        this.s = ratingBar;
        TextView textView5 = (TextView) findViewById2.findViewById(R.id.price);
        this.t = textView5;
        View findViewById7 = findViewById2.findViewById(R.id.cta_button_wrapper);
        this.u = findViewById7;
        View findViewById8 = findViewById7.findViewById(R.id.cta_button_touchable_wrapper);
        this.v = findViewById8;
        View findViewById9 = findViewById2.findViewById(R.id.close_button);
        this.w = findViewById9;
        View findViewById10 = findViewById2.findViewById(R.id.contextual_menu_anchor);
        this.x = findViewById10;
        View findViewById11 = findViewById2.findViewById(R.id.static_contextual_menu_anchor);
        this.y = findViewById11;
        nbv nbvVar = new nbv(euvVar, new nbu() { // from class: ndp
            @Override // defpackage.nbu
            public final void a(boolean z2) {
                ndt ndtVar = ndt.this;
                ndtVar.d = true;
                ndtVar.d(z2);
                ndtVar.c.requestLayout();
            }
        });
        this.f = nbvVar;
        nhb nhbVar = new nhb(context, aahdVar, wzqVar, wyzVar, tdvVar, euvVar, ypaVar, inflate, findViewById2, findViewById3, inflate, findViewById9, findViewById10, findViewById11, new View.OnClickListener() { // from class: ndn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ndt.this.b.a();
            }
        }, new ngx() { // from class: ndq
            @Override // defpackage.ngx
            public final void a(boolean z2) {
                ndt.this.a.f(!z2);
            }
        }, new nha() { // from class: ndr
            @Override // defpackage.nha
            public final void a(boolean z2, boolean z3) {
                ndm ndmVar = ndt.this.a;
                boolean z4 = false;
                if (!z2 && !z3) {
                    z4 = true;
                }
                ndmVar.f(z4);
            }
        }, nbvVar, z);
        this.g = nhbVar;
        this.a = new ndm(context, ajjzVar, ajutVar, ajuwVar, inflate, findViewById2, true, z, ajywVar, akbdVar, null, null, null, null, null);
        this.h = new nbs(ajutVar, findViewById2, ajywVar, null, null, null, null, null);
        nah nahVar = new nah(nhbVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new nag() { // from class: ndo
            @Override // defpackage.nag
            public final void a() {
                ndt.this.b.b();
            }
        });
        this.e = nahVar;
        this.b = new nce(nhbVar, nahVar, findViewById);
        nhbVar.B(textView, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nhbVar.B(findViewById8, augq.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        nhbVar.B(textView3, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_APP_STORE);
        nhbVar.B(findViewById6, augq.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nhbVar.B(findViewById4, augq.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        nhbVar.B(textView2, augq.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        nhbVar.B(textView5, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_PRICE);
        nhbVar.B(textView4, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nhbVar.B(ratingBar, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nhbVar.B(findViewById5, augq.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.g.c();
    }

    public final void d(boolean z) {
        arfs arfsVar;
        arfs arfsVar2;
        aqyg aqygVar;
        aqyg aqygVar2;
        aowm aowmVar;
        augx augxVar;
        this.h.a();
        this.a.v(this.z, this.A, this.B, this.E);
        augn augnVar = null;
        this.h.m = this.B.z ? 3 : null;
        nbs nbsVar = this.h;
        augz augzVar = this.B;
        augm augmVar = this.C;
        boolean z2 = this.d;
        if ((augzVar.b & 8) != 0) {
            arfs arfsVar3 = augzVar.f;
            if (arfsVar3 == null) {
                arfsVar3 = arfs.a;
            }
            arfsVar = arfsVar3;
        } else {
            arfsVar = null;
        }
        if ((augmVar.b & 1) != 0) {
            arfs arfsVar4 = augmVar.c;
            if (arfsVar4 == null) {
                arfsVar4 = arfs.a;
            }
            arfsVar2 = arfsVar4;
        } else {
            arfsVar2 = null;
        }
        if ((augmVar.b & 2) != 0) {
            aqygVar = augmVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        if ((augmVar.b & 4) != 0) {
            aqygVar2 = augmVar.e;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        Spanned b2 = ajcq.b(aqygVar2);
        aulq aulqVar = augmVar.h;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
            aulq aulqVar2 = augmVar.h;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            aowmVar = (aowm) aulqVar2.pX(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
        } else {
            aowmVar = null;
        }
        if ((augmVar.b & 16) != 0) {
            augx augxVar2 = augmVar.i;
            if (augxVar2 == null) {
                augxVar2 = augx.a;
            }
            augxVar = augxVar2;
        } else {
            augxVar = null;
        }
        if ((augmVar.b & 32) != 0 && (augnVar = augmVar.j) == null) {
            augnVar = augn.a;
        }
        nbsVar.b(arfsVar, arfsVar2, b, b2, aowmVar, augxVar, augnVar, z, z2);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        apmg apmgVar;
        apxf apxfVar;
        aoxy aoxyVar;
        auhf auhfVar = (auhf) obj;
        auhfVar.getClass();
        this.z = ajokVar.a;
        this.A = auhfVar;
        augz augzVar = auhfVar.c;
        if (augzVar == null) {
            augzVar = augz.a;
        }
        this.B = augzVar;
        augm augmVar = auhfVar.d;
        if (augmVar == null) {
            augmVar = augm.a;
        }
        this.C = augmVar;
        aulq aulqVar = this.B.s;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
            aulq aulqVar2 = this.B.s;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            apmgVar = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apmgVar = null;
        }
        this.D = apmgVar;
        aulq aulqVar3 = auhfVar.f;
        if (aulqVar3 == null) {
            aulqVar3 = aulq.a;
        }
        this.E = (atlt) ahbj.n(aulqVar3, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        nbv nbvVar = this.f;
        String str = auhfVar.h;
        augz augzVar2 = auhfVar.c;
        if (augzVar2 == null) {
            augzVar2 = augz.a;
        }
        if ((augzVar2.b & 32768) != 0) {
            augz augzVar3 = auhfVar.c;
            if (augzVar3 == null) {
                augzVar3 = augz.a;
            }
            apxf apxfVar2 = augzVar3.q;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            apxfVar = apxfVar2;
        } else {
            apxfVar = null;
        }
        augz augzVar4 = auhfVar.c;
        if (augzVar4 == null) {
            augzVar4 = augz.a;
        }
        aony aonyVar = augzVar4.v;
        augm augmVar2 = auhfVar.d;
        if (augmVar2 == null) {
            augmVar2 = augm.a;
        }
        aony aonyVar2 = augmVar2.f;
        augm augmVar3 = auhfVar.d;
        if (augmVar3 == null) {
            augmVar3 = augm.a;
        }
        nbvVar.k(str, apxfVar, aonyVar, aonyVar2, augmVar3.g);
        nhb nhbVar = this.g;
        acra acraVar = ajokVar.a;
        String str2 = auhfVar.h;
        augz augzVar5 = auhfVar.c;
        if (augzVar5 == null) {
            augzVar5 = augz.a;
        }
        augz augzVar6 = augzVar5;
        augt[] m = muf.m(auhfVar.e);
        if ((auhfVar.b & 8) != 0) {
            aoxy aoxyVar2 = auhfVar.g;
            if (aoxyVar2 == null) {
                aoxyVar2 = aoxy.a;
            }
            aoxyVar = aoxyVar2;
        } else {
            aoxyVar = null;
        }
        nhbVar.G(acraVar, auhfVar, str2, augzVar6, m, aoxyVar, auhfVar.i.I());
        this.d = false;
        d(this.f.l());
        this.b.c(this.z, this.D, this.E);
    }
}
