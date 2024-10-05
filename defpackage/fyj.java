package defpackage;

import android.animation.Animator;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fyj extends bwd {
    private static final void e(bwm bwmVar) {
        bwmVar.a.put("RotateTransition:rotation", Float.valueOf(bwmVar.b.getRotation()));
    }

    @Override // defpackage.bwd
    public final Animator a(ViewGroup viewGroup, bwm bwmVar, bwm bwmVar2) {
        if (bwmVar == null || bwmVar2 == null) {
            return null;
        }
        View view = bwmVar2.b;
        float floatValue = ((Float) bwmVar.a.get("RotateTransition:rotation")).floatValue();
        float floatValue2 = ((Float) bwmVar2.a.get("RotateTransition:rotation")).floatValue();
        if (floatValue == floatValue2) {
            return null;
        }
        view.setRotation(floatValue);
        ValueAnimator ofObject = ValueAnimator.ofObject(new FloatEvaluator(), Float.valueOf(floatValue), Float.valueOf(floatValue2));
        fyi fyiVar = new fyi(view, floatValue, floatValue2);
        ofObject.addUpdateListener(fyiVar);
        ofObject.addListener(fyiVar);
        return ofObject;
    }

    @Override // defpackage.bwd
    public final void b(bwm bwmVar) {
        e(bwmVar);
    }

    @Override // defpackage.bwd
    public final void c(bwm bwmVar) {
        e(bwmVar);
    }
}
