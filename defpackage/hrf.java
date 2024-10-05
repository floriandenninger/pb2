package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.ShortsVideoTrimView2;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hrf extends AnimatorListenerAdapter {
    final /* synthetic */ vye a;
    final /* synthetic */ ShortsVideoTrimView2 b;

    public hrf(ShortsVideoTrimView2 shortsVideoTrimView2, vye vyeVar) {
        this.b = shortsVideoTrimView2;
        this.a = vyeVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.l(this.a);
    }
}
