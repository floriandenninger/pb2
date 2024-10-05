package defpackage;

import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahsa implements Animation.AnimationListener {
    final /* synthetic */ ahsd a;

    public ahsa(ahsd ahsdVar) {
        this.a = ahsdVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.b();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
