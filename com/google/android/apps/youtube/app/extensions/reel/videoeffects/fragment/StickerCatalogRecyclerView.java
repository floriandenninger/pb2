package com.google.android.apps.youtube.app.extensions.reel.videoeffects.fragment;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class StickerCatalogRecyclerView extends RecyclerView {
    public final GridLayoutManager W;

    public StickerCatalogRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(4, null);
        this.W = gridLayoutManager;
        af(gridLayoutManager);
        ae(null);
    }
}
