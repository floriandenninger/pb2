package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fyi extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    private final View a;
    private final float b;
    private final float c;

    public fyi(View view, float f, float f2) {
        this.a = view;
        this.b = f;
        this.c = f2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setRotation(this.c);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setRotation(this.b);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            this.a.setRotation(((Float) animatedValue).floatValue());
        }
    }
}
