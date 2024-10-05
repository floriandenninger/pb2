package defpackage;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abpv implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ TextView a;
    private final /* synthetic */ int b;

    public abpv(TextView textView, int i) {
        this.b = i;
        this.a = textView;
    }

    public /* synthetic */ abpv(TextView textView, int i, byte[] bArr) {
        this.b = i;
        this.a = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        if (i == 0) {
            this.a.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (i != 1) {
            this.a.setHintTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        } else {
            fhe.Q(this.a, ((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }
}
