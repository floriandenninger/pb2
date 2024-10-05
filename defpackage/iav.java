package defpackage;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class iav implements Runnable {
    public final /* synthetic */ iax a;
    private final /* synthetic */ int b;

    public /* synthetic */ iav(iax iaxVar, int i) {
        this.b = i;
        this.a = iaxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            final iax iaxVar = this.a;
            if (etx.S(iaxVar.e) && iaxVar.f.getVisibility() == 0) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.addListener(iaxVar);
                ObjectAnimator duration = ObjectAnimator.ofFloat(iaxVar.f, (Property<TextView, Float>) View.ALPHA, 0.0f).setDuration(250L);
                ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(iaxVar.d), 0);
                ofObject.setDuration(50L);
                ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: iau
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        iax.this.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
                ArrayList arrayList = new ArrayList();
                arrayList.add(duration);
                arrayList.add(ofObject);
                animatorSet.playTogether(arrayList);
                animatorSet.start();
                return;
            }
            return;
        }
        this.a.a();
    }
}
