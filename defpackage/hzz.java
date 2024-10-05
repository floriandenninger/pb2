package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class hzz implements Animator.AnimatorListener {
    final /* synthetic */ iac a;

    public hzz(iac iacVar) {
        this.a = iacVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        iac iacVar = this.a;
        iacVar.aM(iacVar.ay);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
