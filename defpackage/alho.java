package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class alho extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    private boolean a;
    final /* synthetic */ alhp b;
    private float c;
    private float d;

    public alho(alhp alhpVar) {
        this.b = alhpVar;
    }

    protected abstract float a();

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.k((int) this.d);
        this.a = false;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (!this.a) {
            alkg alkgVar = this.b.i;
            this.c = alkgVar == null ? 0.0f : alkgVar.a();
            this.d = a();
            this.a = true;
        }
        alhp alhpVar = this.b;
        float f = this.c;
        alhpVar.k((int) (f + ((this.d - f) * valueAnimator.getAnimatedFraction())));
    }
}
