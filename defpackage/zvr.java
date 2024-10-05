package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zvr extends AnimatorListenerAdapter {
    final /* synthetic */ zvu a;

    public zvr(zvu zvuVar) {
        this.a = zvuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a.a.getAlpha() == 0.0f) {
            this.a.a.setVisibility(8);
        }
        if (this.a.b.getAlpha() == 0.0f) {
            this.a.b.setVisibility(8);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.a.setVisibility(0);
        this.a.b.setVisibility(0);
    }
}
