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
public final class nba {
    public final ncd a;
    public final nhb b;
    public final nbl c;
    public final nce d;
    public final View e;
    public acra f;
    private final nah g;
    private final View h;
    private final View i;
    private final View j;
    private final View k;
    private final View l;
    private final View m;
    private final TextView n;
    private final View o;
    private final TextView p;
    private final View q;
    private final View r;
    private final RatingBar s;
    private final TextView t;
    private final View u;

    public nba(nbb nbbVar, int i) {
        View inflate = LayoutInflater.from(nbbVar.a).inflate(i, nbbVar.k, false);
        this.e = inflate;
        View findViewById = inflate.findViewById(R.id.ad_view);
        this.h = findViewById;
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
        View findViewById6 = findViewById2.findViewById(R.id.ad_attribution);
        this.o = findViewById6;
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.rating_text);
        this.p = textView2;
        RatingBar ratingBar = (RatingBar) findViewById2.findViewById(R.id.rating_bar);
        this.s = ratingBar;
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.price_text);
        this.t = textView3;
        View findViewById7 = findViewById2.findViewById(R.id.icon_text_badge_layout);
        this.u = findViewById7;
        View findViewById8 = findViewById2.findViewById(R.id.close_button);
        this.i = findViewById8;
        View findViewById9 = findViewById2.findViewById(R.id.contextual_menu_anchor);
        this.q = findViewById9;
        View findViewById10 = findViewById2.findViewById(R.id.static_contextual_menu_anchor);
        this.r = findViewById10;
        ncd ncdVar = new ncd();
        this.a = ncdVar;
        nhb nhbVar = new nhb(nbbVar.a, nbbVar.c, nbbVar.h, nbbVar.f, nbbVar.g, nbbVar.j, nbbVar.i, inflate, findViewById2, findViewById3, nbbVar.l, findViewById8, findViewById9, findViewById10, new View.OnClickListener() { // from class: naw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nba.this.d.a();
            }
        }, new ngx() { // from class: nay
            @Override // defpackage.ngx
            public final void a(boolean z) {
                nba.this.c.f(!z);
            }
        }, new nha() { // from class: naz
            @Override // defpackage.nha
            public final void a(boolean z, boolean z2) {
                nbl nblVar = nba.this.c;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                nblVar.f(z3);
            }
        }, ncdVar);
        this.b = nhbVar;
        this.c = new nbl(nbbVar.b, nbbVar.d, nbbVar.e, inflate, findViewById2, nbbVar.n, nbbVar.m, null, null, null, null, null);
        nah nahVar = new nah(nhbVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new nag() { // from class: nax
            @Override // defpackage.nag
            public final void a() {
                nba.this.d.b();
            }
        });
        this.g = nahVar;
        this.d = new nce(nhbVar, nahVar, findViewById);
        nhbVar.B(findViewById5, augq.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        nhbVar.B(textView, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nhbVar.B(findViewById6, augq.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nhbVar.B(textView2, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nhbVar.B(ratingBar, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nhbVar.B(textView3, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_PRICE);
        nhbVar.B(findViewById7, augq.PROMOTED_SPARKLES_CLICK_LOCATION_CUSTOM_BADGE);
        nhbVar.B(findViewById4, augq.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
    }
}
