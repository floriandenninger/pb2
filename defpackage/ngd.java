package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MutedSparklesRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ngd implements ajom {
    public final nfe a;
    public final nce b;
    public final View c;
    public boolean d;
    private final nah e;
    private final nbv f;
    private final nhb g;
    private final nbs h;
    private acra i;
    private Object j;
    private augy k;
    private augm l;
    private atlt m;

    public ngd(Context context, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, ajuw ajuwVar, wyz wyzVar, tdv tdvVar, wzq wzqVar, euv euvVar, ypa ypaVar, ViewGroup viewGroup, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.promoted_sparkles_text_watch_15_click, viewGroup, false);
        this.c = inflate;
        View findViewById = inflate.findViewById(R.id.ad_view);
        View findViewById2 = findViewById.findViewById(R.id.content_layout);
        View findViewById3 = findViewById.findViewById(R.id.click_overlay);
        View findViewById4 = findViewById2.findViewById(R.id.content_background);
        View findViewById5 = findViewById2.findViewById(R.id.thumbnail_wrapper);
        TextView textView = (TextView) findViewById2.findViewById(R.id.title);
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.description);
        View findViewById6 = findViewById2.findViewById(R.id.ad_attribution);
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.website);
        View findViewById7 = findViewById2.findViewById(R.id.cta_button_wrapper).findViewById(R.id.cta_button_touchable_wrapper);
        ImageView imageView = (ImageView) findViewById2.findViewById(R.id.close_button);
        View findViewById8 = findViewById2.findViewById(R.id.contextual_menu_anchor);
        View findViewById9 = findViewById2.findViewById(R.id.static_contextual_menu_anchor);
        nbv nbvVar = new nbv(euvVar, new nbu() { // from class: nga
            @Override // defpackage.nbu
            public final void a(boolean z) {
                ngd ngdVar = ngd.this;
                ngdVar.d = true;
                ngdVar.d(z);
                ngdVar.c.requestLayout();
            }
        });
        this.f = nbvVar;
        nhb nhbVar = new nhb(context, aahdVar, wzqVar, wyzVar, tdvVar, euvVar, ypaVar, inflate, findViewById2, findViewById3, inflate, imageView, findViewById8, findViewById9, new View.OnClickListener() { // from class: nfy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ngd.this.b.a();
            }
        }, new ngx() { // from class: ngb
            @Override // defpackage.ngx
            public final void a(boolean z) {
                ngd.this.a.f(!z);
            }
        }, new nha() { // from class: ngc
            @Override // defpackage.nha
            public final void a(boolean z, boolean z2) {
                nfe nfeVar = ngd.this.a;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                nfeVar.f(z3);
            }
        }, nbvVar);
        this.g = nhbVar;
        this.a = new nfe(ajjzVar, ajutVar, ajuwVar, inflate, findViewById2, true, ajywVar, akbdVar, null, null, null, null, null);
        this.h = new nbs(ajutVar, findViewById2, ajywVar, null, null, null, null, null);
        nah nahVar = new nah(nhbVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new nag() { // from class: nfz
            @Override // defpackage.nag
            public final void a() {
                ngd.this.b.b();
            }
        });
        this.e = nahVar;
        this.b = new nce(nhbVar, nahVar, findViewById);
        nhbVar.B(textView, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nhbVar.B(findViewById7, augq.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        nhbVar.B(findViewById6, augq.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nhbVar.B(findViewById4, augq.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        nhbVar.B(textView2, augq.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        nhbVar.B(findViewById5, augq.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        nhbVar.B(textView3, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_AD_WEBSITE);
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
        this.a.d(this.i, this.j, this.k, this.m);
        augn augnVar = null;
        this.h.m = this.k.w ? 3 : null;
        nbs nbsVar = this.h;
        augy augyVar = this.k;
        augm augmVar = this.l;
        boolean z2 = this.d;
        if ((augyVar.b & 4) != 0) {
            arfs arfsVar3 = augyVar.e;
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
        apxf apxfVar;
        auhr auhrVar = (auhr) obj;
        auhrVar.getClass();
        this.i = ajokVar.a;
        this.j = auhrVar;
        augy augyVar = auhrVar.c;
        if (augyVar == null) {
            augyVar = augy.a;
        }
        this.k = augyVar;
        augm augmVar = auhrVar.d;
        if (augmVar == null) {
            augmVar = augm.a;
        }
        this.l = augmVar;
        aulq aulqVar = this.k.p;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        apmg apmgVar = (apmg) ahbj.n(aulqVar, ButtonRendererOuterClass.buttonRenderer);
        aulq aulqVar2 = auhrVar.f;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        this.m = (atlt) ahbj.n(aulqVar2, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        nbv nbvVar = this.f;
        String str = auhrVar.i;
        augy augyVar2 = auhrVar.c;
        if (augyVar2 == null) {
            augyVar2 = augy.a;
        }
        aoxy aoxyVar = null;
        if ((augyVar2.b & 2048) != 0) {
            augy augyVar3 = auhrVar.c;
            if (augyVar3 == null) {
                augyVar3 = augy.a;
            }
            apxf apxfVar2 = augyVar3.n;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            apxfVar = apxfVar2;
        } else {
            apxfVar = null;
        }
        augy augyVar4 = auhrVar.c;
        if (augyVar4 == null) {
            augyVar4 = augy.a;
        }
        aony aonyVar = augyVar4.s;
        augm augmVar2 = auhrVar.d;
        if (augmVar2 == null) {
            augmVar2 = augm.a;
        }
        aony aonyVar2 = augmVar2.f;
        augm augmVar3 = auhrVar.d;
        if (augmVar3 == null) {
            augmVar3 = augm.a;
        }
        nbvVar.k(str, apxfVar, aonyVar, aonyVar2, augmVar3.g);
        nhb nhbVar = this.g;
        acra acraVar = ajokVar.a;
        String str2 = auhrVar.i;
        augy augyVar5 = auhrVar.c;
        if (augyVar5 == null) {
            augyVar5 = augy.a;
        }
        augt[] m = muf.m(auhrVar.e);
        if ((auhrVar.b & 8) != 0 && (aoxyVar = auhrVar.g) == null) {
            aoxyVar = aoxy.a;
        }
        nhbVar.F(acraVar, auhrVar, str2, augyVar5, m, aoxyVar, auhrVar.h.I());
        this.d = false;
        d(this.f.l());
        this.b.c(this.i, apmgVar, this.m);
    }
}
