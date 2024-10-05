package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchContainerLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class odr extends AnimatorListenerAdapter {
    public final int a;
    public Animator b;
    public final /* synthetic */ NextGenWatchContainerLayout c;

    public odr(NextGenWatchContainerLayout nextGenWatchContainerLayout) {
        this.c = nextGenWatchContainerLayout;
        this.a = nextGenWatchContainerLayout.getResources().getInteger(R.integer.next_gen_watch_transition_animation_duration_ms);
    }

    public final void a() {
        this.b = null;
    }

    public final boolean b() {
        Animator animator = this.b;
        return animator != null && animator.isRunning();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        a();
        this.c.c();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a();
        this.c.c();
    }
}
