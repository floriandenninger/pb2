package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SponsorshipsRenderers;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yio implements ajom {
    public final View a;
    public final ViewGroup b;
    private final aahd c;
    private final YouTubeTextView d;
    private final ImageView e;
    private final ImageView f;
    private final ViewGroup g;
    private final View h;
    private final View i;
    private final View j;
    private final yje k;
    private final yjh l;

    public yio(Context context, aahd aahdVar, yje yjeVar, yjh yjhVar, ViewGroup viewGroup) {
        this.c = aahdVar;
        this.k = yjeVar;
        this.l = yjhVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.sponsorships_expandable_message_layout, viewGroup, false);
        this.a = inflate;
        this.d = (YouTubeTextView) inflate.findViewById(R.id.message);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.expand_icon);
        this.e = imageView;
        this.f = (ImageView) inflate.findViewById(R.id.check_icon);
        imageView.setColorFilter(wbs.Q(context, R.attr.ytTextSecondary));
        this.b = (ViewGroup) inflate.findViewById(R.id.expanded_content);
        this.g = (ViewGroup) inflate.findViewById(R.id.message_container);
        this.h = inflate.findViewById(R.id.border_top);
        this.i = inflate.findViewById(R.id.border_bottom);
        this.j = inflate.findViewById(R.id.margin_bottom);
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
    public final void oB(ajok ajokVar, auww auwwVar) {
        aqyg aqygVar;
        int K;
        int K2;
        boolean z;
        int i;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        YouTubeTextView youTubeTextView = this.d;
        boolean z4 = true;
        if ((auwwVar.b & 1) != 0) {
            aqygVar = auwwVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        boolean z5 = false;
        whu.G(youTubeTextView, aahk.a(aqygVar, this.c, false));
        boolean z6 = !auwwVar.d.isEmpty();
        whu.I(this.e, z6);
        this.a.setOnClickListener(z6 ? new View.OnClickListener() { // from class: yin
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yio yioVar = yio.this;
                yioVar.e(yioVar.b.getVisibility() != 0);
            }
        } : null);
        this.b.removeAllViews();
        for (aulq aulqVar : auwwVar.d) {
            if (aulqVar.pY(SponsorshipsRenderers.sponsorshipsPerksRenderer)) {
                auxj auxjVar = (auxj) aulqVar.pX(SponsorshipsRenderers.sponsorshipsPerksRenderer);
                yjd b = this.k.b(this.b);
                b.oB(ajokVar, auxjVar);
                this.b.addView(b.a);
            } else if (aulqVar.pY(SponsorshipsRenderers.sponsorshipsTierRenderer)) {
                auxm auxmVar = (auxm) aulqVar.pX(SponsorshipsRenderers.sponsorshipsTierRenderer);
                yjg b2 = this.l.b(this.b);
                b2.oB(ajokVar, auxmVar);
                this.b.addView(b2.a);
            }
        }
        e(auwwVar.f);
        int bj = aobq.bj(auwwVar.e);
        if (bj == 0) {
            bj = 1;
        }
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        int orElse = wbs.W(this.a.getContext(), R.attr.ytGeneralBackgroundB).orElse(0);
        int orElse2 = wbs.W(this.a.getContext(), R.attr.ytGeneralBackgroundB).orElse(0);
        int orElse3 = wbs.W(this.a.getContext(), R.attr.ytTextSecondary).orElse(0);
        int K3 = yjk.K(displayMetrics, 8);
        int K4 = yjk.K(displayMetrics, 16);
        int K5 = yjk.K(displayMetrics, 16);
        int K6 = yjk.K(displayMetrics, 16);
        int i4 = bj - 1;
        if (i4 != 2) {
            if (i4 == 3) {
                z3 = false;
            } else if (i4 != 4) {
                K = K6;
                K2 = K5;
                z = false;
                i = 0;
                z4 = false;
                i2 = 0;
                z2 = false;
                i3 = R.style.TextAppearance_YouTube_Spec_Body2a;
            } else {
                z3 = true;
            }
            K3 = yjk.K(displayMetrics, 20);
            int K7 = yjk.K(displayMetrics, 42);
            int K8 = yjk.K(displayMetrics, 0);
            int K9 = yjk.K(displayMetrics, 24);
            orElse3 = wbs.W(this.a.getContext(), R.attr.ytTextPrimary).orElse(0);
            K = K6;
            K2 = K8;
            orElse2 = 0;
            z5 = true;
            i3 = R.style.TextAppearance_YouTube_Spec_Body2a;
            z2 = z3;
            i2 = K9;
            i = K7;
            z = false;
            orElse = 0;
        } else {
            K3 = yjk.K(displayMetrics, 24);
            orElse3 = wbs.W(this.a.getContext(), R.attr.ytTextPrimary).orElse(0);
            orElse2 = wbs.W(this.a.getContext(), R.attr.ytGeneralBackgroundA).orElse(0);
            K = yjk.K(displayMetrics, 0);
            K2 = yjk.K(displayMetrics, 12);
            z = true;
            i = 0;
            z4 = false;
            i2 = 0;
            z2 = false;
            i3 = R.style.TextAppearance_YouTube_Subhead;
        }
        this.g.setBackgroundColor(orElse);
        this.g.setPadding(K4, K3, K4, K3);
        this.d.setTextAppearance(this.a.getContext(), i3);
        this.d.setTextColor(orElse3);
        this.b.setBackgroundColor(orElse2);
        this.b.setPadding(i + K, K2, K, i2 + K2);
        whu.I(this.f, z4);
        whu.I(this.h, z2);
        whu.I(this.i, z5);
        whu.I(this.j, z);
    }

    public final void e(boolean z) {
        whu.I(this.b, z);
        this.e.setImageResource(true != z ? R.drawable.quantum_ic_arrow_drop_down_black_24 : R.drawable.quantum_ic_arrow_drop_up_black_24);
    }
}
