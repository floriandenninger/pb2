package defpackage;

import android.animation.ValueAnimator;
import com.google.android.libraries.youtube.livecreation.ui.view.Circle;
import com.google.android.libraries.youtube.livecreation.ui.view.WaitingIndicatorView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aclm implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ float a;
    final /* synthetic */ WaitingIndicatorView b;

    public aclm(WaitingIndicatorView waitingIndicatorView, float f) {
        this.b = waitingIndicatorView;
        this.a = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Circle circle = this.b.a;
        circle.a = (this.a + floatValue) % 360.0f;
        circle.b = 360.0f - floatValue;
        circle.invalidate();
    }
}
