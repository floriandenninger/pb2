package com.google.android.libraries.youtube.offline.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.google.android.youtube.R;
import defpackage.zai;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class OfflineDialogOptionView extends zai {
    private RadioButton b;

    public OfflineDialogOptionView(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        RadioButton radioButton = (RadioButton) findViewById(R.id.radio_button);
        this.b = radioButton;
        radioButton.setImportantForAccessibility(2);
        super.onFinishInflate();
    }

    @Override // defpackage.zai, android.widget.Checkable
    public final void setChecked(boolean z) {
        super.setChecked(z);
        RadioButton radioButton = this.b;
        if (radioButton != null) {
            radioButton.setChecked(z);
        }
    }

    public OfflineDialogOptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OfflineDialogOptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public OfflineDialogOptionView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
