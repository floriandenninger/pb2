package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class NonInterceptingRecyclerView extends RecyclerView {
    public NonInterceptingRecyclerView(Context context) {
        super(context);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public NonInterceptingRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
