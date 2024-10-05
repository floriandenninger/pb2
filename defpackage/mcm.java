package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mcm extends AnimatorListenerAdapter {
    final /* synthetic */ mcn a;

    public mcm(mcn mcnVar) {
        this.a = mcnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a();
    }
}
