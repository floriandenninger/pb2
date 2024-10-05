package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lek extends ajpc implements ajof, lgl {
    auoa a;
    private final ajjz b;
    private final CardView c;
    private final ImageView d;
    private final TextView e;
    private final View f;
    private final ImageView g;
    private final FixedAspectRatioFrameLayout h;
    private final ajoi i;
    private final Activity j;
    private final Resources k;
    private final SharedPreferences l;
    private final akbd m;
    private ajok n;
    private lgm o;

    public lek(Activity activity, ajjz ajjzVar, aahd aahdVar, SharedPreferences sharedPreferences, akbd akbdVar, ViewGroup viewGroup) {
        this.b = ajjzVar;
        this.j = activity;
        this.k = activity.getResources();
        CardView cardView = (CardView) LayoutInflater.from(activity).inflate(R.layout.search_refinement_card, viewGroup, false);
        this.c = cardView;
        TextView textView = (TextView) cardView.findViewById(R.id.query);
        textView.getClass();
        this.e = textView;
        ImageView imageView = (ImageView) cardView.findViewById(R.id.thumbnail);
        imageView.getClass();
        this.d = imageView;
        this.i = new ajoi(aahdVar, cardView, this);
        this.f = cardView.findViewById(R.id.card_content_container);
        this.g = (ImageView) cardView.findViewById(R.id.card_content_outline);
        this.h = (FixedAspectRatioFrameLayout) cardView.findViewById(R.id.thumbnail_layout);
        this.l = sharedPreferences;
        this.m = akbdVar;
    }

    private static int f(ajok ajokVar) {
        return ajokVar.b("REFINEMENT_POSITION", -1);
    }

    private final void g() {
        this.f.setBackground(this.k.getDrawable(R.drawable.search_refinement_card_background));
        this.g.setImageDrawable(null);
        this.f.setPadding(0, 0, 0, 0);
        j(this.k.getDimensionPixelSize(R.dimen.search_refinement_card_default_width));
        this.c.c(this.k.getDimensionPixelSize(R.dimen.search_refinement_card_default_corner_radius));
        this.c.b(wbs.W(this.j, R.attr.ytBrandBackgroundSolid).orElse(0));
        this.h.a = this.k.getFraction(R.fraction.rounded_aspect_ratio_16_9, 1, 1);
        this.e.setLines(2);
        this.e.setTextSize(0, this.k.getDimensionPixelOffset(R.dimen.search_refinement_card_query_default_text_size));
        this.e.setGravity(8388611);
        n(this.k.getDimensionPixelSize(R.dimen.search_refinement_card_query_default_horizontal_margin), this.k.getDimensionPixelSize(R.dimen.search_refinement_card_query_default_vertical_margin));
    }

    private final void j(int i) {
        yny.z(this.f, yny.x(i), RelativeLayout.LayoutParams.class);
    }

    private final void m(auoa auoaVar) {
        int bG;
        int bG2;
        int bG3;
        auob auobVar = auoaVar.f;
        if (auobVar == null) {
            auobVar = auob.a;
        }
        if (auobVar == null) {
            g();
        } else {
            int bG4 = aobq.bG(auobVar.b);
            if (bG4 == 0) {
                bG4 = 1;
            }
            int i = bG4 - 1;
            if (i == 2) {
                this.f.setBackground(null);
                this.g.setImageDrawable(null);
                this.f.setPadding(0, 0, 0, 0);
                j(this.k.getDimensionPixelSize(R.dimen.search_refinement_card_universal_watch_card_width));
                this.c.c(this.k.getDimensionPixelSize(R.dimen.search_refinement_card_default_corner_radius));
                this.c.b(wbs.W(this.j, R.attr.ytGeneralBackgroundA).orElse(0));
                this.h.a = this.k.getFraction(R.fraction.aspect_ratio_square, 1, 1);
                this.e.setLines(2);
                this.e.setTextSize(0, this.k.getDimensionPixelOffset(R.dimen.search_refinement_card_query_default_text_size));
                this.e.setGravity(8388611);
                int dimensionPixelSize = this.k.getDimensionPixelSize(R.dimen.search_refinement_card_query_small_margin);
                n(dimensionPixelSize, dimensionPixelSize);
            } else if (i == 3) {
                int orElse = wbs.W(this.j, R.attr.ytGeneralBackgroundA).orElse(0);
                this.f.setBackground(null);
                o(orElse);
                int dimensionPixelSize2 = this.k.getDimensionPixelSize(R.dimen.search_refinement_card_container_padding);
                this.f.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
                j(this.k.getDimensionPixelSize(R.dimen.search_refinement_card_rectangular_width));
                this.c.c(this.k.getDimensionPixelOffset(R.dimen.search_refinement_card_rounded_corner_radius));
                this.c.b(orElse);
                this.h.a = this.k.getFraction(R.fraction.rounded_aspect_ratio_16_9, 1, 1);
                this.e.setLines(3);
                this.e.setTextSize(0, this.k.getDimensionPixelSize(R.dimen.search_refinement_card_query_small_text_size));
                this.e.setGravity(8388627);
                int dimensionPixelSize3 = this.k.getDimensionPixelSize(R.dimen.search_refinement_card_query_small_margin);
                n(dimensionPixelSize3, dimensionPixelSize3);
            } else if (i == 4) {
                int orElse2 = wbs.W(this.j, R.attr.ytGeneralBackgroundA).orElse(0);
                this.f.setBackground(null);
                o(orElse2);
                int dimensionPixelSize4 = this.k.getDimensionPixelSize(R.dimen.search_refinement_card_container_padding);
                this.f.setPadding(dimensionPixelSize4, dimensionPixelSize4, dimensionPixelSize4, dimensionPixelSize4);
                j(this.k.getDimensionPixelSize(R.dimen.search_refinement_card_square_width));
                this.c.b(orElse2);
                this.c.c(this.k.getDimensionPixelOffset(R.dimen.search_refinement_card_rounded_corner_radius));
                this.h.a = this.k.getFraction(R.fraction.aspect_ratio_2_1, 1, 1);
                this.e.setLines(2);
                this.e.setTextSize(0, this.k.getDimensionPixelSize(R.dimen.search_refinement_card_query_small_text_size));
                this.e.setGravity(8388627);
                int dimensionPixelSize5 = this.k.getDimensionPixelSize(R.dimen.search_refinement_card_query_small_margin);
                n(dimensionPixelSize5, dimensionPixelSize5);
            } else if (i == 5) {
                int orElse3 = wbs.W(this.j, R.attr.ytGeneralBackgroundA).orElse(0);
                this.f.setBackground(null);
                o(orElse3);
                int dimensionPixelSize6 = this.k.getDimensionPixelSize(R.dimen.search_refinement_card_container_padding);
                this.f.setPadding(dimensionPixelSize6, dimensionPixelSize6, dimensionPixelSize6, dimensionPixelSize6);
                j(this.k.getDimensionPixelSize(R.dimen.search_refinement_card_large_rectangular_width));
                this.c.c(this.k.getDimensionPixelOffset(R.dimen.search_refinement_card_rounded_corner_radius));
                this.c.b(orElse3);
                this.h.a = this.k.getFraction(R.fraction.rounded_aspect_ratio_16_9, 1, 1);
                this.e.setLines(2);
                this.e.setTextSize(0, this.k.getDimensionPixelSize(R.dimen.search_refinement_card_query_small_text_size));
                this.e.setGravity(8388627);
                int dimensionPixelSize7 = this.k.getDimensionPixelSize(R.dimen.search_refinement_card_query_small_margin);
                n(dimensionPixelSize7, dimensionPixelSize7);
            } else {
                g();
            }
            akba a = akba.a(this.c.getContext());
            a.c((int) yjk.J(this.j.getResources().getDisplayMetrics(), ach.g(this.c.e)));
            this.m.c(this.c, a.b());
        }
        if (p()) {
            auob auobVar2 = auoaVar.f;
            if (auobVar2 == null) {
                auobVar2 = auob.a;
            }
            if (auobVar2 == null || (((bG = aobq.bG(auobVar2.b)) == 0 || bG != 6) && (((bG2 = aobq.bG(auobVar2.b)) == 0 || bG2 != 4) && ((bG3 = aobq.bG(auobVar2.b)) == 0 || bG3 != 5)))) {
                int orElse4 = wbs.W(this.j, R.attr.ytGeneralBackgroundC).orElse(0);
                this.c.b(orElse4);
                this.e.setTextColor(wbs.W(this.j, R.attr.ytTextPrimary).orElse(0));
                if (this.g.getDrawable() != null) {
                    o(orElse4);
                }
            } else {
                int orElse5 = wbs.W(this.j, R.attr.ytCallToAction).orElse(0);
                this.c.b(orElse5);
                this.e.setTextColor(wbs.W(this.j, R.attr.ytFilledButtonText).orElse(0));
                if (this.g.getDrawable() != null) {
                    o(orElse5);
                }
            }
            this.e.setTypeface(null, 1);
            this.c.setSelected(true);
            this.c.setClickable(false);
            return;
        }
        this.e.setTextColor(wbs.W(this.j, R.attr.ytTextPrimary).orElse(0));
        this.e.setTypeface(null, 0);
        this.c.setSelected(false);
        this.c.setClickable(true);
    }

    private final void n(int i, int i2) {
        yny.z(this.e, yny.s(i, i2, i, i2), ViewGroup.MarginLayoutParams.class);
    }

    private final void o(int i) {
        GradientDrawable gradientDrawable = (GradientDrawable) this.k.getDrawable(R.drawable.search_refinement_card_rounded_background);
        gradientDrawable.setStroke(yjk.K(this.k.getDisplayMetrics(), 1), fm.e(fk.a(this.k, R.color.yt_separator_light, this.j.getTheme()), i));
        this.g.setImageDrawable(gradientDrawable);
    }

    private final boolean p() {
        lgm lgmVar = this.o;
        return lgmVar != null && lgmVar.c == f(this.n);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.i.c();
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        apxf apxfVar;
        auoa auoaVar = (auoa) obj;
        ajoi ajoiVar = this.i;
        acra acraVar = ajokVar.a;
        aqyg aqygVar = null;
        if ((auoaVar.b & 4) != 0) {
            apxfVar = auoaVar.e;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.a(acraVar, apxfVar, ajokVar.e());
        ajjz ajjzVar = this.b;
        ImageView imageView = this.d;
        avgg avggVar = auoaVar.c;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajjzVar.h(imageView, avggVar);
        TextView textView = this.e;
        if ((auoaVar.b & 2) != 0 && (aqygVar = auoaVar.d) == null) {
            aqygVar = aqyg.a;
        }
        textView.setText(ajcq.b(aqygVar));
        lgm lgmVar = (lgm) ajokVar.c("REFINEMENT_SELECTION_CONTROLLER");
        this.o = lgmVar;
        if (lgmVar != null) {
            lgmVar.a.put(mcy.I(auoaVar), this);
        }
        this.n = ajokVar;
        this.a = auoaVar;
        m(auoaVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((auoa) obj).g.I();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x007a, code lost:
    
        if (r1.c != false) goto L35;
     */
    @Override // defpackage.ajof
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(android.view.View r6) {
        /*
            r5 = this;
            ajok r6 = r5.n
            r0 = 0
            if (r6 != 0) goto L6
            return r0
        L6:
            boolean r6 = r5.p()
            r1 = 1
            if (r6 == 0) goto Le
            return r1
        Le:
            ajok r6 = r5.n
            java.lang.String r2 = "HORIZONTAL_CARD_LIST"
            java.lang.Object r6 = r6.c(r2)
            arev r6 = (defpackage.arev) r6
            ajok r3 = r5.n
            int r3 = f(r3)
            if (r6 == 0) goto L4f
            boolean r4 = defpackage.mcy.J(r6)
            if (r4 != 0) goto L27
            goto L4f
        L27:
            ajok r6 = r5.n
            java.lang.String r2 = "REFINEMENT_SELECTION_LISTENER"
            java.lang.Object r6 = r6.c(r2)
            lgl r6 = (defpackage.lgl) r6
            auoa r2 = r5.a
            if (r2 == 0) goto L3a
            if (r6 == 0) goto L3a
            r6.k(r2, r3)
        L3a:
            androidx.cardview.widget.CardView r6 = r5.c
            android.graphics.Rect r2 = new android.graphics.Rect
            int r3 = r6.getWidth()
            androidx.cardview.widget.CardView r4 = r5.c
            int r4 = r4.getHeight()
            r2.<init>(r0, r0, r3, r4)
            r6.requestRectangleOnScreen(r2)
            return r1
        L4f:
            android.content.SharedPreferences r1 = r5.l
            if (r1 == 0) goto L5c
            java.lang.String r4 = "force_enable_sticky_browsy_bars"
            boolean r1 = r1.getBoolean(r4, r0)
            if (r1 == 0) goto L5c
            goto L7c
        L5c:
            auoa r1 = r5.a
            apxf r1 = r1.e
            if (r1 != 0) goto L64
            apxf r1 = defpackage.apxf.a
        L64:
            aonk r4 = com.google.protos.youtube.api.innertube.SearchEndpointOuterClass.searchEndpoint
            java.lang.Object r1 = r1.pX(r4)
            aunn r1 = (defpackage.aunn) r1
            aunq r1 = r1.e
            if (r1 != 0) goto L72
            aunq r1 = defpackage.aunq.a
        L72:
            aunp r1 = r1.c
            if (r1 != 0) goto L78
            aunp r1 = defpackage.aunp.a
        L78:
            boolean r1 = r1.c
            if (r1 == 0) goto L8c
        L7c:
            r1 = -1
            if (r3 == r1) goto L8c
            arev r6 = defpackage.mcy.H(r6, r3)
            ajok r1 = r5.n
            java.util.Map r1 = r1.e()
            r1.put(r2, r6)
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lek.h(android.view.View):boolean");
    }

    @Override // defpackage.lgl
    public final void k(auoa auoaVar, int i) {
        m(auoaVar);
    }
}
