package com.google.android.libraries.youtube.edit.gallery;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MediaGridRecyclerView extends RecyclerView {
    private final int W;
    private final GridLayoutManager aa;

    public MediaGridRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.W = context.getResources().getDimensionPixelSize(R.dimen.gallery_thumb_min_width);
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(3, null);
        this.aa = gridLayoutManager;
        af(gridLayoutManager);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.aa.q(Math.max(1, getMeasuredWidth() / this.W));
    }
}
