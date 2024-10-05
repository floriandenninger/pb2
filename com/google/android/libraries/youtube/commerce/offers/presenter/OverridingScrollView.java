package com.google.android.libraries.youtube.commerce.offers.presenter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class OverridingScrollView extends ScrollView {
    public OverridingScrollView(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(motionEvent.getActionMasked() != 1);
        return super.dispatchTouchEvent(motionEvent);
    }

    public OverridingScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OverridingScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
