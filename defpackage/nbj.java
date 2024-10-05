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
public final class nbj {
    private View A;
    private View B;
    private RatingBar C;
    private TextView D;
    private View E;
    private View F;
    private final View G;
    public ngr a;
    public nhb b;
    public nbc c;
    public nbd d;
    public nce e;
    public acra f;
    public apmg g;
    public final boolean h;
    public boolean i;
    public final boolean j;
    final /* synthetic */ nbk k;
    private nah l;
    private View m;
    private View n;
    private final View o;
    private final View p;
    private View q;
    private final View r;
    private final View s;
    private final View t;
    private View u;
    private View v;
    private TextView w;
    private TextView x;
    private View y;
    private TextView z;

    private final void b() {
        this.v = this.r.findViewById(R.id.channel_thumbnail);
        this.w = (TextView) this.r.findViewById(R.id.title);
        this.x = (TextView) this.r.findViewById(R.id.description);
        this.y = this.r.findViewById(R.id.ad_attribution);
        this.z = (TextView) this.r.findViewById(R.id.rating_text);
        this.C = (RatingBar) this.r.findViewById(R.id.rating_bar);
        this.D = (TextView) this.r.findViewById(R.id.price_text);
        View findViewById = this.r.findViewById(R.id.cta_button_wrapper);
        this.E = findViewById;
        this.F = findViewById.findViewById(R.id.cta_button_touchable_wrapper);
        this.q = this.r.findViewById(R.id.close_button);
        this.A = this.r.findViewById(R.id.contextual_menu_anchor);
        this.B = this.r.findViewById(R.id.static_contextual_menu_anchor);
    }

    private final void c() {
        this.b.B(this.w, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        this.b.B(this.x, augq.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        this.b.B(this.y, augq.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        this.b.B(this.z, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        this.b.B(this.C, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        this.b.B(this.D, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_PRICE);
        this.b.B(this.t, augq.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        this.b.B(this.F, augq.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        this.b.B(this.v, augq.PROMOTED_SPARKLES_CLICK_LOCATION_ADVERTISER_AD_ICON);
    }

    private final void d() {
        this.l = new nah(this.b, (ViewStub) this.o.findViewById(R.id.muted_ad_view_stub), new nag() { // from class: nbg
            @Override // defpackage.nag
            public final void a() {
                nbj.this.e.b();
            }
        });
        this.e = new nce(this.b, this.l, this.p);
    }

    private final void e() {
        this.a = new ngr(0);
        nbk nbkVar = this.k;
        this.b = new nhb(nbkVar.c, nbkVar.f, nbkVar.k, nbkVar.i, nbkVar.j, nbkVar.m, nbkVar.l, this.o, this.r, this.s, this.G, this.q, this.A, this.B, new View.OnClickListener() { // from class: nbf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nbj.this.e.a();
            }
        }, new ngx() { // from class: nbh
            @Override // defpackage.ngx
            public final void a(boolean z) {
                nbj nbjVar = nbj.this;
                if (nbjVar.h) {
                    nbjVar.c.g();
                } else {
                    nbjVar.d.f(false);
                }
            }
        }, new nha() { // from class: nbi
            @Override // defpackage.nha
            public final void a(boolean z, boolean z2) {
                nbj nbjVar = nbj.this;
                if (nbjVar.h) {
                    nbjVar.c.g();
                } else {
                    nbjVar.d.f(false);
                }
            }
        }, this.a);
    }

    public final View a() {
        return this.h ? this.m : this.o;
    }

    public nbj(nbk nbkVar, int i, boolean z, boolean z2) {
        this.k = nbkVar;
        this.h = z;
        this.j = z2;
        if (!z) {
            View inflate = LayoutInflater.from(nbkVar.c).inflate(i, nbkVar.n, false);
            this.o = inflate;
            View findViewById = inflate.findViewById(R.id.ad_view);
            this.p = findViewById;
            View findViewById2 = findViewById.findViewById(R.id.content_layout);
            this.r = findViewById2;
            this.s = findViewById.findViewById(R.id.click_overlay);
            this.t = findViewById2.findViewById(R.id.content_background);
            this.u = findViewById2.findViewById(R.id.thumbnail_wrapper);
            this.G = nbkVar.o;
            b();
            e();
            this.d = new nbd(nbkVar.e, nbkVar.g, nbkVar.h, inflate, findViewById2, nbkVar.v, nbkVar.t, null, null, null, null, null);
            d();
            this.b.B(this.u, augq.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
            c();
            return;
        }
        View inflate2 = LayoutInflater.from(nbkVar.c).inflate(i, nbkVar.n, false);
        this.m = inflate2;
        ViewStub viewStub = (ViewStub) inflate2.findViewById(R.id.promoted_discovery_app_promo_portrait_thumbnail_stub);
        View inflate3 = ((ViewStub) this.m.findViewById(R.id.promoted_discovery_app_promo_portrait_metadata_stub)).inflate();
        this.o = inflate3;
        this.n = viewStub.inflate();
        View findViewById3 = inflate3.findViewById(R.id.ad_view);
        this.p = findViewById3;
        View findViewById4 = findViewById3.findViewById(R.id.content_layout);
        this.r = findViewById4;
        this.s = findViewById3.findViewById(R.id.click_overlay);
        this.t = findViewById4.findViewById(R.id.content_background);
        this.G = nbkVar.o;
        b();
        e();
        this.c = new nbc(nbkVar.e, nbkVar.g, nbkVar.h, this.m, this.n, findViewById4, nbkVar.c, nbkVar.f, nbkVar.p, nbkVar.q, nbkVar.s, nbkVar.d, nbkVar.v, nbkVar.t, null, null, null, null, null);
        d();
        c();
    }
}
