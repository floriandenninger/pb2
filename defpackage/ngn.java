package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ngn {
    public final ncd a;
    public final nhb b;
    public final nfe c;
    public final nce d;
    public final View e;
    public final View f;
    public final View g;
    public acra h;
    private final nah i;
    private final View j;
    private final View k;
    private final View l;
    private final View m;
    private final TextView n;
    private final View o;
    private final TextView p;
    private final View q;
    private final View r;
    private final View s;

    /* JADX INFO: Access modifiers changed from: protected */
    public ngn(Context context, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, ajuw ajuwVar, wyz wyzVar, tdv tdvVar, wzq wzqVar, euv euvVar, ypa ypaVar, View view, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.promoted_sparkles_text_watch_wide_form, (ViewGroup) null, false);
        this.e = inflate;
        View findViewById = inflate.findViewById(R.id.ad_view);
        this.j = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.content_layout);
        this.k = findViewById2;
        View findViewById3 = findViewById.findViewById(R.id.click_overlay);
        this.l = findViewById3;
        this.f = findViewById2.findViewById(R.id.content_metadata_grid_layout);
        View findViewById4 = findViewById2.findViewById(R.id.content_background);
        this.m = findViewById4;
        View findViewById5 = findViewById2.findViewById(R.id.thumbnail_wrapper);
        this.g = findViewById5;
        TextView textView = (TextView) findViewById2.findViewById(R.id.title);
        this.n = textView;
        View findViewById6 = findViewById2.findViewById(R.id.ad_attribution);
        this.o = findViewById6;
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.website);
        this.p = textView2;
        View findViewById7 = findViewById2.findViewById(R.id.cta_button_wrapper);
        this.q = findViewById7;
        View findViewById8 = findViewById7.findViewById(R.id.cta_button_touchable_wrapper);
        this.r = findViewById8;
        View findViewById9 = findViewById2.findViewById(R.id.close_button);
        this.s = findViewById9;
        ncd ncdVar = new ncd();
        this.a = ncdVar;
        nhb nhbVar = new nhb(context, aahdVar, wzqVar, wyzVar, tdvVar, euvVar, ypaVar, inflate, findViewById2, findViewById3, view, findViewById9, null, null, new View.OnClickListener() { // from class: ngj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ngn.this.d.a();
            }
        }, new ngx() { // from class: ngl
            @Override // defpackage.ngx
            public final void a(boolean z) {
                ngn.this.c.f(!z);
            }
        }, new nha() { // from class: ngm
            @Override // defpackage.nha
            public final void a(boolean z, boolean z2) {
                nfe nfeVar = ngn.this.c;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                nfeVar.f(z3);
            }
        }, ncdVar);
        this.b = nhbVar;
        this.c = new nfe(ajjzVar, ajutVar, ajuwVar, inflate, findViewById2, true, ajywVar, akbdVar, null, null, null, null, null);
        nah nahVar = new nah(nhbVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new nag() { // from class: ngk
            @Override // defpackage.nag
            public final void a() {
                ngn.this.d.b();
            }
        });
        this.i = nahVar;
        this.d = new nce(nhbVar, nahVar, findViewById);
        nhbVar.B(textView, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nhbVar.B(findViewById6, augq.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nhbVar.B(findViewById5, augq.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        nhbVar.B(findViewById8, augq.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        nhbVar.B(findViewById4, augq.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        nhbVar.B(textView2, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_AD_WEBSITE);
    }
}
