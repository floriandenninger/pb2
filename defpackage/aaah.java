package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaah implements aabn {
    private final ajjz a;

    public aaah(ajjz ajjzVar) {
        ajjzVar.getClass();
        this.a = ajjzVar;
    }

    private static final aaaf c(View view) {
        if (view == null) {
            return null;
        }
        aaaf aaafVar = new aaaf();
        aaafVar.a = view;
        aaafVar.b = view.findViewById(R.id.sponsored_region);
        aaafVar.c = (TextView) aaafVar.b.findViewById(R.id.sponsored_text);
        aaafVar.d = (TextView) view.findViewById(R.id.title);
        aaafVar.e = (TextView) view.findViewById(R.id.price);
        aaafVar.f = (TextView) view.findViewById(R.id.merchant);
        aaafVar.g = (ImageView) view.findViewById(R.id.image);
        aaafVar.h = (RatingBar) view.findViewById(R.id.rating);
        aaafVar.i = (TextView) view.findViewById(R.id.review_text);
        aaafVar.j = new xbw(view, null);
        return aaafVar;
    }

    @Override // defpackage.aabn
    public final wv a(Context context, ViewGroup viewGroup, zzz zzzVar, boolean z) {
        return new aaag(LayoutInflater.from(context).inflate(z ? R.layout.info_card_shopping : R.layout.info_card_shopping_container_watch_next, viewGroup, false), z);
    }

    @Override // defpackage.aabn
    public final void b(Context context, aaaa aaaaVar, wv wvVar, aabq aabqVar) {
        aaaf aaafVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        aqyg aqygVar4;
        aaaf aaafVar2;
        aaag aaagVar = (aaag) wvVar;
        arhg c = aaaaVar.c();
        arhf arhfVar = c.n;
        if (arhfVar == null) {
            arhfVar = arhf.a;
        }
        int dN = amkq.dN(arhfVar.b);
        if (dN == 0) {
            dN = 2;
        }
        View view = wvVar.a;
        if (aaagVar.t) {
            if (aaagVar.v == null) {
                aaagVar.v = c(view);
            }
            aaafVar = aaagVar.v;
        } else if (dN == 3) {
            if (aaagVar.u == null) {
                aaagVar.u = c(whu.z(view, R.id.product_card_stub, R.id.product_card));
                RatingBar ratingBar = aaagVar.u.h;
                if (ratingBar != null) {
                    LayerDrawable layerDrawable = (LayerDrawable) ratingBar.getProgressDrawable();
                    Drawable c2 = gl.c(layerDrawable.findDrawableByLayerId(android.R.id.progress));
                    c2.setTint(context.getResources().getColor(R.color.info_card_shopping_star_orange));
                    layerDrawable.setDrawableByLayerId(android.R.id.progress, c2);
                    Drawable c3 = gl.c(layerDrawable.findDrawableByLayerId(android.R.id.background));
                    c3.setTint(wbs.W(context, R.attr.ytIcon1).orElse(0));
                    layerDrawable.setDrawableByLayerId(android.R.id.background, c3);
                    layerDrawable.setDrawableByLayerId(android.R.id.secondaryProgress, c3);
                }
            }
            aaafVar = aaagVar.u;
        } else {
            if (aaagVar.v == null) {
                aaagVar.v = c(whu.z(view, R.id.shopping_card_stub, R.id.shopping_card));
            }
            aaafVar = aaagVar.v;
        }
        if (dN != 3 || (aaafVar2 = aaagVar.v) == null) {
            aaaf aaafVar3 = aaagVar.u;
            if (aaafVar3 != null) {
                aaafVar3.a.setVisibility(8);
            }
        } else {
            aaafVar2.a.setVisibility(8);
        }
        aaafVar.a.setVisibility(0);
        TextView textView = aaafVar.d;
        aqyg aqygVar5 = null;
        if ((c.b & 8) != 0) {
            aqygVar = c.f;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
        TextView textView2 = aaafVar.e;
        if ((c.b & 16) != 0) {
            aqygVar2 = c.g;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        TextView textView3 = aaafVar.f;
        if ((c.b & 32) != 0) {
            aqygVar3 = c.h;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        whu.G(textView3, ajcq.b(aqygVar3));
        if ((c.b & 4) != 0) {
            ajjz ajjzVar = this.a;
            ImageView imageView = aaafVar.g;
            avgg avggVar = c.e;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            ajjzVar.h(imageView, avggVar);
        }
        if (aaafVar.h != null) {
            if (Float.compare(c.l, 0.0f) > 0) {
                aaafVar.h.setVisibility(0);
                aaafVar.h.setRating(c.l);
                aaafVar.h.setContentDescription(String.format("%.1f", Float.valueOf(c.l)));
                TextView textView4 = aaafVar.i;
                if ((c.b & 2048) != 0) {
                    aqygVar4 = c.m;
                    if (aqygVar4 == null) {
                        aqygVar4 = aqyg.a;
                    }
                } else {
                    aqygVar4 = null;
                }
                whu.G(textView4, ajcq.b(aqygVar4));
            } else {
                aaafVar.h.setVisibility(8);
                aaafVar.i.setVisibility(8);
            }
        }
        if ((c.b & 1) != 0 && (aqygVar5 = c.c) == null) {
            aqygVar5 = aqyg.a;
        }
        Spanned b = ajcq.b(aqygVar5);
        whu.G(aaafVar.c, b);
        if (TextUtils.isEmpty(b)) {
            aaafVar.b.setVisibility(4);
        } else {
            aaafVar.b.setVisibility(0);
            aaafVar.b.setOnClickListener(new aaae(c, aaafVar, aabqVar, 1));
        }
        view.setOnClickListener(new aaae(c, aabqVar, aaafVar, 0));
    }
}
