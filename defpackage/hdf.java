package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class hdf implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ hdi b;

    public hdf(hdi hdiVar, View view) {
        this.b = hdiVar;
        this.a = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.a.getWidth() > 0) {
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ObjectAnimator duration = ObjectAnimator.ofInt(this.b.b, "scrollX", (this.a.getLeft() - (this.b.d / 2)) + (this.a.getWidth() / 2)).setDuration(225L);
            duration.setInterpolator(new anq());
            duration.start();
        }
    }
}
