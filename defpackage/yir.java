package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yir implements ajom {
    private final aahd a;
    private final ajjz b;
    private final LinearLayout c;
    private final YouTubeTextView d;
    private final YouTubeTextView e;
    private final ImageView f;
    private final View g;
    private final View h;
    private final YouTubeTextView i;
    private final ajyf j;
    private final YouTubeTextView k;
    private final ajyf l;

    public yir(Context context, aahd aahdVar, ajjz ajjzVar, ajyg ajygVar, ViewGroup viewGroup) {
        this.a = aahdVar;
        this.b = ajjzVar;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.sponsorships_heading_layout, viewGroup, false);
        this.c = linearLayout;
        this.d = (YouTubeTextView) linearLayout.findViewById(R.id.title);
        this.e = (YouTubeTextView) linearLayout.findViewById(R.id.subtitle);
        this.f = (ImageView) linearLayout.findViewById(R.id.icon);
        this.g = linearLayout.findViewById(R.id.top_spacer);
        this.h = linearLayout.findViewById(R.id.title_spacer);
        YouTubeTextView youTubeTextView = (YouTubeTextView) linearLayout.findViewById(R.id.end_button);
        this.i = youTubeTextView;
        this.j = ajygVar.a(youTubeTextView);
        YouTubeTextView youTubeTextView2 = (YouTubeTextView) linearLayout.findViewById(R.id.bottom_button);
        this.k = youTubeTextView2;
        this.l = ajygVar.a(youTubeTextView2);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        auwz auwzVar = (auwz) obj;
        acra acraVar = ajokVar.a;
        aqyg aqygVar2 = null;
        if (auwzVar.h) {
            LinearLayout linearLayout = this.c;
            linearLayout.setBackgroundColor(wbs.Q(linearLayout.getContext(), R.attr.ytGeneralBackgroundB));
        } else {
            this.c.setBackground(null);
        }
        YouTubeTextView youTubeTextView = this.d;
        if ((auwzVar.b & 1) != 0) {
            aqygVar = auwzVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(youTubeTextView, aahk.a(aqygVar, this.a, false));
        YouTubeTextView youTubeTextView2 = this.e;
        if ((auwzVar.b & 4) != 0 && (aqygVar2 = auwzVar.e) == null) {
            aqygVar2 = aqyg.a;
        }
        whu.G(youTubeTextView2, aahk.a(aqygVar2, this.a, false));
        if ((auwzVar.b & 2) == 0) {
            whu.I(this.f, false);
        } else {
            whu.I(this.f, true);
            ajjz ajjzVar = this.b;
            ImageView imageView = this.f;
            avgg avggVar = auwzVar.d;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            ajjzVar.h(imageView, avggVar);
        }
        whu.I(this.g, auwzVar.i);
        whu.I(this.h, (this.e.getVisibility() == 0 || this.f.getVisibility() == 0) && this.d.getVisibility() == 0);
        whu.I(this.i, (auwzVar.b & 8) != 0);
        ajyf ajyfVar = this.j;
        aulq aulqVar = auwzVar.f;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        ajyfVar.b((apmg) ahbj.n(aulqVar, ButtonRendererOuterClass.buttonRenderer), acraVar);
        whu.I(this.k, (auwzVar.b & 16) != 0);
        ajyf ajyfVar2 = this.l;
        aulq aulqVar2 = auwzVar.g;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        ajyfVar2.b((apmg) ahbj.n(aulqVar2, ButtonRendererOuterClass.buttonRenderer), acraVar);
    }
}
