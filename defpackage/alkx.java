package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alkx extends AnimatorListenerAdapter {
    final /* synthetic */ allk a;

    public alkx(allk allkVar) {
        this.a = allkVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.g();
    }
}
