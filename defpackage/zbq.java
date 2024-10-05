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
public abstract class zbq extends ViewGroup {
    private static final Interpolator k = new zh(6);
    public final float[] a;
    public final int[] b;
    public final int c;
    public final int d;
    public float e;
    public VelocityTracker f;
    protected boolean g;
    public boolean h;
    protected boolean i;
    protected final Scroller j;
    private final int l;
    private boolean m;

    public zbq(Context context) {
        super(context);
        this.a = new float[]{0.0f, 0.0f};
        this.b = new int[]{-2147483647, Integer.MAX_VALUE};
        this.e = 0.0f;
        this.g = false;
        this.m = false;
        this.h = false;
        this.i = false;
        Context context2 = getContext();
        setFocusable(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        this.l = viewConfiguration.getScaledTouchSlop();
        this.d = viewConfiguration.getScaledMinimumFlingVelocity();
        this.c = viewConfiguration.getScaledMaximumFlingVelocity();
        this.j = new Scroller(context2, k);
    }

    private final int f(int i) {
        int[] iArr = this.b;
        int i2 = iArr[0];
        if (i < i2) {
            return i2;
        }
        int i3 = iArr[1];
        return i > i3 ? i3 : i;
    }

    private final void g() {
        if (!this.g && this.j.isFinished()) {
            this.m = true;
        }
        this.g = true;
        this.e = 0.0f;
        this.j.abortAnimation();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(int i) {
        this.j.forceFinished(true);
        scrollTo(0, f(i));
    }

    public final void b(int i, int i2) {
        int[] iArr = this.b;
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final void c(int i) {
        this.j.startScroll(0, getScrollY(), 0, f(i) - getScrollY(), 500);
        invalidate();
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.j.computeScrollOffset()) {
            int currY = this.j.getCurrY();
            scrollTo(0, currY);
            invalidate();
            if (this.e != 0.0f) {
                this.e = 0.0f;
            }
            if (currY == this.j.getFinalY()) {
                this.j.abortAnimation();
                if (this.m) {
                    this.m = false;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(MotionEvent motionEvent) {
        this.a[0] = motionEvent.getX();
        this.a[1] = motionEvent.getY();
    }

    public final boolean e(MotionEvent motionEvent) {
        if (this.g) {
            this.g = false;
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            d(motionEvent);
            if (!this.j.isFinished()) {
                g();
                return true;
            }
            this.h = true;
        } else if (action == 2) {
            float x = motionEvent.getX() - this.a[0];
            float y = motionEvent.getY() - this.a[1];
            int i = this.l;
            float f = i;
            boolean z = x > f || x < ((float) (-i));
            if ((y > f || y < (-i)) && (!z || this.i)) {
                d(motionEvent);
                g();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return e(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
    
        if (r0 != 3) goto L36;
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
            android.view.VelocityTracker r1 = r13.f
            if (r1 != 0) goto Le
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r13.f = r1
        Le:
            android.view.VelocityTracker r1 = r13.f
            r1.addMovement(r14)
            boolean r1 = r13.g
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L2e
            boolean r14 = r13.e(r14)
            if (r14 == 0) goto L20
            return r3
        L20:
            if (r0 != r3) goto L2d
            boolean r14 = r13.h
            if (r14 == 0) goto L2d
            r13.h = r2
            boolean r14 = r13.performClick()
            return r14
        L2d:
            return r3
        L2e:
            r1 = 3
            if (r0 == r3) goto L52
            r4 = 2
            if (r0 == r4) goto L37
            if (r0 == r1) goto L52
            goto La2
        L37:
            float[] r0 = r13.a
            r0 = r0[r3]
            r13.d(r14)
            float[] r14 = r13.a
            r14 = r14[r3]
            int r1 = r13.getScrollY()
            float r0 = r0 - r14
            int r14 = java.lang.Math.round(r0)
            int r1 = r1 + r14
            r13.a(r1)
            r13.h = r2
            goto La2
        L52:
            r13.g = r2
            if (r0 == r1) goto L96
            int r14 = r13.getChildCount()
            if (r14 <= 0) goto L96
            android.view.VelocityTracker r14 = r13.f
            r0 = 1000(0x3e8, float:1.401E-42)
            int r1 = r13.c
            float r1 = (float) r1
            r14.computeCurrentVelocity(r0, r1)
            android.view.VelocityTracker r14 = r13.f
            float r14 = r14.getYVelocity()
            int r0 = r13.d
            float r1 = (float) r0
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 > 0) goto L79
            int r0 = -r0
            float r0 = (float) r0
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 >= 0) goto L96
        L79:
            float r14 = -r14
            r13.e = r14
            int r5 = r13.getScrollX()
            int r6 = r13.getScrollY()
            android.widget.Scroller r4 = r13.j
            int[] r0 = r13.b
            r7 = 0
            int r8 = (int) r14
            r9 = 0
            r10 = 0
            r11 = r0[r2]
            r12 = r0[r3]
            r4.fling(r5, r6, r7, r8, r9, r10, r11, r12)
            r13.invalidate()
        L96:
            android.view.VelocityTracker r14 = r13.f
            if (r14 == 0) goto La0
            r14.recycle()
            r14 = 0
            r13.f = r14
        La0:
            r13.h = r2
        La2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zbq.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean showContextMenuForChild(View view) {
        requestDisallowInterceptTouchEvent(true);
        return super.showContextMenuForChild(view);
    }

    public zbq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new float[]{0.0f, 0.0f};
        this.b = new int[]{-2147483647, Integer.MAX_VALUE};
        this.e = 0.0f;
        this.g = false;
        this.m = false;
        this.h = false;
        this.i = false;
        Context context2 = getContext();
        setFocusable(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        this.l = viewConfiguration.getScaledTouchSlop();
        this.d = viewConfiguration.getScaledMinimumFlingVelocity();
        this.c = viewConfiguration.getScaledMaximumFlingVelocity();
        this.j = new Scroller(context2, k);
    }

    public zbq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new float[]{0.0f, 0.0f};
        this.b = new int[]{-2147483647, Integer.MAX_VALUE};
        this.e = 0.0f;
        this.g = false;
        this.m = false;
        this.h = false;
        this.i = false;
        Context context2 = getContext();
        setFocusable(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        this.l = viewConfiguration.getScaledTouchSlop();
        this.d = viewConfiguration.getScaledMinimumFlingVelocity();
        this.c = viewConfiguration.getScaledMaximumFlingVelocity();
        this.j = new Scroller(context2, k);
    }
}
