package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aljl extends AnimatorListenerAdapter {
    final /* synthetic */ aljn a;

    public aljl(aljn aljnVar) {
        this.a = aljnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.a();
        bxe bxeVar = this.a.h;
        if (bxeVar != null) {
            bxeVar.a();
        }
    }
}
