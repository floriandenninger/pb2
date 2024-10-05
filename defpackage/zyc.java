package defpackage;

import android.view.inputmethod.InputMethodManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zyc implements Runnable {
    final /* synthetic */ zyd a;

    public zyc(zyd zydVar) {
        this.a = zydVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ci C = this.a.C();
        if (C != null) {
            ((InputMethodManager) C.getSystemService("input_method")).hideSoftInputFromWindow(this.a.O.getWindowToken(), 0);
        }
    }
}
