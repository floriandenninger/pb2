package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xwn {
    public final Context a;
    public final yal b;
    public final aahd c;
    public final xqi d;
    public final akbv e;
    public boolean f;
    public ViewTreeObserver.OnScrollChangedListener g;
    private final ajjz h;

    public xwn(Context context, yal yalVar, aahd aahdVar, ajjz ajjzVar, xqi xqiVar, akbv akbvVar) {
        context.getClass();
        this.a = context;
        yalVar.getClass();
        this.b = yalVar;
        aahdVar.getClass();
        this.c = aahdVar;
        ajjzVar.getClass();
        this.h = ajjzVar;
        xqiVar.getClass();
        this.d = xqiVar;
        akbvVar.getClass();
        this.e = akbvVar;
    }

    public static final void c(ImageView imageView, ViewGroup viewGroup, ImageView imageView2, ImageView imageView3, aqhh aqhhVar) {
        aott aottVar = aqhhVar.l;
        if (aottVar == null) {
            aottVar = aott.a;
        }
        e(viewGroup, aottVar);
        viewGroup.setVisibility(0);
        imageView.setVisibility(0);
        imageView2.setVisibility(8);
        imageView3.setVisibility(8);
    }

    public static final void d(ImageView imageView, ViewGroup viewGroup, ImageView imageView2, ImageView imageView3, aqhh aqhhVar) {
        aott aottVar = aqhhVar.k;
        if (aottVar == null) {
            aottVar = aott.a;
        }
        e(viewGroup, aottVar);
        viewGroup.setVisibility(0);
        imageView2.setVisibility(0);
        imageView3.setVisibility(0);
        imageView.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(final android.view.View r17, final android.widget.ImageView r18, final android.view.ViewGroup r19, final android.widget.ImageView r20, final android.widget.ImageView r21, final java.lang.String r22, final defpackage.apxj r23, final defpackage.acra r24, final java.util.Map r25, final boolean r26) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xwn.a(android.view.View, android.widget.ImageView, android.view.ViewGroup, android.widget.ImageView, android.widget.ImageView, java.lang.String, apxj, acra, java.util.Map, boolean):void");
    }

    public final void b(ImageView imageView, ImageView imageView2, aqhh aqhhVar) {
        apkv apkvVar;
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.comment_heart_creator_avatar_width);
        imageView.getLayoutParams().width = dimensionPixelSize;
        imageView.getLayoutParams().height = dimensionPixelSize;
        imageView.setImageBitmap(null);
        avgg avggVar = aqhhVar.c;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        Uri D = ahbw.D(avggVar, dimensionPixelSize);
        if (D != null) {
            imageView.setTag(D);
            this.h.g(imageView, D);
            int orElse = wbs.W(this.a, R.attr.ytIconInactive).orElse(0);
            aqhf aqhfVar = aqhhVar.d;
            if (aqhfVar == null) {
                aqhfVar = aqhf.a;
            }
            if (aqhfVar.b == 118483990) {
                aqhf aqhfVar2 = aqhhVar.d;
                if (aqhfVar2 == null) {
                    aqhfVar2 = aqhf.a;
                }
                if (aqhfVar2.b == 118483990) {
                    apkvVar = (apkv) aqhfVar2.c;
                } else {
                    apkvVar = apkv.a;
                }
                orElse = apkvVar.d;
            }
            Drawable drawable = this.a.getResources().getDrawable(R.drawable.ic_favorite_outlined_13);
            drawable.mutate();
            drawable.setColorFilter(new ColorMatrixColorFilter(new float[]{Color.red(orElse) / 255.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, Color.green(orElse) / 255.0f, -1.0f, 0.0f, 255.0f, -1.0f, 0.0f, Color.blue(orElse) / 255.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, Color.alpha(orElse) / 255.0f, 0.0f}));
            imageView2.setImageDrawable(drawable);
        }
    }

    private static final void e(View view, aott aottVar) {
        if (aottVar == null || (aottVar.b & 1) == 0) {
            view.setContentDescription("");
            return;
        }
        aots aotsVar = aottVar.c;
        if (aotsVar == null) {
            aotsVar = aots.a;
        }
        view.setContentDescription(aotsVar.c);
    }
}
