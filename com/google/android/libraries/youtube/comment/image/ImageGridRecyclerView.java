package com.google.android.libraries.youtube.comment.image;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.google.android.youtube.R;
import defpackage.xsm;
import defpackage.xsn;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ImageGridRecyclerView extends RecyclerView {
    public GridLayoutManager W;
    private int aa;

    public ImageGridRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.aa = context.getResources().getDimensionPixelSize(R.dimen.image_gallery_thumbnail_min_width);
        xsm xsmVar = new xsm(getContext());
        this.W = xsmVar;
        af(xsmVar);
        aB(new xsn(context));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.W.q(Math.max(1, getMeasuredWidth() / this.aa));
    }
}
