package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahrc implements Animation.AnimationListener {
    private final View a;
    private final /* synthetic */ int b;

    public ahrc(View view, int i) {
        this.b = i;
        this.a = view;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (this.b != 0) {
            this.a.setVisibility(0);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (this.b != 0) {
            this.a.setVisibility(4);
        } else {
            ahrd.a((ViewGroup) this.a);
            this.a.setVisibility(8);
        }
    }
}
