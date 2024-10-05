package defpackage;

import android.animation.Animator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hxe implements Animator.AnimatorListener {
    final /* synthetic */ View a;
    final /* synthetic */ hxf b;
    final /* synthetic */ boolean c;

    public hxe(View view, hxf hxfVar, boolean z) {
        this.a = view;
        this.b = hxfVar;
        this.c = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.c) {
            this.a.setVisibility(8);
        }
        this.b.b();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
        this.b.c();
    }
}
