package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xyf implements TextWatcher {
    final /* synthetic */ EditText a;
    final /* synthetic */ xyh b;

    public xyf(xyh xyhVar, EditText editText) {
        this.b = xyhVar;
        this.a = editText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        xyh xyhVar = this.b;
        xyhVar.c(xyhVar.l());
        float lineSpacingExtra = this.a.getLineSpacingExtra();
        float lineSpacingMultiplier = this.a.getLineSpacingMultiplier();
        this.a.setLineSpacing(0.0f, 1.0f);
        this.a.setLineSpacing(lineSpacingExtra, lineSpacingMultiplier);
    }
}
