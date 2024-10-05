package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class buy implements Animator.AnimatorListener {
    final /* synthetic */ buz a;
    final /* synthetic */ bva b;

    public buy(bva bvaVar, buz buzVar) {
        this.b = bvaVar;
        this.a = buzVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        this.b.a(1.0f, this.a, true);
        this.a.f();
        buz buzVar = this.a;
        buzVar.g();
        buzVar.h();
        bva bvaVar = this.b;
        if (!bvaVar.d) {
            bvaVar.c += 1.0f;
            return;
        }
        bvaVar.d = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        this.a.d(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.c = 0.0f;
    }
}
