package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class almu implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ alnf a;

    public almu(alnf alnfVar) {
        this.a = alnfVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.m.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
