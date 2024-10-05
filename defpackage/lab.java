package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lab extends gae {
    private ImageView a;
    private TextView b;
    private TextView c;
    private TextView g;
    private LinearLayout h;
    private final ggt i;
    private final Context j;

    public lab(ajut ajutVar, Context context, View view) {
        super(view);
        this.i = new ggt(context, ajutVar);
        this.j = context;
    }

    public final void a(apkf apkfVar) {
        View view = this.f;
        if (apkfVar == null) {
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View c = c();
        c.setVisibility(0);
        this.b = (TextView) c.findViewById(R.id.badge_icon_text);
        this.c = (TextView) c.findViewById(R.id.badge_red_text);
        this.g = (TextView) c.findViewById(R.id.badge_label);
        this.a = (ImageView) c.findViewById(R.id.badge_icon);
        this.h = (LinearLayout) c.findViewById(R.id.badge_icon_and_text);
        whu.G(this.b, apkfVar.c);
        whu.G(this.c, apkfVar.e);
        TextView textView = this.g;
        aqyg aqygVar = apkfVar.f;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        whu.G(textView, ajcq.b(aqygVar));
        apkg apkgVar = apkfVar.g;
        if (apkgVar == null) {
            apkgVar = apkg.a;
        }
        int aR = anaf.aR(apkgVar.b);
        if (aR != 0 && aR == 5) {
            if ((apkfVar.b & 2) != 0) {
                ImageView imageView = this.a;
                ggt ggtVar = this.i;
                arfs arfsVar = apkfVar.d;
                if (arfsVar == null) {
                    arfsVar = arfs.a;
                }
                arfr b = arfr.b(arfsVar.c);
                if (b == null) {
                    b = arfr.UNKNOWN;
                }
                imageView.setImageResource(ggtVar.a(b));
            }
            whu.I(this.a, (apkfVar.b & 2) != 0);
            this.a.setBackground((apkfVar.b & 1) != 0 ? b(this.j) : null);
            this.h.setBackground((apkfVar.b & 1) != 0 ? b(this.j) : null);
            this.b.setBackground(null);
            if ((apkfVar.b & 1) == 0) {
                int dimensionPixelSize = this.j.getResources().getDimensionPixelSize(R.dimen.standalone_red_badge_premium_icon_size);
                yny.z(this.a, yny.h(yny.s(0, 0, 0, 0), yny.y(dimensionPixelSize, dimensionPixelSize)), ViewGroup.MarginLayoutParams.class);
            } else {
                this.b.setPadding(this.j.getResources().getDimensionPixelSize(R.dimen.standalone_red_badge_premium_icon_text_margin_start_end), 0, this.j.getResources().getDimensionPixelSize(R.dimen.standalone_red_badge_premium_icon_text_margin_start_end), 0);
                this.b.setTextColor(wbs.Q(this.j, R.attr.ytTextSecondary));
            }
        }
    }

    public lab(ajut ajutVar, Context context, ViewStub viewStub) {
        super(viewStub);
        this.i = new ggt(context, ajutVar);
        this.j = context;
    }
}
