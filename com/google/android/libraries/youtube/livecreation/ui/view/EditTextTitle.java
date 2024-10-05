package com.google.android.libraries.youtube.livecreation.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.material.textfield.TextInputEditText;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class EditTextTitle extends TextInputEditText {
    public EditTextTitle(Context context) {
        super(context);
    }

    @Override // com.google.android.material.textfield.TextInputEditText, defpackage.sp, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        editorInfo.imeOptions &= -256;
        editorInfo.imeOptions |= 6;
        editorInfo.imeOptions &= -1073741825;
        return onCreateInputConnection;
    }

    public EditTextTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EditTextTitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
