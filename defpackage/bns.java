package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bns implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ bof a;

    public bns(bof bofVar) {
        this.a = bofVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.o.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        bof bofVar = this.a;
        Set set = bofVar.r;
        if (set == null || set.size() == 0) {
            bofVar.nd(true);
            return;
        }
        bny bnyVar = new bny(bofVar, 1);
        int firstVisiblePosition = bofVar.o.getFirstVisiblePosition();
        boolean z = false;
        for (int i = 0; i < bofVar.o.getChildCount(); i++) {
            View childAt = bofVar.o.getChildAt(i);
            if (bofVar.r.contains((bpv) bofVar.p.getItem(firstVisiblePosition + i))) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(bofVar.S);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                if (!z) {
                    alphaAnimation.setAnimationListener(bnyVar);
                }
                childAt.clearAnimation();
                childAt.startAnimation(alphaAnimation);
                z = true;
            }
        }
    }
}
