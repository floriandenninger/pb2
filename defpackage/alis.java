package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alis extends AnimatorListenerAdapter {
    final /* synthetic */ aliv a;

    public alis(aliv alivVar) {
        this.a = alivVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.a();
        bxe bxeVar = this.a.i;
        if (bxeVar != null) {
            bxeVar.a();
        }
    }
}
