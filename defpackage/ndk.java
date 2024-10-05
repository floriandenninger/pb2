package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ndk {
    private final TextView A;
    private final View B;
    public final ncd a;
    public final nhb b;
    public final ndm c;
    public final nce d;
    public final View e;
    public final View f;
    public augz g;
    public boolean h;
    public boolean i;
    public acra j;
    final /* synthetic */ ndl k;
    private final nah l;
    private final View m;
    private final View n;
    private final View o;
    private final View p;
    private final TextView q;
    private final View r;
    private final TextView s;
    private final RatingBar t;
    private final TextView u;
    private final View v;
    private final View w;
    private final View x;
    private final View y;
    private final View z;

    public ndk(ndl ndlVar, int i) {
        this.k = ndlVar;
        View inflate = LayoutInflater.from(ndlVar.a).inflate(i, ndlVar.l, false);
        this.e = inflate;
        View findViewById = inflate.findViewById(R.id.ad_view);
        this.m = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.content_layout);
        this.f = findViewById2;
        View findViewById3 = findViewById.findViewById(R.id.click_overlay);
        this.n = findViewById3;
        View findViewById4 = findViewById2.findViewById(R.id.content_background);
        this.o = findViewById4;
        View findViewById5 = findViewById2.findViewById(R.id.thumbnail_wrapper);
        this.p = findViewById5;
        TextView textView = (TextView) findViewById2.findViewById(R.id.title);
        this.q = textView;
        View findViewById6 = findViewById2.findViewById(R.id.ad_attribution);
        this.r = findViewById6;
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.rating_text);
        this.s = textView2;
        RatingBar ratingBar = (RatingBar) findViewById2.findViewById(R.id.rating);
        this.t = ratingBar;
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.price);
        this.u = textView3;
        View findViewById7 = findViewById2.findViewById(R.id.cta_button_wrapper);
        this.v = findViewById7;
        View findViewById8 = findViewById7.findViewById(R.id.cta_button_touchable_wrapper);
        this.w = findViewById8;
        View findViewById9 = findViewById2.findViewById(R.id.close_button);
        this.x = findViewById9;
        View findViewById10 = findViewById2.findViewById(R.id.contextual_menu_anchor);
        this.y = findViewById10;
        View findViewById11 = findViewById2.findViewById(R.id.static_contextual_menu_anchor);
        this.z = findViewById11;
        TextView textView4 = (TextView) findViewById2.findViewById(R.id.description);
        this.A = textView4;
        View findViewById12 = findViewById2.findViewById(R.id.inner_background);
        this.B = findViewById12;
        ncd ncdVar = new ncd();
        this.a = ncdVar;
        nhb nhbVar = new nhb(ndlVar.a, ndlVar.c, ndlVar.h, ndlVar.f, ndlVar.g, ndlVar.i, ndlVar.j, inflate, findViewById2, findViewById3, ndlVar.m, findViewById9, findViewById10, findViewById11, new View.OnClickListener() { // from class: ndg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ndk.this.d.a();
            }
        }, new ngx() { // from class: ndi
            @Override // defpackage.ngx
            public final void a(boolean z) {
                ndk.this.c.f(!z);
            }
        }, new nha() { // from class: ndj
            @Override // defpackage.nha
            public final void a(boolean z, boolean z2) {
                ndm ndmVar = ndk.this.c;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                ndmVar.f(z3);
            }
        }, ncdVar, ndlVar.n);
        this.b = nhbVar;
        this.c = new ndm(ndlVar.a, ndlVar.b, ndlVar.d, ndlVar.e, inflate, findViewById2, false, ndlVar.n, ndlVar.p, ndlVar.o, null, null, null, null, null);
        nah nahVar = new nah(nhbVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new nag() { // from class: ndh
            @Override // defpackage.nag
            public final void a() {
                ndk.this.d.b();
            }
        });
        this.l = nahVar;
        this.d = new nce(nhbVar, nahVar, findViewById);
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

    public final void a(ndl ndlVar, boolean z) {
        if (this.h) {
            if (z) {
                this.k.k.i(ndlVar);
            } else {
                this.k.k.j(ndlVar);
            }
        }
    }
}
