package com.google.android.apps.youtube.app.extensions.reel.videoeffects.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.google.android.youtube.R;
import defpackage.hab;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ElevatedRoundedCornersRelativeLayout extends RelativeLayout {
    private final Paint a;
    private final Path b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final boolean g;
    private CornerPathEffect h;

    public ElevatedRoundedCornersRelativeLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        CornerPathEffect cornerPathEffect = this.h;
        if (cornerPathEffect != null) {
            this.a.setPathEffect(cornerPathEffect);
            this.a.setAntiAlias(true);
        } else {
            this.a.setAntiAlias(false);
        }
        if (this.g) {
            this.a.setShadowLayer(this.c, this.d, this.e, this.f);
        } else {
            this.a.clearShadowLayer();
        }
        float f = this.c - this.d;
        int width = getWidth();
        int i = this.c;
        float f2 = (width - i) - this.d;
        float f3 = i - this.e;
        float height = (getHeight() - this.c) - this.e;
        this.b.reset();
        this.b.moveTo(f, f3);
        this.b.lineTo(f2, f3);
        this.b.lineTo(f2, height);
        this.b.lineTo(f, height);
        this.b.close();
        canvas.drawPath(this.b, this.a);
    }

    public ElevatedRoundedCornersRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ElevatedRoundedCornersRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.a = paint;
        this.b = new Path();
        getBackground().getClass();
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.dynamic_sticker_shadow_radius);
        this.c = dimensionPixelSize;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.dynamic_sticker_shadow_x_offset);
        this.d = dimensionPixelSize2;
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.dynamic_sticker_shadow_y_offset);
        this.e = dimensionPixelSize3;
        this.f = resources.getColor(R.color.dynamic_sticker_shadow_color);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, hab.c, 0, 0);
        try {
            paint.setColor(((ColorDrawable) getBackground()).getColor());
            setBackgroundColor(0);
            setPadding((getPaddingLeft() + dimensionPixelSize) - dimensionPixelSize2, (getPaddingTop() + dimensionPixelSize) - dimensionPixelSize3, getPaddingRight() + dimensionPixelSize + dimensionPixelSize2, getPaddingBottom() + dimensionPixelSize + dimensionPixelSize3);
            float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
            if (dimension > 0.0f) {
                this.h = new CornerPathEffect(dimension);
            }
            this.g = obtainStyledAttributes.getBoolean(1, true);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
