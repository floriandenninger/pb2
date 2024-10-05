package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alum extends AnimatorListenerAdapter {
    final /* synthetic */ aluq a;

    public alum(aluq aluqVar) {
        this.a = aluqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        aluq aluqVar = this.a;
        ViewGroup.LayoutParams layoutParams = aluqVar.b.getLayoutParams();
        int height = aluqVar.b.getHeight();
        ValueAnimator duration = ValueAnimator.ofInt(height, 1).setDuration(aluqVar.a);
        duration.addListener(new alun(aluqVar, layoutParams, height));
        duration.addUpdateListener(new aluo(aluqVar, layoutParams));
        duration.start();
    }
}
