package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nde {
    private final View A;
    private acra B;
    public final nhb a;
    public final ndm b;
    public final nce c;
    public final View d;
    public augz e;
    public boolean f;
    public boolean g;
    final /* synthetic */ ndf h;
    private final nah i;
    private final ncd j;
    private final View k;
    private final View l;
    private final View m;
    private final View n;
    private final View o;
    private final TextView p;
    private final View q;
    private final TextView r;
    private final RatingBar s;
    private final TextView t;
    private final View u;
    private final View v;
    private final View w;
    private final View x;
    private final View y;
    private final TextView z;

    public nde(ndf ndfVar, int i) {
        this.h = ndfVar;
        View inflate = LayoutInflater.from(ndfVar.a).inflate(i, ndfVar.k, false);
        this.d = inflate;
        View findViewById = inflate.findViewById(R.id.ad_view);
        this.k = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.content_layout);
        this.l = findViewById2;
        View findViewById3 = findViewById.findViewById(R.id.click_overlay);
        this.m = findViewById3;
        View findViewById4 = findViewById2.findViewById(R.id.content_background);
        this.n = findViewById4;
        View findViewById5 = findViewById2.findViewById(R.id.thumbnail_wrapper);
        this.o = findViewById5;
        TextView textView = (TextView) findViewById2.findViewById(R.id.title);
        this.p = textView;
        View findViewById6 = findViewById2.findViewById(R.id.ad_attribution);
        this.q = findViewById6;
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.rating_text);
        this.r = textView2;
        RatingBar ratingBar = (RatingBar) findViewById2.findViewById(R.id.rating);
        this.s = ratingBar;
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.price);
        this.t = textView3;
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
        TextView textView4 = (TextView) findViewById2.findViewById(R.id.description);
        this.z = textView4;
        View findViewById12 = findViewById2.findViewById(R.id.inner_background);
        this.A = findViewById12;
        ncd ncdVar = new ncd();
        this.j = ncdVar;
        nhb nhbVar = new nhb(ndfVar.a, ndfVar.c, ndfVar.h, ndfVar.f, ndfVar.g, ndfVar.i, ndfVar.j, inflate, findViewById2, findViewById3, ndfVar.l, findViewById9, findViewById10, findViewById11, new View.OnClickListener() { // from class: nda
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nde.this.c.a();
            }
        }, new ngx() { // from class: ndc
            @Override // defpackage.ngx
            public final void a(boolean z) {
                nde.this.b.f(!z);
            }
        }, new nha() { // from class: ndd
            @Override // defpackage.nha
            public final void a(boolean z, boolean z2) {
                ndm ndmVar = nde.this.b;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                ndmVar.f(z3);
            }
        }, ncdVar, ndfVar.n);
        this.a = nhbVar;
        this.b = new ndm(ndfVar.a, ndfVar.b, ndfVar.d, ndfVar.e, inflate, findViewById2, false, ndfVar.n, ndfVar.q, ndfVar.p, null, null, null, null, null);
        nah nahVar = new nah(nhbVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new nag() { // from class: ndb
            @Override // defpackage.nag
            public final void a() {
                nde.this.c.b();
            }
        });
        this.i = nahVar;
        this.c = new nce(nhbVar, nahVar, findViewById);
        nhbVar.B(textView, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nhbVar.B(findViewById6, augq.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nhbVar.B(findViewById5, augq.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        nhbVar.B(textView4, augq.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        nhbVar.C(findViewById8, augq.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL, true);
        nhbVar.B(findViewById4, augq.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        nhbVar.B(findViewById12, augq.PROMOTED_SPARKLES_CLICK_LOCATION_INNER_BACKGROUND);
        nhbVar.B(textView2, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nhbVar.B(ratingBar, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nhbVar.B(textView3, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_PRICE);
    }

    public final void a(ajok ajokVar, Object obj, String str, augz augzVar, augu[] auguVarArr, atlt atltVar, aoxy aoxyVar, byte[] bArr) {
        apmg apmgVar;
        this.B = ajokVar.a;
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
        ncd ncdVar = this.j;
        if ((augzVar.b & 32768) != 0 && (apxfVar = augzVar.q) == null) {
            apxfVar = apxf.a;
        }
        ncdVar.a(apxfVar, augzVar.v);
        this.a.G(ajokVar.a, obj, str, augzVar, auguVarArr, aoxyVar, bArr);
        this.b.l(this.B, obj, augzVar, atltVar, Integer.valueOf(wbs.W(this.l.getContext(), R.attr.ytBorderedButtonChipBackground).orElse(0)));
        this.c.c(this.B, apmgVar, atltVar);
    }

    public final void b(ndf ndfVar, boolean z) {
        if (this.f) {
            if (z) {
                this.h.o.i(ndfVar);
            } else {
                this.h.o.j(ndfVar);
            }
        }
    }
}
