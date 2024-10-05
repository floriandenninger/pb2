package defpackage;

import android.os.Handler;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yag implements TextWatcher {
    private final Handler a = new Handler();
    private ajtg[] b;
    private boolean c;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable == null || editable.length() == 0) {
            this.b = null;
            this.c = false;
            return;
        }
        ajtg[] ajtgVarArr = this.b;
        if (ajtgVarArr != null) {
            if (this.c) {
                for (ajtg ajtgVar : ajtgVarArr) {
                    this.a.post(new afmt(editable, ajtgVar, 1));
                }
            } else {
                for (ajtg ajtgVar2 : ajtgVarArr) {
                    editable.removeSpan(ajtgVar2);
                }
            }
        }
        this.b = null;
        this.c = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence == null || charSequence.length() == 0 || !(charSequence instanceof Spanned)) {
            return;
        }
        Spanned spanned = (Spanned) charSequence;
        if (i2 > 0) {
            this.b = (ajtg[]) spanned.getSpans(i, i2 + i, ajtg.class);
            this.c = true;
            return;
        }
        if (i3 <= 0 || i <= 0 || i >= spanned.length()) {
            return;
        }
        ajtg[] ajtgVarArr = (ajtg[]) spanned.getSpans(i - 1, i, ajtg.class);
        int i4 = i + 1;
        ajtg[] ajtgVarArr2 = (ajtg[]) spanned.getSpans(i, i4, ajtg.class);
        if (ajtgVarArr == null || ajtgVarArr.length == 0 || ajtgVarArr2 == null || ajtgVarArr2.length == 0) {
            return;
        }
        this.b = (ajtg[]) spanned.getSpans(i, i4, ajtg.class);
        this.c = false;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
