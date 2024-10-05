package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class almn extends AnimatorListenerAdapter {
    final /* synthetic */ almq a;

    public almn(almq almqVar) {
        this.a = almqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.k.u(true);
    }
}
