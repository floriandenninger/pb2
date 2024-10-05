package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lhm implements Animator.AnimatorListener {
    final /* synthetic */ lho a;

    public lhm(lho lhoVar) {
        this.a = lhoVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        lho lhoVar = this.a;
        lhoVar.m.setBackgroundColor(lhoVar.a);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
