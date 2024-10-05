package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acdg extends AnimatorListenerAdapter {
    final /* synthetic */ acdn a;

    public acdg(acdn acdnVar) {
        this.a = acdnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.f27J = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        acdn acdnVar = this.a;
        acdnVar.f27J = true;
        acdnVar.b.setVisibility(0);
        this.a.g.setVisibility(0);
    }
}
