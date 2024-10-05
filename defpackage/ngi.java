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
public final class ngi implements ajom {
    public final nfe a;
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
    private final View q;
    private final View r;
    private final View s;
    private acra t;

    /* JADX INFO: Access modifiers changed from: protected */
    public ngi(Context context, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, ajuw ajuwVar, wyz wyzVar, tdv tdvVar, wzq wzqVar, euv euvVar, ypa ypaVar, View view, ViewGroup viewGroup, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.promoted_sparkles_text_watch_grid_form, viewGroup, false);
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
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.website);
        this.p = textView2;
        View findViewById6 = findViewById2.findViewById(R.id.cta_button_wrapper);
        this.q = findViewById6;
        View findViewById7 = findViewById6.findViewById(R.id.cta_button_touchable_wrapper);
        this.r = findViewById7;
        View findViewById8 = findViewById2.findViewById(R.id.close_button);
        this.s = findViewById8;
        ncd ncdVar = new ncd();
        this.e = ncdVar;
        nhb nhbVar = new nhb(context, aahdVar, wzqVar, wyzVar, tdvVar, euvVar, ypaVar, inflate, findViewById2, findViewById3, view == null ? inflate : view, findViewById8, null, null, new View.OnClickListener() { // from class: nge
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ngi.this.b.a();
            }
        }, new ngx() { // from class: ngg
            @Override // defpackage.ngx
            public final void a(boolean z) {
                ngi.this.a.f(!z);
            }
        }, new nha() { // from class: ngh
            @Override // defpackage.nha
            public final void a(boolean z, boolean z2) {
                nfe nfeVar = ngi.this.a;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                nfeVar.f(z3);
            }
        }, ncdVar);
        this.f = nhbVar;
        this.a = new nfe(ajjzVar, ajutVar, ajuwVar, inflate, findViewById2, false, ajywVar, akbdVar, null, null, null, null, null);
        nah nahVar = new nah(nhbVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new nag() { // from class: ngf
            @Override // defpackage.nag
            public final void a() {
                ngi.this.b.b();
            }
        });
        this.d = nahVar;
        this.b = new nce(nhbVar, nahVar, findViewById);
        nhbVar.B(textView, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nhbVar.B(findViewById5, augq.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nhbVar.B(fixedAspectRatioRelativeLayout, augq.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        nhbVar.B(findViewById7, augq.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        nhbVar.B(findViewById4, augq.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        nhbVar.B(textView2, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_AD_WEBSITE);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.f.c();
    }

    public final void d(ajok ajokVar, Object obj, String str, augy augyVar, augu[] auguVarArr, atlt atltVar, aoxy aoxyVar, byte[] bArr) {
        apxf apxfVar;
        this.t = ajokVar.a;
        aulq aulqVar = augyVar.p;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        apmg apmgVar = (apmg) ahbj.n(aulqVar, ButtonRendererOuterClass.buttonRenderer);
        ncd ncdVar = this.e;
        if ((augyVar.b & 2048) != 0) {
            apxfVar = augyVar.n;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ncdVar.a(apxfVar, augyVar.s);
        this.f.F(ajokVar.a, obj, str, augyVar, auguVarArr, aoxyVar, bArr);
        this.a.d(this.t, obj, augyVar, atltVar);
        this.b.c(this.t, apmgVar, atltVar);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aoxy aoxyVar;
        auhs auhsVar = (auhs) obj;
        auhsVar.getClass();
        String str = auhsVar.h;
        augy augyVar = auhsVar.c;
        if (augyVar == null) {
            augyVar = augy.a;
        }
        augy augyVar2 = augyVar;
        augu[] auguVarArr = (augu[]) auhsVar.d.toArray(new augu[0]);
        aulq aulqVar = auhsVar.e;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        atlt atltVar = (atlt) ahbj.n(aulqVar, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        if ((auhsVar.b & 4) != 0) {
            aoxyVar = auhsVar.f;
            if (aoxyVar == null) {
                aoxyVar = aoxy.a;
            }
        } else {
            aoxyVar = null;
        }
        d(ajokVar, auhsVar, str, augyVar2, auguVarArr, atltVar, aoxyVar, auhsVar.g.I());
        muf.k(this.k, this.l, this.m, auhsVar.i);
    }
}
