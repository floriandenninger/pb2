package defpackage;

import android.animation.Animator;
import com.google.android.libraries.youtube.rendering.ui.spec.motion.TouchFeedbackDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akaz implements Animator.AnimatorListener {
    final /* synthetic */ TouchFeedbackDrawable a;

    public akaz(TouchFeedbackDrawable touchFeedbackDrawable) {
        this.a = touchFeedbackDrawable;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.a.a(0);
    }
}
