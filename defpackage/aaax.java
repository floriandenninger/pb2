package defpackage;

import android.animation.ValueAnimator;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaax {
    public final Handler a;
    public boolean b;
    public boolean c;
    public final Runnable d;
    public boolean e;
    public final ValueAnimator f;
    public final aaas g;

    public aaax(aaas aaasVar, Handler handler) {
        this.g = aaasVar;
        handler.getClass();
        this.a = handler;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        this.f = duration;
        duration.addUpdateListener(new aaav(aaasVar));
        this.d = new aaaw(this);
    }
}
