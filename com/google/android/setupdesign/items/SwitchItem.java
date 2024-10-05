package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import com.google.android.youtube.R;
import defpackage.altp;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SwitchItem extends Item implements CompoundButton.OnCheckedChangeListener {
    public SwitchItem() {
    }

    @Override // com.google.android.setupdesign.items.Item
    protected int b() {
        return R.layout.sud_items_switch;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
    }

    public SwitchItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, altp.p);
        obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }
}
