package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acdi extends AnimatorListenerAdapter {
    final /* synthetic */ acdn a;

    public acdi(acdn acdnVar) {
        this.a = acdnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.p.setVisibility(4);
        this.a.q.setText("");
        acdn acdnVar = this.a;
        acdnVar.v.removeCallbacks(acdnVar.u);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
