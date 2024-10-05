package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gym extends View {
    private final RectF A;
    private final RectF B;
    private final AccessibilityManager C;
    private gyk D;
    private RectF E;
    private float F;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Paint g;
    public Paint h;
    public Paint i;
    public float j;
    public float k;
    public float l;
    public String m;
    public String n;
    public String o;
    public gyl p;
    public float q;
    public float r;
    public final RectF s;
    public final RectF t;
    public final RectF u;
    public boolean v;
    private final RectF w;
    private final RectF x;
    private final RectF y;
    private final RectF z;

    public gym(Context context) {
        super(context);
        this.j = 1.0f;
        this.k = 0.0f;
        this.l = 0.01f;
        this.m = "";
        this.n = "";
        this.o = "";
        this.v = false;
        this.s = new RectF();
        this.t = new RectF();
        this.y = new RectF();
        this.w = new RectF();
        this.z = new RectF();
        this.x = new RectF();
        this.u = new RectF();
        this.A = new RectF();
        this.B = new RectF();
        this.C = (AccessibilityManager) context.getSystemService("accessibility");
    }

    public static int a(Context context) {
        return yjk.K(context.getResources().getDisplayMetrics(), 16);
    }

    public static void f(float f, String str) {
        if (f < 0.0f || f > 1.0f) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "all params must be >= 0 and <= 1f. ".concat(valueOf) : new String("all params must be >= 0 and <= 1f. "));
        }
    }

    private final float g() {
        return Math.max(Math.min(this.r - this.q, this.j), this.k);
    }

    private final float h(float f) {
        float width;
        if (this.v) {
            int i = this.a;
            int width2 = getWidth();
            int i2 = this.a;
            f -= i;
            width = width2 - (i2 + i2);
        } else {
            width = getWidth();
        }
        return f / width;
    }

    private final void i(int i, int i2) {
        float f;
        float f2;
        if (this.v) {
            int i3 = this.a;
            f = (i - (i3 + i3)) * this.q;
        } else {
            f = (i * this.q) - (this.a / 2.0f);
        }
        float f3 = i2;
        this.s.set(f, 0.0f, this.a + f, f3);
        this.w.set(this.s);
        this.w.left = this.s.right - this.b;
        if (this.v) {
            f2 = ((i - (r0 + r0)) * this.r) + this.a;
        } else {
            f2 = (i * this.r) - (this.a / 2.0f);
        }
        this.t.set(f2, 0.0f, this.a + f2, f3);
        this.x.set(this.t);
        this.x.right = this.t.left + this.b;
        this.y.set(0.0f, 0.0f, this.s.centerX(), f3);
        this.z.set(this.t.centerX(), 0.0f, i, f3);
        this.u.set(this.w.right, 0.0f, this.x.left, f3);
        k(this.A, this.s);
        k(this.B, this.t);
    }

    private final void j(float f, float f2) {
        e(f, f2);
        invalidate();
        gyl gylVar = this.p;
        if (gylVar != null) {
            ((gys) gylVar).p();
            this.p.d(f, f2);
        }
    }

    private final void k(RectF rectF, RectF rectF2) {
        float centerX = rectF2.centerX() - (this.d / 2.0f);
        float centerY = rectF2.centerY();
        float f = this.e;
        float f2 = centerY - (f / 2.0f);
        rectF.set(centerX, f2, this.d + centerX, f + f2);
    }

    private final void l(RectF rectF, MotionEvent motionEvent) {
        this.E = rectF;
        if (!this.v) {
            this.F = motionEvent.getX() - this.E.centerX();
        } else if (Objects.equals(rectF, this.s)) {
            this.F = motionEvent.getX() - this.E.right;
        } else if (Objects.equals(this.E, this.t)) {
            this.F = motionEvent.getX() - this.E.left;
        } else {
            this.F = motionEvent.getX() - this.E.centerX();
        }
        getParent().requestDisallowInterceptTouchEvent(true);
    }

    public final void b(float f) {
        float max = Math.max(Math.min(Math.min(f, 1.0f), this.q + this.j), this.q + this.k);
        if (max != this.r) {
            e(this.q, max);
            invalidate();
            gyl gylVar = this.p;
            if (gylVar != null) {
                ((gys) gylVar).p();
                gys gysVar = (gys) this.p;
                gysVar.u = max;
                gyq k = gysVar.k();
                k.e();
                k.g(false);
                k.d();
                gysVar.z = true;
                gysVar.n();
            }
        }
    }

    public final void c(float f) {
        float min = Math.min(Math.max(0.0f, f), 1.0f - this.k);
        if (min != this.q) {
            float f2 = this.r;
            float f3 = this.k;
            if (min > f2 - f3) {
                j(min, f3 + min);
                return;
            }
            float f4 = this.j;
            if (min < f2 - f4) {
                j(min, f4 + min);
                return;
            }
            e(min, f2);
            invalidate();
            gyl gylVar = this.p;
            if (gylVar != null) {
                ((gys) gylVar).p();
                gys gysVar = (gys) this.p;
                gysVar.m(min);
                gysVar.z = true;
                gysVar.n();
            }
        }
    }

    public final void d(float f) {
        float h;
        float h2;
        float f2 = this.q;
        float f3 = this.r;
        if (f < this.u.centerX()) {
            if (this.v) {
                h2 = h(f - (this.u.width() / 2.0f));
            } else {
                h2 = h((f - (this.u.width() / 2.0f)) - (this.s.width() / 2.0f));
            }
            f2 = Math.max(0.0f, h2);
            f3 = f2 + g();
        } else if (f > this.u.centerX()) {
            if (this.v) {
                h = h(f + (this.u.width() / 2.0f));
            } else {
                h = h(f + (this.u.width() / 2.0f) + (this.t.width() / 2.0f));
            }
            f3 = Math.min(h, 1.0f);
            f2 = f3 - g();
        }
        if (f2 == this.q || f3 == this.r) {
            return;
        }
        e(f2, f3);
        invalidate();
        gyl gylVar = this.p;
        if (gylVar != null) {
            ((gys) gylVar).p();
            this.p.d(f2, f3);
        }
    }

    @Override // android.view.View
    protected final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        gyk gykVar = this.D;
        if (gykVar == null || !gykVar.t(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final void e(float f, float f2) {
        this.q = f;
        this.r = f2;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        gyk gykVar = this.D;
        if (gykVar != null) {
            gykVar.n();
        }
    }

    @Override // android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.C.isEnabled() && this.D == null && getContext() != null) {
            gyk gykVar = new gyk(this);
            this.D = gykVar;
            jw.M(this, gykVar);
        }
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.D != null) {
            setAccessibilityDelegate(null);
            this.D = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        i(width, height);
        canvas.drawRect(this.y, this.h);
        canvas.drawRect(this.z, this.h);
        RectF rectF = this.s;
        float f = this.c;
        canvas.drawRoundRect(rectF, f, f, this.g);
        RectF rectF2 = this.t;
        float f2 = this.c;
        canvas.drawRoundRect(rectF2, f2, f2, this.g);
        float centerX = this.s.centerX();
        canvas.drawRect(centerX, 0.0f, this.t.centerX(), this.c, this.g);
        canvas.drawRect(centerX, height - this.c, this.t.centerX(), height, this.g);
        RectF rectF3 = this.A;
        float f3 = this.f;
        canvas.drawRoundRect(rectF3, f3, f3, this.i);
        RectF rectF4 = this.B;
        float f4 = this.f;
        canvas.drawRoundRect(rectF4, f4, f4, this.i);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        gyl gylVar;
        gzb gzbVar;
        int computeHorizontalScrollOffset;
        if (!super.onTouchEvent(motionEvent)) {
            i(getWidth(), getHeight());
            if (motionEvent.getAction() == 0) {
                if (this.w.contains(motionEvent.getX(), motionEvent.getY())) {
                    l(this.s, motionEvent);
                } else if (this.x.contains(motionEvent.getX(), motionEvent.getY())) {
                    l(this.t, motionEvent);
                } else {
                    if (this.u.contains(motionEvent.getX(), motionEvent.getY())) {
                        l(this.u, motionEvent);
                    }
                    return false;
                }
            } else if (motionEvent.getAction() != 2 || this.E == null) {
                if (motionEvent.getAction() == 1) {
                    if (this.E != null && (gylVar = this.p) != null) {
                        gylVar.a();
                    }
                    this.E = null;
                    getParent().requestDisallowInterceptTouchEvent(false);
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    return false;
                }
            } else {
                float h = h(motionEvent.getX() - this.F);
                if (this.s.equals(this.E)) {
                    c(h);
                } else if (this.t.equals(this.E)) {
                    b(h);
                } else if (this.u.equals(this.E)) {
                    d(motionEvent.getX() - this.F);
                } else {
                    throw new RuntimeException("Impossible path");
                }
                gyl gylVar2 = this.p;
                if (gylVar2 != null && this.v) {
                    int i = (int) this.s.left;
                    int width = (int) this.s.width();
                    gzd gzdVar = ((gys) gylVar2).q;
                    if (gzdVar != null && (computeHorizontalScrollOffset = gzdVar.computeHorizontalScrollOffset()) < width && gzdVar.ad && i > 0) {
                        gzdVar.ao();
                        if (i >= width) {
                            i = width - computeHorizontalScrollOffset;
                        }
                        gyi gyiVar = gzdVar.ac;
                        if (i != gyiVar.b) {
                            gyiVar.cancel();
                            gyi gyiVar2 = gzdVar.ac;
                            gyiVar2.setIntValues(gyiVar2.b, i);
                            gzdVar.ac.start();
                            gzdVar.ac.b = i;
                        }
                    }
                    gyl gylVar3 = this.p;
                    int i2 = (int) this.t.right;
                    int width2 = (int) this.t.width();
                    gzd gzdVar2 = ((gys) gylVar3).q;
                    if (gzdVar2 != null && (gzbVar = (gzb) gzdVar2.m) != null && gzdVar2.ad) {
                        int computeHorizontalScrollOffset2 = gzdVar2.computeHorizontalScrollOffset();
                        if (gzdVar2.getMeasuredWidth() + computeHorizontalScrollOffset2 > gzbVar.w() - width2 && i2 < gzdVar2.getMeasuredWidth()) {
                            gzdVar2.ao();
                            int measuredWidth = i2 > gzdVar2.getMeasuredWidth() - width2 ? i2 - gzdVar2.getMeasuredWidth() : (gzbVar.w() - width2) - (computeHorizontalScrollOffset2 + gzdVar2.getMeasuredWidth());
                            gyi gyiVar3 = gzdVar2.ac;
                            if (measuredWidth != gyiVar3.b) {
                                gyiVar3.cancel();
                                gyi gyiVar4 = gzdVar2.ac;
                                gyiVar4.setIntValues(gyiVar4.b, measuredWidth);
                                gzdVar2.ac.start();
                                gzdVar2.ac.b = measuredWidth;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
