package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alun extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup.LayoutParams a;
    final /* synthetic */ int b;
    final /* synthetic */ aluq c;

    public alun(aluq aluqVar, ViewGroup.LayoutParams layoutParams, int i) {
        this.c = aluqVar;
        this.a = layoutParams;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.b.setAlpha(1.0f);
        this.c.b.setTranslationX(0.0f);
        this.a.height = this.b;
        this.c.b.setLayoutParams(this.a);
    }
}
