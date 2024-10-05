package com.google.android.setupcompat.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class StatusBarBackgroundLayout extends FrameLayout {
    public Drawable a;
    private Object b;

    public StatusBarBackgroundLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.b = windowInsets;
        return super.onApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b == null) {
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int systemWindowInsetTop;
        super.onDraw(canvas);
        Object obj = this.b;
        if (obj == null || (systemWindowInsetTop = ((WindowInsets) obj).getSystemWindowInsetTop()) <= 0) {
            return;
        }
        this.a.setBounds(0, 0, getWidth(), systemWindowInsetTop);
        this.a.draw(canvas);
    }

    public StatusBarBackgroundLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StatusBarBackgroundLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
