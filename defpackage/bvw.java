package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bvw extends AnimatorListenerAdapter {
    private final View a;
    private boolean b = false;

    public bvw(View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        bwr.c(this.a, 1.0f);
        if (this.b) {
            this.a.setLayerType(0, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (jw.ah(this.a) && this.a.getLayerType() == 0) {
            this.b = true;
            this.a.setLayerType(2, null);
        }
    }
}
