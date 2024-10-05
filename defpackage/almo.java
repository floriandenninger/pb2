package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class almo extends AnimatorListenerAdapter {
    final /* synthetic */ almq a;

    public almo(almq almqVar) {
        this.a = almqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.k.u(false);
    }
}
