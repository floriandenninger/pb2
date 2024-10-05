package defpackage;

import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yzy implements Animation.AnimationListener {
    final /* synthetic */ yzz a;

    public yzy(yzz yzzVar) {
        this.a = yzzVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.c();
        if (this.a.b.hasOverlappingRendering()) {
            this.a.b.setLayerType(0, null);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
