package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class kuy extends AnimatorListenerAdapter {
    final /* synthetic */ kva a;

    public kuy(kva kvaVar) {
        this.a = kvaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.d.setVisibility(8);
    }
}
