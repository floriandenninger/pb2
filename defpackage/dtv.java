package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dtv implements TextWatcher {
    private final List a;

    public dtv(List list) {
        this.a = list;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((TextWatcher) it.next()).afterTextChanged(editable);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((TextWatcher) it.next()).beforeTextChanged(charSequence, i, i2, i3);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((TextWatcher) it.next()).onTextChanged(charSequence, i, i2, i3);
        }
    }
}
