package defpackage;

import android.animation.Animator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hxd implements Animator.AnimatorListener {
    final /* synthetic */ View a;
    final /* synthetic */ hxg b;

    public hxd(View view, hxg hxgVar) {
        this.a = view;
        this.b = hxgVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.e();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
        this.b.f();
    }
}
