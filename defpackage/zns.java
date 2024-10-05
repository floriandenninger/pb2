package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zns extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ znv b;

    public zns(znv znvVar, boolean z) {
        this.b = znvVar;
        this.a = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            return;
        }
        this.b.as.setVisibility(4);
        this.b.ah.setVisibility(4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.a) {
            this.b.as.setVisibility(0);
            this.b.ah.setVisibility(0);
        }
    }
}
