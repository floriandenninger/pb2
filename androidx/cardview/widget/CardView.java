package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.ach;
import defpackage.adp;
import defpackage.adq;
import defpackage.adr;
import defpackage.jw;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    public boolean a;
    public boolean b;
    public final Rect c;
    public final Rect d;
    public final adq e;
    private static final int[] g = {R.attr.colorBackground};
    public static final ach f = new ach();

    public CardView(Context context) {
        this(context, null);
    }

    public final void b(int i) {
        adq adqVar = this.e;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        adr adrVar = (adr) adqVar.a;
        adrVar.a(valueOf);
        adrVar.invalidateSelf();
    }

    public final void c(float f2) {
        adr adrVar = (adr) this.e.a;
        if (f2 == adrVar.a) {
            return;
        }
        adrVar.a = f2;
        adrVar.b(null);
        adrVar.invalidateSelf();
    }

    public final void d() {
        this.e.b.setElevation(0.0f);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.youtube.R.attr.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.c = rect;
        this.d = new Rect();
        adq adqVar = new adq(this);
        this.e = adqVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, adp.a, i, com.google.android.youtube.R.style.CardView);
        jw.L(this, context, adp.a, attributeSet, obtainStyledAttributes, i, com.google.android.youtube.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(g);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(com.google.android.youtube.R.color.cardview_light_background);
            } else {
                color = getResources().getColor(com.google.android.youtube.R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.a = obtainStyledAttributes.getBoolean(7, false);
        this.b = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        adr adrVar = new adr(valueOf, dimension);
        adqVar.a = adrVar;
        adqVar.b.setBackgroundDrawable(adrVar);
        CardView cardView = adqVar.b;
        cardView.setClipToOutline(true);
        cardView.setElevation(dimension2);
        ach.h(adqVar, dimension3);
    }
}
