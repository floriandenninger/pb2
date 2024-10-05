package defpackage;

import android.text.Editable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wbd extends wbe {
    final /* synthetic */ wbf a;

    public wbd(wbf wbfVar) {
        this.a = wbfVar;
    }

    @Override // defpackage.wbe, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.d.setVisibility(8);
        this.a.e.setError(null);
        this.a.f.setError(null);
        this.a.g.setError(null);
    }
}
