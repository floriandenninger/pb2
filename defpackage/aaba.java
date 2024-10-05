package defpackage;

import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aaba implements Animation.AnimationListener {
    final /* synthetic */ aabg a;
    private final /* synthetic */ int b;

    public aaba(aabg aabgVar, int i) {
        this.b = i;
        this.a = aabgVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (this.b != 0) {
            this.a.e.setVisibility(0);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (this.b == 0) {
            this.a.e.setVisibility(8);
            return;
        }
        aabg aabgVar = this.a;
        if (aabgVar.g) {
            aabgVar.e.sendAccessibilityEvent(8);
        }
    }
}
