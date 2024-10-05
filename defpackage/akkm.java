package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class akkm implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ akkr a;

    public akkm(akkr akkrVar) {
        this.a = akkrVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.ai.f(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
