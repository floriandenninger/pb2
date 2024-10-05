package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class abnp extends AnimatorListenerAdapter {
    final /* synthetic */ abns a;

    public abnp(abns abnsVar) {
        this.a = abnsVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.s().setVisibility(8);
    }
}
