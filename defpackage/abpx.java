package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abpx implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ GradientDrawable a;

    public abpx(GradientDrawable gradientDrawable) {
        this.a = gradientDrawable;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
