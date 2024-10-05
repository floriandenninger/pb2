package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gfg extends AnimatorListenerAdapter {
    final /* synthetic */ gfi a;

    public gfg(gfi gfiVar) {
        this.a = gfiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Optional.ofNullable(this.a.d).ifPresent(gfd.f);
        this.a.d();
    }
}
