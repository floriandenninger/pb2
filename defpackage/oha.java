package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oha {
    public static final Interpolator a = jg.o(0.05f, 0.0f, 0.0f, 1.0f);
    public final View b;
    public final int c;
    public final ayqw d;
    public int e;
    public ValueAnimator f = null;
    public nxh g = null;

    public oha(final View view, nqp nqpVar) {
        this.b = view;
        this.c = view.getContext().getResources().getDimensionPixelSize(R.dimen.watch_panel_playlist_entry_point_height);
        ayqw ayqwVar = new ayqw();
        this.d = ayqwVar;
        ayqwVar.d(nqpVar.h().j.n().X(new ayrs() { // from class: ogz
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                final oha ohaVar = oha.this;
                final View view2 = view;
                nxh nxhVar = (nxh) obj;
                if (nxhVar == nxh.HIDDEN && ohaVar.g != nxh.HIDDEN) {
                    ValueAnimator valueAnimator = ohaVar.f;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        ohaVar.f = null;
                    }
                    ohaVar.f = ValueAnimator.ofInt(ohaVar.e, 0).setDuration(300L);
                    ohaVar.f.setStartDelay(100L);
                    ohaVar.f.setInterpolator(oha.a);
                    ohaVar.f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ogy
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            oha ohaVar2 = oha.this;
                            View view3 = view2;
                            int intValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                            ohaVar2.e = intValue;
                            view3.setTranslationY(intValue);
                        }
                    });
                    ohaVar.f.start();
                } else if (nxhVar != nxh.HIDDEN && ohaVar.g == nxh.HIDDEN) {
                    int i = ohaVar.c;
                    ohaVar.e = i;
                    view2.setTranslationY(i);
                }
                ohaVar.g = nxhVar;
            }
        }));
    }
}
