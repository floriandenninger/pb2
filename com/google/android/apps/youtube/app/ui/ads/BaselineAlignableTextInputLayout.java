package com.google.android.apps.youtube.app.ui.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BaselineAlignableTextInputLayout extends TextInputLayout {
    public BaselineAlignableTextInputLayout(Context context) {
        super(context);
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.widget.LinearLayout, android.view.View
    public final int getBaseline() {
        EditText editText = this.a;
        if (editText == null) {
            return super.getBaseline();
        }
        ViewParent parent = editText.getParent();
        if (parent instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) parent;
            if (frameLayout.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                return editText.getBaseline() + ((LinearLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin + getPaddingTop();
            }
        }
        return super.getBaseline();
    }

    public BaselineAlignableTextInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaselineAlignableTextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
