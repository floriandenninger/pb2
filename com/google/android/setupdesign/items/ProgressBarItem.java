package com.google.android.setupdesign.items;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ProgressBarItem extends Item {
    public ProgressBarItem() {
    }

    @Override // com.google.android.setupdesign.items.Item
    protected final int b() {
        return R.layout.sud_items_progress_bar;
    }

    public ProgressBarItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
