package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aluo implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ ViewGroup.LayoutParams a;
    final /* synthetic */ aluq b;

    public aluo(aluq aluqVar, ViewGroup.LayoutParams layoutParams) {
        this.b = aluqVar;
        this.a = layoutParams;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.b.b.setLayoutParams(this.a);
    }
}
