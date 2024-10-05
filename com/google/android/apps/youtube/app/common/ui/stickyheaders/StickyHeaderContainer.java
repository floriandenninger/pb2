package com.google.android.apps.youtube.app.common.ui.stickyheaders;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import defpackage.gml;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class StickyHeaderContainer extends FrameLayout {
    public final RecyclerView a;

    public StickyHeaderContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StickyHeaderContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gml.a, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, R.layout.recycler_view);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(resourceId, this);
        this.a = (RecyclerView) getChildAt(0);
    }
}
