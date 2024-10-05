package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uia extends AnimatorListenerAdapter {
    final /* synthetic */ ExpressSignInLayout a;

    public uia(ExpressSignInLayout expressSignInLayout) {
        this.a = expressSignInLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.m.setVisibility(4);
        this.a.l.setVisibility(4);
        this.a.q = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.n.setVisibility(0);
    }
}
