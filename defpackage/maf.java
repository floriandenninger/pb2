package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class maf extends AnimatorListenerAdapter {
    final /* synthetic */ mai a;

    public maf(mai maiVar) {
        this.a = maiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.m();
    }
}
