package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class obt extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    public final ValueAnimator a;
    public boolean b;
    final /* synthetic */ obu c;
    private final float d;
    private final oej e;

    public obt(obu obuVar, long j, float f, oej oejVar) {
        this.c = obuVar;
        this.d = f;
        this.e = oejVar;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.a = ofFloat;
        ofFloat.setDuration(j);
        if (obuVar.b != 128 || obuVar.c != 2) {
            ofFloat.setInterpolator(f > 0.0f ? new DecelerateInterpolator() : new fye());
        } else {
            ofFloat.setInterpolator(jg.o(0.05f, 0.0f, 0.0f, 1.0f));
        }
    }

    private final void a() {
        if (this.b) {
            return;
        }
        oej oejVar = this.e;
        if (oejVar != null) {
            oejVar.a.p(odd.a(this.c.c));
            oejVar.a.e.a.c(0);
        }
        this.c.e = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.b) {
            return;
        }
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = this.d;
        this.c.d(f + ((1.0f - f) * floatValue));
    }
}
