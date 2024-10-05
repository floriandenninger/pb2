package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class almp implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ almq a;
    private final /* synthetic */ int b;

    public almp(almq almqVar, int i) {
        this.b = i;
        this.a = almqVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.b == 0) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.a.m.setScaleX(floatValue);
            this.a.m.setScaleY(floatValue);
        } else {
            this.a.m.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }
}
