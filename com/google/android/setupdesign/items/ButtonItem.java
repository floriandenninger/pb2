package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.youtube.R;
import defpackage.altp;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ButtonItem extends AbstractItem implements View.OnClickListener {
    public ButtonItem() {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    public ButtonItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, altp.c);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.getText(3);
        obtainStyledAttributes.getResourceId(0, R.style.SudButtonItem);
        obtainStyledAttributes.recycle();
    }
}
