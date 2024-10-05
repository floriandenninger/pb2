package defpackage;

import android.view.View;
import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gdu implements Animation.AnimationListener {
    final /* synthetic */ View a;
    final /* synthetic */ gdv b;

    public gdu(gdv gdvVar, View view) {
        this.b = gdvVar;
        this.a = view;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        View view = this.a;
        if (view != null) {
            view.setVisibility(8);
        }
        this.b.b = false;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.b.b = true;
    }
}
