package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
final class almj implements alnx {
    final /* synthetic */ almq a;

    public almj(almq almqVar) {
        this.a = almqVar;
    }

    @Override // defpackage.alnx
    public final void a(TextInputLayout textInputLayout) {
        EditText editText = textInputLayout.a;
        textInputLayout.u(this.a.d());
        textInputLayout.m(false);
        editText.setOnFocusChangeListener(this.a.b);
        almq almqVar = this.a;
        almqVar.m.setOnFocusChangeListener(almqVar.b);
        editText.removeTextChangedListener(this.a.a);
        editText.addTextChangedListener(this.a.a);
    }
}
