package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gba extends AnimatorListenerAdapter {
    boolean a = false;
    final /* synthetic */ BottomUiContainer b;

    public gba(BottomUiContainer bottomUiContainer) {
        this.b = bottomUiContainer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        BottomUiContainer bottomUiContainer = this.b;
        bottomUiContainer.f = null;
        bottomUiContainer.g = null;
        if (this.a) {
            return;
        }
        bottomUiContainer.n(null, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BottomUiContainer bottomUiContainer = this.b;
        bottomUiContainer.f = bottomUiContainer.e;
    }
}
