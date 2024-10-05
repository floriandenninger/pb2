package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.youtube.app.common.ui.HeightTransitionLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fxx extends AnimatorListenerAdapter {
    final /* synthetic */ HeightTransitionLayout a;

    public fxx(HeightTransitionLayout heightTransitionLayout) {
        this.a = heightTransitionLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a(-1);
    }
}
