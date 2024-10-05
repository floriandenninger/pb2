package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class alnp implements alny {
    final /* synthetic */ alnr a;

    public alnp(alnr alnrVar) {
        this.a = alnrVar;
    }

    @Override // defpackage.alny
    public final void a(TextInputLayout textInputLayout, int i) {
        EditText editText = textInputLayout.a;
        if (editText == null || i != 1) {
            return;
        }
        editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editText.post(new alno(this, editText));
    }
}
