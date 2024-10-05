package com.google.android.libraries.youtube.livechat.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import defpackage.abjj;
import defpackage.yjk;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RoundedCornerImageView extends AppCompatImageView {
    private final Path a;
    private final RectF b;
    private int c;
    private float[] d;

    public RoundedCornerImageView(Context context) {
        super(context);
        this.a = new Path();
        this.b = new RectF();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.a);
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == 0 || i2 == 0) {
            return;
        }
        this.b.set(0.0f, 0.0f, i, i2);
        this.a.reset();
        if (this.d == null) {
            this.d = new float[8];
        }
        Arrays.fill(this.d, 0, 8, this.c);
        this.a.addRoundRect(this.b, this.d, Path.Direction.CW);
        this.a.close();
    }

    public RoundedCornerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Path();
        this.b = new RectF();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, abjj.a);
        this.c = obtainStyledAttributes.getDimensionPixelSize(0, yjk.K(displayMetrics, 4));
        obtainStyledAttributes.recycle();
    }
}
