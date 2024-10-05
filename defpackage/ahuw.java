package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahuw implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ahuz a;

    public ahuw(ahuz ahuzVar) {
        this.a = ahuzVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.a.m()) {
            this.a.e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.a.a(64);
            if (this.a.h(2) || this.a.h(4)) {
                this.a.d();
            }
        }
    }
}
