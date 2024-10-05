package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class tju extends Drawable implements Animatable {
    public final int a;
    public final AnimatorSet b;
    private final int d;
    private final int f;
    private final Paint h;
    private final ObjectAnimator i;
    private final ObjectAnimator j;
    private final float k;
    private final float l;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private final Rect s;
    private final int g = 2;
    private final int e = -1;
    private float m = 1.0f;
    public boolean c = isVisible();

    public tju(int i, int i2, float f) {
        this.a = i;
        this.f = i2;
        this.d = Math.round(f * 255.0f);
        Paint paint = new Paint();
        this.h = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "rect1ScaleX", 0.1f, 0.1f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(733L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "rect1ScaleX", 0.1f, 0.8268492f);
        ofFloat2.setInterpolator(jg.o(0.33473143f, 0.12481982f, 0.78584397f, 1.0f));
        ofFloat2.setDuration(650L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, "rect1ScaleX", 0.8268492f, 0.1f);
        ofFloat3.setInterpolator(jg.o(0.225732f, 0.0f, 0.35f, 1.05f));
        ofFloat3.setDuration(617L);
        animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, "rect1TranslationX", -522.6f, 199.6f);
        ofFloat4.setInterpolator(jg.o(0.34f, 0.0f, 0.78f, 1.0f));
        ofFloat4.setStartDelay(400L);
        ofFloat4.setDuration(1600L);
        animatorSet.play(ofFloat4);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this, "rect2ScaleX", 0.1f, 0.55f);
        ofFloat5.setInterpolator(jg.o(0.20502818f, 0.057050835f, 0.5f, 0.5f));
        ofFloat5.setDuration(352L);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this, "rect2ScaleX", 0.55f, 0.90995026f);
        ofFloat6.setInterpolator(jg.o(0.15f, 0.2f, 0.6483738f, 1.0043154f));
        ofFloat6.setDuration(532L);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this, "rect2ScaleX", 0.90995026f, 0.1f);
        ofFloat7.setInterpolator(jg.o(0.25775883f, -0.003163357f, 0.21176192f, 1.3817896f));
        ofFloat7.setDuration(1116L);
        animatorSet.playSequentially(ofFloat5, ofFloat6, ofFloat7);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this, "rect2TranslationX", -208.0f, 132.0f);
        ofFloat8.setInterpolator(jg.o(0.26f, 0.0f, 0.75f, 0.68f));
        ofFloat8.setDuration(964L);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this, "rect2TranslationX", 132.0f, 422.6f);
        ofFloat9.setInterpolator(jg.o(0.4f, 0.6270349f, 0.6f, 0.9020258f));
        ofFloat9.setDuration(1036L);
        animatorSet.playSequentially(ofFloat8, ofFloat9);
        animatorSet.addListener(new tjs());
        tjv.a();
        tjd.b(animatorSet, null);
        this.b = animatorSet;
        this.k = 1.0f;
        this.l = 1.0f;
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this, "growScale", 1.0f);
        ofFloat10.setInterpolator(tji.a);
        ofFloat10.setDuration(500L);
        this.i = ofFloat10;
        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(this, "growScale", 0.0f);
        ofFloat11.setInterpolator(tji.a);
        ofFloat11.setDuration(500L);
        ofFloat11.addListener(new tjt(this));
        this.j = ofFloat11;
        this.s = new Rect();
        a();
    }

    public final void a() {
        this.i.cancel();
        this.j.cancel();
        this.b.cancel();
        this.n = 0.1f;
        this.o = -522.6f;
        this.p = 0.1f;
        this.q = -197.6f;
        this.r = this.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.s)) {
            canvas.save();
            float height = this.s.height();
            float f = this.a;
            if (height > f) {
                canvas.translate(0.0f, (height - f) / 2.0f);
            }
            canvas.scale(this.s.width() / 360.0f, this.a / 4.0f);
            canvas.translate(180.0f, 2.0f);
            canvas.clipRect(-180.0f, -2.0f, 180.0f, 2.0f);
            if (this.r < 1.0f) {
                if (this.g == 0) {
                    canvas.scale(1.0f, -1.0f);
                }
                canvas.translate(0.0f, (this.r - 1.0f) * 4.0f * 0.5f);
                canvas.scale(1.0f, this.r);
            }
            if (this.e != -1) {
                this.h.setColor(0);
                this.h.setAlpha((int) (this.m * this.d));
            } else {
                this.h.setColor(this.f);
                this.h.setAlpha((int) (this.m * this.d));
            }
            canvas.drawRect(-180.0f, -2.0f, 180.0f, 2.0f, this.h);
            this.h.setColor(this.f);
            this.h.setAlpha((int) (this.m * 255.0f));
            canvas.save();
            canvas.translate(this.o, 0.0f);
            canvas.scale(this.n, 1.0f);
            canvas.drawRect(-144.0f, -2.0f, 144.0f, 2.0f, this.h);
            canvas.restore();
            canvas.save();
            canvas.translate(this.q, 0.0f);
            canvas.scale(this.p, 1.0f);
            canvas.drawRect(-144.0f, -2.0f, 144.0f, 2.0f, this.h);
            canvas.restore();
            canvas.restore();
        }
    }

    public float getGrowScale() {
        return this.r;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public float getRect1ScaleX() {
        return this.n;
    }

    public float getRect1TranslationX() {
        return this.o;
    }

    public float getRect2ScaleX() {
        return this.p;
    }

    public float getRect2TranslationX() {
        return this.q;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return isVisible();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.m = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.h.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setGrowScale(float f) {
        this.r = f;
        invalidateSelf();
    }

    public void setRect1ScaleX(float f) {
        this.n = f;
        invalidateSelf();
    }

    public void setRect1TranslationX(float f) {
        this.o = f;
        invalidateSelf();
    }

    public void setRect2ScaleX(float f) {
        this.p = f;
        invalidateSelf();
    }

    public void setRect2TranslationX(float f) {
        this.q = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.c;
        if (!z3 && !z2) {
            return false;
        }
        this.c = z;
        if (z) {
            super.setVisible(true, z2);
            if (z2) {
                a();
            }
            this.j.cancel();
            this.i.setFloatValues(this.k);
            this.i.start();
            if (!this.b.isStarted()) {
                this.b.start();
            }
        } else if (z3) {
            this.i.cancel();
            this.j.setFloatValues(this.l);
            this.j.start();
        }
        return z3;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        setVisible(true, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        setVisible(false, false);
    }
}
