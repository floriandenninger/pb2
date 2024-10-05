package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mzo implements TextWatcher {
    final /* synthetic */ mzs a;

    public mzo(mzs mzsVar) {
        this.a = mzsVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        mzs mzsVar = this.a;
        String obj = editable.toString();
        mzsVar.b.clear();
        if (obj.isEmpty()) {
            mzsVar.b.addAll(mzsVar.a);
        } else {
            Pattern compile = Pattern.compile(Pattern.quote(obj), 2);
            for (mzp mzpVar : mzsVar.a) {
                if (compile.matcher(mzpVar.a).find()) {
                    mzsVar.b.add(mzpVar);
                }
            }
        }
        mzsVar.d.m.mw();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
