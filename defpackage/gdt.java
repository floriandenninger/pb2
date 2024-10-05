package defpackage;

import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gdt implements Animation.AnimationListener {
    final /* synthetic */ gdv a;

    public gdt(gdv gdvVar) {
        this.a = gdvVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.a = false;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.a.a = true;
    }
}
