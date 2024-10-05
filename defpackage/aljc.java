package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aljc extends Drawable implements Animatable {
    private static final Property a = new aljb(Float.class);
    private ValueAnimator b;
    private ValueAnimator c;
    final Context d;
    final alip e;
    public List f;
    public boolean g;
    final Paint h = new Paint();
    public int i;
    private float j;

    public aljc(Context context, alip alipVar) {
        this.d = context;
        this.e = alipVar;
        setAlpha(PrivateKeyType.INVALID);
    }

    private final void a(ValueAnimator... valueAnimatorArr) {
        boolean z = this.g;
        this.g = true;
        valueAnimatorArr[0].end();
        this.g = z;
    }

    public boolean b(boolean z, boolean z2, boolean z3) {
        if (this.b == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<aljc, Float>) a, 0.0f, 1.0f);
            this.b = ofFloat;
            ofFloat.setDuration(500L);
            this.b.setInterpolator(aleq.b);
            ValueAnimator valueAnimator = this.b;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.b = valueAnimator;
            valueAnimator.addListener(new aliz(this));
        }
        if (this.c == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<aljc, Float>) a, 1.0f, 0.0f);
            this.c = ofFloat2;
            ofFloat2.setDuration(500L);
            this.c.setInterpolator(aleq.b);
            ValueAnimator valueAnimator2 = this.c;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.c = valueAnimator2;
            valueAnimator2.addListener(new alja(this));
        }
        if (!isVisible() && !z) {
            return false;
        }
        ValueAnimator valueAnimator3 = z ? this.b : this.c;
        if (!z3) {
            if (valueAnimator3.isRunning()) {
                valueAnimator3.end();
            } else {
                a(valueAnimator3);
            }
            return super.setVisible(z, false);
        }
        if (valueAnimator3.isRunning()) {
            return false;
        }
        boolean z4 = !z || super.setVisible(true, false);
        if (!(z ? this.e.c() : this.e.b())) {
            a(valueAnimator3);
            return z4;
        }
        if (z2 || !valueAnimator3.isPaused()) {
            valueAnimator3.start();
        } else {
            valueAnimator3.resume();
        }
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float c() {
        if (this.e.c() || this.e.b()) {
            return this.j;
        }
        return 1.0f;
    }

    public final void d(bxe bxeVar) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        if (this.f.contains(bxeVar)) {
            return;
        }
        this.f.add(bxeVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(float f) {
        if (this.j != f) {
            this.j = f;
            invalidateSelf();
        }
    }

    public final boolean f() {
        ValueAnimator valueAnimator = this.c;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public final boolean g() {
        ValueAnimator valueAnimator = this.b;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final boolean h(boolean z, boolean z2, boolean z3) {
        float n = alkd.n(this.d.getContentResolver());
        boolean z4 = false;
        if (z3 && n > 0.0f) {
            z4 = true;
        }
        return b(z, z2, z4);
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return g() || f();
    }

    public final void j() {
        h(false, false, false);
    }

    public final void k(bxe bxeVar) {
        List list = this.f;
        if (list == null || !list.contains(bxeVar)) {
            return;
        }
        this.f.remove(bxeVar);
        if (this.f.isEmpty()) {
            this.f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.i = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.h.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return h(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        b(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        b(false, true, false);
    }
}
