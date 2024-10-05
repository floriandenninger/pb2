package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fmh extends fms {
    public static final /* synthetic */ int d = 0;
    public final int a = 200;
    public int b = 200;
    final /* synthetic */ fmt c;

    public fmh(fmt fmtVar) {
        this.c = fmtVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.c.invalidate();
        if (b() == 0.0f) {
            this.c.k();
        }
    }
}
