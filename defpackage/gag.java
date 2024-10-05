package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gag extends gae {
    private final int a;

    public gag(View view, int i) {
        super(view);
        this.a = i;
    }

    private static void f(TextView textView, int i) {
        textView.setTextColor(fk.a(textView.getResources(), i, textView.getContext().getTheme()));
    }

    private static void g(TextView textView, int i) {
        textView.setTextColor(wbs.W(textView.getContext(), i).orElse(0));
    }

    public final void a(apkh apkhVar) {
        aqyg aqygVar;
        ViewStub viewStub = this.d;
        View view = this.f;
        if (apkhVar == null) {
            if (viewStub != null) {
                viewStub.setVisibility(8);
            }
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View c = c();
        c.setVisibility(0);
        TextView textView = (TextView) c.findViewById(R.id.ypc_badge_icon);
        TextView textView2 = (TextView) c.findViewById(R.id.ypc_badge_label);
        TextView textView3 = (TextView) c.findViewById(R.id.ypc_badge_discount);
        TextView textView4 = (TextView) c.findViewById(R.id.ypc_badge_text);
        int i = apkhVar.b;
        aqyg aqygVar2 = null;
        if ((i & 4) != 0) {
            if ((8 & i) != 0) {
                aqygVar = apkhVar.f;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            whu.G(textView3, ajcq.b(aqygVar));
            if ((apkhVar.b & 4) != 0 && (aqygVar2 = apkhVar.e) == null) {
                aqygVar2 = aqyg.a;
            }
            whu.G(textView4, ajcq.b(aqygVar2));
            whu.I(textView, false);
            whu.I(textView2, false);
        } else {
            whu.G(textView, apkhVar.c);
            if ((apkhVar.b & 2) != 0 && (aqygVar2 = apkhVar.d) == null) {
                aqygVar2 = aqyg.a;
            }
            whu.G(textView2, ajcq.b(aqygVar2));
            whu.I(textView3, false);
            whu.I(textView4, false);
        }
        int i2 = this.a;
        if (i2 == 0) {
            jm.s(textView, R.style.StandaloneBadgesLight);
            textView.setBackgroundResource(R.drawable.standalone_badge_light_background);
            f(textView3, R.color.yt_grey1);
            f(textView4, R.color.yt_grey1);
            textView3.setBackgroundResource(R.drawable.standalone_badge_dark_background);
            textView4.setBackgroundResource(R.drawable.standalone_badge_dark_background);
            jm.s(textView2, R.style.TextAppearance_YouTube_Caption_Inverse);
        } else if (i2 == 2) {
            jm.s(textView, R.style.StandaloneBadges);
            textView.setBackgroundResource(R.drawable.standalone_badge_red_background);
            g(textView3, R.attr.ytTextSecondary);
            g(textView4, R.attr.ytBrandRed);
            textView3.setBackgroundResource(R.drawable.standalone_badge_red_background);
            textView4.setBackgroundResource(R.drawable.standalone_badge_red_background);
            jm.s(textView2, R.style.TextAppearance_YouTube_Caption_Inverse);
        } else {
            jm.s(textView, R.style.StandaloneBadges);
            textView.setBackground(b(textView.getContext()));
            g(textView3, R.attr.ytTextSecondary);
            g(textView4, R.attr.ytTextSecondary);
            textView3.setBackground(b(textView3.getContext()));
            textView4.setBackground(b(textView4.getContext()));
            jm.s(textView2, R.style.TextAppearance_YouTube_Caption);
        }
        if ((apkhVar.b & 32) != 0) {
            apki apkiVar = apkhVar.g;
            if (apkiVar == null) {
                apkiVar = apki.a;
            }
            int aQ = anaf.aQ(apkiVar.b);
            if (aQ != 0 && aQ == 2) {
                f(textView4, R.color.quantum_vanillagreen600);
            }
        }
    }

    public gag(ViewStub viewStub, int i) {
        super(viewStub);
        this.a = i;
    }
}
