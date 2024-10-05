package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajqq extends AnimatorListenerAdapter {
    final /* synthetic */ ajqa a;
    final /* synthetic */ ajqr b;

    public ajqq(ajqr ajqrVar, ajqa ajqaVar) {
        this.b = ajqrVar;
        this.a = ajqaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.b.setListener(null);
        this.b.c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Runnable runnable = this.a.c;
    }
}
