package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class uj extends AnimatorListenerAdapter {
    final /* synthetic */ ul a;
    private boolean b = false;

    public uj(ul ulVar) {
        this.a = ulVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.b) {
            this.b = false;
            return;
        }
        if (((Float) this.a.p.getAnimatedValue()).floatValue() == 0.0f) {
            ul ulVar = this.a;
            ulVar.q = 0;
            ulVar.j(0);
        } else {
            ul ulVar2 = this.a;
            ulVar2.q = 2;
            ulVar2.i();
        }
    }
}
