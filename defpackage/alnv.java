package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alnv implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ TextInputLayout a;

    public alnv(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.n.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
