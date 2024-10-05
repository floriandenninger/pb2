package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bwa extends AnimatorListenerAdapter {
    final /* synthetic */ bwd a;

    public bwa(bwd bwdVar) {
        this.a = bwdVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.p();
        animator.removeListener(this);
    }
}
