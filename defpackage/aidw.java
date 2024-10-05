package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aidw extends AnimatorListenerAdapter {
    final /* synthetic */ aidx a;

    public aidw(aidx aidxVar) {
        this.a = aidxVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a.getAlpha() == 0.0f) {
            whu.I(this.a, false);
            this.a.a.setImageBitmap(null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        whu.I(this.a, true);
    }
}
