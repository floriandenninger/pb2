package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gyh implements Animator.AnimatorListener {
    final /* synthetic */ gyi a;

    public gyh(gyi gyiVar) {
        this.a = gyiVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a.a = 0;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        gyi gyiVar = this.a;
        gyiVar.a = 0;
        gyiVar.b = 0;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
