package defpackage;

import android.widget.AutoCompleteTextView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class almz implements Runnable {
    final /* synthetic */ AutoCompleteTextView a;
    final /* synthetic */ alna b;

    public almz(alna alnaVar, AutoCompleteTextView autoCompleteTextView) {
        this.b = alnaVar;
        this.a = autoCompleteTextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.removeTextChangedListener(this.b.a.a);
    }
}
