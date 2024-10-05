package com.google.android.setupdesign.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class StickyHeaderRecyclerView extends HeaderRecyclerView {
    private View aa;
    private int ab;
    private final RectF ac;

    public StickyHeaderRecyclerView(Context context) {
        super(context);
        this.ab = 0;
        this.ac = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.ac.contains(motionEvent.getX(), motionEvent.getY())) {
            motionEvent.offsetLocation(-this.ac.left, -this.ac.top);
            return this.W.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.aa != null) {
            View view = this.W;
            int save = canvas.save();
            View view2 = view != null ? view : this.aa;
            if (view2.getTop() + (view != null ? this.aa.getTop() : 0) < this.ab || !view2.isShown()) {
                this.ac.set(0.0f, (-r0) + this.ab, view2.getWidth(), (view2.getHeight() - r0) + this.ab);
                canvas.translate(0.0f, this.ac.top);
                canvas.clipRect(0, 0, view2.getWidth(), view2.getHeight());
                view2.draw(canvas);
            } else {
                this.ac.setEmpty();
            }
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (getFitsSystemWindows()) {
            this.ab = windowInsets.getSystemWindowInsetTop();
            windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return windowInsets;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        View view2;
        super.onLayout(z, i, i2, i3, i4);
        if (this.aa == null && (view2 = this.W) != null) {
            this.aa = view2.findViewWithTag("sticky");
        }
        if (this.aa == null || (view = this.W) == null || view.getHeight() != 0) {
            return;
        }
        view.layout(0, -view.getMeasuredHeight(), view.getMeasuredWidth(), 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.aa != null) {
            measureChild(this.W, i, i2);
        }
    }

    public StickyHeaderRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ab = 0;
        this.ac = new RectF();
    }

    public StickyHeaderRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ab = 0;
        this.ac = new RectF();
    }
}
