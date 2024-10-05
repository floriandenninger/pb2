package defpackage;

import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class kgr implements Animation.AnimationListener {
    final /* synthetic */ kgs a;

    public kgr(kgs kgsVar) {
        this.a = kgsVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (this.a.np()) {
            this.a.b.setVisibility(8);
            aabk aabkVar = this.a.d;
            if (aabkVar != null) {
                aabkVar.c();
            }
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
