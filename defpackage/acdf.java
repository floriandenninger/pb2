package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acdf extends AnimatorListenerAdapter {
    final /* synthetic */ acdn a;

    public acdf(acdn acdnVar) {
        this.a = acdnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        acdn acdnVar = this.a;
        acdnVar.b.setVisibility(8);
        acdnVar.e(false);
        this.a.b.setAlpha(1.0f);
        this.a.K = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.K = true;
    }
}
