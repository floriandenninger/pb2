package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lxj implements TextWatcher {
    final /* synthetic */ lxm a;

    public lxj(lxm lxmVar) {
        this.a = lxmVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        lxm lxmVar = this.a;
        lxmVar.g = editable;
        lxmVar.j();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
