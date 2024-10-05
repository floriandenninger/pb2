package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class nqi implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ View c;
    final /* synthetic */ nqj d;
    private final /* synthetic */ int e;

    public nqi(nqj nqjVar, View view, View view2, View view3, int i) {
        this.e = i;
        this.d = nqjVar;
        this.a = view;
        this.b = view2;
        this.c = view3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.e == 0) {
            float b = nql.b(this.a, ((Float) valueAnimator.getAnimatedValue()).floatValue() * this.d.a);
            this.a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
            this.b.setTranslationX(b);
            this.c.setTranslationX(b);
            return;
        }
        float b2 = nql.b(this.a, 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * this.d.a;
        this.a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.b.setTranslationX(b2);
        this.c.setTranslationX(b2);
    }
}
