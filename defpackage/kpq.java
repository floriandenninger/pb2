package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ThumbnailsRenderer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kpq implements xiy {
    public ViewGroup a;
    public TextView b;
    public TextView c;
    public xix d;
    public avcx e;
    final /* synthetic */ kpr f;
    private final float g;
    private ViewGroup h;
    private ImageView i;
    private ImageView j;

    public kpq(kpr kprVar, Context context) {
        this.f = kprVar;
        this.g = context.getResources().getDisplayMetrics().density;
        a();
    }

    private final void d() {
        if (this.a != null) {
            return;
        }
        kpr kprVar = this.f;
        kprVar.o(kprVar.j);
        ViewGroup viewGroup = (ViewGroup) ((ViewStub) this.f.c.findViewById(R.id.survey_interstitial_stub)).inflate();
        this.a = viewGroup;
        this.j = (ImageView) viewGroup.findViewById(R.id.interstitial_background);
        ViewGroup viewGroup2 = (ViewGroup) this.a.findViewById(R.id.interstitial_dialog);
        this.h = viewGroup2;
        this.b = (TextView) viewGroup2.findViewById(R.id.interstitial_text);
        this.c = (TextView) this.h.findViewById(R.id.interstitial_start_button);
        this.i = (ImageView) this.h.findViewById(R.id.interstitial_logo);
        this.c.setOnClickListener(new kpp(this, 0));
        this.a.setOnClickListener(new kpp(this, 1));
        this.h.setOnClickListener(ipu.d);
    }

    @Override // defpackage.xiy
    public final void a() {
        this.e = null;
        c(false);
    }

    @Override // defpackage.xiy
    public final void b(avcx avcxVar) {
        aqyg aqygVar;
        this.e = avcxVar;
        d();
        TextView textView = this.b;
        aqyg aqygVar2 = null;
        if ((avcxVar.b & 2) != 0) {
            aqygVar = avcxVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        ajjz ajjzVar = this.f.b;
        ImageView imageView = this.i;
        avgg avggVar = avcxVar.i;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajjzVar.h(imageView, avggVar);
        aulq aulqVar = avcxVar.j;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        avgl avglVar = (avgl) ahbj.n(aulqVar, ThumbnailsRenderer.thumbnailLandscapePortraitRenderer);
        if (avglVar != null) {
            ajjz ajjzVar2 = this.f.b;
            ImageView imageView2 = this.j;
            avgg avggVar2 = avglVar.c;
            if (avggVar2 == null) {
                avggVar2 = avgg.a;
            }
            ajjzVar2.h(imageView2, avggVar2);
        }
        aulq aulqVar2 = avcxVar.h;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        aowm aowmVar = (aowm) ahbj.n(aulqVar2, AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
        if (aowmVar != null) {
            TextView textView2 = this.c;
            if ((aowmVar.b & 1) != 0 && (aqygVar2 = aowmVar.e) == null) {
                aqygVar2 = aqyg.a;
            }
            textView2.setText(ajcq.b(aqygVar2));
            if (this.c.getBackground().getCurrent() instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) this.c.getBackground().getCurrent().mutate();
                gradientDrawable.setColor(aowmVar.c == 3 ? ((Integer) aowmVar.d).intValue() : 0);
                gradientDrawable.setCornerRadius(this.g * aowmVar.i);
                gradientDrawable.setStroke(Math.round(this.g * aowmVar.l), aowmVar.j);
                this.c.setBackground(gradientDrawable);
            }
            this.c.setVisibility(0);
            return;
        }
        this.c.setVisibility(8);
    }

    @Override // defpackage.xiy
    public final void c(boolean z) {
        if (z) {
            d();
        }
        ViewGroup viewGroup = this.a;
        if (viewGroup != null) {
            viewGroup.setVisibility(true != z ? 8 : 0);
        }
    }
}
