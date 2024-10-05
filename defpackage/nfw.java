package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nfw {
    public final ncd a;
    public final nhb b;
    public final ncm c;
    public final nce d;
    public final View e;
    public acra f;
    private final nah g;
    private final View h;
    private final View i;
    private final View j;
    private final View k;
    private final TextView l;
    private final View m;
    private final TextView n;
    private final View o;
    private final View p;
    private final View q;
    private final TextView r;
    private final View s;
    private final View t;

    public nfw(nfx nfxVar, int i) {
        View inflate = LayoutInflater.from(nfxVar.a).inflate(i, nfxVar.k, false);
        this.e = inflate;
        View findViewById = inflate.findViewById(R.id.ad_view);
        this.h = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.content_layout);
        this.i = findViewById2;
        View findViewById3 = findViewById.findViewById(R.id.click_overlay);
        this.j = findViewById3;
        View findViewById4 = findViewById2.findViewById(R.id.content_background);
        this.k = findViewById4;
        TextView textView = (TextView) findViewById2.findViewById(R.id.title);
        this.l = textView;
        View findViewById5 = findViewById2.findViewById(R.id.ad_attribution);
        this.m = findViewById5;
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.website);
        this.n = textView2;
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.description);
        this.r = textView3;
        View findViewById6 = findViewById2.findViewById(R.id.cta_button_wrapper);
        this.s = findViewById6;
        View findViewById7 = findViewById6.findViewById(R.id.cta_button_touchable_wrapper);
        this.t = findViewById7;
        View findViewById8 = findViewById2.findViewById(R.id.close_button);
        this.o = findViewById8;
        View findViewById9 = findViewById2.findViewById(R.id.contextual_menu_anchor);
        this.p = findViewById9;
        View findViewById10 = findViewById2.findViewById(R.id.static_contextual_menu_anchor);
        this.q = findViewById10;
        ncd ncdVar = new ncd();
        this.a = ncdVar;
        nhb nhbVar = new nhb(nfxVar.a, nfxVar.c, nfxVar.h, nfxVar.f, nfxVar.g, nfxVar.i, nfxVar.j, inflate, findViewById2, findViewById3, nfxVar.l, findViewById8, findViewById9, findViewById10, new View.OnClickListener() { // from class: nfs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nfw.this.d.a();
            }
        }, new ngx() { // from class: nfu
            @Override // defpackage.ngx
            public final void a(boolean z) {
                nfw.this.c.f(!z);
            }
        }, new nha() { // from class: nfv
            @Override // defpackage.nha
            public final void a(boolean z, boolean z2) {
                ncm ncmVar = nfw.this.c;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                ncmVar.f(z3);
            }
        }, ncdVar);
        this.b = nhbVar;
        this.c = new ncm(nfxVar.b, nfxVar.d, nfxVar.e, inflate, findViewById2, nfxVar.n, nfxVar.m, null, null, null, null, null);
        nah nahVar = new nah(nhbVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new nag() { // from class: nft
            @Override // defpackage.nag
            public final void a() {
                nfw.this.d.b();
            }
        });
        this.g = nahVar;
        this.d = new nce(nhbVar, nahVar, findViewById);
        nhbVar.B(textView, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nhbVar.B(findViewById5, augq.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nhbVar.B(textView3, augq.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        nhbVar.B(findViewById7, augq.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        nhbVar.B(findViewById4, augq.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        nhbVar.B(textView2, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_AD_WEBSITE);
    }
}
