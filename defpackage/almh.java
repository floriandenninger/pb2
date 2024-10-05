package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: PG */
/* loaded from: classes.dex */
final class almh implements TextWatcher {
    final /* synthetic */ almq a;

    public almh(almq almqVar) {
        this.a = almqVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        almq almqVar = this.a;
        if (almqVar.k.g != null) {
            return;
        }
        almqVar.a(almqVar.d());
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
