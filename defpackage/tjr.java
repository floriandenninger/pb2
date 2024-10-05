package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tjr extends Drawable implements Animatable {
    private static final LinearInterpolator i = new LinearInterpolator();
    public final AnimatorSet a;
    public final ValueAnimator b;
    public float c;
    public float d;
    public int e;
    public final int[] f;
    public int g;
    private final ValueAnimator l;
    private final ValueAnimator m;
    private final ValueAnimator n;
    private final ValueAnimator o;
    private final ValueAnimator p;
    private final ArrayList q;
    private float r;
    private float s;
    private float t;
    private final Paint u;
    private int v;
    private final int w;
    private final float x;
    private long y;
    private long z;
    private final RectF j = new RectF();
    private final Rect k = new Rect();
    public boolean h = false;

    public tjr(float f, int i2, int i3, int[] iArr) {
        this.g = i2;
        this.x = f;
        this.w = i3;
        this.f = iArr;
        ArrayList arrayList = new ArrayList();
        this.q = arrayList;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "detentFraction", 0.0f, 1.0f);
        ofFloat.setDuration(1332L);
        LinearInterpolator linearInterpolator = i;
        ofFloat.setInterpolator(linearInterpolator);
        this.l = ofFloat;
        arrayList.add(ofFloat);
        e();
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "currentColor", iArr[0], iArr[0]);
        ofInt.setEvaluator(aheu.a);
        ofInt.setStartDelay(999L);
        ofInt.setDuration(333L);
        ofInt.setInterpolator(linearInterpolator);
        this.e = iArr[0];
        this.b = ofInt;
        arrayList.add(ofInt);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "headFraction", 0.0f, 1.0f);
        ofFloat2.setDuration(666L);
        ofFloat2.setInterpolator(tji.a);
        this.m = ofFloat2;
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, "tailFraction", 0.0f, 1.0f);
        ofFloat3.setStartDelay(666L);
        ofFloat3.setDuration(666L);
        ofFloat3.setInterpolator(tji.a);
        this.n = ofFloat3;
        arrayList.add(ofFloat3);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, "alphaFraction", 0.0f, 1.0f);
        ofFloat4.addListener(new tjp(this));
        ofFloat4.setDuration(750L);
        ofFloat4.setInterpolator(linearInterpolator);
        this.o = ofFloat4;
        arrayList.add(ofFloat4);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this, "alphaFraction", 1.0f, 0.0f);
        ofFloat5.addListener(new tjq(this));
        ofFloat5.setDuration(750L);
        ofFloat5.setInterpolator(linearInterpolator);
        this.p = ofFloat5;
        arrayList.add(ofFloat5);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofInt);
        tjv.a();
        tjd.b(animatorSet, new Runnable() { // from class: tjo
            @Override // java.lang.Runnable
            public final void run() {
                tjr tjrVar = tjr.this;
                tjrVar.b();
                tjrVar.d = 0.0f;
                tjrVar.c = (tjrVar.c + 216.0f) % 360.0f;
                tjrVar.e();
                int[] iArr2 = tjrVar.f;
                int i4 = iArr2[0];
                tjrVar.e = i4;
                ValueAnimator valueAnimator = tjrVar.b;
                tjrVar.e();
                valueAnimator.setIntValues(i4, iArr2[0]);
            }
        });
        this.a = animatorSet;
        Paint paint = new Paint();
        this.u = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        this.v = PrivateKeyType.INVALID;
        setVisible(false, false);
        a();
    }

    public final void a() {
        super.setVisible(this.h, false);
        if (this.a.isStarted()) {
            this.a.cancel();
        }
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = (Animator) arrayList.get(i2);
            if (animator.isStarted()) {
                animator.cancel();
            }
        }
        b();
        this.s = 0.0f;
        this.d = 0.0f;
        this.r = 0.0f;
        this.c = 0.0f;
        int[] iArr = this.f;
        int i3 = iArr[0];
        this.e = i3;
        ValueAnimator valueAnimator = this.b;
        e();
        valueAnimator.setIntValues(i3, iArr[0]);
        this.t = 0.0f;
        invalidateSelf();
    }

    public final void b() {
        this.b.setStartDelay(999L);
        this.n.setStartDelay(666L);
    }

    public final void c(boolean z) {
        setVisible(z, true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect;
        if (getBounds().isEmpty()) {
            return;
        }
        if (isVisible() || this.p.isRunning()) {
            if (this.x != -1.0f) {
                Rect bounds = getBounds();
                int centerX = bounds.centerX();
                int centerY = bounds.centerY();
                this.k.left = centerX - (getIntrinsicWidth() / 2);
                this.k.right = centerX + (getIntrinsicWidth() / 2);
                this.k.top = centerY - (getIntrinsicHeight() / 2);
                this.k.bottom = centerY + (getIntrinsicHeight() / 2);
                rect = this.k;
            } else {
                rect = getBounds();
            }
            int i2 = this.g;
            float f = this.t;
            float f2 = i2 * f;
            int i3 = this.v;
            float f3 = (this.w + i2) - (f2 / 2.0f);
            this.u.setColor(this.e);
            this.u.setAlpha((int) (i3 * f));
            this.u.setStrokeWidth(f2);
            this.j.set(rect);
            this.j.inset(f3, f3);
            float width = this.j.width();
            float abs = Math.abs((this.s * 290.0f) - (this.d * 290.0f));
            double d = (width / 2.0f) - f2;
            Double.isNaN(d);
            double d2 = f2 * 180.0f;
            Double.isNaN(d2);
            float max = Math.max(abs, (float) ((d * 3.141592653589793d) / d2));
            float f4 = this.r;
            canvas.drawArc(this.j, (r1 + (this.c + (f4 * 286.0f))) - 90.0f, max, false, this.u);
        }
    }

    public final void e() {
        int length = this.f.length;
    }

    public float getAlphaFraction() {
        return this.t;
    }

    public int getCurrentColor() {
        return this.e;
    }

    public float getDetentFraction() {
        return this.r;
    }

    public float getHeadFraction() {
        return this.s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        float f = this.x;
        return f != -1.0f ? (int) (f + f) : super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.x;
        return f != -1.0f ? (int) (f + f) : super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public float getTailFraction() {
        return this.d;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.a.isRunning() || this.o.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        if (i2 != this.v) {
            this.v = i2;
            invalidateSelf();
        }
    }

    public void setAlphaFraction(float f) {
        this.t = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.u.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setCurrentColor(int i2) {
        this.e = i2;
        invalidateSelf();
    }

    public void setDetentFraction(float f) {
        this.r = f;
        invalidateSelf();
    }

    public void setHeadFraction(float f) {
        this.s = f;
        invalidateSelf();
    }

    public void setTailFraction(float f) {
        this.d = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.h;
        if (!z3 && !z2) {
            return false;
        }
        this.h = z;
        if (z) {
            super.setVisible(true, z2);
            if (this.p.isRunning()) {
                this.o.setCurrentPlayTime(750 - this.p.getCurrentPlayTime());
                this.p.cancel();
            }
            if (z2) {
                a();
                this.o.setStartDelay(0L);
                this.o.start();
                this.y = 0L;
            } else {
                long max = Math.max(0L, this.y - (SystemClock.elapsedRealtime() - this.z));
                this.y = max;
                this.o.setStartDelay(max);
                this.o.start();
            }
            this.z = SystemClock.elapsedRealtime();
        } else if (z3) {
            if (this.o.isRunning()) {
                this.p.setCurrentPlayTime(750 - this.o.getCurrentPlayTime());
                this.o.cancel();
            }
            this.p.start();
        } else {
            a();
        }
        return z3;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        c(true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        c(false);
    }
}
