package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xyp implements TextWatcher {
    final /* synthetic */ xyr a;

    public xyp(xyr xyrVar) {
        this.a = xyrVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        xyr xyrVar = this.a;
        xyrVar.aF(xyrVar.aK());
        float lineSpacingExtra = this.a.ao.getLineSpacingExtra();
        float lineSpacingMultiplier = this.a.ao.getLineSpacingMultiplier();
        this.a.ao.setLineSpacing(0.0f, 1.0f);
        this.a.ao.setLineSpacing(lineSpacingExtra, lineSpacingMultiplier);
    }
}
