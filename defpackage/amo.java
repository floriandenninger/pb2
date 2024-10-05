package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.widget.EditText;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amo extends gp {
    private final Reference a;

    public amo(EditText editText) {
        this.a = new WeakReference(editText);
    }

    @Override // defpackage.gp
    public final void h() {
        EditText editText = (EditText) this.a.get();
        if (editText == null || !editText.isAttachedToWindow()) {
            return;
        }
        Editable editableText = editText.getEditableText();
        int selectionStart = Selection.getSelectionStart(editableText);
        int selectionEnd = Selection.getSelectionEnd(editableText);
        alr.b().c(editableText);
        amk.a(editableText, selectionStart, selectionEnd);
    }
}
