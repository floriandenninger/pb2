package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ybk implements TextWatcher {
    final /* synthetic */ ybm a;

    public ybk(ybm ybmVar) {
        this.a = ybmVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable.length() > 0) {
            this.a.c.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_clear_entry, 0);
            this.a.d = true;
        } else {
            this.a.c.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            ybm ybmVar = this.a;
            ybmVar.d = false;
            ybmVar.d();
        }
        this.a.e();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
