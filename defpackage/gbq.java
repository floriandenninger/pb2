package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gbq extends bwd {
    private static final void e(bwm bwmVar) {
        bwmVar.a.put("hatsSurveyView:HEIGHT", Integer.valueOf(bwmVar.b.getHeight()));
    }

    @Override // defpackage.bwd
    public final Animator a(ViewGroup viewGroup, bwm bwmVar, bwm bwmVar2) {
        if (bwmVar == null || bwmVar2 == null) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, "translationY", ((Integer) bwmVar2.a.get("hatsSurveyView:HEIGHT")).intValue() - ((Integer) bwmVar.a.get("hatsSurveyView:HEIGHT")).intValue(), 0.0f);
        ofFloat.setInterpolator(new anq());
        return ofFloat;
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
