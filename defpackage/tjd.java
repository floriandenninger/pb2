package defpackage;

import android.animation.Animator;
import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tjd extends tjc {
    protected final Animator a;
    public final Runnable b;
    public int d;
    private final tjg e = new tjg(this);
    public final int c = -1;

    private tjd(Animator animator, Runnable runnable) {
        this.a = animator;
        this.b = runnable;
    }

    public static void b(Animator animator, Runnable runnable) {
        animator.addListener(new tjd(animator, runnable));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            return;
        }
        tjh tjhVar = (tjh) tjh.a.get();
        final tjg tjgVar = this.e;
        Choreographer choreographer = tjhVar.b;
        if (tjgVar.a == null) {
            tjgVar.a = new Choreographer.FrameCallback() { // from class: tjf
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    tjg tjgVar2 = tjg.this;
                    tjd tjdVar = tjgVar2.b;
                    tjdVar.d++;
                    if (tjdVar.a(tjdVar.a) || tjgVar2.b.a.isStarted()) {
                        return;
                    }
                    tjd tjdVar2 = tjgVar2.b;
                    if (tjdVar2.c != -1 && tjdVar2.d >= 0) {
                        return;
                    }
                    Runnable runnable = tjdVar2.b;
                    if (runnable != null) {
                        runnable.run();
                    }
                    tjgVar2.b.a.start();
                }
            };
        }
        choreographer.postFrameCallback(tjgVar.a);
    }
}
