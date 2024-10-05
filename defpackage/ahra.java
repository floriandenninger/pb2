package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahra implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ ahrd a;

    public ahra(ahrd ahrdVar) {
        this.a = ahrdVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        this.a.e.setAlpha((int) (255.0f * animatedFraction));
        this.a.setAlpha(1.0f - (animatedFraction * 0.3f));
    }
}
