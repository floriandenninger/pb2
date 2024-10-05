package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akat implements Animator.AnimatorListener {
    final /* synthetic */ akau a;

    public akat(akau akauVar) {
        this.a = akauVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.c(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
