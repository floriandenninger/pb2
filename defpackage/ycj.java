package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.PerksSectionRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ycj implements ajom {
    public final LinearLayout a;
    private final ajjz b;
    private final ajco c;
    private final YouTubeTextView d;
    private final YouTubeTextView e;
    private final YouTubeTextView f;
    private final ImageView g;

    public ycj(Context context, ajjz ajjzVar, aahd aahdVar, ViewGroup viewGroup) {
        this.b = ajjzVar;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.ypc_perk_item_v2_layout, viewGroup, false);
        this.a = linearLayout;
        ajcn a = ajco.a();
        a.a = context;
        a.c = new ajrv(aahdVar);
        this.c = a.a();
        this.e = (YouTubeTextView) linearLayout.findViewById(R.id.perk_public_description);
        this.f = (YouTubeTextView) linearLayout.findViewById(R.id.perk_sponsors_description);
        this.d = (YouTubeTextView) linearLayout.findViewById(R.id.perk_title);
        this.g = (ImageView) linearLayout.findViewById(R.id.sponsors_only_icon);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    public final void d(attx attxVar) {
        aqyg aqygVar;
        aqyg aqygVar2;
        YouTubeTextView youTubeTextView = this.d;
        aqyg aqygVar3 = null;
        if ((attxVar.b & 1) != 0) {
            aqygVar = attxVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        ycl.d(youTubeTextView, ajcq.d(aqygVar, this.c));
        int i = attxVar.b & 2;
        if (i == 0) {
            this.e.setVisibility(8);
        } else {
            YouTubeTextView youTubeTextView2 = this.e;
            if (i != 0) {
                aqygVar2 = attxVar.d;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            } else {
                aqygVar2 = null;
            }
            ycl.d(youTubeTextView2, ajcq.d(aqygVar2, this.c));
        }
        aulq aulqVar = attxVar.e;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(PerksSectionRendererOuterClass.sponsorsDescriptionRenderer)) {
            aulq aulqVar2 = attxVar.e;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            attz attzVar = (attz) aulqVar2.pX(PerksSectionRendererOuterClass.sponsorsDescriptionRenderer);
            YouTubeTextView youTubeTextView3 = this.f;
            if ((attzVar.b & 2) != 0 && (aqygVar3 = attzVar.d) == null) {
                aqygVar3 = aqyg.a;
            }
            ycl.d(youTubeTextView3, ajcq.d(aqygVar3, this.c));
            if ((attzVar.b & 1) != 0) {
                ajjz ajjzVar = this.b;
                ImageView imageView = this.g;
                avgg avggVar = attzVar.c;
                if (avggVar == null) {
                    avggVar = avgg.a;
                }
                ajjzVar.h(imageView, avggVar);
                return;
            }
            return;
        }
        this.g.setVisibility(8);
        this.f.setVisibility(8);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        d((attx) obj);
    }
}
