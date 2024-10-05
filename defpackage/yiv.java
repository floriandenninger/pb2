package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yiv implements ajom {
    public final View a;
    private final Context b;
    private final aahd c;
    private final ajjz d;
    private final YouTubeTextView e;
    private final ImageView f;

    public yiv(Context context, aahd aahdVar, ajjz ajjzVar, ViewGroup viewGroup) {
        this.b = context;
        this.c = aahdVar;
        this.d = ajjzVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.sponsorships_loyalty_badge_layout, viewGroup, false);
        this.a = inflate;
        this.e = (YouTubeTextView) inflate.findViewById(R.id.title);
        this.f = (ImageView) inflate.findViewById(R.id.icon);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    public final void d(int i) {
        whu.I(this.a, true);
        this.a.setBackground(null);
        this.a.setAlpha(1.0f);
        if (i == 1) {
            GradientDrawable gradientDrawable = (GradientDrawable) this.b.getResources().getDrawable(R.drawable.loyalty_badge_border);
            gradientDrawable.setColor(wbs.W(this.b, R.attr.ytGeneralBackgroundA).orElse(0));
            gradientDrawable.setStroke(1, wbs.W(this.b, R.attr.ytGeneralBackgroundC).orElse(0));
            this.a.setBackground(gradientDrawable);
            return;
        }
        if (i == 2) {
            this.a.setAlpha(0.8f);
        } else if (i == 3) {
            whu.I(this.a, false);
        }
    }

    public final void e(auxc auxcVar) {
        aqyg aqygVar;
        YouTubeTextView youTubeTextView = this.e;
        if ((auxcVar.b & 2) != 0) {
            aqygVar = auxcVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(youTubeTextView, aahk.a(aqygVar, this.c, false));
        ajjz ajjzVar = this.d;
        ImageView imageView = this.f;
        avgg avggVar = auxcVar.c;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajjzVar.h(imageView, avggVar);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        e((auxc) obj);
    }
}
