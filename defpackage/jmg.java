package defpackage;

import android.animation.Animator;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBar;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jmg implements Animator.AnimatorListener {
    final /* synthetic */ SlimStatusBar a;
    final /* synthetic */ jmk b;

    public jmg(jmk jmkVar, SlimStatusBar slimStatusBar) {
        this.b = jmkVar;
        this.a = slimStatusBar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setBackgroundColor(this.b.a);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
