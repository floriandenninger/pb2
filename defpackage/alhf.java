package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alhf extends AnimatorListenerAdapter {
    final /* synthetic */ alhp a;
    private boolean b;

    public alhf(alhp alhpVar) {
        this.a = alhpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        alhp alhpVar = this.a;
        alhpVar.w = 0;
        alhpVar.r = null;
        if (this.b) {
            return;
        }
        alhpVar.x.g(4, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.x.g(0, false);
        alhp alhpVar = this.a;
        alhpVar.w = 1;
        alhpVar.r = animator;
        this.b = false;
    }
}
