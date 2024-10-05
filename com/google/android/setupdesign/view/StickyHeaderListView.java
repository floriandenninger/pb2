package com.google.android.setupdesign.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ListView;
import defpackage.altp;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class StickyHeaderListView extends ListView {
    private View a;
    private View b;
    private int c;
    private final RectF d;

    public StickyHeaderListView(Context context) {
        super(context);
        this.c = 0;
        this.d = new RectF();
        a(null, R.attr.listViewStyle);
    }

    private final void a(AttributeSet attributeSet, int i) {
        if (isInEditMode()) {
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, altp.o, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            addHeaderView(LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false), null, false);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.d.contains(motionEvent.getX(), motionEvent.getY())) {
            motionEvent.offsetLocation(-this.d.left, -this.d.top);
            return this.b.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView, android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.a != null) {
            int save = canvas.save();
            View view = this.b;
            View view2 = view != null ? view : this.a;
            if (view2.getTop() + (view != null ? this.a.getTop() : 0) < this.c || !view2.isShown()) {
                this.d.set(0.0f, (-r1) + this.c, view2.getWidth(), (view2.getHeight() - r1) + this.c);
                canvas.translate(0.0f, this.d.top);
                canvas.clipRect(0, 0, view2.getWidth(), view2.getHeight());
                view2.draw(canvas);
            } else {
                this.d.setEmpty();
            }
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (getFitsSystemWindows()) {
            this.c = windowInsets.getSystemWindowInsetTop();
            windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return windowInsets;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        int i = this.a != null ? 1 : 0;
        accessibilityEvent.setItemCount(accessibilityEvent.getItemCount() - i);
        accessibilityEvent.setFromIndex(Math.max(accessibilityEvent.getFromIndex() - i, 0));
        accessibilityEvent.setToIndex(Math.max(accessibilityEvent.getToIndex() - i, 0));
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.a == null) {
            this.a = findViewWithTag("sticky");
            this.b = findViewWithTag("stickyContainer");
        }
    }

    public StickyHeaderListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        this.d = new RectF();
        a(attributeSet, R.attr.listViewStyle);
    }

    public StickyHeaderListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = 0;
        this.d = new RectF();
        a(attributeSet, i);
    }
}
