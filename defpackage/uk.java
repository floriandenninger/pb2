package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class uk implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ ul a;

    public uk(ul ulVar) {
        this.a = ulVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        this.a.b.setAlpha(floatValue);
        this.a.c.setAlpha(floatValue);
        this.a.i();
    }
}
