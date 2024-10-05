package defpackage;

import android.widget.AutoCompleteTextView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class almt implements Runnable {
    final /* synthetic */ AutoCompleteTextView a;
    final /* synthetic */ almv b;

    public almt(almv almvVar, AutoCompleteTextView autoCompleteTextView) {
        this.b = almvVar;
        this.a = autoCompleteTextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean isPopupShowing = this.a.isPopupShowing();
        this.b.a.d(isPopupShowing);
        this.b.a.d = isPopupShowing;
    }
}
