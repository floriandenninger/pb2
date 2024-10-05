package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nfc {
    public final ncd a;
    public final nhb b;
    public final nfe c;
    public final nce d;
    public augy e;
    public boolean f;
    public boolean g;
    public final View h;
    public final View i;
    public acra j;
    final /* synthetic */ nfd k;
    private final nah l;
    private final View m;
    private final View n;
    private final View o;
    private final View p;
    private final TextView q;
    private final View r;
    private final TextView s;
    private final View t;
    private final View u;
    private final View v;
    private final View w;
    private final View x;
    private final TextView y;

    public nfc(nfd nfdVar, int i) {
        this.k = nfdVar;
        View inflate = LayoutInflater.from(nfdVar.a).inflate(i, nfdVar.k, false);
        this.h = inflate;
        View findViewById = inflate.findViewById(R.id.ad_view);
        this.m = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.content_layout);
        this.i = findViewById2;
        View findViewById3 = findViewById.findViewById(R.id.click_overlay);
        this.n = findViewById3;
        View findViewById4 = findViewById2.findViewById(R.id.content_background);
        this.o = findViewById4;
        View findViewById5 = findViewById2.findViewById(R.id.thumbnail_wrapper);
        this.p = findViewById5;
        TextView textView = (TextView) findViewById2.findViewById(R.id.title);
        this.q = textView;
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.website);
        this.s = textView2;
        View findViewById6 = findViewById2.findViewById(R.id.ad_attribution);
        this.r = findViewById6;
        View findViewById7 = findViewById2.findViewById(R.id.cta_button_wrapper);
        this.t = findViewById7;
        View findViewById8 = findViewById7.findViewById(R.id.cta_button_touchable_wrapper);
        this.u = findViewById8;
        View findViewById9 = findViewById2.findViewById(R.id.close_button);
        this.v = findViewById9;
        View findViewById10 = findViewById2.findViewById(R.id.contextual_menu_anchor);
        this.w = findViewById10;
        View findViewById11 = findViewById2.findViewById(R.id.static_contextual_menu_anchor);
        this.x = findViewById11;
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.description);
        this.y = textView3;
        ncd ncdVar = new ncd();
        this.a = ncdVar;
        nhb nhbVar = new nhb(nfdVar.a, nfdVar.c, nfdVar.h, nfdVar.f, nfdVar.g, nfdVar.i, nfdVar.j, inflate, findViewById2, findViewById3, nfdVar.l, findViewById9, findViewById10, findViewById11, new View.OnClickListener() { // from class: ney
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nfc.this.d.a();
            }
        }, new ngx() { // from class: nfa
            @Override // defpackage.ngx
            public final void a(boolean z) {
                nfc.this.c.f(!z);
            }
        }, new nha() { // from class: nfb
            @Override // defpackage.nha
            public final void a(boolean z, boolean z2) {
                nfe nfeVar = nfc.this.c;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                nfeVar.f(z3);
            }
        }, ncdVar);
        this.b = nhbVar;
        this.c = new nfe(nfdVar.b, nfdVar.d, nfdVar.e, inflate, findViewById2, false, nfdVar.o, nfdVar.n, null, null, null, null, null);
        nah nahVar = new nah(nhbVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new nag() { // from class: nez
            @Override // defpackage.nag
            public final void a() {
                nfc.this.d.b();
            }
        });
        this.l = nahVar;
        this.d = new nce(nhbVar, nahVar, findViewById);
        nhbVar.B(textView, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nhbVar.B(findViewById6, augq.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nhbVar.B(findViewById5, augq.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        nhbVar.B(textView3, augq.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        nhbVar.B(findViewById8, augq.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        nhbVar.B(findViewById4, augq.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        nhbVar.B(textView2, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_AD_WEBSITE);
    }

    public final void a(nfd nfdVar, boolean z) {
        if (this.f) {
            if (z) {
                this.k.m.i(nfdVar);
            } else {
                this.k.m.j(nfdVar);
            }
        }
    }
}
