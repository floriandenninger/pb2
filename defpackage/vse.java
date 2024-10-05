package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vse extends AnimatorListenerAdapter {
    final /* synthetic */ vsd a;
    final /* synthetic */ vsf b;

    public vse(vsf vsfVar, vsd vsdVar) {
        this.b = vsfVar;
        this.a = vsdVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.b.remove(this.a);
    }
}
