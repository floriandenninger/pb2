package defpackage;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abpw implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ Drawable a;

    public abpw(Drawable drawable) {
        this.a = drawable;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.setColorFilter(((Integer) valueAnimator.getAnimatedValue()).intValue(), PorterDuff.Mode.SRC_IN);
    }
}
