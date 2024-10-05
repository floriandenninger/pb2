package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dub implements TextWatcher {
    public EditText a;
    private int b;
    private int c;
    private final szx d;
    private final sww e;
    private final sxc f;

    public dub() {
    }

    public dub(szx szxVar, sww swwVar, sxc sxcVar) {
        this.d = szxVar;
        this.e = swwVar;
        this.f = sxcVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        EditText editText;
        if (editable.subSequence(this.b, this.c).toString().contains("\n")) {
            int i = this.c;
            if (!editable.subSequence(i - 1, i).toString().equals("\n") || (editText = this.a) == null) {
                return;
            }
            this.e.b(this.d.a(), spi.a(editText, this.f.u)).Q();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.b = i;
        this.c = i + i3;
    }
}
