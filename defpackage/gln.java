package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gln implements TextWatcher {
    final /* synthetic */ TextInputLayout a;
    final /* synthetic */ Button b;
    final /* synthetic */ glq c;

    public gln(glq glqVar, TextInputLayout textInputLayout, Button button) {
        this.c = glqVar;
        this.a = textInputLayout;
        this.b = button;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String trim = editable == null ? "" : editable.toString().trim();
        if (trim.contains("<") || trim.contains(">")) {
            this.a.v(this.c.a.getString(R.string.playlist_creation_title_invalid_characters_error));
            this.c.b(this.b, false);
        } else {
            this.a.v(null);
            this.c.b(this.b, !trim.isEmpty());
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
