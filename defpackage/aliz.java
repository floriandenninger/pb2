package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aliz extends AnimatorListenerAdapter {
    final /* synthetic */ aljc a;

    public aliz(aljc aljcVar) {
        this.a = aljcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        aljc aljcVar = this.a;
        List<bxe> list = aljcVar.f;
        if (list == null || aljcVar.g) {
            return;
        }
        for (bxe bxeVar : list) {
        }
    }
}
