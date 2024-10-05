package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.SponsorshipsRenderers;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yjg implements ajom {
    public final View a;
    private final aahd b;
    private final yjd c;
    private final YouTubeTextView d;
    private final YouTubeTextView e;
    private final ajyf f;
    private final YouTubeTextView g;
    private final YouTubeTextView h;
    private final FrameLayout i;
    private final FrameLayout j;
    private final YouTubeTextView k;
    private final YouTubeTextView l;
    private final yio m;
    private final YouTubeTextView n;
    private final View o;

    public yjg(Context context, aahd aahdVar, ajyg ajygVar, yje yjeVar, yip yipVar, ViewGroup viewGroup) {
        this.b = aahdVar;
        final int i = 0;
        View inflate = LayoutInflater.from(context).inflate(R.layout.sponsorships_tier_layout, viewGroup, false);
        this.a = inflate;
        this.d = (YouTubeTextView) inflate.findViewById(R.id.title_view);
        this.n = (YouTubeTextView) inflate.findViewById(R.id.above_purchase_button_text_view);
        YouTubeTextView youTubeTextView = (YouTubeTextView) inflate.findViewById(R.id.purchase_button);
        this.e = youTubeTextView;
        this.f = ajygVar.a(youTubeTextView);
        this.g = (YouTubeTextView) inflate.findViewById(R.id.disclaimer_view);
        this.h = (YouTubeTextView) inflate.findViewById(R.id.bottom_disclaimer);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.expandable_message_view);
        this.i = frameLayout;
        yio b = yipVar.b(frameLayout);
        this.m = b;
        frameLayout.addView(b.a);
        FrameLayout frameLayout2 = (FrameLayout) inflate.findViewById(R.id.perks_view);
        this.j = frameLayout2;
        yjd b2 = yjeVar.b(frameLayout2);
        this.c = b2;
        frameLayout2.addView(b2.a);
        YouTubeTextView youTubeTextView2 = (YouTubeTextView) inflate.findViewById(R.id.toggle_expand);
        this.k = youTubeTextView2;
        final int i2 = 1;
        youTubeTextView2.setOnClickListener(new View.OnClickListener(this) { // from class: yjf
            public final /* synthetic */ yjg a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i2 != 0) {
                    this.a.e(true);
                } else {
                    this.a.e(false);
                }
            }
        });
        YouTubeTextView youTubeTextView3 = (YouTubeTextView) inflate.findViewById(R.id.toggle_collapse);
        this.l = youTubeTextView3;
        youTubeTextView3.setOnClickListener(new View.OnClickListener(this) { // from class: yjf
            public final /* synthetic */ yjg a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i != 0) {
                    this.a.e(true);
                } else {
                    this.a.e(false);
                }
            }
        });
        this.o = inflate.findViewById(R.id.bottom_border);
        Drawable a = aii.a(context, R.drawable.quantum_ic_arrow_drop_down_black_24);
        zau.f(a, wbs.S(context, android.R.attr.textColorLink), PorterDuff.Mode.SRC_ATOP);
        Drawable a2 = aii.a(context, R.drawable.quantum_ic_arrow_drop_up_black_24);
        zau.f(a2, wbs.S(context, android.R.attr.textColorLink), PorterDuff.Mode.SRC_ATOP);
        youTubeTextView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, a, (Drawable) null);
        youTubeTextView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, a2, (Drawable) null);
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
    public final void oB(ajok ajokVar, auxm auxmVar) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        aqyg aqygVar4;
        aqyg aqygVar5;
        acra acraVar = ajokVar.a;
        YouTubeTextView youTubeTextView = this.n;
        aqyg aqygVar6 = null;
        if ((auxmVar.b & 1024) != 0) {
            aqygVar = auxmVar.k;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(youTubeTextView, ajcq.b(aqygVar));
        YouTubeTextView youTubeTextView2 = this.d;
        if ((auxmVar.b & 1) != 0) {
            aqygVar2 = auxmVar.c;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        whu.G(youTubeTextView2, ajcq.b(aqygVar2));
        ajyf ajyfVar = this.f;
        aulq aulqVar = auxmVar.j;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        ajyfVar.b((apmg) ahbj.n(aulqVar, ButtonRendererOuterClass.buttonRenderer), acraVar);
        YouTubeTextView youTubeTextView3 = this.g;
        if ((auxmVar.b & 4) != 0) {
            aqygVar3 = auxmVar.d;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        whu.G(youTubeTextView3, aahk.a(aqygVar3, this.b, false));
        YouTubeTextView youTubeTextView4 = this.h;
        if ((auxmVar.b & 8) != 0) {
            aqygVar4 = auxmVar.e;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
        } else {
            aqygVar4 = null;
        }
        whu.G(youTubeTextView4, aahk.a(aqygVar4, this.b, false));
        aulq aulqVar2 = auxmVar.f;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        auww auwwVar = (auww) ahbj.n(aulqVar2, SponsorshipsRenderers.sponsorshipsExpandableMessageRenderer);
        whu.I(this.i, auwwVar != null);
        if (auwwVar != null) {
            this.m.oB(ajokVar, auwwVar);
        }
        aulq aulqVar3 = auxmVar.g;
        if (aulqVar3 == null) {
            aulqVar3 = aulq.a;
        }
        this.c.oB(ajokVar, (auxj) ahbj.n(aulqVar3, SponsorshipsRenderers.sponsorshipsPerksRenderer));
        if ((auxmVar.b & 64) != 0) {
            aqygVar5 = auxmVar.h;
            if (aqygVar5 == null) {
                aqygVar5 = aqyg.a;
            }
        } else {
            aqygVar5 = null;
        }
        Spanned b = ajcq.b(aqygVar5);
        whu.H(this.k, b, 8);
        YouTubeTextView youTubeTextView5 = this.l;
        if ((auxmVar.b & 128) != 0 && (aqygVar6 = auxmVar.i) == null) {
            aqygVar6 = aqyg.a;
        }
        whu.H(youTubeTextView5, ajcq.b(aqygVar6), 8);
        e(TextUtils.isEmpty(b));
        whu.I(this.o, auxmVar.l);
    }

    public final void e(boolean z) {
        ArrayList arrayList = this.c.b;
        int size = arrayList.size();
        boolean z2 = false;
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= size) {
                break;
            }
            yjb yjbVar = (yjb) arrayList.get(i);
            YouTubeTextView youTubeTextView = yjbVar.c;
            whu.I(youTubeTextView, z && !TextUtils.isEmpty(youTubeTextView.getText()));
            YouTubeTextView youTubeTextView2 = yjbVar.d;
            if (!z || TextUtils.isEmpty(youTubeTextView2.getText())) {
                z3 = false;
            }
            whu.I(youTubeTextView2, z3);
            yjbVar.a.d(z);
            i++;
        }
        YouTubeTextView youTubeTextView3 = this.k;
        whu.I(youTubeTextView3, (z || TextUtils.isEmpty(youTubeTextView3.getText())) ? false : true);
        YouTubeTextView youTubeTextView4 = this.l;
        if (z && !TextUtils.isEmpty(youTubeTextView4.getText())) {
            z2 = true;
        }
        whu.I(youTubeTextView4, z2);
    }
}
