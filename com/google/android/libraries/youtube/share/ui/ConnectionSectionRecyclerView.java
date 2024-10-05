package com.google.android.libraries.youtube.share.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.zbd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ConnectionSectionRecyclerView extends RecyclerView {
    private zbd W;

    public ConnectionSectionRecyclerView(Context context) {
        super(context);
        this.W = new zbd(this);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (canScrollHorizontally(1) || canScrollHorizontally(-1)) {
            this.W.a(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public ConnectionSectionRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.W = new zbd(this);
    }
}
