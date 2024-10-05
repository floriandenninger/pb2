package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hpv implements TextWatcher {
    final /* synthetic */ View a;
    final /* synthetic */ hpw b;

    public hpv(hpw hpwVar, View view) {
        this.b = hpwVar;
        this.a = view;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.b.a.hasFocus()) {
            hpw hpwVar = this.b;
            hpwVar.c.a(hpwVar.a.getText().toString());
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.setVisibility(i3 == 0 ? 4 : 0);
    }
}
