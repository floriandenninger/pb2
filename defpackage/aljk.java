package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aljk extends AnimatorListenerAdapter {
    final /* synthetic */ aljn a;

    public aljk(aljn aljnVar) {
        this.a = aljnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        aljn aljnVar = this.a;
        aljnVar.e = (aljnVar.e + 1) % aljnVar.d.c.length;
        aljnVar.f = true;
    }
}
