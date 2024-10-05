package com.google.android.libraries.youtube.livechat.ui.view;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.android.libraries.youtube.livechat.ui.common.WrappedLinearLayoutManager;
import defpackage.abpf;
import defpackage.wd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class LiveChatRecyclerView extends RecyclerView {
    private final abpf W;
    private float aa;
    private float ab;

    public LiveChatRecyclerView(Context context) {
        super(context);
        abpf abpfVar = new abpf();
        this.W = abpfVar;
        aB(abpfVar);
        ae(null);
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void af(wd wdVar) {
        super.af(wdVar);
        if (wdVar instanceof WrappedLinearLayoutManager) {
            ((WrappedLinearLayoutManager) wdVar).r(true);
        } else if (wdVar instanceof LinearLayoutManager) {
            ((LinearLayoutManager) wdVar).r(true);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.aa = motionEvent.getX();
            this.ab = motionEvent.getY();
        } else if (actionMasked == 1) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float f = this.aa - x;
            float f2 = this.ab - y;
            float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
            if ((f * f) + (f2 * f2) < scaledTouchSlop * scaledTouchSlop) {
                performClick();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public LiveChatRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        abpf abpfVar = new abpf();
        this.W = abpfVar;
        aB(abpfVar);
        ae(null);
    }

    public LiveChatRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        abpf abpfVar = new abpf();
        this.W = abpfVar;
        aB(abpfVar);
        ae(null);
    }
}
