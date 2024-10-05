package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zvq implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ zvu a;

    public zvq(zvu zvuVar) {
        this.a = zvuVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.a.a.setAlpha(floatValue);
        this.a.b.setAlpha(1.0f - floatValue);
    }
}
