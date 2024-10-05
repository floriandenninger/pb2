package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioRelativeLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MutedSparklesRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ndy implements ajom {
    public final ndm a;
    public final nce b;
    public final View c;
    private final nah d;
    private final ncd e;
    private final nhb f;
    private final View g;
    private final View h;
    private final View i;
    private final View j;
    private final View k;
    private final FixedAspectRatioRelativeLayout l;
    private final ImageView m;
    private final TextView n;
    private final View o;
    private final TextView p;
    private final TextView q;
    private final ImageView r;
    private final TextView s;
    private final View t;
    private final View u;
    private final View v;
    private acra w;

    /* JADX INFO: Access modifiers changed from: protected */
    public ndy(Context context, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, ajuw ajuwVar, wyz wyzVar, tdv tdvVar, wzq wzqVar, euv euvVar, ypa ypaVar, View view, ViewGroup viewGroup, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.promoted_sparkles_text_ctd_watch_grid_form, viewGroup, false);
        this.c = inflate;
        View findViewById = inflate.findViewById(R.id.ad_view);
        this.g = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.content_layout);
        this.h = findViewById2;
        View findViewById3 = findViewById.findViewById(R.id.click_overlay);
        this.i = findViewById3;
        View findViewById4 = findViewById2.findViewById(R.id.content_background);
        this.j = findViewById4;
        this.k = findViewById2.findViewById(R.id.content_wrapper);
        FixedAspectRatioRelativeLayout fixedAspectRatioRelativeLayout = (FixedAspectRatioRelativeLayout) findViewById2.findViewById(R.id.thumbnail_wrapper);
        this.l = fixedAspectRatioRelativeLayout;
        this.m = (ImageView) fixedAspectRatioRelativeLayout.findViewById(R.id.thumbnail);
        TextView textView = (TextView) findViewById2.findViewById(R.id.title);
        this.n = textView;
        View findViewById5 = findViewById2.findViewById(R.id.ad_attribution);
        this.o = findViewById5;
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.app_store_text);
        this.p = textView2;
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.rating_text);
        this.q = textView3;
        ImageView imageView = (ImageView) findViewById2.findViewById(R.id.rating_star);
        this.r = imageView;
        TextView textView4 = (TextView) findViewById2.findViewById(R.id.price);
        this.s = textView4;
        View findViewById6 = findViewById2.findViewById(R.id.cta_button_wrapper);
        this.t = findViewById6;
        View findViewById7 = findViewById6.findViewById(R.id.cta_button_touchable_wrapper);
        this.u = findViewById7;
        View findViewById8 = findViewById2.findViewById(R.id.close_button);
        this.v = findViewById8;
        ncd ncdVar = new ncd();
        this.e = ncdVar;
        nhb nhbVar = new nhb(context, aahdVar, wzqVar, wyzVar, tdvVar, euvVar, ypaVar, inflate, findViewById2, findViewById3, view == null ? inflate : view, findViewById8, null, null, new View.OnClickListener() { // from class: ndu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ndy.this.b.a();
            }
        }, new ngx() { // from class: ndw
            @Override // defpackage.ngx
            public final void a(boolean z) {
                ndy.this.a.f(!z);
            }
        }, new nha() { // from class: ndx
            @Override // defpackage.nha
            public final void a(boolean z, boolean z2) {
                ndm ndmVar = ndy.this.a;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                ndmVar.f(z3);
            }
        }, ncdVar);
        this.f = nhbVar;
        this.a = new ndm(ajjzVar, ajutVar, ajuwVar, inflate, findViewById2, false, ajywVar, akbdVar, null, null, null, null, null);
        nah nahVar = new nah(nhbVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new nag() { // from class: ndv
            @Override // defpackage.nag
            public final void a() {
                ndy.this.b.b();
            }
        });
        this.d = nahVar;
        this.b = new nce(nhbVar, nahVar, findViewById);
        nhbVar.B(textView, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nhbVar.B(findViewById5, augq.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nhbVar.B(fixedAspectRatioRelativeLayout, augq.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        nhbVar.B(findViewById7, augq.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        nhbVar.B(findViewById4, augq.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        nhbVar.B(textView3, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nhbVar.B(imageView, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nhbVar.B(textView4, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_PRICE);
        if (textView2 != null) {
            nhbVar.B(textView2, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_APP_STORE);
        }
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.f.c();
    }

    public final void d(ajok ajokVar, Object obj, String str, augz augzVar, augu[] auguVarArr, atlt atltVar, aoxy aoxyVar, byte[] bArr) {
        apmg apmgVar;
        this.w = ajokVar.a;
        aulq aulqVar = augzVar.s;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        apxf apxfVar = null;
        if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
            aulq aulqVar2 = augzVar.s;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            apmgVar = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apmgVar = null;
        }
        ncd ncdVar = this.e;
        if ((augzVar.b & 32768) != 0 && (apxfVar = augzVar.q) == null) {
            apxfVar = apxf.a;
        }
        ncdVar.a(apxfVar, augzVar.v);
        this.f.G(ajokVar.a, obj, str, augzVar, auguVarArr, aoxyVar, bArr);
        this.a.v(this.w, obj, augzVar, atltVar);
        this.b.c(this.w, apmgVar, atltVar);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aoxy aoxyVar;
        auhg auhgVar = (auhg) obj;
        auhgVar.getClass();
        String str = auhgVar.h;
        augz augzVar = auhgVar.c;
        if (augzVar == null) {
            augzVar = augz.a;
        }
        augz augzVar2 = augzVar;
        augu[] auguVarArr = (augu[]) auhgVar.d.toArray(new augu[0]);
        aulq aulqVar = auhgVar.e;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        atlt atltVar = (atlt) ahbj.n(aulqVar, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        if ((auhgVar.b & 4) != 0) {
            aoxyVar = auhgVar.f;
            if (aoxyVar == null) {
                aoxyVar = aoxy.a;
            }
        } else {
            aoxyVar = null;
        }
        d(ajokVar, auhgVar, str, augzVar2, auguVarArr, atltVar, aoxyVar, auhgVar.g.I());
        muf.k(this.k, this.l, this.m, auhgVar.i);
    }
}
