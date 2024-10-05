package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.HeightTransitionLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fxy extends bwd {
    public static final /* synthetic */ int p = 0;

    @Override // defpackage.bwd
    public final Animator a(ViewGroup viewGroup, bwm bwmVar, bwm bwmVar2) {
        int intValue;
        int intValue2;
        if (bwmVar == null || bwmVar2 == null || (intValue = ((Integer) bwmVar.a.get("heightTransition:height")).intValue()) == (intValue2 = ((Integer) bwmVar2.a.get("heightTransition:height")).intValue())) {
            return null;
        }
        final HeightTransitionLayout heightTransitionLayout = (HeightTransitionLayout) bwmVar2.b;
        ValueAnimator ofInt = ValueAnimator.ofInt(intValue, intValue2);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fxw
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                HeightTransitionLayout heightTransitionLayout2 = HeightTransitionLayout.this;
                int i = fxy.p;
                heightTransitionLayout2.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        ofInt.addListener(new fxx(heightTransitionLayout));
        return ofInt;
    }

    @Override // defpackage.bwd
    public final void b(bwm bwmVar) {
        View view = bwmVar.b;
        if (view instanceof HeightTransitionLayout) {
            HeightTransitionLayout heightTransitionLayout = (HeightTransitionLayout) view;
            bwmVar.a.put("heightTransition:height", Integer.valueOf(heightTransitionLayout.a));
            heightTransitionLayout.a(-1);
        }
    }

    @Override // defpackage.bwd
    public final void c(bwm bwmVar) {
        View view = bwmVar.b;
        if (view instanceof HeightTransitionLayout) {
            HeightTransitionLayout heightTransitionLayout = (HeightTransitionLayout) view;
            bwmVar.a.put("heightTransition:height", Integer.valueOf(heightTransitionLayout.getHeight()));
            heightTransitionLayout.a(heightTransitionLayout.getHeight());
        }
    }
}
