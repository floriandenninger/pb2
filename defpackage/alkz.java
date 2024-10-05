package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class alkz implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ allk a;
    private final /* synthetic */ int b;

    public alkz(allk allkVar, int i) {
        this.b = i;
        this.a = allkVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        if (i == 0) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.a.f.setScaleX(floatValue);
            this.a.f.setScaleY(floatValue);
        } else {
            if (i == 1) {
                this.a.f.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            }
            if (i == 2) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                String str = allk.c;
                this.a.f.setTranslationY(intValue);
            } else {
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                String str2 = allk.c;
                this.a.f.setTranslationY(intValue2);
            }
        }
    }
}
