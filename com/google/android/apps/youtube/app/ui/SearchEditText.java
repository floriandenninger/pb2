package com.google.android.apps.youtube.app.ui;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.Selection;
import android.util.AttributeSet;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SearchEditText extends EditText {
    public SearchEditText(Context context) {
        super(context);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        if (i == 16908322) {
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null) {
                StringBuilder sb = new StringBuilder();
                int i2 = 0;
                for (int i3 = 0; i3 < primaryClip.getItemCount(); i3++) {
                    sb.append(primaryClip.getItemAt(i3).coerceToText(getContext()));
                }
                int length = getText().length();
                if (isFocused()) {
                    int selectionStart = getSelectionStart();
                    int selectionEnd = getSelectionEnd();
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    length = Math.max(0, Math.max(selectionStart, selectionEnd));
                    i2 = max;
                }
                Selection.setSelection(getText(), length);
                getText().replace(i2, length, sb.toString());
                return true;
            }
            i = R.id.paste;
        }
        return super.onTextContextMenuItem(i);
    }

    public SearchEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SearchEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SearchEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
