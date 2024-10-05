package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class NoOverlapImageView extends ImageView {
    public NoOverlapImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public NoOverlapImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public NoOverlapImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
