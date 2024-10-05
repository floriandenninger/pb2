package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mzx implements TextWatcher {
    final /* synthetic */ mzy a;

    public mzx(mzy mzyVar) {
        this.a = mzyVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        mzy mzyVar = this.a;
        if (mzyVar.i || mzyVar.h) {
            return;
        }
        aahd aahdVar = mzyVar.c;
        apxf apxfVar = mzyVar.e.h;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.c(apxfVar, null);
        mzyVar.h = true;
    }
}
