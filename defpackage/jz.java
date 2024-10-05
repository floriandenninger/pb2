package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jz implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ nu a;

    public jz(nu nuVar) {
        this.a = nuVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((View) this.a.a.c.getParent()).invalidate();
    }
}
