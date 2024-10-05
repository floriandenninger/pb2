package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alnq implements View.OnClickListener {
    final /* synthetic */ alnr a;

    public alnq(alnr alnrVar) {
        this.a = alnrVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EditText editText = this.a.k.a;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (this.a.a()) {
            editText.setTransformationMethod(null);
        } else {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            editText.setSelection(selectionEnd);
        }
        this.a.k.h();
    }
}
