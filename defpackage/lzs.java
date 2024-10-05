package defpackage;

import android.animation.Animator;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lzs implements Animator.AnimatorListener {
    final /* synthetic */ ImageView a;
    final /* synthetic */ lzt b;

    public lzs(lzt lztVar, ImageView imageView) {
        this.b = lztVar;
        this.a = imageView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setAlpha(1.0f);
        this.b.a.j();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
