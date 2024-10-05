package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aboq implements Animation.AnimationListener {
    public final View a;
    public final View b;
    public final int d;
    public final int e;
    public boolean g;
    public aboo h;
    public final Handler c = new Handler();
    public final Runnable f = new Runnable() { // from class: abop
        @Override // java.lang.Runnable
        public final void run() {
            aboq aboqVar = aboq.this;
            if (aboqVar.g) {
                aboqVar.g = false;
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setInterpolator(new AccelerateInterpolator());
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(aboqVar);
                aboqVar.a.startAnimation(alphaAnimation);
            }
        }
    };

    public aboq(ViewGroup viewGroup, View view, int i, int i2) {
        this.a = view;
        this.b = viewGroup;
        this.e = i;
        this.d = i2;
        viewGroup.removeAllViews();
        viewGroup.setTranslationY(0.0f);
        viewGroup.addView(view);
        viewGroup.setVisibility(8);
        this.g = false;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        abor aborVar;
        aboq aboqVar;
        this.a.setVisibility(8);
        aboo abooVar = this.h;
        if (abooVar == null || (aboqVar = (aborVar = abooVar.a).a) == null || this != aboqVar) {
            return;
        }
        aborVar.h();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
