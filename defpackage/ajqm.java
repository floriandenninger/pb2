package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajqm extends AnimatorListenerAdapter {
    final /* synthetic */ ajqd a;
    final /* synthetic */ ajqo b;

    public ajqm(ajqo ajqoVar, ajqd ajqdVar) {
        this.b = ajqoVar;
        this.a = ajqdVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.b.setListener(null);
        this.b.f();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Runnable runnable = this.a.d;
    }
}
