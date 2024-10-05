package com.google.android.libraries.youtube.offline.ui;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.zga;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class BestFitImageView extends ImageView {
    public BestFitImageView(Context context) {
        super(context);
    }

    private final void a() {
        super.setScaleType(ImageView.ScaleType.MATRIX);
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        Matrix matrix = new Matrix(getMatrix());
        float f = intrinsicWidth * height > width * intrinsicHeight ? height / intrinsicHeight : width / intrinsicWidth;
        matrix.setScale(f, f);
        setImageMatrix(matrix);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a();
    }

    @Override // android.widget.ImageView
    protected final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        a();
        return frame;
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        a();
    }

    @Override // android.widget.ImageView
    public final void setScaleType(ImageView.ScaleType scaleType) {
        zga.b("setScaleType() is not supported for BestFitImageView");
    }

    @Override // android.view.View
    public final void setScaleX(float f) {
        zga.b("setScaleX()  is not supported for BestFitImageView");
    }

    @Override // android.view.View
    public final void setScaleY(float f) {
        zga.b("setScaleY() is not supported for BestFitImageView");
    }

    public BestFitImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BestFitImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BestFitImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
