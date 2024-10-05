package defpackage;

import android.app.AlertDialog;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class llt implements TextWatcher {
    final /* synthetic */ AlertDialog a;

    public llt(AlertDialog alertDialog) {
        this.a = alertDialog;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.getButton(-1).setEnabled(!TextUtils.isEmpty(editable));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
