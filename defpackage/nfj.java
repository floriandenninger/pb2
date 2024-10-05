package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nfj {
    public final ncd a;
    public final nhb b;
    public final nfm c;
    public final nce d;
    public final View e;
    public acra f;
    private final nah g;
    private final View h;
    private final View i;
    private final View j;
    private final View k;
    private final View l;
    private final TextView m;
    private final View n;
    private final TextView o;
    private final TextView p;
    private final TextView q;
    private final View r;
    private final View s;
    private final View t;
    private final View u;
    private final View v;
    private final TextView w;
    private final View x;

    public nfj(nfk nfkVar, int i) {
        View inflate = LayoutInflater.from(nfkVar.a).inflate(i, nfkVar.k, false);
        this.e = inflate;
        View findViewById = inflate.findViewById(R.id.ad_view);
        this.h = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.content_layout);
        this.i = findViewById2;
        View findViewById3 = findViewById.findViewById(R.id.click_overlay);
        this.j = findViewById3;
        View findViewById4 = findViewById2.findViewById(R.id.content_background);
        this.k = findViewById4;
        View findViewById5 = findViewById2.findViewById(R.id.thumbnail_wrapper);
        this.l = findViewById5;
        TextView textView = (TextView) findViewById2.findViewById(R.id.title);
        this.m = textView;
        View findViewById6 = findViewById2.findViewById(R.id.ad_attribution);
        this.n = findViewById6;
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.advertiser);
        this.o = textView2;
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.price);
        this.p = textView3;
        TextView textView4 = (TextView) findViewById2.findViewById(R.id.separator);
        this.q = textView4;
        View findViewById7 = findViewById2.findViewById(R.id.cta_button_wrapper);
        this.r = findViewById7;
        View findViewById8 = findViewById7.findViewById(R.id.cta_button_touchable_wrapper);
        this.s = findViewById8;
        View findViewById9 = findViewById2.findViewById(R.id.close_button);
        this.t = findViewById9;
        View findViewById10 = findViewById2.findViewById(R.id.contextual_menu_anchor);
        this.u = findViewById10;
        View findViewById11 = findViewById2.findViewById(R.id.static_contextual_menu_anchor);
        this.v = findViewById11;
        TextView textView5 = (TextView) findViewById2.findViewById(R.id.description);
        this.w = textView5;
        View findViewById12 = findViewById2.findViewById(R.id.inner_background);
        this.x = findViewById12;
        ncd ncdVar = new ncd();
        this.a = ncdVar;
        nhb nhbVar = new nhb(nfkVar.a, nfkVar.c, nfkVar.h, nfkVar.f, nfkVar.g, nfkVar.i, nfkVar.j, inflate, findViewById2, findViewById3, nfkVar.l, findViewById9, findViewById10, findViewById11, new View.OnClickListener() { // from class: nff
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nfj.this.d.a();
            }
        }, new ngx() { // from class: nfh
            @Override // defpackage.ngx
            public final void a(boolean z) {
                nfj.this.c.f(!z);
            }
        }, new nha() { // from class: nfi
            @Override // defpackage.nha
            public final void a(boolean z, boolean z2) {
                nfm nfmVar = nfj.this.c;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                nfmVar.f(z3);
            }
        }, ncdVar);
        this.b = nhbVar;
        this.c = new nfm(nfkVar.b, nfkVar.d, nfkVar.e, inflate, findViewById2, nfkVar.n, nfkVar.m, null, null, null, null, null);
        nah nahVar = new nah(nhbVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new nag() { // from class: nfg
            @Override // defpackage.nag
            public final void a() {
                nfj.this.d.b();
            }
        });
        this.g = nahVar;
        this.d = new nce(nhbVar, nahVar, findViewById);
        nhbVar.B(textView, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nhbVar.B(findViewById6, augq.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nhbVar.B(findViewById5, augq.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        nhbVar.B(textView5, augq.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        nhbVar.B(findViewById8, augq.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        nhbVar.B(findViewById4, augq.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        nhbVar.B(findViewById12, augq.PROMOTED_SPARKLES_CLICK_LOCATION_INNER_BACKGROUND);
        nhbVar.B(textView2, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_PRODUCT_ADVERTISER);
        nhbVar.B(textView3, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_PRODUCT_PRICE);
        nhbVar.B(textView4, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_PRODUCT_PRICE);
    }
}
