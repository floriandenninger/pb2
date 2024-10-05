package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mzm implements TextWatcher {
    final /* synthetic */ mzn a;

    public mzm(mzn mznVar) {
        this.a = mznVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        mzn mznVar = this.a;
        if (mznVar.l || mznVar.k) {
            return;
        }
        aahd aahdVar = mznVar.d;
        apxf apxfVar = mznVar.f.h;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.c(apxfVar, null);
        mznVar.k = true;
    }
}
