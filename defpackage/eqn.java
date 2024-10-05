package defpackage;

import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class eqn implements TextWatcher {
    final /* synthetic */ eqt a;

    public eqn(eqt eqtVar) {
        this.a = eqtVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        eqs eqsVar;
        eqt eqtVar = this.a;
        eqtVar.d();
        String obj = eqtVar.h.getText().toString();
        if (obj.isEmpty()) {
            aqyg aqygVar = eqtVar.j.i;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            eqsVar = eqs.a(aqygVar);
        } else if (obj.equals(eqtVar.j.c)) {
            eqsVar = eqs.b();
        } else {
            eqtVar.m = new eqr(eqtVar);
            Handler handler = eqtVar.d;
            Runnable runnable = eqtVar.m;
            aprv aprvVar = eqtVar.j;
            handler.postDelayed(runnable, (aprvVar.b & 64) != 0 ? aprvVar.g : 1000L);
            eqsVar = new eqs(2, null);
        }
        eqtVar.f(eqsVar);
    }
}
