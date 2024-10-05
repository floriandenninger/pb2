package defpackage;

import android.animation.Animator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class iks implements Animator.AnimatorListener {
    private final View a;

    public iks(View view) {
        this.a = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        etx.M(this.a, false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
