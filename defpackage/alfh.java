package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alfh implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ alfk a;

    public alfh(alfk alfkVar) {
        this.a = alfkVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.j(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
