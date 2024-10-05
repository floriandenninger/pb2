package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akkl extends AnimatorListenerAdapter {
    final /* synthetic */ akkr a;

    public akkl(akkr akkrVar) {
        this.a = akkrVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.am.a(akkp.CONTENTS_ENTER_ANIMATION);
    }
}
