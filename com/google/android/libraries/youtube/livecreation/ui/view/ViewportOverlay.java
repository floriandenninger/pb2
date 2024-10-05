package com.google.android.libraries.youtube.livecreation.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.youtube.R;
import defpackage.acfi;
import defpackage.aih;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ViewportOverlay extends View {
    private Paint a;
    private View b;

    public ViewportOverlay(Context context) {
        super(context);
        b(context, null, 0);
    }

    private final void b(Context context, AttributeSet attributeSet, int i) {
        int d = aih.d(context, R.color.lc_default_viewport_overlay_color);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, acfi.d, i, 0);
            try {
                d = obtainStyledAttributes.getColor(0, d);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.a.setColor(d);
    }

    public final void a(View view) {
        this.b = view;
        postInvalidate();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        View view = this.b;
        if (view == null || view.getVisibility() != 0) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.a);
            return;
        }
        this.b.getLocationInWindow(r2);
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int[] iArr2 = {iArr2[0] - iArr[0], iArr2[1] - iArr[1]};
        int width = this.b.getWidth();
        int height = this.b.getHeight();
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), iArr2[1], this.a);
        canvas.drawRect(0.0f, iArr2[1], iArr2[0], getMeasuredHeight(), this.a);
        canvas.drawRect(iArr2[0] + width, iArr2[1], getMeasuredWidth(), getMeasuredHeight(), this.a);
        canvas.drawRect(iArr2[0], iArr2[1] + height, r3 + width, getMeasuredHeight(), this.a);
    }

    public ViewportOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, attributeSet, 0);
    }

    public ViewportOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(context, attributeSet, i);
    }
}
