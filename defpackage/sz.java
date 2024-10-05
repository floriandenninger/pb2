package defpackage;

import android.support.v7.widget.AppCompatSpinner;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sz implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ AppCompatSpinner a;

    public sz(AppCompatSpinner appCompatSpinner) {
        this.a = appCompatSpinner;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (!this.a.b.u()) {
            this.a.b();
        }
        ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
