package com.google.android.apps.youtube.app.offline.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.youtube.app.common.widget.TintableImageView;
import com.google.android.libraries.youtube.common.ui.CircularImageView;
import com.google.android.youtube.R;
import defpackage.aii;
import defpackage.gl;
import defpackage.jwz;
import defpackage.jxa;
import defpackage.tjr;
import defpackage.wbs;
import defpackage.whu;
import defpackage.yjk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class OfflineArrowView extends jxa {
    public int a;
    public int b;
    public ColorStateList c;
    public int d;
    private CircularImageView p;
    private Drawable q;
    private int r;
    private int s;

    public OfflineArrowView(Context context) {
        super(context);
        this.d = 1;
        n(yjk.p(context, null, 0), null);
    }

    private final void m(int i, boolean z) {
        ColorStateList colorStateList;
        TintableImageView tintableImageView = this.f;
        ColorStateList colorStateList2 = this.c;
        if (tintableImageView == null) {
            return;
        }
        if (colorStateList2 != null) {
            tintableImageView.a(colorStateList2);
            return;
        }
        if (!z || (colorStateList = this.o) == null) {
            if (i == this.k) {
                tintableImageView.a(TintableImageView.a);
                return;
            } else if (i != this.l) {
                tintableImageView.a(null);
                return;
            } else {
                tintableImageView.a(ColorStateList.valueOf(wbs.Q(getContext(), R.attr.ytTextPrimary)));
                return;
            }
        }
        tintableImageView.a(colorStateList);
    }

    private final void n(Context context, AttributeSet attributeSet) {
        int color;
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jwz.a);
        this.k = obtainStyledAttributes.getResourceId(2, R.drawable.yt_outline_download_black_24);
        this.r = obtainStyledAttributes.getResourceId(8, R.drawable.ic_offline_start);
        this.s = obtainStyledAttributes.getResourceId(0, R.drawable.ic_offline_progress);
        this.l = obtainStyledAttributes.getResourceId(1, R.drawable.yt_fill_downloaded_black_24);
        this.a = obtainStyledAttributes.getResourceId(4, R.drawable.ic_offline_unavailable);
        this.b = obtainStyledAttributes.getResourceId(7, R.drawable.quantum_ic_pause_circle_filled_grey600_24);
        this.m = obtainStyledAttributes.getResourceId(5, R.drawable.ic_offline_error);
        this.c = obtainStyledAttributes.getColorStateList(6);
        this.o = obtainStyledAttributes.getColorStateList(3);
        obtainStyledAttributes.recycle();
        this.j = aii.a(context, R.drawable.offline_progress_bar);
        this.q = aii.a(context, R.drawable.offline_progress_bar_v2);
        ColorStateList colorStateList = this.c;
        if (colorStateList != null) {
            color = colorStateList.getDefaultColor();
            this.j = gl.c(this.j);
            this.j.setTintList(this.c);
        } else {
            color = resources.getColor(R.color.offline_progress_bar_color);
        }
        this.f = new TintableImageView(context);
        this.f.setScaleType(ImageView.ScaleType.CENTER);
        e();
        this.e = new ProgressBar(context, null, android.R.attr.progressBarStyleHorizontal);
        this.e.setProgressDrawable(this.j);
        this.e.setRotation(-90.0f);
        ProgressBar progressBar = new ProgressBar(context);
        this.g = progressBar;
        progressBar.setIndeterminateDrawable(new tjr(-1.0f, resources.getDimensionPixelSize(R.dimen.offline_progress_bar_thickness), resources.getDimensionPixelSize(R.dimen.offline_progress_bar_inset_radius), new int[]{color}));
        progressBar.setVisibility(8);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.offline_progress_bar_size);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17);
        CircularImageView circularImageView = new CircularImageView(context, null);
        this.p = circularImageView;
        circularImageView.setBackgroundColor(context.getResources().getColor(R.color.yt_black_pure_opacity80));
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.offline_overlay_size);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2, 17);
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        this.i = lottieAnimationView;
        lottieAnimationView.f(R.raw.ic_offline_arrow_lottie);
        lottieAnimationView.l(-1);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.offline_arrow_lottie_size);
        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(dimensionPixelSize3, dimensionPixelSize3, 17);
        addView(circularImageView, layoutParams2);
        addView(progressBar, layoutParams);
        addView(this.e, layoutParams);
        addView(lottieAnimationView, layoutParams3);
        addView(this.f, new FrameLayout.LayoutParams(-2, -2, 17));
    }

    private final void o() {
        CircularImageView circularImageView = this.p;
        if (circularImageView != null && circularImageView.getVisibility() == 0) {
            circularImageView.setVisibility(8);
        }
        j();
    }

    private final void p(int i, boolean z) {
        AnimationDrawable animationDrawable = this.h;
        TintableImageView tintableImageView = this.f;
        o();
        this.n = i;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
        m(i, z);
        if (tintableImageView != null) {
            tintableImageView.setImageResource(i);
        }
    }

    public final void a(ColorStateList colorStateList) {
        this.c = colorStateList;
        m(this.n, true);
    }

    public final void b(int i) {
        p(i, true);
    }

    public final void c(int i) {
        p(i, false);
    }

    public final void d() {
        b(this.l);
    }

    public final void e() {
        b(this.k);
    }

    public final void f() {
        if (this.d == 2) {
            c(R.drawable.ic_offline_partially_playable);
            whu.I(this.p, true);
        }
    }

    public final void g() {
        if (this.d == 2) {
            TintableImageView tintableImageView = this.f;
            LottieAnimationView lottieAnimationView = this.i;
            CircularImageView circularImageView = this.p;
            whu.I(tintableImageView, false);
            whu.I(lottieAnimationView, true);
            whu.I(circularImageView, true);
            if (lottieAnimationView == null || lottieAnimationView.o()) {
                return;
            }
            lottieAnimationView.e();
            return;
        }
        o();
        TintableImageView tintableImageView2 = this.f;
        AnimationDrawable animationDrawable = this.h;
        if (animationDrawable == null) {
            Drawable a = aii.a(getContext(), this.s);
            a.getClass();
            animationDrawable = (AnimationDrawable) a;
            this.h = animationDrawable;
        }
        m(this.s, false);
        if (tintableImageView2 != null) {
            tintableImageView2.setImageDrawable(animationDrawable);
        }
        this.n = this.s;
        if (animationDrawable.isRunning()) {
            return;
        }
        animationDrawable.start();
    }

    public final void h() {
        CircularImageView circularImageView = this.p;
        if (this.d == 2) {
            c(R.drawable.ic_offline_start_v2);
            whu.I(circularImageView, true);
        } else {
            c(this.r);
        }
    }

    @Override // defpackage.jxa
    public final void i(int i) {
        ProgressBar progressBar = this.e;
        ProgressBar progressBar2 = this.g;
        int i2 = this.d;
        if (progressBar != null) {
            if (i2 == 2) {
                progressBar.setProgressDrawable(this.q);
            } else {
                o();
                progressBar.setProgressDrawable(this.j);
            }
            whu.I(progressBar, true);
            whu.I(progressBar2, false);
            progressBar.setMax(100);
            progressBar.setProgress(i);
        }
    }

    public OfflineArrowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 1;
        n(yjk.p(context, attributeSet, 0), attributeSet);
    }

    public OfflineArrowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = 1;
        n(yjk.p(context, attributeSet, 0), attributeSet);
    }

    public OfflineArrowView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.d = 1;
        n(yjk.p(context, attributeSet, 0), attributeSet);
    }
}
