package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bux implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ buz a;
    final /* synthetic */ bva b;

    public bux(bva bvaVar, buz buzVar) {
        this.b = bvaVar;
        this.a = buzVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        bva.e(floatValue, this.a);
        this.b.a(floatValue, this.a, false);
        this.b.invalidateSelf();
    }
}
