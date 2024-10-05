package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.google.android.apps.youtube.app.red.presenter.NavigationDropdownView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kzw extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ NavigationDropdownView a;

    public kzw(NavigationDropdownView navigationDropdownView) {
        this.a = navigationDropdownView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        NavigationDropdownView navigationDropdownView = this.a;
        if (navigationDropdownView.i == animator) {
            if (navigationDropdownView.a) {
                navigationDropdownView.a = false;
                navigationDropdownView.b = 0.0f;
                navigationDropdownView.requestLayout();
            }
            this.a.i = null;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        NavigationDropdownView navigationDropdownView = this.a;
        if (navigationDropdownView.i == animator) {
            navigationDropdownView.a(0.0f);
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.a.i == valueAnimator) {
            this.a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }
}
