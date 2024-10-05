package com.google.android.apps.youtube.app.extensions.reel.edit.fragment;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.youtube.R;
import defpackage.anr;
import defpackage.hwu;
import defpackage.hww;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ShortsRecordButtonView extends FrameLayout {
    final FrameLayout a;
    public Animator b;
    public final int c;
    final int d;
    public final int e;
    public final int f;
    public final ImageView g;
    public final ImageView h;
    final GradientDrawable i;
    public final GradientDrawable j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;

    public ShortsRecordButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.shorts_record_button_view_layout, (ViewGroup) this, true);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.shorts_record_button_touch_area);
        this.a = frameLayout;
        frameLayout.setAccessibilityDelegate(new hwu());
        c();
        ImageView imageView = (ImageView) findViewById(R.id.shorts_record_button_inner_circle);
        this.g = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.shorts_record_button_outer_ring);
        this.h = imageView2;
        this.i = (GradientDrawable) imageView2.getDrawable();
        this.j = (GradientDrawable) imageView.getDrawable();
        this.c = getResources().getDimensionPixelSize(R.dimen.shorts_record_button_outer_ring_stroke_width);
        this.k = getResources().getColor(R.color.shorts_record_button_default_outer_ring_color);
        this.l = getResources().getColor(R.color.shorts_record_button_pulsing_outer_ring_color);
        this.d = getResources().getDimensionPixelSize(R.dimen.shorts_record_button_inner_circle_corner_radius_for_square);
        this.e = getResources().getDimensionPixelSize(R.dimen.shorts_record_button_inner_circle_corner_radius_for_circle);
        this.f = getResources().getDimensionPixelOffset(R.dimen.shorts_record_button_pulse_breakaway_threshold);
    }

    public static void a(View view, float f, float f2) {
        view.animate().translationX(f).translationY(f2).setDuration(50L).start();
    }

    private final void g() {
        a(this.g, 0.0f, 0.0f);
        a(this.h, 0.0f, 0.0f);
        this.p = false;
    }

    public final void b() {
        if (this.o) {
            Animator animator = this.b;
            if (animator != null && animator.isRunning()) {
                this.b.cancel();
            }
            if (!this.n) {
                AnimatorSet animatorSet = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.h, "scaleX", 1.8472222f);
                ofFloat.setDuration(500L);
                ofFloat.setInterpolator(new anr());
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.h, "scaleY", 1.8472222f);
                ofFloat2.setDuration(500L);
                ofFloat2.setInterpolator(new anr());
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.g, "scaleX", 1.0f);
                ofFloat3.setDuration(200L);
                ofFloat3.setInterpolator(new anr());
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.g, "scaleY", 1.0f);
                ofFloat4.setDuration(200L);
                ofFloat4.setInterpolator(new anr());
                int i = this.l;
                ofFloat2.addUpdateListener(new hww(this, i, i));
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.h, "scaleX", 1.8472222f, 1.5277778f);
                ofFloat5.setDuration(1000L);
                ofFloat5.setRepeatCount(-1);
                ofFloat5.setRepeatMode(2);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.h, "scaleY", 1.8472222f, 1.5277778f);
                ofFloat6.setDuration(1000L);
                ofFloat6.setRepeatCount(-1);
                ofFloat6.setRepeatMode(2);
                int i2 = this.l;
                ofFloat6.addUpdateListener(new hww(this, i2, i2));
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(ofFloat5, ofFloat6);
                animatorSet.playSequentially(animatorSet2, animatorSet3);
                this.b = animatorSet;
                animatorSet.start();
                return;
            }
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.h, "scaleX", 1.2222222f);
            ofFloat7.setDuration(100L);
            ofFloat7.setInterpolator(new anr());
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.h, "scaleY", 1.2222222f);
            ofFloat8.setDuration(100L);
            ofFloat8.setInterpolator(new anr());
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.g, "scaleX", 0.5714286f);
            ofFloat9.setDuration(100L);
            ofFloat9.setInterpolator(new anr());
            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.g, "scaleY", 0.5714286f);
            ofFloat10.setDuration(100L);
            ofFloat10.setInterpolator(new anr());
            ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(this.j, "cornerRadius", this.d);
            ofFloat11.setDuration(100L);
            ofFloat11.setInterpolator(new anr());
            int i3 = this.l;
            ofFloat8.addUpdateListener(new hww(this, i3, i3));
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(ofFloat7, ofFloat8, ofFloat9, ofFloat10, ofFloat11);
            this.b = animatorSet4;
            animatorSet4.start();
        }
    }

    public final void c() {
        setContentDescription(getResources().getString(R.string.shorts_a11y_record_button));
    }

    public final void d(int i, int i2) {
        this.i.setStroke(i, i2);
    }

    public final void e() {
        this.n = true;
        g();
        b();
    }

    public final void f() {
        if (this.m) {
            return;
        }
        this.m = true;
        this.o = false;
        Animator animator = this.b;
        if (animator != null && animator.isRunning()) {
            this.b.cancel();
        }
        if (!this.n) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.h, "scaleX", 1.0f);
            ofFloat.setDuration(200L);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.h, "scaleY", 1.0f);
            ofFloat2.setDuration(200L);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.g, "scaleX", 1.0f);
            ofFloat3.setDuration(200L);
            ofFloat3.setInterpolator(new anr());
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.g, "scaleY", 1.0f);
            ofFloat4.setDuration(200L);
            ofFloat4.setInterpolator(new anr());
            ofFloat2.addUpdateListener(new hww(this, this.l, this.k));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
            this.b = animatorSet;
            animatorSet.start();
        } else {
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.h, "scaleX", 1.0f);
            ofFloat5.setDuration(200L);
            ofFloat5.setInterpolator(new anr());
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.h, "scaleY", 1.0f);
            ofFloat6.setDuration(200L);
            ofFloat6.setInterpolator(new anr());
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.g, "scaleX", 1.0f);
            ofFloat7.setDuration(200L);
            ofFloat7.setInterpolator(new anr());
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.g, "scaleY", 1.0f);
            ofFloat8.setDuration(200L);
            ofFloat8.setInterpolator(new anr());
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.j, "cornerRadius", this.e);
            ofFloat9.setDuration(200L);
            ofFloat9.setInterpolator(new anr());
            ofFloat6.addUpdateListener(new hww(this, this.l, this.k));
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9);
            this.b = animatorSet2;
            animatorSet2.start();
        }
        g();
    }

    @Override // android.view.View
    public final void setContentDescription(CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.a.setOnTouchListener(onTouchListener);
    }
}
