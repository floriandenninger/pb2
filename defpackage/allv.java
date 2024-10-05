package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class allv implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ TabLayout a;

    public allv(TabLayout tabLayout) {
        this.a = tabLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }
}
