package defpackage;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alml implements alny {
    final /* synthetic */ almq a;

    public alml(almq almqVar) {
        this.a = almqVar;
    }

    @Override // defpackage.alny
    public final void a(TextInputLayout textInputLayout, int i) {
        EditText editText = textInputLayout.a;
        if (editText == null || i != 2) {
            return;
        }
        editText.post(new almk(this, editText));
        if (editText.getOnFocusChangeListener() == this.a.b) {
            editText.setOnFocusChangeListener(null);
        }
        View.OnFocusChangeListener onFocusChangeListener = this.a.m.getOnFocusChangeListener();
        almq almqVar = this.a;
        if (onFocusChangeListener == almqVar.b) {
            almqVar.m.setOnFocusChangeListener(null);
        }
    }
}
