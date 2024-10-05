package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MutedSparklesRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nfr implements ajom {
    public final nfl a;
    public final nce b;
    private final nah c;
    private final ncd d;
    private final nhb e;
    private final View f;
    private final View g;
    private final View h;
    private final View i;
    private final View j;
    private final View k;
    private final TextView l;
    private final View m;
    private final TextView n;
    private final TextView o;
    private final View p;
    private final View q;
    private final View r;
    private final TextView s;
    private final View t;
    private final View u;
    private acra v;

    /* JADX INFO: Access modifiers changed from: protected */
    public nfr(Context context, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, ajuw ajuwVar, wyz wyzVar, tdv tdvVar, wzq wzqVar, euv euvVar, ypa ypaVar, ViewGroup viewGroup, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.promoted_sparkles_text_product_watch, viewGroup, false);
        this.f = inflate;
        View findViewById = inflate.findViewById(R.id.ad_view);
        this.g = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.content_layout);
        this.h = findViewById2;
        View findViewById3 = findViewById.findViewById(R.id.click_overlay);
        this.i = findViewById3;
        View findViewById4 = findViewById2.findViewById(R.id.content_background);
        this.j = findViewById4;
        View findViewById5 = findViewById2.findViewById(R.id.thumbnail_wrapper);
        this.k = findViewById5;
        TextView textView = (TextView) findViewById2.findViewById(R.id.title);
        this.l = textView;
        View findViewById6 = findViewById2.findViewById(R.id.ad_attribution);
        this.m = findViewById6;
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.advertiser);
        this.n = textView2;
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.price);
        this.o = textView3;
        View findViewById7 = findViewById2.findViewById(R.id.cta_button_wrapper);
        this.p = findViewById7;
        View findViewById8 = findViewById7.findViewById(R.id.cta_button_touchable_wrapper);
        this.q = findViewById8;
        View findViewById9 = findViewById2.findViewById(R.id.close_button);
        this.r = findViewById9;
        TextView textView4 = (TextView) findViewById2.findViewById(R.id.description);
        this.s = textView4;
        View findViewById10 = findViewById2.findViewById(R.id.contextual_menu_anchor);
        this.t = findViewById10;
        View findViewById11 = findViewById2.findViewById(R.id.static_contextual_menu_anchor);
        this.u = findViewById11;
        ncd ncdVar = new ncd();
        this.d = ncdVar;
        nhb nhbVar = new nhb(context, aahdVar, wzqVar, wyzVar, tdvVar, euvVar, ypaVar, inflate, findViewById2, findViewById3, inflate, findViewById9, findViewById10, findViewById11, new View.OnClickListener() { // from class: nfn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nfr.this.b.a();
            }
        }, new ngx() { // from class: nfp
            @Override // defpackage.ngx
            public final void a(boolean z) {
                nfr.this.a.f(!z);
            }
        }, new nha() { // from class: nfq
            @Override // defpackage.nha
            public final void a(boolean z, boolean z2) {
                nfl nflVar = nfr.this.a;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                nflVar.f(z3);
            }
        }, ncdVar);
        this.e = nhbVar;
        this.a = new nfl(ajjzVar, ajutVar, ajuwVar, inflate, findViewById2, ajywVar, akbdVar, null, null, null, null, null);
        nah nahVar = new nah(nhbVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new nag() { // from class: nfo
            @Override // defpackage.nag
            public final void a() {
                nfr.this.b.b();
            }
        });
        this.c = nahVar;
        this.b = new nce(nhbVar, nahVar, findViewById);
        nhbVar.B(textView, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nhbVar.B(findViewById6, augq.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nhbVar.B(findViewById5, augq.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        nhbVar.B(textView4, augq.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        nhbVar.B(findViewById8, augq.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        nhbVar.B(findViewById4, augq.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        nhbVar.B(textView2, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_PRODUCT_ADVERTISER);
        nhbVar.B(textView3, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_PRODUCT_PRICE);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.f;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.e.c();
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        atlt atltVar;
        aoxy aoxyVar;
        apmg apmgVar;
        auho auhoVar = (auho) obj;
        auhoVar.getClass();
        auhm auhmVar = auhoVar.c;
        if (auhmVar == null) {
            auhmVar = auhm.a;
        }
        auhm auhmVar2 = auhmVar;
        augu[] auguVarArr = (augu[]) auhoVar.d.toArray(new augu[0]);
        aulq aulqVar = auhoVar.e;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        apxf apxfVar = null;
        if (aulqVar.pY(MutedSparklesRendererOuterClass.mutedSparklesRenderer)) {
            aulq aulqVar2 = auhoVar.e;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            atltVar = (atlt) aulqVar2.pX(MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        } else {
            atltVar = null;
        }
        if ((auhoVar.b & 4) != 0) {
            aoxy aoxyVar2 = auhoVar.f;
            if (aoxyVar2 == null) {
                aoxyVar2 = aoxy.a;
            }
            aoxyVar = aoxyVar2;
        } else {
            aoxyVar = null;
        }
        this.v = ajokVar.a;
        aulq aulqVar3 = auhmVar2.n;
        if (aulqVar3 == null) {
            aulqVar3 = aulq.a;
        }
        if (aulqVar3.pY(ButtonRendererOuterClass.buttonRenderer)) {
            aulq aulqVar4 = auhmVar2.n;
            if (aulqVar4 == null) {
                aulqVar4 = aulq.a;
            }
            apmgVar = (apmg) aulqVar4.pX(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apmgVar = null;
        }
        ncd ncdVar = this.d;
        if ((auhmVar2.b & 512) != 0 && (apxfVar = auhmVar2.l) == null) {
            apxfVar = apxf.a;
        }
        ncdVar.a(apxfVar, auhmVar2.q);
        this.e.H(ajokVar.a, auhoVar, auhoVar.h, auhmVar2, auguVarArr, aoxyVar, auhoVar.g.I());
        this.a.i(this.v, auhoVar, auhmVar2, atltVar);
        this.b.c(this.v, apmgVar, atltVar);
    }
}
