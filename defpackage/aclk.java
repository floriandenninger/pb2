package defpackage;

import android.animation.ValueAnimator;
import com.google.android.libraries.youtube.livecreation.ui.view.Circle;
import com.google.android.libraries.youtube.livecreation.ui.view.WaitingIndicatorView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aclk implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ WaitingIndicatorView a;

    public aclk(WaitingIndicatorView waitingIndicatorView) {
        this.a = waitingIndicatorView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Circle circle = this.a.a;
        circle.b = floatValue;
        circle.invalidate();
    }
}
