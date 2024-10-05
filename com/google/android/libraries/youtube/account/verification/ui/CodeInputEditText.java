package com.google.android.libraries.youtube.account.verification.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import defpackage.wkz;
import defpackage.wla;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CodeInputEditText extends EditText {
    public wla a;

    public CodeInputEditText(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new wkz(this, super.onCreateInputConnection(editorInfo));
    }

    public CodeInputEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CodeInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
