package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nej {
    public final ncd a;
    public final nhb b;
    public final ndm c;
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
    private final TextView q;
    private final RatingBar r;
    private final TextView s;
    private final View t;
    private final View u;
    private final View v;

    /* JADX INFO: Access modifiers changed from: protected */
    public nej(Context context, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, ajuw ajuwVar, wyz wyzVar, tdv tdvVar, wzq wzqVar, euv euvVar, ypa ypaVar, View view, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.promoted_sparkles_text_ctd_watch_wide_form, (ViewGroup) null, false);
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
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.app_store_text);
        this.p = textView2;
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.rating_text);
        this.q = textView3;
        RatingBar ratingBar = (RatingBar) findViewById2.findViewById(R.id.rating);
        this.r = ratingBar;
        TextView textView4 = (TextView) findViewById2.findViewById(R.id.price);
        this.s = textView4;
        View findViewById7 = findViewById2.findViewById(R.id.cta_button_wrapper);
        this.t = findViewById7;
        View findViewById8 = findViewById7.findViewById(R.id.cta_button_touchable_wrapper);
        this.u = findViewById8;
        View findViewById9 = findViewById2.findViewById(R.id.close_button);
        this.v = findViewById9;
        ncd ncdVar = new ncd();
        this.a = ncdVar;
        nhb nhbVar = new nhb(context, aahdVar, wzqVar, wyzVar, tdvVar, euvVar, ypaVar, inflate, findViewById2, findViewById3, view, findViewById9, null, null, new View.OnClickListener() { // from class: nef
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                nej.this.d.a();
            }
        }, new ngx() { // from class: neh
            @Override // defpackage.ngx
            public final void a(boolean z) {
                nej.this.c.f(!z);
            }
        }, new nha() { // from class: nei
            @Override // defpackage.nha
            public final void a(boolean z, boolean z2) {
                ndm ndmVar = nej.this.c;
                boolean z3 = false;
                if (!z && !z2) {
                    z3 = true;
                }
                ndmVar.f(z3);
            }
        }, ncdVar);
        this.b = nhbVar;
        this.c = new ndm(ajjzVar, ajutVar, ajuwVar, inflate, findViewById2, true, ajywVar, akbdVar, null, null, null, null, null);
        nah nahVar = new nah(nhbVar, (ViewStub) inflate.findViewById(R.id.muted_ad_view_stub), new nag() { // from class: neg
            @Override // defpackage.nag
            public final void a() {
                nej.this.d.b();
            }
        });
        this.i = nahVar;
        this.d = new nce(nhbVar, nahVar, findViewById);
        nhbVar.B(textView, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TITLE);
        nhbVar.B(findViewById6, augq.PROMOTED_SPARKLES_CLICK_LOCATION_AD_BADGE);
        nhbVar.B(findViewById5, augq.PROMOTED_SPARKLES_CLICK_LOCATION_THUMBNAIL);
        nhbVar.B(findViewById8, augq.PROMOTED_SPARKLES_CLICK_LOCATION_ACTION_LABEL);
        nhbVar.B(findViewById4, augq.PROMOTED_SPARKLES_CLICK_LOCATION_BACKGROUND);
        nhbVar.B(textView3, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nhbVar.B(ratingBar, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_RATING);
        nhbVar.B(textView4, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_PRICE);
        if (textView2 != null) {
            nhbVar.B(textView2, augq.PROMOTED_SPARKLES_CLICK_LOCATION_TEXT_CTD_AD_APP_STORE);
        }
    }
}
