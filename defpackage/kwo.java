package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class kwo implements TextWatcher {
    final /* synthetic */ TextInputLayout a;
    final /* synthetic */ kwq b;

    public kwo(kwq kwqVar, TextInputLayout textInputLayout) {
        this.b = kwqVar;
        this.a = textInputLayout;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String trim = editable == null ? "" : editable.toString().trim();
        if (trim.contains("<") || trim.contains(">")) {
            this.a.v(this.b.qR().getString(R.string.playlist_creation_title_invalid_characters_error));
            this.b.an.d(false);
        } else {
            this.a.v(null);
            this.b.an.d(!trim.isEmpty());
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
