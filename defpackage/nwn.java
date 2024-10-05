package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class nwn extends AnimatorListenerAdapter {
    final /* synthetic */ azqv a;
    final /* synthetic */ zcf b;

    public nwn(azqv azqvVar, zcf zcfVar) {
        this.a = azqvVar;
        this.b = zcfVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a.sh();
        this.b.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.sh();
        this.b.a();
    }
}
