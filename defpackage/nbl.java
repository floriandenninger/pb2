package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.IconTextBadgeRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nbl extends nbz {
    private final TextView A;
    private final RatingBar B;
    private final TextView C;
    private final View D;
    private final View E;
    private final ImageView F;
    private final TextView G;

    public nbl(ajjz ajjzVar, ajut ajutVar, ajuw ajuwVar, View view, View view2, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(ajjzVar, ajutVar, ajuwVar, view, view2, false, ajywVar, akbdVar, null, null, null, null, null);
        this.A = (TextView) view2.findViewById(R.id.rating_text);
        this.B = (RatingBar) view2.findViewById(R.id.rating_bar);
        this.C = (TextView) view2.findViewById(R.id.price_text);
        View findViewById = view2.findViewById(R.id.icon_text_badge_layout);
        this.D = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.icon_text_badge);
        this.E = findViewById2;
        this.F = (ImageView) findViewById2.findViewById(R.id.icon_text_badge_icon);
        this.G = (TextView) findViewById2.findViewById(R.id.icon_text_badge_text);
    }

    @Override // defpackage.nbz, defpackage.nby, defpackage.nbw
    public final void c(acra acraVar, Object obj, augh aughVar) {
        aqyg aqygVar;
        super.c(acraVar, obj, aughVar);
        float f = aughVar.f;
        int i = aughVar.g;
        int i2 = aughVar.h;
        arft arftVar = null;
        if ((aughVar.b & 8192) != 0) {
            aqygVar = aughVar.p;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        aulq aulqVar = aughVar.i;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(IconTextBadgeRendererOuterClass.iconTextBadgeRenderer)) {
            aulq aulqVar2 = aughVar.i;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            arftVar = (arft) aulqVar2.pX(IconTextBadgeRendererOuterClass.iconTextBadgeRenderer);
        }
        muf.p(this.A, this.B, f, i, i2);
        muf.q(this.C, b);
        if (arftVar == null) {
            this.D.setVisibility(8);
            this.F.setVisibility(8);
            this.G.setVisibility(8);
            return;
        }
        this.D.setVisibility(0);
        Drawable background = this.E.getBackground();
        if (background instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) background.getCurrent().mutate();
            int i3 = arftVar.e;
            if (i3 != 0) {
                gradientDrawable.setColor(i3);
            } else {
                gradientDrawable.setColor(this.E.getResources().getColor(R.color.icon_text_badge_background_color));
            }
        }
        if ((arftVar.b & 1) != 0) {
            aqyg aqygVar2 = arftVar.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            if (aqygVar2.c.size() > 0) {
                ImageView imageView = this.F;
                aqyg aqygVar3 = arftVar.d;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
                imageView.setColorFilter(((aqyi) aqygVar3.c.get(0)).i);
            }
            ImageView imageView2 = this.F;
            ajut ajutVar = this.n;
            arfs arfsVar = arftVar.c;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfr b2 = arfr.b(arfsVar.c);
            if (b2 == null) {
                b2 = arfr.UNKNOWN;
            }
            imageView2.setImageResource(ajutVar.a(b2));
            this.F.setVisibility(0);
        } else {
            this.F.setVisibility(8);
        }
        aqyg aqygVar4 = arftVar.d;
        if (aqygVar4 == null) {
            aqygVar4 = aqyg.a;
        }
        Spanned b3 = ajcq.b(aqygVar4);
        if (TextUtils.isEmpty(b3)) {
            this.G.setVisibility(8);
            return;
        }
        this.G.setVisibility(0);
        this.G.setText(b3);
        aqyg aqygVar5 = arftVar.d;
        if (aqygVar5 == null) {
            aqygVar5 = aqyg.a;
        }
        if (aqygVar5.c.size() > 0) {
            TextView textView = this.G;
            aqyg aqygVar6 = arftVar.d;
            if (aqygVar6 == null) {
                aqygVar6 = aqyg.a;
            }
            textView.setTextColor(((aqyi) aqygVar6.c.get(0)).i);
        }
    }
}
