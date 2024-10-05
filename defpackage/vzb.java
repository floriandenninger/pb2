package defpackage;

import android.animation.ObjectAnimator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vzb {
    private final ObjectAnimator d;
    private boolean b = true;
    public float a = 1.0f;
    private float c = 1.0f;

    public vzb(vzd vzdVar) {
        this.d = ObjectAnimator.ofFloat(this, vzdVar.a, 1.0f).setDuration(150L);
    }

    public final float a() {
        return Math.min(this.a, this.c);
    }

    public final void b(float f) {
        float max = Math.max(Math.min(f, 1.0f), 0.0f);
        this.c = max;
        float floor = (float) Math.floor(max);
        boolean z = floor == 1.0f;
        if (this.d.isRunning() && z == this.b) {
            return;
        }
        this.d.setFloatValues(floor);
        this.d.start();
        this.b = z;
    }
}
