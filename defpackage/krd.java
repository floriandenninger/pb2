package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class krd extends kre {
    private TextView A;
    private TextView B;
    private RatingBar C;
    private TextView z;

    public krd(Context context, ajjz ajjzVar, aaea aaeaVar, acra acraVar) {
        super(context, ajjzVar, aaeaVar, acraVar);
    }

    @Override // defpackage.kre, defpackage.kqt
    public final void c() {
        aqyg aqygVar;
        aqyg aqygVar2;
        if (this.r == null || this.f == null) {
            return;
        }
        super.c();
        apfl apflVar = ((apfm) this.r).d;
        if (apflVar == null) {
            apflVar = apfl.a;
        }
        int bX = amkq.bX(apflVar.i);
        if (bX == 0) {
            bX = 1;
        }
        this.x = bX;
        apfk apfkVar = ((apfm) this.r).e;
        if (apfkVar == null) {
            apfkVar = apfk.a;
        }
        int bX2 = amkq.bX(apfkVar.c);
        if (bX2 == 0) {
            bX2 = 1;
        }
        this.y = bX2;
        this.f.setImageResource(R.drawable.app_download);
        apfm apfmVar = (apfm) this.r;
        if ((apfmVar.b & 1) != 0) {
            ajjz ajjzVar = this.a;
            ImageView imageView = this.f;
            avgg avggVar = apfmVar.c;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            krc krcVar = new krc(this);
            ajju a = ajjv.a();
            a.d(true);
            a.c = krcVar;
            ajjzVar.k(imageView, avggVar, a.a());
        }
        float f = apflVar.f;
        if (f <= 0.0f) {
            this.C.setVisibility(8);
            this.B.setVisibility(8);
        } else {
            float min = Math.min(5.0f, f);
            this.C.setVisibility(0);
            this.C.setRating(min);
            whu.G(this.B, String.format("%1.1f", Float.valueOf(min)));
            this.B.setTextColor(apflVar.h);
        }
        apmh apmhVar = apflVar.c;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        apmg apmgVar = apmhVar.c;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        this.i = apmgVar.t;
        TextView textView = (TextView) this.g;
        aqyg aqygVar3 = null;
        if ((apmgVar.b & 256) != 0) {
            aqygVar = apmgVar.i;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = (TextView) this.g;
        apmf apmfVar = apmgVar.c == 17 ? (apmf) apmgVar.d : apmf.a;
        textView2.setTextColor((apmfVar.b == 118483990 ? (apkv) apmfVar.c : apkv.a).d);
        Drawable background = this.g.getBackground();
        apmf apmfVar2 = apmgVar.c == 17 ? (apmf) apmgVar.d : apmf.a;
        background.setColorFilter((apmfVar2.b == 118483990 ? (apkv) apmfVar2.c : apkv.a).c, PorterDuff.Mode.SRC);
        TextView textView3 = this.z;
        if ((apflVar.b & 2) != 0) {
            aqygVar2 = apflVar.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        textView3.setText(ajcq.b(aqygVar2));
        this.z.setTextColor(apflVar.h);
        TextView textView4 = this.A;
        if ((apflVar.b & 4) != 0 && (aqygVar3 = apflVar.e) == null) {
            aqygVar3 = aqyg.a;
        }
        textView4.setText(ajcq.b(aqygVar3));
        this.A.setTextColor(apflVar.h);
        this.d.getBackground().setColorFilter(apflVar.g, PorterDuff.Mode.SRC);
        apfk apfkVar2 = ((apfm) this.r).e;
        if (apfkVar2 == null) {
            apfkVar2 = apfk.a;
        }
        apmh apmhVar2 = apfkVar2.b;
        if (apmhVar2 == null) {
            apmhVar2 = apmh.a;
        }
        apmg apmgVar2 = apmhVar2.c;
        if (apmgVar2 == null) {
            apmgVar2 = apmg.a;
        }
        this.j = apmgVar2.t;
        Drawable background2 = this.h.getBackground();
        apmf apmfVar3 = apmgVar2.c == 17 ? (apmf) apmgVar2.d : apmf.a;
        background2.setColorFilter((apmfVar3.b == 118483990 ? (apkv) apmfVar3.c : apkv.a).c, PorterDuff.Mode.SRC);
        if (((apfm) this.r).h) {
            this.d.setElevation(10.0f);
            this.e.setZ(10.0f);
            this.f.setZ(10.0f);
            this.h.setZ(10.0f);
        }
    }

    @Override // defpackage.kre
    protected final void h(View view) {
        this.c = whu.z(view, R.id.app_promo_ad_cta_overlay_stub, R.id.app_promo_ad_cta_overlay);
        this.h = this.c.findViewById(R.id.collapse_cta_container);
        this.e = this.c.findViewById(R.id.expanded_details_container);
        this.d = this.c.findViewById(R.id.expanded_background_container);
        this.f = (ImageView) this.c.findViewById(R.id.app_promo_thumbnail_icon);
        this.g = this.c.findViewById(R.id.expanded_details_cta);
        this.z = (TextView) this.c.findViewById(R.id.expanded_details_title);
        this.A = (TextView) this.c.findViewById(R.id.expanded_details_description);
        this.B = (TextView) this.c.findViewById(R.id.expanded_details_rating_score);
        this.C = (RatingBar) this.c.findViewById(R.id.expanded_details_rating_bar);
        krb krbVar = new krb(this);
        this.g.setOnClickListener(krbVar);
        this.d.setOnClickListener(krbVar);
        this.h.setOnClickListener(krbVar);
        this.f.setOnClickListener(krbVar);
    }
}
