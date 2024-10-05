package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gaf extends gae {
    private final ajut a;
    private final Context b;

    public gaf(ajut ajutVar, Context context, View view) {
        super(view);
        this.a = ajutVar;
        this.b = context;
    }

    public final void a() {
        View view = this.f;
        if (view != null) {
            whu.I(view, false);
        }
    }

    public final void f(atdu atduVar) {
        if (atduVar == null) {
            a();
            return;
        }
        View c = c();
        ImageView imageView = (ImageView) c.findViewById(R.id.badge_icon);
        TextView textView = (TextView) c.findViewById(R.id.badge_label);
        whu.I(c, true);
        if ((atduVar.b & 1) != 0) {
            ggt ggtVar = new ggt(this.b, this.a);
            arfs arfsVar = atduVar.c;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfr b = arfr.b(arfsVar.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            imageView.setImageResource(ggtVar.a(b));
        }
        whu.I(imageView, 1 == (atduVar.b & 1));
        whu.G(textView, atduVar.e);
        if ((atduVar.b & 128) == 0) {
            c.setContentDescription(null);
        } else {
            aots aotsVar = atduVar.g;
            if (aotsVar == null) {
                aotsVar = aots.a;
            }
            c.setContentDescription(aotsVar.c);
        }
        View view = this.f;
        if (view == null) {
            return;
        }
        ImageView imageView2 = (ImageView) view.findViewById(R.id.badge_icon);
        TextView textView2 = (TextView) view.findViewById(R.id.badge_label);
        int cl = anaf.cl(atduVar.d);
        if (cl == 0) {
            cl = 1;
        }
        int i = cl - 1;
        if (i == 3) {
            view.setBackground(b(this.b));
            textView2.setTextColor(wbs.W(this.b, R.attr.ytBrandRed).orElse(0));
            jj.h(imageView2, wbs.S(this.b, R.attr.ytBrandRed));
            return;
        }
        if (i != 4) {
            if (i != 6) {
                if (i == 22) {
                    view.setBackground(aii.a(this.b, R.drawable.reel_player_badge_background));
                    textView2.setTextColor(wbs.Q(this.b, R.attr.ytOverlayTextPrimary));
                    jj.h(imageView2, wbs.S(this.b, R.attr.ytOverlayTextPrimary));
                    return;
                }
                if (i != 17) {
                    if (i != 18) {
                        switch (i) {
                            case 11:
                                textView2.setPaintFlags(textView2.getPaintFlags() | 16);
                                break;
                            case 13:
                                view.setBackground(b(this.b));
                                textView2.setTextColor(wbs.W(this.b, R.attr.ytBrandRed).orElse(0));
                                imageView2.setColorFilter(wbs.W(this.b, R.attr.ytBrandRed).orElse(0));
                                return;
                        }
                        view.setBackground(b(this.b));
                        textView2.setTextColor(wbs.W(this.b, R.attr.ytBadgeText1).orElse(0));
                        imageView2.setColorFilter(wbs.W(this.b, R.attr.ytBadgeText1).orElse(0));
                        return;
                    }
                    view.setBackgroundResource(R.drawable.duration_background);
                    textView2.setTextColor(wbs.Q(this.b, R.attr.ytStaticWhite));
                    jj.h(imageView2, wbs.S(this.b, R.attr.ytStaticWhite));
                    return;
                }
                if (atduVar.e.isEmpty()) {
                    View view2 = this.f;
                    if (view2 != null) {
                        ImageView imageView3 = (ImageView) view2.findViewById(R.id.badge_icon);
                        TextView textView3 = (TextView) view2.findViewById(R.id.badge_label);
                        view2.setBackground(null);
                        view2.setPadding(0, 0, 0, 0);
                        textView3.setTextColor(wbs.Q(this.b, R.attr.ytTextSecondary));
                        textView3.setPadding(0, 0, 0, 0);
                        int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(R.dimen.metadata_badge_premium_icon_size);
                        yny.z(imageView3, yny.h(yny.s(0, 0, 0, 0), yny.y(dimensionPixelSize, dimensionPixelSize)), ViewGroup.MarginLayoutParams.class);
                        return;
                    }
                    return;
                }
                View view3 = this.f;
                if (view3 != null) {
                    ImageView imageView4 = (ImageView) view3.findViewById(R.id.badge_icon);
                    TextView textView4 = (TextView) view3.findViewById(R.id.badge_label);
                    view3.setBackground(b(this.b));
                    view3.setPadding(0, 0, 0, 0);
                    textView4.setTextColor(wbs.Q(this.b, R.attr.ytTextSecondary));
                    int dimensionPixelSize2 = this.b.getResources().getDimensionPixelSize(R.dimen.metadata_badge_premium_icon_text_margin_start_end);
                    textView4.setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
                    int dimensionPixelSize3 = this.b.getResources().getDimensionPixelSize(R.dimen.metadata_badge_premium_padding);
                    int dimensionPixelSize4 = this.b.getResources().getDimensionPixelSize(R.dimen.metadata_badge_premium_icon_size);
                    yny.z(imageView4, yny.h(yny.s(dimensionPixelSize3, dimensionPixelSize3, 0, dimensionPixelSize3), yny.y(dimensionPixelSize4, dimensionPixelSize4)), ViewGroup.MarginLayoutParams.class);
                    return;
                }
                return;
            }
            view.setBackground(null);
            textView2.setTextColor(wbs.W(this.b, R.attr.ytBadgeText1).orElse(0));
            jj.h(imageView2, wbs.S(this.b, R.attr.ytIconActiveOther));
            return;
        }
        view.setBackground(b(this.b));
        textView2.setTextColor(aih.d(this.b, R.color.quantum_vanillagreen600));
        imageView2.setColorFilter(aih.d(this.b, R.color.quantum_vanillagreen600));
    }

    public gaf(ajut ajutVar, Context context, ViewStub viewStub) {
        super(viewStub);
        this.a = ajutVar;
        this.b = context;
    }
}
