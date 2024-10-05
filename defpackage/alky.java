package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alky extends AnimatorListenerAdapter {
    final /* synthetic */ int a;
    final /* synthetic */ allk b;

    public alky(allk allkVar, int i) {
        this.b = allkVar;
        this.a = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.f(this.a);
    }
}
