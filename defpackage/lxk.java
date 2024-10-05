package defpackage;

import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lxk implements Animation.AnimationListener {
    final /* synthetic */ lxm a;
    private final /* synthetic */ int b;

    public lxk(lxm lxmVar, int i) {
        this.b = i;
        this.a = lxmVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (this.b == 0) {
            this.a.d.clearAnimation();
            this.a.d.setVisibility(8);
        } else {
            this.a.d.clearAnimation();
            this.a.d.setVisibility(0);
        }
    }
}
