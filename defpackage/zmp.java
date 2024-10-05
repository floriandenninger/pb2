package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zmp extends AnimatorListenerAdapter {
    final /* synthetic */ zmq a;

    public zmp(zmq zmqVar) {
        this.a = zmqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.c.setVisibility(4);
    }
}
