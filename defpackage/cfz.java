package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cfz extends Drawable implements Drawable.Callback, Animatable {
    public cfj a;
    public final clm b;
    public float c;
    public boolean d;
    public boolean e;
    public final ArrayList f;
    public cib g;
    public String h;
    public cia i;
    public boolean j;
    public cjq k;
    public boolean l;
    private final Matrix m = new Matrix();
    private final ValueAnimator.AnimatorUpdateListener n;
    private int o;
    private boolean p;

    public cfz() {
        clm clmVar = new clm();
        this.b = clmVar;
        this.c = 1.0f;
        this.d = true;
        this.e = false;
        this.f = new ArrayList();
        cfw cfwVar = new cfw(this);
        this.n = cfwVar;
        this.o = PrivateKeyType.INVALID;
        this.l = true;
        this.p = false;
        clmVar.addUpdateListener(cfwVar);
    }

    private final boolean t() {
        return this.d || this.e;
    }

    private static final float u(Rect rect) {
        return rect.width() / rect.height();
    }

    public final float a() {
        return this.b.d();
    }

    public final float b() {
        return this.b.e();
    }

    public final float c() {
        return this.b.c();
    }

    public final float d() {
        return this.b.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        float f2;
        this.p = false;
        cfj cfjVar = this.a;
        int i = -1;
        if (cfjVar == null || getBounds().isEmpty() || u(getBounds()) == u(cfjVar.g)) {
            if (this.k != null) {
                float f3 = this.c;
                float min = Math.min(canvas.getWidth() / this.a.g.width(), canvas.getHeight() / this.a.g.height());
                if (f3 > min) {
                    f = this.c / min;
                } else {
                    min = f3;
                    f = 1.0f;
                }
                if (f > 1.0f) {
                    i = canvas.save();
                    float width = this.a.g.width() / 2.0f;
                    float height = this.a.g.height() / 2.0f;
                    float f4 = width * min;
                    float f5 = height * min;
                    float f6 = this.c;
                    canvas.translate((width * f6) - f4, (f6 * height) - f5);
                    canvas.scale(f, f, f4, f5);
                }
                this.m.reset();
                this.m.preScale(min, min);
                this.k.b(canvas, this.m, this.o);
                if (i > 0) {
                    canvas.restoreToCount(i);
                }
            }
        } else if (this.k != null) {
            Rect bounds = getBounds();
            float width2 = bounds.width() / this.a.g.width();
            float height2 = bounds.height() / this.a.g.height();
            if (this.l) {
                float min2 = Math.min(width2, height2);
                if (min2 < 1.0f) {
                    f2 = 1.0f / min2;
                    width2 /= f2;
                    height2 /= f2;
                } else {
                    f2 = 1.0f;
                }
                if (f2 > 1.0f) {
                    i = canvas.save();
                    float width3 = bounds.width() / 2.0f;
                    float height3 = bounds.height() / 2.0f;
                    float f7 = width3 * min2;
                    float f8 = min2 * height3;
                    canvas.translate(width3 - f7, height3 - f8);
                    canvas.scale(f2, f2, f7, f8);
                }
            }
            this.m.reset();
            this.m.preScale(width2, height2);
            this.k.b(canvas, this.m, this.o);
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
        cfd.a();
    }

    public final int e() {
        return this.b.getRepeatCount();
    }

    public final void f(cig cigVar, Object obj, clu cluVar) {
        List list;
        if (this.k == null) {
            this.f.add(new cfv(this, cigVar, obj, cluVar));
            return;
        }
        if (cigVar == cig.a) {
            this.k.a(obj, cluVar);
        } else {
            cih cihVar = cigVar.b;
            if (cihVar == null) {
                if (this.k == null) {
                    cll.a("Cannot resolve KeyPath. Composition is not set yet.");
                    list = Collections.emptyList();
                } else {
                    ArrayList arrayList = new ArrayList();
                    this.k.e(cigVar, 0, arrayList, new cig(new String[0]));
                    list = arrayList;
                }
                for (int i = 0; i < list.size(); i++) {
                    ((cig) list.get(i)).b.a(obj, cluVar);
                }
                if (list.isEmpty()) {
                    return;
                }
            } else {
                cihVar.a(obj, cluVar);
            }
        }
        invalidateSelf();
        if (obj == cge.C) {
            o(c());
        }
    }

    public final void g() {
        cjs a = ckr.a(this.a);
        cfj cfjVar = this.a;
        this.k = new cjq(this, a, cfjVar.f, cfjVar);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        if (this.a == null) {
            return -1;
        }
        return (int) (r0.g.height() * this.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        if (this.a == null) {
            return -1;
        }
        return (int) (r0.g.width() * this.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        clm clmVar = this.b;
        if (clmVar.i) {
            clmVar.cancel();
        }
        this.a = null;
        this.k = null;
        this.g = null;
        clm clmVar2 = this.b;
        clmVar2.h = null;
        clmVar2.f = -2.1474836E9f;
        clmVar2.g = 2.1474836E9f;
        invalidateSelf();
    }

    public final void i() {
        this.f.clear();
        this.b.h();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.p) {
            return;
        }
        this.p = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return q();
    }

    public final void j() {
        if (this.k == null) {
            this.f.add(new cfx(this, 1));
            return;
        }
        if (t() || e() == 0) {
            clm clmVar = this.b;
            clmVar.i = true;
            boolean m = clmVar.m();
            for (Animator.AnimatorListener animatorListener : clmVar.a) {
                if (Build.VERSION.SDK_INT >= 26) {
                    animatorListener.onAnimationStart(clmVar, m);
                } else {
                    animatorListener.onAnimationStart(clmVar);
                }
            }
            clmVar.k((int) (clmVar.m() ? clmVar.d() : clmVar.e()));
            clmVar.c = 0L;
            clmVar.e = 0;
            clmVar.g();
        }
        if (t()) {
            return;
        }
        l((int) (d() < 0.0f ? b() : a()));
        this.b.f();
    }

    public final void k() {
        float e;
        if (this.k == null) {
            this.f.add(new cfx(this, 0));
            return;
        }
        if (t() || e() == 0) {
            clm clmVar = this.b;
            clmVar.i = true;
            clmVar.g();
            clmVar.c = 0L;
            if (clmVar.m() && clmVar.d == clmVar.e()) {
                e = clmVar.d();
            } else if (!clmVar.m() && clmVar.d == clmVar.d()) {
                e = clmVar.e();
            }
            clmVar.d = e;
        }
        if (t()) {
            return;
        }
        l((int) (d() < 0.0f ? b() : a()));
        this.b.f();
    }

    public final void l(int i) {
        if (this.a == null) {
            this.f.add(new cft(this, i));
        } else {
            this.b.k(i);
        }
    }

    public final void m(int i, int i2) {
        if (this.a == null) {
            this.f.add(new cfr(this, i, i2));
        } else {
            this.b.l(i, i2 + 0.99f);
        }
    }

    public final void n(float f, float f2) {
        cfj cfjVar = this.a;
        if (cfjVar == null) {
            this.f.add(new cfs(this, f, f2));
            return;
        }
        float c = cln.c(cfjVar.h, cfjVar.i, f);
        cfj cfjVar2 = this.a;
        m((int) c, (int) cln.c(cfjVar2.h, cfjVar2.i, f2));
    }

    public final void o(float f) {
        cfj cfjVar = this.a;
        if (cfjVar == null) {
            this.f.add(new cfu(this, f));
        } else {
            this.b.k(cln.c(cfjVar.h, cfjVar.i, f));
            cfd.a();
        }
    }

    public final void p(int i) {
        this.b.setRepeatCount(i);
    }

    public final boolean q() {
        clm clmVar = this.b;
        if (clmVar == null) {
            return false;
        }
        return clmVar.i;
    }

    public final boolean r(cfj cfjVar) {
        float f;
        float f2;
        if (this.a == cfjVar) {
            return false;
        }
        this.p = false;
        h();
        this.a = cfjVar;
        g();
        clm clmVar = this.b;
        cfj cfjVar2 = clmVar.h;
        clmVar.h = cfjVar;
        if (cfjVar2 == null) {
            f = (int) Math.max(clmVar.f, cfjVar.h);
            f2 = Math.min(clmVar.g, cfjVar.i);
        } else {
            f = (int) cfjVar.h;
            f2 = cfjVar.i;
        }
        clmVar.l(f, (int) f2);
        float f3 = clmVar.d;
        clmVar.d = 0.0f;
        clmVar.k((int) f3);
        clmVar.b();
        o(this.b.getAnimatedFraction());
        Iterator it = new ArrayList(this.f).iterator();
        while (it.hasNext()) {
            cfy cfyVar = (cfy) it.next();
            if (cfyVar != null) {
                cfyVar.a();
            }
            it.remove();
        }
        this.f.clear();
        abn abnVar = cfjVar.m;
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof ImageView)) {
            return true;
        }
        ImageView imageView = (ImageView) callback;
        imageView.setImageDrawable(null);
        imageView.setImageDrawable(this);
        return true;
    }

    public final boolean s() {
        return this.a.d.c() > 0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.o = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        cll.a("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View) || ((View) callback).isInEditMode()) {
            return;
        }
        j();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f.clear();
        this.b.f();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
