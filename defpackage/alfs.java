package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alfs extends AnimatorListenerAdapter {
    final /* synthetic */ HideBottomViewOnScrollBehavior a;

    public alfs(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.a = hideBottomViewOnScrollBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a = null;
    }
}
