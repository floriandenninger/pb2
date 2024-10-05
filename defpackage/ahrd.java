package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahrd extends aivc {
    public ahrb a;
    public final Animation b;
    public final Animation c;
    public final Animation.AnimationListener d;
    public final ColorDrawable e;
    private final ValueAnimator f;
    private boolean g;
    private final long h;

    public ahrd(Context context) {
        super(context);
        this.e = new ColorDrawable(Color.argb(140, 0, 0, 0));
        this.g = false;
        long integer = context.getResources().getInteger(R.integer.config_shortAnimTime);
        this.h = integer;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.b = alphaAnimation;
        alphaAnimation.setDuration(integer);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        this.c = alphaAnimation2;
        alphaAnimation2.setDuration(integer);
        ahrc ahrcVar = new ahrc(this, 0);
        this.d = ahrcVar;
        alphaAnimation2.setAnimationListener(ahrcVar);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f = valueAnimator;
        valueAnimator.setDuration(integer);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(new ahra(this));
        jw.av(this);
        d();
    }

    public static void a(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.clearAnimation();
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt);
            }
        }
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new aivh(-1, -1, false);
    }

    public final void d() {
        removeAllViews();
        setVisibility(8);
    }

    public final void e(boolean z) {
        if (this.g == z) {
            return;
        }
        this.g = z;
        jw.V(this, true != z ? 0 : 4);
        if (z) {
            this.f.start();
            setForeground(this.e);
        } else {
            clearAnimation();
            animate().alpha(1.0f).setDuration(this.h).start();
            setForeground(null);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.g;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ahrb ahrbVar;
        if (super.onTouchEvent(motionEvent) || (ahrbVar = this.a) == null) {
            return false;
        }
        ahrbVar.i(motionEvent);
        return false;
    }
}
