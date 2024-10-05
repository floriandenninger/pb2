package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.ahe;
import defpackage.aleq;
import defpackage.alfs;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class HideBottomViewOnScrollBehavior extends ahe {
    public ViewPropertyAnimator a;
    private int b;
    private int c;

    public HideBottomViewOnScrollBehavior() {
        this.b = 0;
        this.c = 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 2;
    }

    private final void v(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.a = view.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new alfs(this));
    }

    @Override // defpackage.ahe
    public final void d(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            if (this.c == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.a;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.c = 1;
            v(view, this.b, 175L, aleq.c);
            return;
        }
        if (i2 >= 0 || this.c == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.a;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.c = 2;
        v(view, 0, 225L, aleq.d);
    }

    @Override // defpackage.ahe
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.b = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        return false;
    }

    @Override // defpackage.ahe
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }
}
