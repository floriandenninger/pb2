package defpackage;

import android.animation.ObjectAnimator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rwb {
    public final rwa a;
    public final ObjectAnimator b;

    public rwb(rwa rwaVar) {
        this.a = rwaVar;
        this.b = ObjectAnimator.ofFloat(rwaVar, "animationPercent", 0.0f, 1.0f);
    }
}
