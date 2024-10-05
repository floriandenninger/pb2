package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fxt extends Drawable implements Drawable.Callback, Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
    private static final TimeInterpolator e;
    public final ValueAnimator a;
    public fxs b;
    public fxs c;
    public fxs d;
    private final HashSet f;

    static {
        new ColorDrawable(0);
        e = new fye();
    }

    public fxt(fxs fxsVar, int i) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[0]);
        this.a = ofInt;
        ofInt.setIntValues(PrivateKeyType.INVALID, 0);
        ofInt.setDuration(i);
        ofInt.setStartDelay(1L);
        ofInt.setInterpolator(e);
        ofInt.addUpdateListener(this);
        ofInt.addListener(this);
        this.f = new HashSet();
        yjk.f();
        if (ofInt.isStarted()) {
            ofInt.end();
        }
        i(null);
        h(fxsVar);
        e(null);
        c();
        c();
    }

    private final void h(fxs fxsVar) {
        fxsVar.getClass();
        this.b = fxsVar;
        fxsVar.a.setCallback(this);
        fxsVar.a.setBounds(getBounds());
        fxsVar.a.setAlpha(PrivateKeyType.INVALID);
    }

    private final void i(fxs fxsVar) {
        this.c = fxsVar;
        if (fxsVar != null) {
            fxsVar.a.setCallback(this);
            fxsVar.a.setBounds(getBounds());
            fxsVar.a.setAlpha(PrivateKeyType.INVALID);
        }
    }

    private final boolean j() {
        return (this.c == null || this.b == null || this.d != null) ? false : true;
    }

    private final boolean k() {
        return this.c == null && this.b != null && this.d == null;
    }

    private static final void l(fxr fxrVar) {
        if (fxrVar != null) {
            fxrVar.a();
        }
    }

    public final fxs a() {
        fxs fxsVar = this.d;
        return fxsVar != null ? fxsVar : this.b;
    }

    public final void b(fxr fxrVar) {
        this.f.add(fxrVar);
    }

    public final void c() {
        amkq.O(this.c == null, "previousDrawableHolder must be null in static state.");
        amkq.O(this.b != null, "currentDrawableHolder must not be null in static state.");
        amkq.O(this.d == null, "nextDrawableHolder must be null in static state.");
        amkq.N(k());
        boolean f = f();
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("All drawables must be unique. Previous ");
        sb.append(valueOf);
        sb.append(", current ");
        sb.append(valueOf2);
        sb.append(", next ");
        sb.append(valueOf3);
        amkq.O(f, sb.toString());
    }

    public final void d(fxs fxsVar, fxr fxrVar) {
        String.valueOf(String.valueOf(fxsVar)).length();
        if (k()) {
            l(fxrVar);
            e(null);
        } else if (g()) {
            this.a.cancel();
            l(fxrVar);
        } else {
            if (j()) {
                b(fxrVar);
                return;
            }
            throw new RuntimeException("In a bad state.");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.b.a.draw(canvas);
        fxs fxsVar = this.c;
        if (fxsVar != null) {
            fxsVar.a.draw(canvas);
        }
    }

    public final void e(fxs fxsVar) {
        this.d = fxsVar;
        if (fxsVar != null) {
            fxsVar.a.setCallback(this);
            fxsVar.a.setBounds(getBounds());
            fxsVar.a.setAlpha(PrivateKeyType.INVALID);
        }
    }

    public final boolean f() {
        fxs fxsVar = this.c;
        Drawable drawable = fxsVar != null ? fxsVar.a : null;
        fxs fxsVar2 = this.b;
        Drawable drawable2 = fxsVar2 != null ? fxsVar2.a : null;
        fxs fxsVar3 = this.d;
        Drawable drawable3 = fxsVar3 != null ? fxsVar3.a : null;
        if (drawable != null && drawable2 != null && drawable == drawable2) {
            return false;
        }
        if (drawable == null || drawable3 == null || drawable != drawable3) {
            return drawable2 == null || drawable3 == null || drawable2 != drawable3;
        }
        return false;
    }

    public final boolean g() {
        return (this.c != null || this.b == null || this.d == null) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return a().a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return a().a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRect(getBounds());
        outline.setAlpha(getAlpha() / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        h(this.c);
        i(null);
        e(null);
        c();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        i(null);
        e(null);
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            l((fxr) it.next());
        }
        this.f.clear();
        c();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        throw new UnsupportedOperationException("crossFadeAnimator should never repeat.");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        i(this.b);
        h(this.d);
        e(null);
        amkq.O(this.c != null, "previousDrawableHolder must not be null in static state.");
        amkq.O(this.b != null, "currentDrawableHolder must not be null in static state.");
        amkq.O(this.d == null, "nextDrawableHolder must be null in static state.");
        amkq.N(j());
        boolean f = f();
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("All drawables must be unique. Previous ");
        sb.append(valueOf);
        sb.append(", current ");
        sb.append(valueOf2);
        sb.append(", next ");
        sb.append(valueOf3);
        amkq.O(f, sb.toString());
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        fxs fxsVar = this.c;
        if (fxsVar != null) {
            fxsVar.a.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
            invalidateSelf();
        }
        fxs a = a();
        float animatedFraction = valueAnimator.getAnimatedFraction();
        fxs fxsVar2 = this.c;
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            fxr fxrVar = (fxr) it.next();
            if (fxrVar != null) {
                fxrVar.b(animatedFraction, fxsVar2, a);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.b.a.setBounds(rect);
        fxs fxsVar = this.c;
        if (fxsVar != null) {
            fxsVar.a.setBounds(rect);
        }
        fxs fxsVar2 = this.d;
        if (fxsVar2 != null) {
            fxsVar2.a.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        throw new UnsupportedOperationException("Set alpha on the inner drawables instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException("Set color filter on the inner drawables instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (!k() || !this.b.a.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
