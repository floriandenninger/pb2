package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akkh extends AnimatorListenerAdapter {
    final /* synthetic */ akki a;

    public akkh(akki akkiVar) {
        this.a = akkiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a.am.a(akkp.ENTER_FROM_BELOW_ANIMATION);
    }
}
