package defpackage;

import android.view.animation.Animation;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gef implements Animation.AnimationListener {
    final /* synthetic */ geg a;

    public gef(geg gegVar) {
        this.a = gegVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        TextView textView = this.a.a;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
