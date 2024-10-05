package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nau {
    private View A;
    private TextView B;
    private View C;
    private View D;
    private View E;
    private View F;
    private final View G;
    public nhb a;
    public nal b;
    public nam c;
    public nce d;
    public ftw e;
    public String f;
    public acra g;
    public apmg h;
    public final boolean i;
    public boolean j;
    public final boolean k;
    final /* synthetic */ nav l;
    public ngr m;
    private nah n;
    private View o;
    private View p;
    private final View q;
    private final View r;
    private View s;
    private final View t;
    private final View u;
    private final View v;
    private View w;
    private View x;
    private TextView y;
    private TextView z;

    private final void b() {
        this.x = this.t.findViewById(R.id.channel_thumbnail);
        this.y = (TextView) this.t.findViewById(R.id.title);
        this.z = (TextView) this.t.findViewById(R.id.description);
        this.A = this.t.findViewById(R.id.ad_attribution);
        this.B = (TextView) this.t.findViewById(R.id.advertiser_name_or_website);
        View findViewById = this.t.findViewById(R.id.cta_button_wrapper);
        this.E = findViewById;
        this.F = findViewById.findViewById(R.id.cta_button_touchable_wrapper);
        this.s = this.t.findViewById(R.id.close_button);
        this.C = this.t.findViewById(R.id.contextual_menu_anchor);
        this.D = this.t.findViewById(R.id.static_contextual_menu_anchor);
        View findViewById2 = this.t.findViewById(R.id.discovery_action_toggle_button);
        ftw c = this.l.v.c(findViewById2);
        this.e = c;
        c.e = new ftv() { // from class: naq
            @Override // defpackage.ftv
            public final void a(boolean z) {
                nau nauVar = nau.this;
                nbm nbmVar = (nbm) nauVar.l.m.a(new eux(nauVar.f, nbm.class), nbm.class, "PDTBState");
                if (nbmVar != null) {
                    nbmVar.a = z;
                }
            }
        };
        findViewById2.setOnClickListener(null);
        findViewById2.setClickable(false);
    }

    private final void c() {
        this.a.B(this.y, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        this.a.B(this.z, augq.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        this.a.B(this.A, augq.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        this.a.B(this.B, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_AD_WEBSITE);
        this.a.B(this.v, augq.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        this.a.B(this.F, augq.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        this.a.B(this.x, augq.PROMOTED_SPARKLES_CLICK_LOCATION_ADVERTISER_AD_ICON);
    }

    private final void d() {
        this.n = new nah(this.a, (ViewStub) this.q.findViewById(R.id.muted_ad_view_stub), new nag() { // from class: nar
            @Override // defpackage.nag
            public final void a() {
                nau.this.d.b();
            }
        });
        this.d = new nce(this.a, this.n, this.r);
    }

    private final void e() {
        this.m = new ngr(1);
        nav navVar = this.l;
        this.a = new nhb(navVar.c, navVar.f, navVar.k, navVar.i, navVar.j, navVar.m, navVar.l, this.q, this.t, this.u, this.G, this.s, this.C, this.D, this.e, new View.OnClickListener() { // from class: nao
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nau.this.d.a();
            }
        }, new ngx() { // from class: nas
            @Override // defpackage.ngx
            public final void a(boolean z) {
                nau nauVar = nau.this;
                if (nauVar.i) {
                    nauVar.b.g();
                } else {
                    nauVar.c.f(false);
                }
            }
        }, new nha() { // from class: nat
            @Override // defpackage.nha
            public final void a(boolean z, boolean z2) {
                nau nauVar = nau.this;
                if (nauVar.i) {
                    nauVar.b.g();
                } else {
                    nauVar.c.f(false);
                }
            }
        }, this.m, false);
    }

    public final View a() {
        return this.i ? this.o : this.q;
    }

    public nau(nav navVar, int i, boolean z, boolean z2) {
        this.l = navVar;
        this.i = z;
        this.k = z2;
        if (!z) {
            View inflate = LayoutInflater.from(navVar.c).inflate(i, navVar.n, false);
            this.q = inflate;
            View findViewById = inflate.findViewById(R.id.ad_view);
            this.r = findViewById;
            View findViewById2 = findViewById.findViewById(R.id.content_layout);
            this.t = findViewById2;
            this.u = findViewById.findViewById(R.id.click_overlay);
            this.v = findViewById2.findViewById(R.id.content_background);
            this.w = findViewById2.findViewById(R.id.thumbnail_wrapper);
            this.G = navVar.o;
            b();
            e();
            this.c = new nam(navVar.e, navVar.g, navVar.h, inflate, findViewById2, navVar.w, navVar.t, null, null, null, null, null);
            d();
            this.a.B(this.w, augq.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
            c();
            return;
        }
        View inflate2 = LayoutInflater.from(navVar.c).inflate(i, navVar.n, false);
        this.o = inflate2;
        ViewStub viewStub = (ViewStub) inflate2.findViewById(R.id.promoted_discovery_action_portrait_thumbnail_stub);
        View inflate3 = ((ViewStub) this.o.findViewById(R.id.promoted_discovery_action_portrait_metadata_stub)).inflate();
        this.q = inflate3;
        this.p = viewStub.inflate();
        View findViewById3 = inflate3.findViewById(R.id.ad_view);
        this.r = findViewById3;
        View findViewById4 = findViewById3.findViewById(R.id.content_layout);
        this.t = findViewById4;
        this.u = findViewById3.findViewById(R.id.click_overlay);
        this.v = findViewById4.findViewById(R.id.content_background);
        this.G = navVar.o;
        b();
        e();
        this.b = new nal(navVar.e, navVar.g, navVar.h, this.o, this.p, findViewById4, navVar.c, navVar.f, navVar.p, navVar.q, navVar.s, navVar.d, navVar.w, navVar.t, null, null, null, null, null);
        d();
        c();
    }
}
