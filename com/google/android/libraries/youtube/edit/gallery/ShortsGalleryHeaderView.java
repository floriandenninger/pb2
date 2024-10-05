package com.google.android.libraries.youtube.edit.gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ShortsGalleryHeaderView extends RelativeLayout {
    public ShortsGalleryHeaderView(Context context) {
        this(context, null);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getResources().getDisplayMetrics().heightPixels / 3, 1073741824));
    }

    public ShortsGalleryHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShortsGalleryHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
