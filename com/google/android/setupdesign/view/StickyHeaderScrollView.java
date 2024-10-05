package com.google.android.setupdesign.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class StickyHeaderScrollView extends BottomScrollView {
    private View a;
    private View b;
    private int c;

    public StickyHeaderScrollView(Context context) {
        super(context);
        this.c = 0;
    }

    private final void a() {
        View view = this.a;
        if (view != null) {
            View view2 = this.b;
            View view3 = view2 != null ? view2 : view;
            if ((view3.getTop() - getScrollY()) + (view2 != null ? view.getTop() : 0) < this.c || !view3.isShown()) {
                view3.setTranslationY(getScrollY() - r0);
            } else {
                view3.setTranslationY(0.0f);
            }
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (!getFitsSystemWindows()) {
            return windowInsets;
        }
        this.c = windowInsets.getSystemWindowInsetTop();
        return windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.setupdesign.view.BottomScrollView, android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.a == null) {
            this.a = findViewWithTag("sticky");
            this.b = findViewWithTag("stickyContainer");
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.setupdesign.view.BottomScrollView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        a();
    }

    public StickyHeaderScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
    }

    public StickyHeaderScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = 0;
    }
}
