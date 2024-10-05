package com.google.android.apps.youtube.app.offline.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.youtube.app.common.widget.TintableImageView;
import com.google.android.youtube.R;
import defpackage.aii;
import defpackage.cge;
import defpackage.cig;
import defpackage.clw;
import defpackage.jwz;
import defpackage.jxa;
import defpackage.tjr;
import defpackage.wbs;
import defpackage.whu;
import defpackage.yjk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class UploadArrowView extends jxa {
    public UploadArrowView(Context context) {
        super(context);
        b(yjk.p(context, null, 0), null);
    }

    private final void b(Context context, AttributeSet attributeSet) {
        int i;
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jwz.b);
        this.k = R.drawable.yt_outline_upload_black_24;
        int i2 = obtainStyledAttributes.getInt(0, 0);
        if (i2 == 0) {
            i = R.drawable.yt_fill_downloaded_black_24;
        } else {
            if (i2 != 1) {
                StringBuilder sb = new StringBuilder(55);
                sb.append("Unsupported UploadArrowView completedStyle: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
            i = R.drawable.yt_outline_check_circle_black_24;
        }
        this.l = i;
        this.m = R.drawable.quantum_gm_ic_error_outline_black_24;
        obtainStyledAttributes.recycle();
        this.o = ColorStateList.valueOf(wbs.Q(getContext(), R.attr.ytBrandIconInactive));
        TintableImageView tintableImageView = new TintableImageView(context);
        this.f = tintableImageView;
        tintableImageView.setScaleType(ImageView.ScaleType.CENTER);
        tintableImageView.a(this.o);
        a(this.k);
        final int Q = wbs.Q(getContext(), R.attr.ytCallToAction);
        Drawable a = aii.a(context, R.drawable.offline_progress_bar_v2);
        this.j = a;
        this.e = new ProgressBar(context, null, android.R.attr.progressBarStyleHorizontal);
        this.e.setProgressDrawable(a);
        this.e.setRotation(-90.0f);
        this.e.setProgressTintList(ColorStateList.valueOf(Q));
        this.e.setVisibility(8);
        ProgressBar progressBar = new ProgressBar(context);
        this.g = progressBar;
        progressBar.setIndeterminateDrawable(new tjr(-1.0f, resources.getDimensionPixelSize(R.dimen.offline_progress_bar_thickness), resources.getDimensionPixelSize(R.dimen.offline_progress_bar_inset_radius), new int[]{Q}));
        progressBar.setVisibility(8);
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        this.i = lottieAnimationView;
        lottieAnimationView.f(R.raw.ic_offline_arrow_lottie);
        lottieAnimationView.l(-1);
        lottieAnimationView.setRotationX(180.0f);
        lottieAnimationView.b(new cig("**"), cge.E, new clw() { // from class: jxm
            @Override // defpackage.clw
            public final Object a() {
                return new PorterDuffColorFilter(Q, PorterDuff.Mode.SRC_ATOP);
            }
        });
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.offline_arrow_lottie_size);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.offline_progress_bar_size);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2, 17);
        addView(progressBar, layoutParams2);
        addView(this.e, layoutParams2);
        addView(lottieAnimationView, layoutParams);
        addView(tintableImageView, new FrameLayout.LayoutParams(-2, -2, 17));
    }

    public final void a(int i) {
        j();
        this.n = i;
        AnimationDrawable animationDrawable = this.h;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
        TintableImageView tintableImageView = this.f;
        if (tintableImageView != null) {
            tintableImageView.setImageResource(i);
            tintableImageView.a(this.o);
        }
    }

    @Override // defpackage.jxa
    public final void i(int i) {
        ProgressBar progressBar = this.e;
        if (progressBar != null) {
            progressBar.setProgressDrawable(this.j);
            whu.I(progressBar, true);
            whu.I(this.g, false);
            progressBar.setMax(100);
            progressBar.setProgress(i);
        }
    }

    public UploadArrowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(yjk.p(context, attributeSet, 0), attributeSet);
    }

    public UploadArrowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(yjk.p(context, attributeSet, 0), attributeSet);
    }

    public UploadArrowView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b(yjk.p(context, attributeSet, 0), attributeSet);
    }
}
