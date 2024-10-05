package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aaav implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ aaas a;

    public aaav(aaas aaasVar) {
        this.a = aaasVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
