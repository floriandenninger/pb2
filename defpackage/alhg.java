package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alhg extends AnimatorListenerAdapter {
    final /* synthetic */ alhp a;

    public alhg(alhp alhpVar) {
        this.a = alhpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        alhp alhpVar = this.a;
        alhpVar.w = 0;
        alhpVar.r = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.x.g(0, false);
        alhp alhpVar = this.a;
        alhpVar.w = 2;
        alhpVar.r = animator;
    }
}
