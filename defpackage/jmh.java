package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jmh implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View a;
    private final /* synthetic */ int b;

    public /* synthetic */ jmh(View view, int i) {
        this.b = i;
        this.a = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        if (i == 0) {
            this.a.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        } else if (i != 1) {
            this.a.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        } else {
            this.a.setPadding(0, 0, 0, Math.max(0, ((Integer) valueAnimator.getAnimatedValue()).intValue()));
        }
    }
}
