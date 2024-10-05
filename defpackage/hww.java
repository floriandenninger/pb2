package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ShortsRecordButtonView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hww implements ValueAnimator.AnimatorUpdateListener {
    protected final int a;
    protected final int b;
    protected final ArgbEvaluator c;
    final /* synthetic */ ShortsRecordButtonView d;

    public hww(ShortsRecordButtonView shortsRecordButtonView, int i, int i2) {
        this.d = shortsRecordButtonView;
        this.a = i;
        this.b = i2;
        this.c = i == i2 ? null : new ArgbEvaluator();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int animatedFraction = (int) (valueAnimator.getAnimatedFraction() * ((float) valueAnimator.getDuration()));
        ShortsRecordButtonView shortsRecordButtonView = this.d;
        int round = Math.round(shortsRecordButtonView.c / floatValue);
        int i = this.a;
        int i2 = this.b;
        if (i != i2 && animatedFraction < 100) {
            i2 = ((Integer) this.c.evaluate(animatedFraction / 100.0f, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
        }
        shortsRecordButtonView.d(round, i2);
    }
}
