package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.quantum.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uza extends AnimatorListenerAdapter {
    final /* synthetic */ Snackbar a;

    public uza(Snackbar snackbar) {
        this.a = snackbar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
    }
}
