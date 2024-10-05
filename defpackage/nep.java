package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nep {
    public final ncd a;
    public final nhb b;
    public final nfe c;
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
    private final View p;
    private final View q;
    private final View r;
    private final View s;
    private final View t;
    private final TextView u;
    private final View v;

    public nep(neq neqVar, int i) {
        View inflate = LayoutInflater.from(neqVar.a).inflate(i, neqVar.k, false);
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
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.website);
        this.o = textView2;
        View findViewById7 = findViewById2.findViewById(R.id.cta_button_wrapper);
        this.p = findViewById7;
        View findViewById8 = findViewById7.findViewById(R.id.cta_button_touchable_wrapper);
        this.q = findViewById8;
        View findViewById9 = findViewById2.findViewById(R.id.close_button);
        this.r = findViewById9;
        View findViewById10 = findViewById2.findViewById(R.id.contextual_menu_anchor);
        this.s = findViewById10;
        View findViewById11 = findViewById2.findViewById(R.id.static_contextual_menu_anchor);
        this.t = findViewById11;
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.description);
        this.u = textView3;
        View findViewById12 = findViewById2.findViewById(R.id.inner_background);
        this.v = findViewById12;
        ncd ncdVar = new ncd();
        this.a = ncdVar;
        nhb nhbVar = new nhb(neqVar.a, neqVar.c, neqVar.h, neqVar.f, neqVar.g, neqVar.i, neqVar.j, inflate, findViewById2, findViewById3, neqVar.l, findViewById9, findViewById10, findViewById11, new View.OnClickListener() { // from class: nel
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nep.this.d.a();
            }
        }, new ngx() { // from class: nen
            @Override // defpackage.ngx
            public final void a(boolean z) {
                nep.this.c.f(!z);
            }
        }, new nha() { // from class: neo
            @Override // defpackage.nha
            public final void a(boolean z, boolean z2) {
                nfe nfeVar = nep.this.c;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                nfeVar.f(z3);
            }
        }, ncdVar);
        this.b = nhbVar;
        this.c = new nfe(neqVar.b, neqVar.d, neqVar.e, inflate, findViewById2, false, neqVar.n, neqVar.m, null, null, null, null, null);
        nah nahVar = new nah(nhbVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new nag() { // from class: nem
            @Override // defpackage.nag
            public final void a() {
                nep.this.d.b();
            }
        });
        this.g = nahVar;
        this.d = new nce(nhbVar, nahVar, findViewById);
        nhbVar.B(textView, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nhbVar.B(findViewById6, augq.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nhbVar.B(findViewById5, augq.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        nhbVar.B(textView3, augq.PROMOTED_SPARKLES_CLICK_LOCATION_DESCRIPTION);
        nhbVar.B(findViewById8, augq.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        nhbVar.B(findViewById4, augq.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        nhbVar.B(findViewById12, augq.PROMOTED_SPARKLES_CLICK_LOCATION_INNER_BACKGROUND);
        nhbVar.B(textView2, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_AD_WEBSITE);
    }
}
