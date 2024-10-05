package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gbc extends AnimatorListenerAdapter {
    final /* synthetic */ View a;

    public gbc(View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        KeyEvent.Callback callback = this.a;
        if (callback instanceof gbe) {
            ((gbe) callback).a();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
    }
}
