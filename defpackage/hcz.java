package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class hcz extends AnimatorListenerAdapter {
    final /* synthetic */ View a;

    public hcz(View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        this.a.setAlpha(0.0f);
        this.a.setVisibility(0);
    }
}
