package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fmn extends fms {
    public static final /* synthetic */ int g = 0;
    public final azrw a;
    public final int b;
    public final int c;
    public final long d = 1500;
    public final Runnable e = new fmm(this);
    final /* synthetic */ fmt f;

    public fmn(fmt fmtVar, azrw azrwVar, int i, int i2) {
        this.f = fmtVar;
        this.a = azrwVar;
        this.b = i;
        this.c = i2;
    }

    public final void a() {
        this.f.removeCallbacks(this.e);
        if (b() == 1.0f) {
            f();
        } else {
            d();
            this.f.postInvalidate();
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f.invalidate();
    }
}
