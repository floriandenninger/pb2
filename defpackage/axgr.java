package defpackage;

import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class axgr implements Animation.AnimationListener {
    final /* synthetic */ axgs a;

    public axgr(axgs axgsVar) {
        this.a = axgsVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.setVisibility(8);
        ((ViewGroup) this.a.getParent()).removeView(this.a);
        Runnable runnable = this.a.c;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
