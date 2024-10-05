package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class fms implements ValueAnimator.AnimatorUpdateListener {
    private float a;
    protected final ValueAnimator h;

    /* JADX INFO: Access modifiers changed from: protected */
    public fms() {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        this.h = duration;
        duration.addUpdateListener(this);
        this.a = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float b() {
        return this.h.isRunning() ? ((Float) this.h.getAnimatedValue()).floatValue() : this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        this.h.reverse();
        this.a = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d() {
        this.h.start();
        this.a = 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(int i) {
        this.h.setDuration(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f() {
        this.h.cancel();
        this.a = 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g() {
        this.h.cancel();
        this.a = 0.0f;
    }
}
