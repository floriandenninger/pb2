package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gbb extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ int b;
    final /* synthetic */ BottomUiContainer c;

    public gbb(BottomUiContainer bottomUiContainer, View view, int i) {
        this.c = bottomUiContainer;
        this.a = view;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        BottomUiContainer bottomUiContainer = this.c;
        bottomUiContainer.j(bottomUiContainer.c(this.a, this.b));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        BottomUiContainer bottomUiContainer = this.c;
        bottomUiContainer.j(bottomUiContainer.c(this.a, this.b));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        BottomUiContainer bottomUiContainer = this.c;
        bottomUiContainer.j(bottomUiContainer.c(this.a, this.b));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BottomUiContainer bottomUiContainer = this.c;
        bottomUiContainer.j(bottomUiContainer.c(this.a, this.b));
    }
}
