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
public final class ned {
    public final ncd a;
    public final nhb b;
    public final ndm c;
    public final nce d;
    public final View e;
    public final View f;
    public acra g;
    private final nah h;
    private final View i;
    private final View j;
    private final View k;
    private final View l;
    private final TextView m;
    private final View n;
    private final TextView o;
    private final RatingBar p;
    private final TextView q;
    private final View r;
    private final View s;
    private final View t;
    private final View u;
    private final View v;
    private final TextView w;
    private final View x;

    public ned(ncs ncsVar, int i) {
        View inflate = LayoutInflater.from(ncsVar.a).inflate(i, ncsVar.j, false);
        this.e = inflate;
        View findViewById = inflate.findViewById(R.id.ad_view);
        this.i = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.content_layout);
        this.f = findViewById2;
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
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.rating_text);
        this.o = textView2;
        RatingBar ratingBar = (RatingBar) findViewById2.findViewById(R.id.rating);
        this.p = ratingBar;
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.price);
        this.q = textView3;
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
        TextView textView4 = (TextView) findViewById2.findViewById(R.id.description);
        this.w = textView4;
        View findViewById12 = findViewById2.findViewById(R.id.inner_background);
        this.x = findViewById12;
        ncd ncdVar = new ncd();
        this.a = ncdVar;
        final byte[] bArr = null;
        nhb nhbVar = new nhb(ncsVar.a, ncsVar.c, ncsVar.h, ncsVar.f, ncsVar.g, ncsVar.l, ncsVar.i, inflate, findViewById2, findViewById3, ncsVar.k, findViewById9, findViewById10, findViewById11, new View.OnClickListener(bArr, bArr) { // from class: nco
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ned.this.d.a();
            }
        }, new ngx(bArr, bArr) { // from class: ncq
            @Override // defpackage.ngx
            public final void a(boolean z) {
                ned.this.c.f(!z);
            }
        }, new nha(bArr, bArr) { // from class: ncr
            @Override // defpackage.nha
            public final void a(boolean z, boolean z2) {
                ndm ndmVar = ned.this.c;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                ndmVar.f(z3);
            }
        }, ncdVar);
        this.b = nhbVar;
        this.c = new ndm(ncsVar.b, ncsVar.d, ncsVar.e, inflate, findViewById2, false, ncsVar.n, ncsVar.m, null, null, null, null, null);
        final byte[] bArr2 = null;
        nah nahVar = new nah(nhbVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new nag(bArr2, bArr2) { // from class: ncp
            @Override // defpackage.nag
            public final void a() {
                ned.this.d.b();
            }
        });
        this.h = nahVar;
        this.d = new nce(nhbVar, nahVar, findViewById);
        nhbVar.B(textView, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nhbVar.B(findViewById6, augq.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nhbVar.B(findViewById5, augq.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        nhbVar.B(textView4, augq.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        nhbVar.B(findViewById8, augq.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        nhbVar.B(findViewById4, augq.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        nhbVar.B(findViewById12, augq.PROMOTED_SPARKLES_CLICK_LOCATION_INNER_BACKGROUND);
        nhbVar.B(textView2, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nhbVar.B(ratingBar, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nhbVar.B(textView3, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_PRICE);
    }

    public ned(ncx ncxVar, int i) {
        View inflate = LayoutInflater.from(ncxVar.a).inflate(i, ncxVar.j, false);
        this.e = inflate;
        View findViewById = inflate.findViewById(R.id.ad_view);
        this.i = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.content_layout);
        this.f = findViewById2;
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
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.rating_text);
        this.o = textView2;
        RatingBar ratingBar = (RatingBar) findViewById2.findViewById(R.id.rating);
        this.p = ratingBar;
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.price);
        this.q = textView3;
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
        TextView textView4 = (TextView) findViewById2.findViewById(R.id.description);
        this.w = textView4;
        View findViewById12 = findViewById2.findViewById(R.id.inner_background);
        this.x = findViewById12;
        ncd ncdVar = new ncd();
        this.a = ncdVar;
        final byte[] bArr = null;
        nhb nhbVar = new nhb(ncxVar.a, ncxVar.c, ncxVar.h, ncxVar.f, ncxVar.g, ncxVar.m, ncxVar.i, inflate, findViewById2, findViewById3, ncxVar.k, findViewById9, findViewById10, findViewById11, new View.OnClickListener(bArr) { // from class: nct
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ned.this.d.a();
            }
        }, new ngx(bArr) { // from class: ncv
            @Override // defpackage.ngx
            public final void a(boolean z) {
                ned.this.c.f(!z);
            }
        }, new nha(bArr) { // from class: ncw
            @Override // defpackage.nha
            public final void a(boolean z, boolean z2) {
                ndm ndmVar = ned.this.c;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                ndmVar.f(z3);
            }
        }, ncdVar);
        this.b = nhbVar;
        this.c = new ndm(ncxVar.b, ncxVar.d, ncxVar.e, inflate, findViewById2, false, ncxVar.n, ncxVar.l, null, null, null, null, null);
        final byte[] bArr2 = null;
        nah nahVar = new nah(nhbVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new nag(bArr2) { // from class: ncu
            @Override // defpackage.nag
            public final void a() {
                ned.this.d.b();
            }
        });
        this.h = nahVar;
        this.d = new nce(nhbVar, nahVar, findViewById);
        nhbVar.B(textView, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nhbVar.B(findViewById6, augq.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nhbVar.B(findViewById5, augq.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        nhbVar.B(textView4, augq.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        nhbVar.B(findViewById8, augq.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        nhbVar.B(findViewById4, augq.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        nhbVar.B(findViewById12, augq.PROMOTED_SPARKLES_CLICK_LOCATION_INNER_BACKGROUND);
        nhbVar.B(textView2, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nhbVar.B(ratingBar, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nhbVar.B(textView3, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_PRICE);
    }

    public ned(nee neeVar) {
        View inflate = LayoutInflater.from(neeVar.a).inflate(R.layout.promoted_sparkles_text_ctd_watch_themed_cta_compact_form, neeVar.k, false);
        this.e = inflate;
        View findViewById = inflate.findViewById(R.id.ad_view);
        this.i = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.content_layout);
        this.f = findViewById2;
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
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.rating_text);
        this.o = textView2;
        RatingBar ratingBar = (RatingBar) findViewById2.findViewById(R.id.rating);
        this.p = ratingBar;
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.price);
        this.q = textView3;
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
        TextView textView4 = (TextView) findViewById2.findViewById(R.id.description);
        this.w = textView4;
        View findViewById12 = findViewById2.findViewById(R.id.inner_background);
        this.x = findViewById12;
        ncd ncdVar = new ncd();
        this.a = ncdVar;
        nhb nhbVar = new nhb(neeVar.a, neeVar.c, neeVar.h, neeVar.f, neeVar.g, neeVar.i, neeVar.j, inflate, findViewById2, findViewById3, neeVar.l, findViewById9, findViewById10, findViewById11, new View.OnClickListener() { // from class: ndz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ned.this.d.a();
            }
        }, new ngx() { // from class: neb
            @Override // defpackage.ngx
            public final void a(boolean z) {
                ned.this.c.f(!z);
            }
        }, new nha() { // from class: nec
            @Override // defpackage.nha
            public final void a(boolean z, boolean z2) {
                ndm ndmVar = ned.this.c;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                ndmVar.f(z3);
            }
        }, ncdVar);
        this.b = nhbVar;
        this.c = new ndm(neeVar.b, neeVar.d, neeVar.e, inflate, findViewById2, false, neeVar.n, neeVar.m, null, null, null, null, null);
        nah nahVar = new nah(nhbVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new nag() { // from class: nea
            @Override // defpackage.nag
            public final void a() {
                ned.this.d.b();
            }
        });
        this.h = nahVar;
        this.d = new nce(nhbVar, nahVar, findViewById);
        nhbVar.B(textView, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nhbVar.B(findViewById6, augq.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nhbVar.B(findViewById5, augq.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        nhbVar.B(textView4, augq.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        nhbVar.B(findViewById8, augq.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        nhbVar.B(findViewById4, augq.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        nhbVar.B(findViewById12, augq.PROMOTED_SPARKLES_CLICK_LOCATION_INNER_BACKGROUND);
        nhbVar.B(textView2, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nhbVar.B(ratingBar, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nhbVar.B(textView3, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_PRICE);
    }
}
