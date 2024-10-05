package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class akkn extends AnimatorListenerAdapter {
    final /* synthetic */ akkr a;

    public akkn(akkr akkrVar) {
        this.a = akkrVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.am.a(akkp.REVEAL_THIRD_PARTY_NETWORK_SECTION_ANIMATION);
    }
}
