package com.google.android.libraries.youtube.rendering.ui.spec.motion;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.libraries.youtube.rendering.ui.spec.motion.TouchFeedbackDrawable;
import com.google.android.youtube.R;
import defpackage.akau;
import defpackage.akaw;
import defpackage.akax;
import defpackage.akaz;
import defpackage.akbb;
import defpackage.akbc;
import defpackage.wbs;
import defpackage.yjk;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class TouchFeedbackDrawable extends Drawable {
    public akbb a;
    private final Drawable b;
    private boolean c;
    private boolean d;
    private boolean e;
    private akau f;

    public TouchFeedbackDrawable() {
        this(null);
        b();
    }

    public /* synthetic */ TouchFeedbackDrawable(int i, int i2, int i3, Drawable drawable, akbc akbcVar) {
        this(i, i2, i3, drawable);
    }

    public static int a(Resources resources, Resources.Theme theme) {
        return wbs.X(resources, theme, R.attr.ytTouchResponse).orElse(0);
    }

    private final void b() {
        this.f = new akau((byte[]) null);
        this.e = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        akbb akbbVar = this.a;
        int a = a(theme.getResources(), theme);
        akbbVar.a.setColor(a);
        akbbVar.b.setColor(a);
        akbbVar.setAlpha(0);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        this.a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        int color;
        if (theme != null) {
            obtainAttributes = theme.obtainStyledAttributes(attributeSet, akax.a, 0, 0);
        } else {
            obtainAttributes = resources.obtainAttributes(attributeSet, akax.a);
        }
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        boolean hasValue = obtainAttributes.hasValue(0);
        this.d = !hasValue;
        if (hasValue || theme == null) {
            color = obtainAttributes.getColor(0, 0);
        } else {
            color = a(resources, theme);
        }
        int K = yjk.K(resources.getDisplayMetrics(), 1);
        int dimensionPixelSize = obtainAttributes.getDimensionPixelSize(1, 0);
        if (obtainAttributes.getInt(2, 0) == 1) {
            this.a = new akbb(color, K, -1);
        } else {
            this.a = new akbb(color, K, dimensionPixelSize);
        }
        obtainAttributes.recycle();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        Drawable drawable = this.b;
        final int i = 1;
        final int i2 = 0;
        if (drawable != null && drawable.isStateful()) {
            onStateChange = onStateChange || this.b.setState(iArr);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i3 : iArr) {
            if (i3 == 16842910) {
                z = true;
            } else if (i3 == 16842919) {
                z2 = true;
            }
        }
        boolean z3 = z && z2;
        if (this.e != z3) {
            this.e = z3;
            final int i4 = 2;
            if (!z3) {
                ValueAnimator ofInt = ValueAnimator.ofInt(26, 0);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: akay
                    public final /* synthetic */ TouchFeedbackDrawable a;

                    {
                        this.a = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i5 = i2;
                        if (i5 == 0) {
                            this.a.a.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
                            return;
                        }
                        if (i5 == 1) {
                            TouchFeedbackDrawable touchFeedbackDrawable = this.a;
                            touchFeedbackDrawable.a.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
                            touchFeedbackDrawable.invalidateSelf();
                        } else {
                            TouchFeedbackDrawable touchFeedbackDrawable2 = this.a;
                            touchFeedbackDrawable2.a.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
                            touchFeedbackDrawable2.invalidateSelf();
                        }
                    }
                });
                ofInt.setInterpolator(akaw.a);
                ofInt.setDuration(400L);
                ValueAnimator ofInt2 = ValueAnimator.ofInt(26, 0);
                ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: akay
                    public final /* synthetic */ TouchFeedbackDrawable a;

                    {
                        this.a = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i5 = i4;
                        if (i5 == 0) {
                            this.a.a.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
                            return;
                        }
                        if (i5 == 1) {
                            TouchFeedbackDrawable touchFeedbackDrawable = this.a;
                            touchFeedbackDrawable.a.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
                            touchFeedbackDrawable.invalidateSelf();
                        } else {
                            TouchFeedbackDrawable touchFeedbackDrawable2 = this.a;
                            touchFeedbackDrawable2.a.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
                            touchFeedbackDrawable2.invalidateSelf();
                        }
                    }
                });
                ofInt2.setInterpolator(akaw.b);
                ofInt2.setDuration(400L);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofInt, ofInt2);
                this.f.b(animatorSet);
            } else {
                ValueAnimator ofInt3 = ValueAnimator.ofInt(0, 26);
                ofInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: akay
                    public final /* synthetic */ TouchFeedbackDrawable a;

                    {
                        this.a = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i5 = i;
                        if (i5 == 0) {
                            this.a.a.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
                            return;
                        }
                        if (i5 == 1) {
                            TouchFeedbackDrawable touchFeedbackDrawable = this.a;
                            touchFeedbackDrawable.a.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
                            touchFeedbackDrawable.invalidateSelf();
                        } else {
                            TouchFeedbackDrawable touchFeedbackDrawable2 = this.a;
                            touchFeedbackDrawable2.a.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
                            touchFeedbackDrawable2.invalidateSelf();
                        }
                    }
                });
                ofInt3.setInterpolator(akaw.a);
                ofInt3.setDuration(100L);
                ofInt3.addListener(new akaz(this));
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.play(ofInt3);
                this.f.a(animatorSet2);
            }
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setBounds(i, i2, i3, i4);
        }
        this.a.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    private TouchFeedbackDrawable(int i, int i2, int i3, Drawable drawable) {
        this(drawable);
        this.a = new akbb(i, i2, i3);
        this.c = i3 == -2;
        b();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        this.a.setBounds(rect);
    }

    private TouchFeedbackDrawable(Drawable drawable) {
        this.b = drawable;
        if (drawable != null) {
            drawable.setCallback(getCallback());
        }
    }
}
