package com.google.android.libraries.quantum.fab;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import defpackage.uyy;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FloatingActionButton extends ImageView {
    private int a;
    private int b;
    private int c;

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    private static GradientDrawable a(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    @Override // android.view.View
    public final ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = super.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.a;
            layoutParams.width = this.a;
        }
        return layoutParams;
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(new int[]{R.attr.state_enabled, R.attr.state_pressed}, ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("translationZ", getElevation())));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("translationZ", 0.0f)));
        setStateListAnimator(stateListAnimator);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable layerDrawable;
        int dimensionPixelSize;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uyy.a, i, com.google.android.youtube.R.style.QuantumFloatingActionButton);
        int color = obtainStyledAttributes.getColor(1, 0);
        int color2 = obtainStyledAttributes.getColor(2, 0);
        int i2 = obtainStyledAttributes.getInt(3, 0);
        setElevation(obtainStyledAttributes.getDimension(0, 0.0f));
        if (this.b != color || this.c != color2) {
            this.b = color;
            this.c = color2;
            GradientDrawable a = a(color);
            try {
                layerDrawable = (Drawable) Class.forName("android.graphics.drawable.RippleDrawable").getConstructor(ColorStateList.class, Drawable.class, Drawable.class).newInstance(ColorStateList.valueOf(color2), a, null);
            } catch (Exception unused) {
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{R.attr.state_pressed}, a(color2));
                stateListDrawable.addState(new int[0], a(R.color.transparent));
                layerDrawable = new LayerDrawable(new Drawable[]{a, stateListDrawable});
            }
            int paddingTop = getPaddingTop();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingBottom = getPaddingBottom();
            setBackgroundDrawable(layerDrawable);
            setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
        Resources resources = getResources();
        if (i2 == 1) {
            this.a = resources.getDimensionPixelSize(com.google.android.youtube.R.dimen.quantum_fab_diameter_mini);
            dimensionPixelSize = resources.getDimensionPixelSize(com.google.android.youtube.R.dimen.quantum_fab_padding_mini);
        } else {
            this.a = resources.getDimensionPixelSize(com.google.android.youtube.R.dimen.quantum_fab_diameter_default);
            dimensionPixelSize = resources.getDimensionPixelSize(com.google.android.youtube.R.dimen.quantum_fab_padding_default);
        }
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        requestLayout();
        obtainStyledAttributes.recycle();
    }
}
