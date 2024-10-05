package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zk implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ zl a;

    public zk(zl zlVar) {
        this.a = zlVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.p = valueAnimator.getAnimatedFraction();
    }
}
