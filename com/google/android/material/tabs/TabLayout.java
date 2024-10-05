package com.google.android.material.tabs;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.youtube.R;
import defpackage.aleq;
import defpackage.alkd;
import defpackage.allu;
import defpackage.allv;
import defpackage.allw;
import defpackage.allx;
import defpackage.ally;
import defpackage.almb;
import defpackage.almc;
import defpackage.almd;
import defpackage.almf;
import defpackage.almg;
import defpackage.bxz;
import defpackage.byc;
import defpackage.hy;
import defpackage.ia;
import defpackage.jw;
import defpackage.ks;
import defpackage.kw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@byc
/* loaded from: classes3.dex */
public class TabLayout extends HorizontalScrollView {
    private static final int B = 2132084320;
    private static final hy C = new ia(16);
    public alkd A;
    private almc D;
    private final int E;
    private final int F;
    private final int G;
    private int H;
    private final ArrayList I;

    /* renamed from: J, reason: collision with root package name */
    private allx f178J;
    private ValueAnimator K;
    private bxz L;
    private DataSetObserver M;
    private almd N;
    private allw O;
    private boolean P;
    private final hy Q;
    public final ArrayList a;
    final almb b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public ColorStateList h;
    public ColorStateList i;
    public ColorStateList j;
    public Drawable k;
    public int l;
    public PorterDuff.Mode m;
    public float n;
    public float o;
    public final int p;
    public int q;
    public int r;
    int s;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    int x;
    public boolean y;
    public ViewPager z;

    public TabLayout(Context context) {
        this(context, null);
    }

    private final int p(int i, float f) {
        int i2 = this.u;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        View childAt = this.b.getChildAt(i);
        int i3 = i + 1;
        View childAt2 = i3 < this.b.getChildCount() ? this.b.getChildAt(i3) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        return jw.e(this) == 0 ? left + i4 : left - i4;
    }

    private final int q() {
        int i = this.E;
        if (i != -1) {
            return i;
        }
        int i2 = this.u;
        if (i2 == 0 || i2 == 2) {
            return this.G;
        }
        return 0;
    }

    private final void r(View view) {
        if (view instanceof allu) {
            allu alluVar = (allu) view;
            almc d = d();
            CharSequence charSequence = alluVar.a;
            Drawable drawable = alluVar.b;
            int i = alluVar.c;
            if (!TextUtils.isEmpty(alluVar.getContentDescription())) {
                d.c = alluVar.getContentDescription();
                d.b();
            }
            f(d, this.a.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private final void s(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && jw.al(this)) {
            almb almbVar = this.b;
            int childCount = almbVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (almbVar.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int p = p(i, 0.0f);
            if (scrollX != p) {
                if (this.K == null) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.K = valueAnimator;
                    valueAnimator.setInterpolator(aleq.b);
                    this.K.setDuration(this.s);
                    this.K.addUpdateListener(new allv(this));
                }
                this.K.setIntValues(scrollX, p);
                this.K.start();
            }
            almb almbVar2 = this.b;
            int i3 = this.s;
            ValueAnimator valueAnimator2 = almbVar2.a;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                almbVar2.a.cancel();
            }
            almbVar2.d(true, i, i3);
            return;
        }
        o(i);
    }

    private final void t(int i) {
        int childCount = this.b.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.b.getChildAt(i2);
                boolean z = i2 == i;
                childAt.setSelected(z);
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    private final void v(ViewPager viewPager, boolean z) {
        List list;
        ViewPager viewPager2 = this.z;
        if (viewPager2 != null) {
            almd almdVar = this.N;
            if (almdVar != null) {
                viewPager2.j(almdVar);
            }
            allw allwVar = this.O;
            if (allwVar != null && (list = this.z.h) != null) {
                list.remove(allwVar);
            }
        }
        allx allxVar = this.f178J;
        if (allxVar != null) {
            this.I.remove(allxVar);
            this.f178J = null;
        }
        if (viewPager != null) {
            this.z = viewPager;
            if (this.N == null) {
                this.N = new almd(this);
            }
            almd almdVar2 = this.N;
            almdVar2.b = 0;
            almdVar2.a = 0;
            viewPager.e(almdVar2);
            almg almgVar = new almg(viewPager);
            this.f178J = almgVar;
            e(almgVar);
            bxz bxzVar = viewPager.b;
            if (bxzVar != null) {
                k(bxzVar, true);
            }
            if (this.O == null) {
                this.O = new allw(this);
            }
            allw allwVar2 = this.O;
            allwVar2.a = true;
            if (viewPager.h == null) {
                viewPager.h = new ArrayList();
            }
            viewPager.h.add(allwVar2);
            o(viewPager.a());
        } else {
            this.z = null;
            k(null, false);
        }
        this.P = z;
    }

    public final int a() {
        almc almcVar = this.D;
        if (almcVar != null) {
            return almcVar.d;
        }
        return -1;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        r(view);
    }

    public final int b() {
        return this.a.size();
    }

    public final almc c(int i) {
        if (i < 0 || i >= b()) {
            return null;
        }
        return (almc) this.a.get(i);
    }

    public final almc d() {
        almc almcVar = (almc) C.a();
        if (almcVar == null) {
            almcVar = new almc();
        }
        almcVar.g = this;
        hy hyVar = this.Q;
        almf almfVar = hyVar != null ? (almf) hyVar.a() : null;
        if (almfVar == null) {
            almfVar = new almf(this, getContext());
        }
        almfVar.a(almcVar);
        almfVar.setFocusable(true);
        almfVar.setMinimumWidth(q());
        if (!TextUtils.isEmpty(almcVar.c)) {
            almfVar.setContentDescription(almcVar.c);
        } else {
            almfVar.setContentDescription(almcVar.b);
        }
        almcVar.h = almfVar;
        if (almcVar.i != -1) {
            almcVar.h.setId(0);
        }
        return almcVar;
    }

    @Deprecated
    public final void e(allx allxVar) {
        if (this.I.contains(allxVar)) {
            return;
        }
        this.I.add(allxVar);
    }

    public final void f(almc almcVar, boolean z) {
        int size = this.a.size();
        if (almcVar.g == this) {
            almcVar.d = size;
            this.a.add(size, almcVar);
            int size2 = this.a.size();
            while (true) {
                size++;
                if (size >= size2) {
                    break;
                } else {
                    ((almc) this.a.get(size)).d = size;
                }
            }
            almf almfVar = almcVar.h;
            almfVar.setSelected(false);
            almfVar.setActivated(false);
            almb almbVar = this.b;
            int i = almcVar.d;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            u(layoutParams);
            almbVar.addView(almfVar, i, layoutParams);
            if (z) {
                almcVar.a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r0 != 2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            r4 = this;
            int r0 = r4.u
            r1 = 2
            r2 = 0
            if (r0 == 0) goto Lb
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = 0
            goto L14
        Lb:
            int r0 = r4.H
            int r3 = r4.c
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L14:
            almb r3 = r4.b
            defpackage.jw.Y(r3, r0, r2, r2, r2)
            int r0 = r4.u
            java.lang.String r2 = "TabLayout"
            r3 = 1
            if (r0 == 0) goto L34
            if (r0 == r3) goto L25
            if (r0 == r1) goto L25
            goto L50
        L25:
            int r0 = r4.r
            if (r0 != r1) goto L2e
            java.lang.String r0 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r2, r0)
        L2e:
            almb r0 = r4.b
            r0.setGravity(r3)
            goto L50
        L34:
            int r0 = r4.r
            if (r0 == 0) goto L43
            if (r0 == r3) goto L3d
            if (r0 == r1) goto L48
            goto L50
        L3d:
            almb r0 = r4.b
            r0.setGravity(r3)
            goto L50
        L43:
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r2, r0)
        L48:
            almb r0 = r4.b
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r0.setGravity(r1)
        L50:
            r4.n(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.g():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public final void h() {
        int a;
        for (int childCount = this.b.getChildCount() - 1; childCount >= 0; childCount--) {
            almf almfVar = (almf) this.b.getChildAt(childCount);
            this.b.removeViewAt(childCount);
            if (almfVar != null) {
                almfVar.a(null);
                almfVar.setSelected(false);
                this.Q.b(almfVar);
            }
            requestLayout();
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            almc almcVar = (almc) it.next();
            it.remove();
            almcVar.g = null;
            almcVar.h = null;
            almcVar.a = null;
            almcVar.i = -1;
            almcVar.b = null;
            almcVar.c = null;
            almcVar.d = -1;
            almcVar.e = null;
            C.b(almcVar);
        }
        this.D = null;
        bxz bxzVar = this.L;
        if (bxzVar != null) {
            int j = bxzVar.j();
            for (int i = 0; i < j; i++) {
                almc d = d();
                CharSequence l = this.L.l(i);
                if (TextUtils.isEmpty(d.c) && !TextUtils.isEmpty(l)) {
                    d.h.setContentDescription(l);
                }
                d.b = l;
                d.b();
                f(d, false);
            }
            ViewPager viewPager = this.z;
            if (viewPager == null || j <= 0 || (a = viewPager.a()) == a() || a >= b()) {
                return;
            }
            i(c(a));
        }
    }

    public final void i(almc almcVar) {
        j(almcVar, true);
    }

    public final void j(almc almcVar, boolean z) {
        almc almcVar2 = this.D;
        if (almcVar2 == almcVar) {
            if (almcVar2 != null) {
                for (int size = this.I.size() - 1; size >= 0; size--) {
                    ((allx) this.I.get(size)).b();
                }
                s(almcVar.d);
                return;
            }
            return;
        }
        int i = almcVar != null ? almcVar.d : -1;
        if (z) {
            if ((almcVar2 != null && almcVar2.d != -1) || i == -1) {
                s(i);
            } else {
                o(i);
            }
            if (i != -1) {
                t(i);
            }
        }
        this.D = almcVar;
        if (almcVar2 != null) {
            for (int size2 = this.I.size() - 1; size2 >= 0; size2--) {
                ((allx) this.I.get(size2)).c();
            }
        }
        if (almcVar != null) {
            for (int size3 = this.I.size() - 1; size3 >= 0; size3--) {
                ((allx) this.I.get(size3)).a(almcVar);
            }
        }
    }

    public final void k(bxz bxzVar, boolean z) {
        DataSetObserver dataSetObserver;
        bxz bxzVar2 = this.L;
        if (bxzVar2 != null && (dataSetObserver = this.M) != null) {
            bxzVar2.b.unregisterObserver(dataSetObserver);
        }
        this.L = bxzVar;
        if (z && bxzVar != null) {
            if (this.M == null) {
                this.M = new ally(this);
            }
            bxzVar.b.registerObserver(this.M);
        }
        h();
    }

    public final void l(int i, float f, boolean z, boolean z2) {
        int round = Math.round(i + f);
        if (round < 0 || round >= this.b.getChildCount()) {
            return;
        }
        if (z2) {
            almb almbVar = this.b;
            ValueAnimator valueAnimator = almbVar.a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                almbVar.a.cancel();
            }
            almbVar.b = i;
            almbVar.c = f;
            almbVar.c(almbVar.getChildAt(i), almbVar.getChildAt(almbVar.b + 1), almbVar.c);
        }
        ValueAnimator valueAnimator2 = this.K;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.K.cancel();
        }
        scrollTo(p(i, f), 0);
        if (z) {
            t(round);
        }
    }

    public final void m(ViewPager viewPager) {
        v(viewPager, false);
    }

    public final void n(boolean z) {
        for (int i = 0; i < this.b.getChildCount(); i++) {
            View childAt = this.b.getChildAt(i);
            childAt.setMinimumWidth(q());
            u((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public final void o(int i) {
        l(i, 0.0f, true, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        alkd.B(this);
        if (this.z == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                v((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.P) {
            m(null);
            this.P = false;
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        almf almfVar;
        Drawable drawable;
        for (int i = 0; i < this.b.getChildCount(); i++) {
            View childAt = this.b.getChildAt(i);
            if ((childAt instanceof almf) && (drawable = (almfVar = (almf) childAt).c) != null) {
                drawable.setBounds(almfVar.getLeft(), almfVar.getTop(), almfVar.getRight(), almfVar.getBottom());
                almfVar.c.draw(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ks.c(accessibilityNodeInfo).t(kw.e(1, b(), 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        if (r8.getMeasuredWidth() != getMeasuredWidth()) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b3, code lost:
    
        if (r2 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b5, code lost:
    
        r8.measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(r9, getPaddingTop() + getPaddingBottom(), r8.getLayoutParams().height));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b0, code lost:
    
        if (r8.getMeasuredWidth() < getMeasuredWidth()) goto L45;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            android.content.Context r0 = r7.getContext()
            java.util.ArrayList r1 = r7.a
            int r1 = r1.size()
            r2 = 0
            r3 = 0
        Lc:
            r4 = 48
            if (r3 >= r1) goto L30
            java.util.ArrayList r5 = r7.a
            java.lang.Object r5 = r5.get(r3)
            almc r5 = (defpackage.almc) r5
            if (r5 == 0) goto L2d
            android.graphics.drawable.Drawable r6 = r5.a
            if (r6 == 0) goto L2d
            java.lang.CharSequence r5 = r5.b
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L2d
            boolean r1 = r7.v
            if (r1 != 0) goto L30
            r4 = 72
            goto L30
        L2d:
            int r3 = r3 + 1
            goto Lc
        L30:
            float r0 = defpackage.alkd.r(r0, r4)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r9)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r3) goto L55
            if (r1 == 0) goto L46
            goto L68
        L46:
            int r9 = r7.getPaddingTop()
            int r0 = r0 + r9
            int r9 = r7.getPaddingBottom()
            int r0 = r0 + r9
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L68
        L55:
            int r1 = r7.getChildCount()
            if (r1 != r5) goto L68
            int r1 = android.view.View.MeasureSpec.getSize(r9)
            if (r1 < r0) goto L68
            android.view.View r1 = r7.getChildAt(r2)
            r1.setMinimumHeight(r0)
        L68:
            int r0 = android.view.View.MeasureSpec.getSize(r8)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            if (r1 == 0) goto L86
            int r1 = r7.F
            if (r1 <= 0) goto L77
            goto L84
        L77:
            float r0 = (float) r0
            android.content.Context r1 = r7.getContext()
            r3 = 56
            float r1 = defpackage.alkd.r(r1, r3)
            float r0 = r0 - r1
            int r1 = (int) r0
        L84:
            r7.q = r1
        L86:
            super.onMeasure(r8, r9)
            int r8 = r7.getChildCount()
            if (r8 != r5) goto Ld3
            android.view.View r8 = r7.getChildAt(r2)
            int r0 = r7.u
            if (r0 == 0) goto La8
            if (r0 == r5) goto L9d
            r1 = 2
            if (r0 == r1) goto La8
            goto Ld3
        L9d:
            int r0 = r8.getMeasuredWidth()
            int r1 = r7.getMeasuredWidth()
            if (r0 == r1) goto Lb3
            goto Lb2
        La8:
            int r0 = r8.getMeasuredWidth()
            int r1 = r7.getMeasuredWidth()
            if (r0 >= r1) goto Lb3
        Lb2:
            r2 = 1
        Lb3:
            if (r2 == 0) goto Ld3
            int r0 = r7.getPaddingTop()
            int r1 = r7.getPaddingBottom()
            android.view.ViewGroup$LayoutParams r2 = r8.getLayoutParams()
            int r2 = r2.height
            int r0 = r0 + r1
            int r9 = getChildMeasureSpec(r9, r0, r2)
            int r0 = r7.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r8.measure(r0, r9)
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        alkd.A(this, f);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return Math.max(0, ((this.b.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight()) > 0;
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        r(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TabLayout(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private final void u(LinearLayout.LayoutParams layoutParams) {
        if (this.u != 1 || this.r != 0) {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        } else {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        r(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        r(view);
    }
}
