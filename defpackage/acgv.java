package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acgv implements TextWatcher {
    final /* synthetic */ acgz a;

    public acgv(acgz acgzVar) {
        this.a = acgzVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        whu.I(this.a.d, !TextUtils.isEmpty(charSequence));
        final acgz acgzVar = this.a;
        if (charSequence.length() > 0) {
            final String charSequence2 = charSequence.toString();
            acgzVar.g = charSequence.toString();
            abxp abxpVar = acgzVar.a;
            abxo abxoVar = new abxo(abxpVar.f, abxpVar.a.c(), charSequence.toString(), null, null, null);
            abxoVar.k();
            final anhy b = abxpVar.c.b(abxoVar, abxpVar.b);
            b.d(new Runnable() { // from class: acgt
                @Override // java.lang.Runnable
                public final void run() {
                    acgz acgzVar2 = acgz.this;
                    String str = charSequence2;
                    anhy anhyVar = b;
                    if (TextUtils.equals(str, acgzVar2.g)) {
                        try {
                            aqzw aqzwVar = (aqzw) anhyVar.get();
                            if (aqzwVar.c.size() != 0) {
                                acgy acgyVar = acgzVar2.e;
                                aqzu[] aqzuVarArr = (aqzu[]) aqzwVar.c.toArray(new aqzu[0]);
                                acgyVar.d.clear();
                                if (aqzuVarArr != null) {
                                    for (aqzu aqzuVar : aqzuVarArr) {
                                        acgyVar.d.add(aqzuVar);
                                    }
                                }
                                acgzVar2.c.setVisibility(0);
                            } else {
                                acgzVar2.e.w();
                                acgzVar2.c.setVisibility(8);
                            }
                            acgzVar2.e.mw();
                            acgzVar2.c.aa(0);
                        } catch (InterruptedException | ExecutionException e) {
                            zga.d("Error getting game titles", e);
                        }
                    }
                }
            }, acgzVar.f);
            return;
        }
        acgzVar.g = null;
        acgzVar.e.w();
        acgzVar.e.mw();
        acgzVar.c.setVisibility(8);
    }
}
