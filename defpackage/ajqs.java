package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajqs extends AnimatorListenerAdapter {
    final /* synthetic */ ajpx a;
    final /* synthetic */ ajqt b;

    public ajqs(ajqt ajqtVar, ajpx ajpxVar) {
        this.b = ajqtVar;
        this.a = ajpxVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.b.setListener(null);
        this.b.h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Runnable runnable = this.a.c;
    }
}
