package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class allz implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ almb c;

    public allz(almb almbVar, View view, View view2) {
        this.c = almbVar;
        this.a = view;
        this.b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.c.c(this.a, this.b, valueAnimator.getAnimatedFraction());
    }
}
