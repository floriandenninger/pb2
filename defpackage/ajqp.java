package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajqp extends AnimatorListenerAdapter {
    final /* synthetic */ ajpg a;
    final /* synthetic */ ajqg b;

    public ajqp(ajqg ajqgVar, ajpg ajpgVar) {
        this.b = ajqgVar;
        this.a = ajpgVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.b.setListener(null);
        this.b.c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Runnable runnable = this.a.c;
    }
}
