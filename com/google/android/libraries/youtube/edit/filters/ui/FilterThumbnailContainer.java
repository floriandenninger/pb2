package com.google.android.libraries.youtube.edit.filters.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import defpackage.zvl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FilterThumbnailContainer extends FrameLayout {
    public FilterThumbnailContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOutlineProvider(new zvl(getResources().getDimension(R.dimen.camera_filter_preview_item_corner_radius)));
        setClipToOutline(true);
    }
}
