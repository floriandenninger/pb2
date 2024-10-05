package com.google.android.apps.youtube.app.player.overlay;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import defpackage.axzf;
import defpackage.kkq;
import defpackage.knj;
import defpackage.yjk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FullscreenEngagementPanelCoordinatorLayout extends kkq {
    public int i;
    public int j;
    public axzf k;
    private final DisplayMetrics l;
    private final int m;
    private final int n;

    public FullscreenEngagementPanelCoordinatorLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        long size = View.MeasureSpec.getSize(i);
        long max = size - Math.max(size / 2, View.MeasureSpec.getSize(i2));
        int K = yjk.K(this.l, this.i);
        if (K <= 0) {
            K = this.m;
        }
        long j = K;
        int K2 = yjk.K(this.l, this.j);
        if (K2 <= 0) {
            K2 = this.n;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) yjk.z(max, j, K2), 1073741824), i2);
    }

    public FullscreenEngagementPanelCoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FullscreenEngagementPanelCoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = context.getResources().getDisplayMetrics();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, knj.a);
        this.n = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.m = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
    }
}
