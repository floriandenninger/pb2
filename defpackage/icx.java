package defpackage;

import android.animation.Animator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class icx implements Animator.AnimatorListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ ida b;

    public icx(ida idaVar, boolean z) {
        this.b = idaVar;
        this.a = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b.i.c(Boolean.valueOf(this.a));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.a) {
            this.b.j.setVisibility(8);
            this.b.k.setVisibility(0);
        }
        this.b.i.c(Boolean.valueOf(this.a));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.a) {
            this.b.j.setVisibility(0);
            this.b.j.setAlpha(0.0f);
        }
    }
}
