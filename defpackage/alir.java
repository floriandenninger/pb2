package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alir extends AnimatorListenerAdapter {
    final /* synthetic */ aliv a;

    public alir(aliv alivVar) {
        this.a = alivVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        aliv alivVar = this.a;
        alivVar.f = (alivVar.f + 4) % alivVar.e.c.length;
    }
}
