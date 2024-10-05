package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class obi extends AnimatorListenerAdapter {
    final /* synthetic */ obj a;

    public obi(obj objVar) {
        this.a = objVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        obj objVar = this.a;
        objVar.c = 1.0f;
        objVar.J();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        obj objVar = this.a;
        objVar.c = 0.01f;
        objVar.a();
    }
}
