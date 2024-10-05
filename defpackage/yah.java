package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yah {
    private static final Interpolator a = jg.o(0.05f, 0.0f, 0.0f, 1.0f);
    private static final Interpolator b = jg.o(1.0f, 0.0f, 0.95f, 1.0f);

    public static final Animator a(View view, int i, int i2) {
        view.getClass();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(b(view, i, i2, 300L, 100L, a), b(view, i2, i, 100L, 500L, b));
        return animatorSet;
    }

    private static final Animator b(View view, int i, int i2, long j, long j2, Interpolator interpolator) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "backgroundColor", new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        ofObject.setStartDelay(j);
        ofObject.setDuration(j2);
        ofObject.setInterpolator(interpolator);
        return ofObject;
    }
}
