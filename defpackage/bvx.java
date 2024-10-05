package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bvx extends bxa {
    public bvx() {
    }

    private static float J(bwm bwmVar, float f) {
        Float f2;
        return (bwmVar == null || (f2 = (Float) bwmVar.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    private final Animator K(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        bwr.c(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) bwr.a, f2);
        ofFloat.addListener(new bvw(view));
        x(new bvv(view));
        return ofFloat;
    }

    @Override // defpackage.bxa, defpackage.bwd
    public final void c(bwm bwmVar) {
        bxa.I(bwmVar);
        bwmVar.a.put("android:fade:transitionAlpha", Float.valueOf(bwr.a(bwmVar.b)));
    }

    @Override // defpackage.bxa
    public final Animator e(View view, bwm bwmVar) {
        float J2 = J(bwmVar, 0.0f);
        return K(view, J2 != 1.0f ? J2 : 0.0f, 1.0f);
    }

    @Override // defpackage.bxa
    public final Animator f(View view, bwm bwmVar) {
        lo loVar = bwr.b;
        return K(view, J(bwmVar, 1.0f), 0.0f);
    }

    public bvx(int i) {
        this.p = i;
    }
}
