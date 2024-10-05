package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fmk extends fms {
    final /* synthetic */ fmt a;

    public fmk(fmt fmtVar) {
        this.a = fmtVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.invalidate();
    }
}
