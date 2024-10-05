package defpackage;

import android.support.v7.widget.AppCompatSpinner;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class td implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ tf a;

    public td(tf tfVar) {
        this.a = tfVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        tf tfVar = this.a;
        AppCompatSpinner appCompatSpinner = tfVar.d;
        if (!jw.aj(appCompatSpinner) || !appCompatSpinner.getGlobalVisibleRect(tfVar.c)) {
            this.a.k();
        } else {
            this.a.n();
            super/*vh*/.s();
        }
    }
}
