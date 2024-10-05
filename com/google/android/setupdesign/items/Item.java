package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.youtube.R;
import defpackage.altp;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class Item extends AbstractItem {
    public Item() {
    }

    protected int b() {
        return R.layout.sud_items_default;
    }

    public Item(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, altp.m);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.getText(4);
        obtainStyledAttributes.getText(5);
        obtainStyledAttributes.getResourceId(2, b());
        obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.getColor(7, 0);
        obtainStyledAttributes.getInt(6, 16);
        obtainStyledAttributes.recycle();
    }
}
