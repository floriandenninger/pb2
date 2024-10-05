package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class vao extends ViewGroup {
    private static final Interpolator a = new zh(5);
    private final int b;
    private boolean c;
    private final boolean d;
    public final float[] j;
    public final int[] k;
    public final int l;
    public final int m;
    public float n;
    public VelocityTracker o;
    protected boolean p;
    public boolean q;
    protected final Scroller r;

    public vao(Context context) {
        super(context);
        this.j = new float[]{0.0f, 0.0f};
        this.k = new int[]{-2147483647, Integer.MAX_VALUE};
        this.n = 0.0f;
        this.p = false;
        this.c = false;
        this.q = false;
        this.d = true;
        Context context2 = getContext();
        setFocusable(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        this.b = viewConfiguration.getScaledTouchSlop();
        this.m = viewConfiguration.getScaledMinimumFlingVelocity();
        this.l = viewConfiguration.getScaledMaximumFlingVelocity();
        this.r = new Scroller(context2, a);
    }

    private final int a(int i) {
        int[] iArr = this.k;
        int i2 = iArr[0];
        if (i < i2) {
            return i2;
        }
        int i3 = iArr[1];
        return i > i3 ? i3 : i;
    }

    private final void b() {
        if (!this.p && this.r.isFinished()) {
            e();
            this.c = true;
        }
        this.p = true;
        this.n = 0.0f;
        this.r.abortAnimation();
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.r.computeScrollOffset()) {
            int currY = this.r.getCurrY();
            scrollTo(0, currY);
            invalidate();
            float f = this.n;
            if (f != 0.0f) {
                g(f);
                this.n = 0.0f;
            }
            if (currY == this.r.getFinalY()) {
                this.r.abortAnimation();
                if (this.c) {
                    this.c = false;
                    d();
                }
            }
        }
    }

    public void d() {
    }

    public void e() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g(float f) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(int i) {
        this.r.forceFinished(true);
        scrollTo(0, a(i));
    }

    public final void l(int i, int i2) {
        int[] iArr = this.k;
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m(MotionEvent motionEvent) {
        this.j[0] = motionEvent.getX();
        this.j[1] = motionEvent.getY();
    }

    public final boolean n(MotionEvent motionEvent) {
        if (!this.d) {
            return false;
        }
        if (this.p) {
            this.p = false;
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            m(motionEvent);
            if (!this.r.isFinished()) {
                b();
                return true;
            }
            this.q = true;
        } else if (action == 2) {
            float x = motionEvent.getX() - this.j[0];
            float y = motionEvent.getY() - this.j[1];
            int i = this.b;
            float f = i;
            boolean z = x > f || x < ((float) (-i));
            if ((y > f || y < (-i)) && !z) {
                m(motionEvent);
                b();
                return true;
            }
        }
        return false;
    }

    public final void o(int i, boolean z) {
        if (z) {
            i = a(i);
        }
        this.r.startScroll(0, getScrollY(), 0, i - getScrollY(), 500);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return n(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
    
        if (r0 != 3) goto L39;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            r13 = this;
            int r0 = r14.getAction()
            android.view.VelocityTracker r1 = r13.o
            if (r1 != 0) goto Le
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r13.o = r1
        Le:
            android.view.VelocityTracker r1 = r13.o
            r1.addMovement(r14)
            boolean r1 = r13.p
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L2e
            boolean r14 = r13.n(r14)
            if (r14 == 0) goto L20
            return r3
        L20:
            if (r0 != r3) goto L2d
            boolean r14 = r13.q
            if (r14 == 0) goto L2d
            r13.q = r2
            boolean r14 = r13.performClick()
            return r14
        L2d:
            return r3
        L2e:
            r1 = 3
            if (r0 == r3) goto L53
            r4 = 2
            if (r0 == r4) goto L38
            if (r0 == r1) goto L53
            goto Lad
        L38:
            float[] r0 = r13.j
            r0 = r0[r3]
            r13.m(r14)
            float[] r14 = r13.j
            r14 = r14[r3]
            int r1 = r13.getScrollY()
            float r0 = r0 - r14
            int r14 = java.lang.Math.round(r0)
            int r1 = r1 + r14
            r13.k(r1)
            r13.q = r2
            goto Lad
        L53:
            r13.p = r2
            r14 = 0
            if (r0 == r1) goto L9e
            int r0 = r13.getChildCount()
            if (r0 <= 0) goto L9e
            android.view.VelocityTracker r0 = r13.o
            r1 = 1000(0x3e8, float:1.401E-42)
            int r4 = r13.l
            float r4 = (float) r4
            r0.computeCurrentVelocity(r1, r4)
            android.view.VelocityTracker r0 = r13.o
            float r0 = r0.getYVelocity()
            int r1 = r13.m
            float r4 = (float) r1
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 > 0) goto L80
            int r1 = -r1
            float r1 = (float) r1
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L7c
            goto L80
        L7c:
            r13.g(r14)
            goto La1
        L80:
            float r14 = -r0
            r13.n = r14
            int r5 = r13.getScrollX()
            int r6 = r13.getScrollY()
            android.widget.Scroller r4 = r13.r
            int[] r0 = r13.k
            r7 = 0
            int r8 = (int) r14
            r9 = 0
            r10 = 0
            r11 = r0[r2]
            r12 = r0[r3]
            r4.fling(r5, r6, r7, r8, r9, r10, r11, r12)
            r13.invalidate()
            goto La1
        L9e:
            r13.g(r14)
        La1:
            android.view.VelocityTracker r14 = r13.o
            if (r14 == 0) goto Lab
            r14.recycle()
            r14 = 0
            r13.o = r14
        Lab:
            r13.q = r2
        Lad:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vao.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean showContextMenuForChild(View view) {
        requestDisallowInterceptTouchEvent(true);
        return super.showContextMenuForChild(view);
    }

    public vao(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = new float[]{0.0f, 0.0f};
        this.k = new int[]{-2147483647, Integer.MAX_VALUE};
        this.n = 0.0f;
        this.p = false;
        this.c = false;
        this.q = false;
        this.d = true;
        Context context2 = getContext();
        setFocusable(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        this.b = viewConfiguration.getScaledTouchSlop();
        this.m = viewConfiguration.getScaledMinimumFlingVelocity();
        this.l = viewConfiguration.getScaledMaximumFlingVelocity();
        this.r = new Scroller(context2, a);
    }

    public vao(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = new float[]{0.0f, 0.0f};
        this.k = new int[]{-2147483647, Integer.MAX_VALUE};
        this.n = 0.0f;
        this.p = false;
        this.c = false;
        this.q = false;
        this.d = true;
        Context context2 = getContext();
        setFocusable(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        this.b = viewConfiguration.getScaledTouchSlop();
        this.m = viewConfiguration.getScaledMinimumFlingVelocity();
        this.l = viewConfiguration.getScaledMaximumFlingVelocity();
        this.r = new Scroller(context2, a);
    }
}
