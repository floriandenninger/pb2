package com.google.android.libraries.youtube.mdx.manualpairing;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class TvCodeEditText extends TextInputEditText {
    public TvCodeEditText(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    public TvCodeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public TvCodeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
