package defpackage;

import android.view.View;
import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mqp implements Animation.AnimationListener {
    private final mqq a;
    private final boolean b;

    public mqp(mqq mqqVar, boolean z) {
        this.a = mqqVar;
        this.b = z;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        mqq mqqVar = this.a;
        boolean z = this.b;
        mpq mpqVar = (mpq) mqqVar;
        if (zev.e(mpqVar.a) && z) {
            View childAt = mpqVar.b.getChildAt(0);
            if (ks.c(childAt.createAccessibilityNodeInfo()).b.isAccessibilityFocused()) {
                childAt.performAccessibilityAction(128, null);
                childAt.sendAccessibilityEvent(8);
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
