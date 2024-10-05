package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class alnn implements alnx {
    final /* synthetic */ alnr a;

    public alnn(alnr alnrVar) {
        this.a = alnrVar;
    }

    @Override // defpackage.alnx
    public final void a(TextInputLayout textInputLayout) {
        EditText editText = textInputLayout.a;
        textInputLayout.u(true);
        textInputLayout.m(true);
        this.a.m.setChecked(!r4.a());
        editText.removeTextChangedListener(this.a.a);
        editText.addTextChangedListener(this.a.a);
    }
}
