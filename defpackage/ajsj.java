package defpackage;

import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajsj implements TextWatcher {
    private final EditText a;
    private final float b;
    private final int c;

    public ajsj(EditText editText, float f, int i) {
        this.a = editText;
        this.b = f;
        this.c = i;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.a.isInEditMode() && i3 > 0 && (charSequence instanceof Spannable)) {
            ajsm.a(charSequence, i, i3 + i, this.b, this.c);
        }
    }
}
