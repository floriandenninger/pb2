package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abpy implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ GradientDrawable a;
    final /* synthetic */ GradientDrawable b;

    public abpy(GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2) {
        this.a = gradientDrawable;
        this.b = gradientDrawable2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        this.b.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
