package com.google.android.libraries.youtube.share.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.youtube.common.ui.TopPeekingScrollView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AnchorableTopPeekingScrollView extends TopPeekingScrollView {
    public boolean n;
    public int o;
    public int p;

    public AnchorableTopPeekingScrollView(Context context) {
        this(context, null);
    }

    public final void i(boolean z) {
        if (this.n && !z) {
            this.p = 0;
            b(0, this.k);
            c(0);
            z = false;
        }
        this.n = z;
    }

    @Override // com.google.android.libraries.youtube.common.ui.TopPeekingScrollView, defpackage.zbq, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.n && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.youtube.common.ui.TopPeekingScrollView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!this.n) {
            super.onLayout(z, i, i2, i3, i4);
        } else if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int i5 = i3 - i;
            childAt.layout((i5 - childAt.getMeasuredWidth()) / 2, i2 + this.k, ((i5 - childAt.getMeasuredWidth()) / 2) + childAt.getMeasuredWidth(), i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.youtube.common.ui.TopPeekingScrollView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        this.o = measuredHeight;
        if (!this.n || (i3 = this.p) == 0) {
            return;
        }
        int i4 = this.k;
        int min = Math.min((i3 + (i4 + i4)) - measuredHeight, i4);
        b(min, min);
        if (this.j.isFinished()) {
            a(min);
        }
    }

    @Override // com.google.android.libraries.youtube.common.ui.TopPeekingScrollView, defpackage.zbq, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.n && super.onTouchEvent(motionEvent);
    }

    public AnchorableTopPeekingScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AnchorableTopPeekingScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
