package defpackage;

import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alna implements alny {
    final /* synthetic */ alnf a;

    public alna(alnf alnfVar) {
        this.a = alnfVar;
    }

    @Override // defpackage.alny
    public final void a(TextInputLayout textInputLayout, int i) {
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.a;
        if (autoCompleteTextView == null || i != 3) {
            return;
        }
        autoCompleteTextView.post(new almz(this, autoCompleteTextView));
        if (autoCompleteTextView.getOnFocusChangeListener() == this.a.b) {
            autoCompleteTextView.setOnFocusChangeListener(null);
        }
        autoCompleteTextView.setOnTouchListener(null);
        autoCompleteTextView.setOnDismissListener(null);
    }
}
