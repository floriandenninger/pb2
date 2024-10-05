package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aicd extends AnimatorListenerAdapter {
    final /* synthetic */ aice a;

    public aicd(aice aiceVar) {
        this.a = aiceVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        aice aiceVar = this.a;
        if (aiceVar.g.isAttachedToWindow() && aiceVar.f) {
            aiceVar.g.postDelayed(new aicc(aiceVar), aice.a.toMillis());
        }
    }
}
