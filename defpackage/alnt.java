package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alnt implements TextWatcher {
    final /* synthetic */ TextInputLayout a;

    public alnt(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.Q(!r0.p);
        TextInputLayout textInputLayout = this.a;
        if (textInputLayout.b) {
            textInputLayout.O(editable.length());
        }
        TextInputLayout textInputLayout2 = this.a;
        if (textInputLayout2.f) {
            textInputLayout2.R(editable.length());
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
