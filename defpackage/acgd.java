package defpackage;

import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acgd implements Animation.AnimationListener {
    final /* synthetic */ acgf a;

    public acgd(acgf acgfVar) {
        this.a = acgfVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.an.setBackgroundColor(0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.a.an.setBackgroundColor(-1);
    }
}
