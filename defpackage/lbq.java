package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lbq implements TextWatcher {
    final /* synthetic */ lbz a;

    public lbq(lbz lbzVar) {
        this.a = lbzVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable.length() != 0 || !this.a.aj.c().g()) {
            this.a.aF.setVisibility(8);
        } else {
            this.a.aF.setVisibility(0);
        }
        this.a.ai.d();
        this.a.aG();
        this.a.aH = editable.toString();
        this.a.bg();
        lbz lbzVar = this.a;
        lbzVar.bi(lbzVar.aH);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
