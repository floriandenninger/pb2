package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class uh implements Runnable {
    final /* synthetic */ ul a;

    public uh(ul ulVar) {
        this.a = ulVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ul ulVar = this.a;
        int i = ulVar.q;
        if (i == 1) {
            ulVar.p.cancel();
        } else if (i != 2) {
            return;
        }
        ulVar.q = 3;
        ValueAnimator valueAnimator = ulVar.p;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        ulVar.p.setDuration(500L);
        ulVar.p.start();
    }
}
