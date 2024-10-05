package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class tjp extends AnimatorListenerAdapter {
    final /* synthetic */ tjr a;

    public tjp(tjr tjrVar) {
        this.a = tjrVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.a.a.isStarted()) {
            return;
        }
        this.a.a.start();
    }
}
