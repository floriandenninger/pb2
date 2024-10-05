package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.FrameLayout;
import defpackage.yjk;
import defpackage.zbm;
import defpackage.zga;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RoundedFrameLayout extends FrameLayout {
    private int a;
    private RectF b;
    private float[] c;
    private Path d;

    public RoundedFrameLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.save();
        Path path = this.d;
        if (path != null) {
            canvas.clipPath(path);
        } else {
            zga.b("Rounded frame layout rectPath is null");
        }
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
        Path path = this.d;
        if (path == null) {
            this.d = new Path();
        } else {
            path.reset();
        }
        if (this.c == null) {
            this.c = new float[8];
        }
        Arrays.fill(this.c, 0, 8, this.a);
        this.d.addRoundRect(this.b, this.c, Path.Direction.CW);
        this.d.close();
    }

    public RoundedFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zbm.e);
        this.b = new RectF();
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, yjk.K(displayMetrics, 16));
        setWillNotDraw(false);
        obtainStyledAttributes.recycle();
    }
}
