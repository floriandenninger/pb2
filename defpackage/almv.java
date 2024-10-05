package defpackage;

import android.text.Editable;
import android.widget.AutoCompleteTextView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class almv extends alif {
    final /* synthetic */ alnf a;

    public almv(alnf alnfVar) {
        this.a = alnfVar;
    }

    @Override // defpackage.alif, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        AutoCompleteTextView a = alnf.a(this.a.k.a);
        if (this.a.i.isTouchExplorationEnabled() && alnf.h(a) && !this.a.m.hasFocus()) {
            a.dismissDropDown();
        }
        a.post(new almt(this, a));
    }
}
