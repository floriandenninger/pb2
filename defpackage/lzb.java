package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lzb extends AnimatorListenerAdapter {
    final /* synthetic */ ImageView a;

    public lzb(ImageView imageView) {
        this.a = imageView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.setVisibility(8);
    }
}
