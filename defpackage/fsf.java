package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import com.google.android.apps.youtube.app.common.rendering.presenter.donationshelf.PrefixedEditText;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fsf implements TextWatcher {
    final /* synthetic */ fsg a;

    public fsf(fsg fsgVar) {
        this.a = fsgVar;
    }

    private final void a(long j) {
        npt nptVar = this.a.f;
        if (nptVar != null) {
            npw npwVar = nptVar.a;
            npwVar.j = j;
            Button button = npwVar.i;
            if (j <= 0) {
                button.setEnabled(false);
            } else {
                button.setEnabled(true);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        try {
            if (editable.toString().isEmpty()) {
                a(0L);
                return;
            }
            long parseLong = Long.parseLong(editable.toString()) * 1000000;
            fsg fsgVar = this.a;
            aqlc aqlcVar = fsgVar.e;
            if (parseLong >= aqlcVar.t && parseLong <= aqlcVar.u) {
                fsgVar.c.setError(null);
                a(parseLong);
                return;
            }
            PrefixedEditText prefixedEditText = fsgVar.c;
            aqyg aqygVar = aqlcVar.v;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            prefixedEditText.setError(ajcq.b(aqygVar));
            a(0L);
        } catch (NumberFormatException unused) {
            fsg fsgVar2 = this.a;
            PrefixedEditText prefixedEditText2 = fsgVar2.c;
            aqyg aqygVar2 = fsgVar2.e.v;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            prefixedEditText2.setError(ajcq.b(aqygVar2));
            a(0L);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
