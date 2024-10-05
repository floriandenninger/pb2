package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class znn implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ znv a;
    private final /* synthetic */ int b;

    public /* synthetic */ znn(znv znvVar, int i) {
        this.b = i;
        this.a = znvVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.b != 0) {
            this.a.an.requestLayout();
            return;
        }
        yny.z(this.a.al, yny.x(((Integer) valueAnimator.getAnimatedValue()).intValue()), ViewGroup.LayoutParams.class);
    }
}
