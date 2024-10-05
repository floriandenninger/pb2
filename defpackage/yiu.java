package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SponsorshipsRenderers;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yiu implements ajom {
    public final View a;
    public final ViewGroup b;
    private final aahd c;
    private final Context d;
    private final ajjz e;
    private final YouTubeTextView f;
    private final YouTubeTextView g;
    private final YouTubeTextView h;
    private final ImageView i;
    private final ImageView j;

    public yiu(Context context, aahd aahdVar, ajjz ajjzVar, ViewGroup viewGroup) {
        this.d = context;
        this.c = aahdVar;
        this.e = ajjzVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.sponsorships_list_tile_layout, viewGroup, false);
        this.a = inflate;
        this.f = (YouTubeTextView) inflate.findViewById(R.id.title);
        this.g = (YouTubeTextView) inflate.findViewById(R.id.subtitle);
        this.h = (YouTubeTextView) inflate.findViewById(R.id.detail);
        this.i = (ImageView) inflate.findViewById(R.id.icon);
        this.j = (ImageView) inflate.findViewById(R.id.expand_icon);
        this.b = (ViewGroup) inflate.findViewById(R.id.expanded_content);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajom
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void oB(ajok ajokVar, auxb auxbVar) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        avgg avggVar;
        YouTubeTextView youTubeTextView = this.f;
        if ((auxbVar.b & 8) != 0) {
            aqygVar = auxbVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(youTubeTextView, aahk.a(aqygVar, this.c, false));
        YouTubeTextView youTubeTextView2 = this.g;
        if ((auxbVar.b & 16) != 0) {
            aqygVar2 = auxbVar.e;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        whu.G(youTubeTextView2, aahk.a(aqygVar2, this.c, false));
        YouTubeTextView youTubeTextView3 = this.h;
        if ((auxbVar.b & 32) != 0) {
            aqygVar3 = auxbVar.f;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        whu.G(youTubeTextView3, aahk.a(aqygVar3, this.c, false));
        ajjz ajjzVar = this.e;
        ImageView imageView = this.i;
        if ((auxbVar.b & 1) != 0) {
            avggVar = auxbVar.c;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        } else {
            avggVar = null;
        }
        ajjzVar.h(imageView, avggVar);
        boolean z = auxbVar.g.size() > 0;
        whu.I(this.j, z);
        this.a.setOnClickListener(z ? new View.OnClickListener() { // from class: yit
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yiu yiuVar = yiu.this;
                yiuVar.e(yiuVar.b.getVisibility() != 0);
            }
        } : null);
        ColorDrawable colorDrawable = auxbVar.h ? new ColorDrawable(wbs.Q(this.a.getContext(), R.attr.ytGeneralBackgroundB)) : null;
        if (z) {
            whu.F(this.a, colorDrawable, 0);
        } else {
            this.a.setBackground(colorDrawable);
        }
        this.b.removeAllViews();
        for (aulq aulqVar : auxbVar.g) {
            if (aulqVar.pY(SponsorshipsRenderers.sponsorshipsListTileRenderer)) {
                yiu yiuVar = new yiu(this.d, this.c, this.e, this.b);
                yiuVar.oB(ajokVar, (auxb) aulqVar.pX(SponsorshipsRenderers.sponsorshipsListTileRenderer));
                this.b.addView(yiuVar.a);
            } else if (aulqVar.pY(SponsorshipsRenderers.sponsorshipsLoyaltyBadgesRenderer)) {
                yiw yiwVar = new yiw(this.d, this.c, this.e, this.b);
                yiwVar.e((auxd) aulqVar.pX(SponsorshipsRenderers.sponsorshipsLoyaltyBadgesRenderer));
                yiwVar.d(true);
                ViewGroup viewGroup = yiwVar.a;
                viewGroup.setPadding(yjk.K(this.a.getResources().getDisplayMetrics(), 48), 0, 0, 0);
                this.b.addView(viewGroup);
            }
        }
        e(false);
    }

    public final void e(boolean z) {
        whu.I(this.b, z);
        this.j.setImageResource(true != z ? R.drawable.quantum_ic_keyboard_arrow_down_grey600_24 : R.drawable.quantum_ic_keyboard_arrow_up_grey600_24);
    }
}
