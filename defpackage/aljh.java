package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aljh extends AnimatorListenerAdapter {
    final /* synthetic */ aljj a;

    public aljh(aljj aljjVar) {
        this.a = aljjVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        aljj aljjVar = this.a;
        aljjVar.c = (aljjVar.c + 1) % aljjVar.b.c.length;
        aljjVar.d = true;
    }
}
