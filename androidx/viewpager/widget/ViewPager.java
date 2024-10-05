package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.tabs.TabLayout;
import defpackage.allw;
import defpackage.bxz;
import defpackage.bya;
import defpackage.byb;
import defpackage.byc;
import defpackage.byd;
import defpackage.bye;
import defpackage.byf;
import defpackage.byg;
import defpackage.byh;
import defpackage.ji;
import defpackage.jw;
import defpackage.uo;
import defpackage.wn;
import defpackage.zh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public static final int[] a = {R.attr.layout_gravity};
    private static final Comparator i = new uo(7);
    private static final Interpolator j = new zh(4);
    private boolean A;
    private int B;
    private int C;
    private int D;
    private boolean E;
    private float F;
    private float G;
    private float H;
    private float I;

    /* renamed from: J, reason: collision with root package name */
    private int f79J;
    private VelocityTracker K;
    private int L;
    private int M;
    private int N;
    private int O;
    private boolean P;
    private boolean Q;
    private int R;
    private List S;
    private final Runnable T;
    private int U;
    public bxz b;
    public int c;
    public int d;
    public EdgeEffect e;
    public EdgeEffect f;
    public byg g;
    public List h;
    private int k;
    private final ArrayList l;
    private final byd m;
    private final Rect n;
    private int o;
    private Parcelable p;
    private ClassLoader q;
    private Scroller r;
    private boolean s;
    private byh t;
    private float u;
    private float v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public ViewPager(Context context) {
        super(context);
        this.l = new ArrayList();
        this.m = new byd();
        this.n = new Rect();
        this.o = -1;
        this.p = null;
        this.q = null;
        this.u = -3.4028235E38f;
        this.v = Float.MAX_VALUE;
        this.d = 1;
        this.E = true;
        this.f79J = -1;
        this.P = true;
        this.T = new bya(this);
        this.U = 0;
        v(context);
    }

    private final void A(int i2) {
        byg bygVar = this.g;
        if (bygVar != null) {
            bygVar.c(i2);
        }
        List list = this.S;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                byg bygVar2 = (byg) this.S.get(i3);
                if (bygVar2 != null) {
                    bygVar2.c(i2);
                }
            }
        }
    }

    private final void B(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f79J) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.F = motionEvent.getX(i2);
            this.f79J = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.K;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private final void C(int i2, boolean z, int i3, boolean z2) {
        int scrollX;
        int i4;
        int abs;
        byd d = d(i2);
        int w = d != null ? (int) (w() * Math.max(this.u, Math.min(d.e, this.v))) : 0;
        if (z) {
            if (getChildCount() == 0) {
                D(false);
            } else {
                Scroller scroller = this.r;
                if (scroller == null || scroller.isFinished()) {
                    scrollX = getScrollX();
                } else {
                    scrollX = this.s ? this.r.getCurrX() : this.r.getStartX();
                    this.r.abortAnimation();
                    D(false);
                }
                int i5 = scrollX;
                int scrollY = getScrollY();
                int i6 = w - i5;
                int i7 = -scrollY;
                if (i6 != 0) {
                    i4 = i6;
                } else if (i7 == 0) {
                    z(false);
                    h();
                    q(0);
                } else {
                    i4 = 0;
                }
                D(true);
                q(2);
                int w2 = w();
                float f = w2;
                float f2 = w2 / 2;
                float sin = f2 + (((float) Math.sin((Math.min(1.0f, Math.abs(i4) / f) - 0.5f) * 0.47123894f)) * f2);
                int abs2 = Math.abs(i3);
                if (abs2 > 0) {
                    abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                } else {
                    abs = (int) (((Math.abs(i4) / (f + 0.0f)) + 1.0f) * 100.0f);
                }
                int min = Math.min(abs, 600);
                this.s = false;
                this.r.startScroll(i5, scrollY, i4, i7, min);
                jw.G(this);
            }
            if (z2) {
                A(i2);
                return;
            }
            return;
        }
        if (z2) {
            A(i2);
        }
        z(false);
        scrollTo(w, 0);
        E(w);
    }

    private final void D(boolean z) {
        if (this.x != z) {
            this.x = z;
        }
    }

    private final boolean E(int i2) {
        if (this.l.size() == 0) {
            if (this.P) {
                return false;
            }
            this.Q = false;
            g(0, 0.0f, 0);
            if (this.Q) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        byd y = y();
        float w = w();
        int i3 = y.b;
        float f = ((i2 / w) - y.e) / (y.d + (0.0f / w));
        this.Q = false;
        g(i3, f, (int) (w * f));
        if (this.Q) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private final boolean F(float f, float f2) {
        float e;
        boolean z;
        float f3 = this.F - f;
        this.F = f;
        float height = f2 / getHeight();
        float width = f3 / getWidth();
        if (ji.d(this.e) != 0.0f) {
            e = -ji.e(this.e, -width, 1.0f - height);
        } else {
            e = ji.d(this.f) != 0.0f ? ji.e(this.f, width, height) : 0.0f;
        }
        float width2 = e * getWidth();
        float f4 = f3 - width2;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = width2 != 0.0f;
        if (Math.abs(f4) < 1.0E-4f) {
            return z4;
        }
        float scrollX = getScrollX() + f4;
        float w = w();
        float f5 = this.u * w;
        float f6 = this.v * w;
        byd bydVar = (byd) this.l.get(0);
        byd bydVar2 = (byd) this.l.get(r8.size() - 1);
        if (bydVar.b != 0) {
            f5 = bydVar.e * w;
            z = false;
        } else {
            z = true;
        }
        if (bydVar2.b != this.b.j() - 1) {
            f6 = bydVar2.e * w;
        } else {
            z2 = true;
        }
        if (scrollX < f5) {
            if (z) {
                ji.e(this.e, (f5 - scrollX) / w, 1.0f - (f2 / getHeight()));
            } else {
                z3 = z4;
            }
            z4 = z3;
            scrollX = f5;
        } else if (scrollX > f6) {
            if (z2) {
                ji.e(this.f, (scrollX - f6) / w, f2 / getHeight());
            } else {
                z3 = z4;
            }
            z4 = z3;
            scrollX = f6;
        }
        int i2 = (int) scrollX;
        this.F += scrollX - i2;
        scrollTo(i2, getScrollY());
        E(i2);
        return z4;
    }

    private final boolean G() {
        this.f79J = -1;
        this.z = false;
        this.A = false;
        VelocityTracker velocityTracker = this.K;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.K = null;
        }
        this.e.onRelease();
        this.f.onRelease();
        return (this.e.isFinished() && this.f.isFinished()) ? false : true;
    }

    private final void H() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private final int w() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private final Rect x(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private final byd y() {
        int i2;
        int w = w();
        float f = 0.0f;
        float scrollX = w > 0 ? getScrollX() / w : 0.0f;
        float f2 = w > 0 ? 0.0f / w : 0.0f;
        byd bydVar = null;
        float f3 = 0.0f;
        int i3 = 0;
        boolean z = true;
        int i4 = -1;
        while (i3 < this.l.size()) {
            byd bydVar2 = (byd) this.l.get(i3);
            if (!z && bydVar2.b != (i2 = i4 + 1)) {
                bydVar2 = this.m;
                bydVar2.e = f + f3 + f2;
                bydVar2.b = i2;
                bydVar2.d = 1.0f;
                i3--;
            }
            byd bydVar3 = bydVar2;
            f = bydVar3.e;
            float f4 = bydVar3.d + f + f2;
            if (!z && scrollX < f) {
                return bydVar;
            }
            if (scrollX < f4 || i3 == this.l.size() - 1) {
                return bydVar3;
            }
            i4 = bydVar3.b;
            i3++;
            z = false;
            bydVar = bydVar3;
            f3 = bydVar3.d;
        }
        return bydVar;
    }

    private final void z(boolean z) {
        boolean z2 = this.U == 2;
        if (z2) {
            D(false);
            if (!this.r.isFinished()) {
                this.r.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.r.getCurrX();
                int currY = this.r.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        E(currX);
                    }
                }
            }
        }
        this.y = false;
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            byd bydVar = (byd) this.l.get(i2);
            if (bydVar.c) {
                bydVar.c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                jw.H(this, this.T);
            } else {
                this.T.run();
            }
        }
    }

    public int a() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i2, int i3) {
        byd c;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (c = c(childAt)) != null && c.b == this.c) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (isFocusable()) {
            if (((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        byd c;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (c = c(childAt)) != null && c.b == this.c) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        bye byeVar = (bye) layoutParams;
        boolean z = byeVar.a | (view.getClass().getAnnotation(byc.class) != null);
        byeVar.a = z;
        if (!this.w) {
            super.addView(view, i2, layoutParams);
        } else {
            if (byeVar == null || !z) {
                byeVar.d = true;
                addViewInLayout(view, i2, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    final byd b(int i2, int i3) {
        byd bydVar = new byd();
        bydVar.b = i2;
        bydVar.a = this.b.c(this, i2);
        bydVar.d = 1.0f;
        if (i3 < 0 || i3 >= this.l.size()) {
            this.l.add(bydVar);
        } else {
            this.l.add(i3, bydVar);
        }
        return bydVar;
    }

    final byd c(View view) {
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            byd bydVar = (byd) this.l.get(i2);
            if (this.b.g(view, bydVar.a)) {
                return bydVar;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i2) {
        if (this.b == null) {
            return false;
        }
        int w = w();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) w) * this.u)) : i2 > 0 && scrollX < ((int) (((float) w) * this.v));
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof bye) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.s = true;
        if (this.r.isFinished() || !this.r.computeScrollOffset()) {
            z(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.r.getCurrX();
        int currY = this.r.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!E(currX)) {
                this.r.abortAnimation();
                scrollTo(0, currY);
            }
        }
        jw.G(this);
    }

    final byd d(int i2) {
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            byd bydVar = (byd) this.l.get(i3);
            if (bydVar.b == i2) {
                return bydVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L5f
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L5a
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L48
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L5a
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.r(r4)
            goto L5b
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L5a
            boolean r6 = r5.r(r1)
            goto L5b
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r6 = r5.u()
            goto L5b
        L41:
            r6 = 66
            boolean r6 = r5.r(r6)
            goto L5b
        L48:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L53
            boolean r6 = r5.t()
            goto L5b
        L53:
            r6 = 17
            boolean r6 = r5.r(r6)
            goto L5b
        L5a:
            r6 = 0
        L5b:
            if (r6 == 0) goto L5e
            goto L5f
        L5e:
            return r2
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        byd c;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (c = c(childAt)) != null && c.b == this.c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        bxz bxzVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0 && (overScrollMode != 1 || (bxzVar = this.b) == null || bxzVar.j() <= 1)) {
            this.e.finish();
            this.f.finish();
            return;
        }
        if (this.e.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((-height) + getPaddingTop(), this.u * width);
            this.e.setSize(height, width);
            z = this.e.draw(canvas);
            canvas.restoreToCount(save);
        }
        if (!this.f.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.v + 1.0f)) * width2);
            this.f.setSize((height2 - paddingTop) - paddingBottom, width2);
            z |= this.f.draw(canvas);
            canvas.restoreToCount(save2);
        }
        if (z) {
            jw.G(this);
        }
    }

    public void e(byg bygVar) {
        if (this.S == null) {
            this.S = new ArrayList();
        }
        this.S.add(bygVar);
    }

    public final void f() {
        int j2 = this.b.j();
        this.k = j2;
        int size = this.l.size();
        int i2 = this.d;
        boolean z = size < (i2 + i2) + 1 && this.l.size() < j2;
        int i3 = this.c;
        int i4 = 0;
        boolean z2 = false;
        while (i4 < this.l.size()) {
            byd bydVar = (byd) this.l.get(i4);
            int k = this.b.k(bydVar.a);
            if (k != -1) {
                if (k == -2) {
                    this.l.remove(i4);
                    i4--;
                    if (!z2) {
                        this.b.f(this);
                    }
                    this.b.d(this, bydVar.b, bydVar.a);
                    int i5 = this.c;
                    if (i5 == bydVar.b) {
                        i3 = Math.max(0, Math.min(i5, (-1) + j2));
                    }
                    z = true;
                    z2 = true;
                } else {
                    int i6 = bydVar.b;
                    if (i6 != k) {
                        if (i6 == this.c) {
                            i3 = k;
                        }
                        bydVar.b = k;
                        z = true;
                    }
                }
            }
            i4++;
        }
        if (z2) {
            this.b.h();
        }
        Collections.sort(this.l, i);
        if (z) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                bye byeVar = (bye) getChildAt(i7).getLayoutParams();
                if (!byeVar.a) {
                    byeVar.c = 0.0f;
                }
            }
            n(i3, false, true);
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void g(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.R
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            bye r9 = (defpackage.bye) r9
            boolean r10 = r9.a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.b
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            byg r0 = r12.g
            if (r0 == 0) goto L72
            r0.b(r13, r14, r15)
        L72:
            java.util.List r0 = r12.S
            if (r0 == 0) goto L8c
            int r0 = r0.size()
        L7a:
            if (r1 >= r0) goto L8c
            java.util.List r3 = r12.S
            java.lang.Object r3 = r3.get(r1)
            byg r3 = (defpackage.byg) r3
            if (r3 == 0) goto L89
            r3.b(r13, r14, r15)
        L89:
            int r1 = r1 + 1
            goto L7a
        L8c:
            r12.Q = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.g(int, float, int):void");
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new bye();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new bye(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i2, int i3) {
        throw null;
    }

    public final void h() {
        i(this.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r9 != r10) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void i(int r19) {
        /*
            Method dump skipped, instructions count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.i(int):void");
    }

    public void j(byg bygVar) {
        List list = this.S;
        if (list != null) {
            list.remove(bygVar);
        }
    }

    public final void k(bxz bxzVar) {
        bxz bxzVar2 = this.b;
        if (bxzVar2 != null) {
            bxzVar2.n(null);
            this.b.f(this);
            for (int i2 = 0; i2 < this.l.size(); i2++) {
                byd bydVar = (byd) this.l.get(i2);
                this.b.d(this, bydVar.b, bydVar.a);
            }
            this.b.h();
            this.l.clear();
            int i3 = 0;
            while (i3 < getChildCount()) {
                if (!((bye) getChildAt(i3).getLayoutParams()).a) {
                    removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            this.c = 0;
            scrollTo(0, 0);
        }
        this.b = bxzVar;
        this.k = 0;
        if (bxzVar != null) {
            if (this.t == null) {
                this.t = new byh(this);
            }
            this.b.n(this.t);
            this.y = false;
            boolean z = this.P;
            this.P = true;
            this.k = this.b.j();
            if (this.o >= 0) {
                this.b.e(this.p, this.q);
                n(this.o, false, true);
                this.o = -1;
                this.p = null;
                this.q = null;
            } else if (!z) {
                h();
            } else {
                requestLayout();
            }
        }
        List list = this.h;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.h.size();
        for (int i4 = 0; i4 < size; i4++) {
            allw allwVar = (allw) this.h.get(i4);
            TabLayout tabLayout = allwVar.b;
            if (tabLayout.z == this) {
                tabLayout.k(bxzVar, allwVar.a);
            }
        }
    }

    public void l(int i2) {
        this.y = false;
        n(i2, !this.P, false);
    }

    public void m(int i2, boolean z) {
        this.y = false;
        n(i2, z, false);
    }

    final void n(int i2, boolean z, boolean z2) {
        o(i2, z, z2, 0);
    }

    final void o(int i2, boolean z, boolean z2, int i3) {
        bxz bxzVar = this.b;
        if (bxzVar == null || bxzVar.j() <= 0) {
            D(false);
            return;
        }
        if (z2 || this.c != i2 || this.l.size() == 0) {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 >= this.b.j()) {
                i2 = this.b.j() - 1;
            }
            int i4 = this.d;
            int i5 = this.c;
            if (i2 > i5 + i4 || i2 < i5 - i4) {
                for (int i6 = 0; i6 < this.l.size(); i6++) {
                    ((byd) this.l.get(i6)).c = true;
                }
            }
            boolean z3 = this.c != i2;
            if (this.P) {
                this.c = i2;
                if (z3) {
                    A(i2);
                }
                requestLayout();
                return;
            }
            i(i2);
            C(i2, z, i3, z3);
            return;
        }
        D(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.T);
        Scroller scroller = this.r;
        if (scroller != null && !scroller.isFinished()) {
            this.r.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & PrivateKeyType.INVALID;
        if (action == 3 || action == 1) {
            G();
            return false;
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.H = x;
            this.F = x;
            float y = motionEvent.getY();
            this.I = y;
            this.G = y;
            this.f79J = motionEvent.getPointerId(0);
            this.A = false;
            this.s = true;
            this.r.computeScrollOffset();
            if (this.U == 2 && Math.abs(this.r.getFinalX() - this.r.getCurrX()) > this.O) {
                this.r.abortAnimation();
                this.y = false;
                h();
                this.z = true;
                H();
                q(1);
            } else if (ji.d(this.e) == 0.0f && ji.d(this.f) == 0.0f) {
                z(false);
                this.z = false;
            } else {
                this.z = true;
                q(1);
                if (ji.d(this.e) != 0.0f) {
                    ji.e(this.e, 0.0f, 1.0f - (this.G / getHeight()));
                }
                if (ji.d(this.f) != 0.0f) {
                    ji.e(this.f, 0.0f, this.G / getHeight());
                }
            }
        } else {
            if (this.z) {
                return true;
            }
            if (this.A) {
                return false;
            }
            if (action == 2) {
                int i2 = this.f79J;
                if (i2 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i2);
                    float x2 = motionEvent.getX(findPointerIndex);
                    float f = x2 - this.F;
                    float abs = Math.abs(f);
                    float y2 = motionEvent.getY(findPointerIndex);
                    float abs2 = Math.abs(y2 - this.I);
                    if (f != 0.0f) {
                        float f2 = this.F;
                        if ((this.E || ((f2 >= this.C || f <= 0.0f) && (f2 <= getWidth() - this.C || f >= 0.0f))) && s(this, false, (int) f, (int) x2, (int) y2)) {
                            this.F = x2;
                            this.G = y2;
                            this.A = true;
                            return false;
                        }
                    }
                    float f3 = this.D;
                    if (abs > f3 && abs * 0.5f > abs2) {
                        this.z = true;
                        H();
                        q(1);
                        this.F = f > 0.0f ? this.H + this.D : this.H - this.D;
                        this.G = y2;
                        D(true);
                    } else if (abs2 > f3) {
                        this.A = true;
                    }
                    if (this.z && F(x2, y2)) {
                        jw.G(this);
                    }
                }
            } else if (action == 6) {
                B(motionEvent);
            }
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        return this.z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        byd c;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
        }
        while (i3 != i5) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (c = c(childAt)) != null && c.b == this.c && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        bxz bxzVar = this.b;
        if (bxzVar != null) {
            bxzVar.e(savedState.b, savedState.e);
            n(savedState.a, false, true);
        } else {
            this.o = savedState.a;
            this.p = savedState.b;
            this.q = savedState.e;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.c;
        bxz bxzVar = this.b;
        if (bxzVar != null) {
            savedState.b = bxzVar.a();
        }
        return savedState;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            if (i4 <= 0 || this.l.isEmpty()) {
                byd d = d(this.c);
                int min = (int) ((d != null ? Math.min(d.e, this.v) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
                if (min != getScrollX()) {
                    z(false);
                    scrollTo(min, getScrollY());
                    return;
                }
                return;
            }
            if (!this.r.isFinished()) {
                this.r.setFinalX(a() * w());
                return;
            }
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            scrollTo((int) ((getScrollX() / ((i4 - getPaddingLeft()) - getPaddingRight())) * ((i2 - paddingLeft) - paddingRight)), getScrollY());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x01bb  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Deprecated
    public void p(byg bygVar) {
        this.g = bygVar;
    }

    public final void q(int i2) {
        if (this.U == i2) {
            return;
        }
        this.U = i2;
        byg bygVar = this.g;
        if (bygVar != null) {
            bygVar.a(i2);
        }
        List list = this.S;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                byg bygVar2 = (byg) this.S.get(i3);
                if (bygVar2 != null) {
                    bygVar2.a(i2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(int r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.findFocus()
            r1 = 0
            if (r0 != r5) goto L9
        L7:
            r0 = r1
            goto L63
        L9:
            if (r0 == 0) goto L63
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r5) goto L16
            goto L63
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L7
        L63:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r5, r0, r6)
            r2 = 0
            r3 = 66
            r4 = 17
            if (r1 == 0) goto Lb4
            if (r1 == r0) goto Lb4
            if (r6 != r4) goto L94
            android.graphics.Rect r2 = r5.n
            android.graphics.Rect r2 = r5.x(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r5.n
            android.graphics.Rect r3 = r5.x(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L8f
            if (r2 < r3) goto L8f
            boolean r2 = r5.t()
            goto Lc8
        L8f:
            boolean r2 = r1.requestFocus()
            goto Lc8
        L94:
            if (r6 != r3) goto Lc8
            android.graphics.Rect r2 = r5.n
            android.graphics.Rect r2 = r5.x(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r5.n
            android.graphics.Rect r3 = r5.x(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto Laf
            if (r2 > r3) goto Laf
            boolean r2 = r5.u()
            goto Lc8
        Laf:
            boolean r2 = r1.requestFocus()
            goto Lc8
        Lb4:
            if (r6 == r4) goto Lc4
            r0 = 1
            if (r6 != r0) goto Lba
            goto Lc4
        Lba:
            if (r6 == r3) goto Lbf
            r0 = 2
            if (r6 != r0) goto Lc8
        Lbf:
            boolean r2 = r5.u()
            goto Lc8
        Lc4:
            boolean r2 = r5.t()
        Lc8:
            if (r2 == 0) goto Ld1
            int r6 = android.view.SoundEffectConstants.getContantForFocusDirection(r6)
            r5.playSoundEffect(r6)
        Ld1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.r(int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.w) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean s(View view, boolean z, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && s(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i2);
    }

    final boolean t() {
        int i2 = this.c;
        if (i2 <= 0) {
            return false;
        }
        m(i2 - 1, true);
        return true;
    }

    final boolean u() {
        if (this.b == null || this.c >= r0.j() - 1) {
            return false;
        }
        m(this.c + 1, true);
        return true;
    }

    final void v(Context context) {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        this.r = new Scroller(context, j);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.D = viewConfiguration.getScaledPagingTouchSlop();
        this.L = (int) (400.0f * f);
        this.M = viewConfiguration.getScaledMaximumFlingVelocity();
        this.e = new EdgeEffect(context);
        this.f = new EdgeEffect(context);
        this.N = (int) (25.0f * f);
        this.O = (int) (f + f);
        this.B = (int) (f * 16.0f);
        jw.M(this, new byf(this));
        if (jw.c(this) == 0) {
            jw.V(this, 1);
        }
        jw.X(this, new byb(this));
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new wn(6);
        int a;
        Parcelable b;
        ClassLoader e;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.a = parcel.readInt();
            this.b = parcel.readParcelable(classLoader);
            this.e = classLoader;
        }

        public final String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.a + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeParcelable(this.b, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = new ArrayList();
        this.m = new byd();
        this.n = new Rect();
        this.o = -1;
        this.p = null;
        this.q = null;
        this.u = -3.4028235E38f;
        this.v = Float.MAX_VALUE;
        this.d = 1;
        this.E = true;
        this.f79J = -1;
        this.P = true;
        this.T = new bya(this);
        this.U = 0;
        v(context);
    }
}
