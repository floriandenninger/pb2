package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajqz implements TextWatcher {
    final /* synthetic */ ajra a;

    public ajqz(ajra ajraVar) {
        this.a = ajraVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.a();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
