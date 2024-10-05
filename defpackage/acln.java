package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.youtube.livecreation.ui.view.WaitingIndicatorView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acln extends AnimatorListenerAdapter {
    final /* synthetic */ WaitingIndicatorView a;

    public acln(WaitingIndicatorView waitingIndicatorView) {
        this.a = waitingIndicatorView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a.setVisibility(8);
    }
}
