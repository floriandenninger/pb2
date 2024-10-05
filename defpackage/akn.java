package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akn {
    private static final Interpolator c = new zh(3);
    public int a;
    public float b;
    private int d;
    private float[] f;
    private float[] g;
    private float[] h;
    private float[] i;
    private int[] j;
    private int[] k;
    private int[] l;
    private int m;
    private VelocityTracker n;
    private final float o;
    private int p;
    private final OverScroller q;
    private final akm r;
    private View s;
    private boolean t;
    private final ViewGroup u;
    private int e = -1;
    private final Runnable v = new akl(this);

    private akn(Context context, ViewGroup viewGroup, akm akmVar) {
        if (akmVar != null) {
            this.u = viewGroup;
            this.r = akmVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.p = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.a = viewConfiguration.getScaledTouchSlop();
            this.o = viewConfiguration.getScaledMaximumFlingVelocity();
            this.b = viewConfiguration.getScaledMinimumFlingVelocity();
            this.q = new OverScroller(context, c);
            return;
        }
        throw new NullPointerException("Callback may not be null");
    }

    private final void A(float f, float f2, int i) {
        Math.abs(f);
        Math.abs(f2);
        int i2 = this.j[i];
    }

    public static akn b(ViewGroup viewGroup, akm akmVar) {
        return new akn(viewGroup.getContext(), viewGroup, akmVar);
    }

    public static akn c(ViewGroup viewGroup, float f, akm akmVar) {
        akn b = b(viewGroup, akmVar);
        b.a = (int) (b.a * (1.0f / f));
        return b;
    }

    private final int o(int i, int i2, int i3) {
        int abs;
        if (i == 0) {
            return 0;
        }
        float width = this.u.getWidth() / 2;
        float sin = width + (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    private final void p(int i) {
        if (this.f == null || !h(i)) {
            return;
        }
        this.f[i] = 0.0f;
        this.g[i] = 0.0f;
        this.h[i] = 0.0f;
        this.i[i] = 0.0f;
        this.j[i] = 0;
        this.k[i] = 0;
        this.l[i] = 0;
        this.m = ((1 << i) ^ (-1)) & this.m;
    }

    private final void q(float f, float f2) {
        this.t = true;
        this.r.e(this.s, f, f2);
        this.t = false;
        if (this.d == 1) {
            g(0);
        }
    }

    private final void r() {
        this.n.computeCurrentVelocity(1000, this.o);
        q(y(this.n.getXVelocity(this.e), this.b, this.o), y(this.n.getYVelocity(this.e), this.b, this.o));
    }

    private final void s(float f, float f2, int i) {
        A(f, f2, i);
        A(f2, f, i);
        A(f, f2, i);
        A(f2, f, i);
    }

    private final void t(float f, float f2, int i) {
        float[] fArr = this.f;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.g;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.h;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.i;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.j;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.k;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.l;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f = fArr2;
            this.g = fArr3;
            this.h = fArr4;
            this.i = fArr5;
            this.j = iArr;
            this.k = iArr2;
            this.l = iArr3;
        }
        float[] fArr9 = this.f;
        this.h[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.g;
        this.i[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.j;
        int i3 = (int) f;
        int i4 = (int) f2;
        int i5 = i3 < this.u.getLeft() + this.p ? 1 : 0;
        if (i4 < this.u.getTop() + this.p) {
            i5 |= 4;
        }
        if (i3 > this.u.getRight() - this.p) {
            i5 |= 2;
        }
        if (i4 > this.u.getBottom() - this.p) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.m |= 1 << i;
    }

    private final void u(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (x(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.h[pointerId] = x;
                this.i[pointerId] = y;
            }
        }
    }

    private final boolean v(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        int a = this.r.a(view);
        int b = this.r.b(view);
        if (a <= 0 || b <= 0) {
            return a > 0 ? Math.abs(f) > ((float) this.a) : b > 0 && Math.abs(f2) > ((float) this.a);
        }
        int i = this.a;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    private final boolean w(int i, int i2, int i3, int i4) {
        int i5;
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.s.getLeft();
        int top = this.s.getTop();
        int i6 = i - left;
        int i7 = i2 - top;
        if (i6 != 0) {
            i5 = i6;
        } else {
            if (i7 == 0) {
                this.q.abortAnimation();
                g(0);
                return false;
            }
            i5 = 0;
        }
        View view = this.s;
        int z = z(i3, (int) this.b, (int) this.o);
        int z2 = z(i4, (int) this.b, (int) this.o);
        int abs = Math.abs(i5);
        int abs2 = Math.abs(i7);
        int abs3 = Math.abs(z);
        int abs4 = Math.abs(z2);
        int i8 = abs3 + abs4;
        int i9 = abs + abs2;
        if (z != 0) {
            f = abs3;
            f2 = i8;
        } else {
            f = abs;
            f2 = i9;
        }
        float f5 = f / f2;
        if (z2 != 0) {
            f3 = abs4;
            f4 = i8;
        } else {
            f3 = abs2;
            f4 = i9;
        }
        this.q.startScroll(left, top, i5, i7, (int) ((o(i5, z, this.r.a(view)) * f5) + (o(i7, z2, this.r.b(view)) * (f3 / f4))));
        g(2);
        return true;
    }

    private final boolean x(int i) {
        return h(i);
    }

    private static final float y(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    private static final int z(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    public final View a(int i, int i2) {
        int childCount = this.u.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            View childAt = this.u.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
    }

    public final void d() {
        this.e = -1;
        float[] fArr = this.f;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0.0f);
            Arrays.fill(this.i, 0.0f);
            Arrays.fill(this.j, 0);
            Arrays.fill(this.k, 0);
            Arrays.fill(this.l, 0);
            this.m = 0;
        }
        VelocityTracker velocityTracker = this.n;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.n = null;
        }
    }

    public final void e(View view, int i) {
        if (view.getParent() == this.u) {
            this.s = view;
            this.e = i;
            this.r.c(view, i);
            g(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.u + ")");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        if (r9.e == (-1)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006d, code lost:
    
        r();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akn.f(android.view.MotionEvent):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(int i) {
        this.u.removeCallbacks(this.v);
        if (this.d != i) {
            this.d = i;
            this.r.d(i);
            if (this.d == 0) {
                this.s = null;
            }
        }
    }

    public final boolean h(int i) {
        return ((1 << i) & this.m) != 0;
    }

    public final boolean i(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    public final boolean j(int i, int i2) {
        if (!this.t) {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        }
        return w(i, i2, (int) this.n.getXVelocity(this.e), (int) this.n.getYVelocity(this.e));
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c9, code lost:
    
        if (r12 != r11) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akn.k(android.view.MotionEvent):boolean");
    }

    public final boolean l(View view, int i, int i2) {
        this.s = view;
        this.e = -1;
        boolean w = w(i, i2, 0, 0);
        if (w || this.d != 0 || this.s == null) {
            return w;
        }
        this.s = null;
        return false;
    }

    final boolean m(View view, int i) {
        if (view == this.s && this.e == i) {
            return true;
        }
        if (view == null || !this.r.f(view, i)) {
            return false;
        }
        this.e = i;
        e(view, i);
        return true;
    }

    public final boolean n() {
        if (this.d == 2) {
            boolean computeScrollOffset = this.q.computeScrollOffset();
            int currX = this.q.getCurrX();
            int currY = this.q.getCurrY();
            int left = currX - this.s.getLeft();
            int top = currY - this.s.getTop();
            if (left != 0) {
                jw.D(this.s, left);
            }
            if (top != 0) {
                jw.E(this.s, top);
            }
            if (left != 0 || top != 0) {
                this.r.i(this.s, currX, currY, left);
            }
            if (computeScrollOffset) {
                if (currX == this.q.getFinalX() && currY == this.q.getFinalY()) {
                    this.q.abortAnimation();
                }
            }
            this.u.post(this.v);
        }
        return this.d == 2;
    }
}
