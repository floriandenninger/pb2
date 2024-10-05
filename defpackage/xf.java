package defpackage;

import android.support.v7.widget.SearchView;
import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xf implements TextWatcher {
    final /* synthetic */ SearchView a;

    public xf(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.onTextChanged(charSequence);
    }
}
