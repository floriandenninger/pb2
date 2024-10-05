package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bva extends Drawable implements Animatable {
    private static final Interpolator e = new LinearInterpolator();
    private static final Interpolator f = new anq();
    private static final int[] g = {-16777216};
    public final buz a;
    public final Resources b;
    float c;
    boolean d;
    private float h;
    private final Animator i;

    public bva(Context context) {
        gn.g(context);
        this.b = context.getResources();
        buz buzVar = new buz();
        this.a = buzVar;
        buzVar.c(g);
        buzVar.e(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new bux(this, buzVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(e);
        ofFloat.addListener(new buy(this, buzVar));
        this.i = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void e(float f2, buz buzVar) {
        if (f2 > 0.75f) {
            float f3 = (f2 - 0.75f) / 0.25f;
            int a = buzVar.a();
            int[] iArr = buzVar.i;
            buzVar.g();
            int i = iArr[0];
            buzVar.t = ((((a >> 24) & PrivateKeyType.INVALID) + ((int) ((((i >> 24) & PrivateKeyType.INVALID) - r2) * f3))) << 24) | ((((a >> 16) & PrivateKeyType.INVALID) + ((int) ((((i >> 16) & PrivateKeyType.INVALID) - r3) * f3))) << 16) | ((((a >> 8) & PrivateKeyType.INVALID) + ((int) ((((i >> 8) & PrivateKeyType.INVALID) - r4) * f3))) << 8) | ((a & PrivateKeyType.INVALID) + ((int) (f3 * ((i & PrivateKeyType.INVALID) - r0))));
            return;
        }
        buzVar.t = buzVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(float f2, buz buzVar, boolean z) {
        float interpolation;
        float f3;
        if (this.d) {
            e(f2, buzVar);
            double floor = Math.floor(buzVar.l / 0.8f);
            float f4 = buzVar.j;
            float f5 = buzVar.k;
            buzVar.e = f4 + ((((-0.01f) + f5) - f4) * f2);
            buzVar.f = f5;
            float f6 = buzVar.l;
            buzVar.g = f6 + ((((float) (floor + 1.0d)) - f6) * f2);
            return;
        }
        if (f2 != 1.0f || z) {
            float f7 = buzVar.l;
            if (f2 < 0.5f) {
                interpolation = buzVar.j;
                f3 = (f.getInterpolation(f2 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f8 = buzVar.j + 0.79f;
                interpolation = f8 - (((1.0f - f.getInterpolation(((-0.5f) + f2) / 0.5f)) * 0.79f) + 0.01f);
                f3 = f8;
            }
            float f9 = this.c;
            buzVar.e = interpolation;
            buzVar.f = f3;
            buzVar.g = f7 + (0.20999998f * f2);
            this.h = (f2 + f9) * 216.0f;
        }
    }

    public final void b(boolean z) {
        this.a.d(z);
        invalidateSelf();
    }

    public final void c(float f2) {
        buz buzVar = this.a;
        if (f2 != buzVar.o) {
            buzVar.o = f2;
        }
        invalidateSelf();
    }

    public final void d(float f2) {
        buz buzVar = this.a;
        buzVar.e = 0.0f;
        buzVar.f = f2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.h, bounds.exactCenterX(), bounds.exactCenterY());
        buz buzVar = this.a;
        RectF rectF = buzVar.a;
        float f2 = buzVar.p;
        float f3 = (buzVar.h / 2.0f) + f2;
        if (f2 <= 0.0f) {
            f3 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((buzVar.q * buzVar.o) / 2.0f, buzVar.h / 2.0f);
        }
        rectF.set(bounds.centerX() - f3, bounds.centerY() - f3, bounds.centerX() + f3, bounds.centerY() + f3);
        float f4 = buzVar.e;
        float f5 = buzVar.g;
        float f6 = (f4 + f5) * 360.0f;
        float f7 = ((buzVar.f + f5) * 360.0f) - f6;
        buzVar.b.setColor(buzVar.t);
        buzVar.b.setAlpha(buzVar.s);
        float f8 = buzVar.h / 2.0f;
        rectF.inset(f8, f8);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, buzVar.d);
        float f9 = -f8;
        rectF.inset(f9, f9);
        canvas.drawArc(rectF, f6, f7, false, buzVar.b);
        if (buzVar.m) {
            Path path = buzVar.n;
            if (path == null) {
                buzVar.n = new Path();
                buzVar.n.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height());
            int i = buzVar.q;
            float f10 = buzVar.o;
            buzVar.n.moveTo(0.0f, 0.0f);
            buzVar.n.lineTo(buzVar.q * buzVar.o, 0.0f);
            Path path2 = buzVar.n;
            int i2 = buzVar.q;
            float f11 = buzVar.o;
            path2.lineTo((i2 * f11) / 2.0f, buzVar.r * f11);
            buzVar.n.offset(((min / 2.0f) + rectF.centerX()) - ((i * f10) / 2.0f), rectF.centerY() + (buzVar.h / 2.0f));
            buzVar.n.close();
            buzVar.c.setColor(buzVar.t);
            buzVar.c.setAlpha(buzVar.s);
            canvas.save();
            canvas.rotate(f6 + f7, rectF.centerX(), rectF.centerY());
            canvas.drawPath(buzVar.n, buzVar.c);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.i.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.s = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.i.cancel();
        this.a.f();
        buz buzVar = this.a;
        if (buzVar.f != buzVar.e) {
            this.d = true;
            this.i.setDuration(666L);
            this.i.start();
        } else {
            buzVar.h();
            this.a.b();
            this.i.setDuration(1332L);
            this.i.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.i.cancel();
        this.h = 0.0f;
        this.a.d(false);
        this.a.h();
        this.a.b();
        invalidateSelf();
    }
}
