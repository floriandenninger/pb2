package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hac extends AnimatorListenerAdapter {
    final /* synthetic */ TextView a;
    final /* synthetic */ int b;

    public hac(TextView textView, int i) {
        this.a = textView;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
        this.a.setAlpha(1.0f);
        fhe.Q(this.a, this.b);
    }
}
