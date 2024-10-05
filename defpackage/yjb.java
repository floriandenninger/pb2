package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SponsorshipsRenderers;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yjb implements ajom {
    public final yiw a;
    public final View b;
    public final YouTubeTextView c;
    public final YouTubeTextView d;
    private final Context e;
    private final aahd f;
    private final ajjz g;
    private final YouTubeTextView h;
    private final YouTubeTextView i;
    private final FlexboxLayout j;
    private final YouTubeTextView k;
    private final ViewGroup l;

    public yjb(Context context, aahd aahdVar, ajjz ajjzVar, yix yixVar, ViewGroup viewGroup) {
        this.e = context;
        this.f = aahdVar;
        this.g = ajjzVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.sponsorships_perk_layout, viewGroup, false);
        this.b = inflate;
        this.a = yixVar.b((ViewGroup) inflate);
        YouTubeTextView youTubeTextView = (YouTubeTextView) inflate.findViewById(R.id.bullet_point_view);
        this.h = youTubeTextView;
        whu.G(youTubeTextView, "•");
        this.i = (YouTubeTextView) inflate.findViewById(R.id.title_view);
        this.c = (YouTubeTextView) inflate.findViewById(R.id.description_view);
        this.d = (YouTubeTextView) inflate.findViewById(R.id.fulfillment_instructions_view);
        this.j = (FlexboxLayout) inflate.findViewById(R.id.images_layout);
        this.k = (YouTubeTextView) inflate.findViewById(R.id.image_description_view);
        this.l = (ViewGroup) inflate.findViewById(R.id.loyalty_badges);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    public final void d(auxi auxiVar) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        aqyg aqygVar4;
        whu.I(this.h, 1 == (auxiVar.b & 1));
        YouTubeTextView youTubeTextView = this.i;
        if ((auxiVar.b & 1) != 0) {
            aqygVar = auxiVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(youTubeTextView, ajcq.b(aqygVar));
        YouTubeTextView youTubeTextView2 = this.c;
        if ((auxiVar.b & 2) != 0) {
            aqygVar2 = auxiVar.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        whu.G(youTubeTextView2, ajcq.b(aqygVar2));
        YouTubeTextView youTubeTextView3 = this.d;
        if ((auxiVar.b & 4) != 0) {
            aqygVar3 = auxiVar.e;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        whu.G(youTubeTextView3, aahk.a(aqygVar3, this.f, false));
        if ((auxiVar.b & 16) != 0) {
            aulq aulqVar = auxiVar.h;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            auxd auxdVar = (auxd) ahbj.n(aulqVar, SponsorshipsRenderers.sponsorshipsLoyaltyBadgesRenderer);
            if (auxdVar != null) {
                this.a.e(auxdVar);
                this.l.addView(this.a.a);
                whu.I(this.j, false);
            }
        }
        this.j.removeAllViews();
        if (auxiVar.f.size() != 0) {
            this.j.addView(this.k);
            YouTubeTextView youTubeTextView4 = this.k;
            if ((auxiVar.b & 8) != 0) {
                aqygVar4 = auxiVar.g;
                if (aqygVar4 == null) {
                    aqygVar4 = aqyg.a;
                }
            } else {
                aqygVar4 = null;
            }
            whu.G(youTubeTextView4, ajcq.b(aqygVar4));
            int dimensionPixelSize = this.e.getResources().getDimensionPixelSize(R.dimen.perk_images_padding);
            for (avgg avggVar : auxiVar.f) {
                ImageView imageView = new ImageView(this.e);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(this.e.getResources().getDimensionPixelSize(R.dimen.perk_images_width), this.e.getResources().getDimensionPixelSize(R.dimen.perk_images_height)));
                imageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                this.j.addView(imageView);
                this.g.h(imageView, avggVar);
                if (avggVar != null && (avggVar.b & 4) != 0) {
                    aott aottVar = avggVar.d;
                    if (aottVar == null) {
                        aottVar = aott.a;
                    }
                    if ((aottVar.b & 1) != 0) {
                        aott aottVar2 = avggVar.d;
                        if (aottVar2 == null) {
                            aottVar2 = aott.a;
                        }
                        aots aotsVar = aottVar2.c;
                        if (aotsVar == null) {
                            aotsVar = aots.a;
                        }
                        imageView.setContentDescription(aotsVar.c);
                    }
                }
                imageView.setContentDescription(null);
            }
        }
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        d((auxi) obj);
    }
}
