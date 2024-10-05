package com.google.android.libraries.youtube.livechat.ui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.libraries.youtube.livechat.ui.view.VerticalShimmerLoadingFrameLayout;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import defpackage.abpu;
import defpackage.jw;
import defpackage.wbs;
import defpackage.whu;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class VerticalShimmerLoadingFrameLayout extends LoadingFrameLayout {
    private static final long f = TimeUnit.SECONDS.toMillis(1);
    public View a;
    public View b;
    private final ValueAnimator g;
    private final Context h;
    private final View i;

    public VerticalShimmerLoadingFrameLayout(Context context) {
        this(context, null);
    }

    private final void j() {
        d(true);
        if (getChildAt(getChildCount() - 1) != this.b) {
            bringChildToFront(this.i);
            bringChildToFront(this.a);
            bringChildToFront(this.b);
        }
        if (this.g.isStarted()) {
            return;
        }
        this.g.start();
    }

    private final void k() {
        this.g.end();
    }

    @Override // com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout
    public final void a() {
        if (this.a == null) {
            return;
        }
        k();
        super.a();
    }

    @Override // com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout
    public final void b(CharSequence charSequence, boolean z) {
        if (this.a == null) {
            return;
        }
        k();
        super.b(charSequence, z);
    }

    @Override // com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout
    public final void c() {
        if (this.a == null || !jw.aj(this)) {
            return;
        }
        j();
    }

    public final void d(boolean z) {
        whu.I(this.i, z);
        whu.I(this.a, z);
        whu.I(this.b, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a == null || this.e != 1) {
            return;
        }
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a == null) {
            return;
        }
        k();
    }

    public VerticalShimmerLoadingFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerticalShimmerLoadingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = context;
        View view = new View(context);
        this.i = view;
        view.setBackgroundColor(wbs.W(context, R.attr.liveChatShimmerLoadingFrameOverlayColor).orElse(0));
        addView(view, -1, -1);
        View view2 = new View(context);
        this.a = view2;
        view2.setBackgroundColor(wbs.W(context, R.attr.liveChatShimmerLoadingFrameBackgroundColor).orElse(0));
        addView(this.a, -1, -1);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{wbs.W(context, R.attr.liveChatShimmerLoadingFrameShimmerStartColor).orElse(0), wbs.W(context, R.attr.liveChatShimmerLoadingFrameShimmerMiddleColor).orElse(0), wbs.W(context, R.attr.liveChatShimmerLoadingFrameShimmerEndColor).orElse(0)});
        View view3 = new View(context);
        this.b = view3;
        view3.setBackground(gradientDrawable);
        addView(this.b, -1, -1);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        long millis = TimeUnit.SECONDS.toMillis(30L);
        long j = f;
        ofFloat.setRepeatCount((int) (millis / j));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(j);
        ofFloat.addListener(new abpu(this));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: abpt
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VerticalShimmerLoadingFrameLayout verticalShimmerLoadingFrameLayout = VerticalShimmerLoadingFrameLayout.this;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue < 0.5f) {
                    float height = verticalShimmerLoadingFrameLayout.a.getHeight();
                    float f2 = (-height) * (floatValue + floatValue);
                    verticalShimmerLoadingFrameLayout.a.setTranslationY(f2);
                    verticalShimmerLoadingFrameLayout.b.setTranslationY(height + f2);
                    return;
                }
                float f3 = floatValue - 0.5f;
                float height2 = verticalShimmerLoadingFrameLayout.a.getHeight();
                float f4 = (-height2) * (f3 + f3);
                verticalShimmerLoadingFrameLayout.b.setTranslationY(f4);
                verticalShimmerLoadingFrameLayout.a.setTranslationY(height2 + f4);
            }
        });
        this.g = ofFloat;
        c();
    }
}
