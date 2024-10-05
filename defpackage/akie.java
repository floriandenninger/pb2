package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class akie implements TextWatcher {
    final /* synthetic */ akif a;

    public akie(akif akifVar) {
        this.a = akifVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Iterator it = this.a.c.b.iterator();
        while (it.hasNext()) {
            ((aklj) it.next()).d(charSequence.toString());
        }
    }
}
