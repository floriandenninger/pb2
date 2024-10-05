package com.google.android.libraries.youtube.common.ui.swipelayout;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
import defpackage.akm;
import defpackage.akn;
import defpackage.ald;
import defpackage.alh;
import defpackage.ali;
import defpackage.hiq;
import defpackage.jw;
import defpackage.yjk;
import defpackage.zeh;
import defpackage.zej;
import defpackage.zek;
import defpackage.zel;
import defpackage.zem;
import defpackage.zen;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SwipeLayout extends FrameLayout {
    private static final int[] i = {R.attr.state_enabled, R.attr.state_pressed};
    private static final int[] j = new int[0];
    public int a;
    public int b;
    public View c;
    public VelocityTracker d;
    public int e;
    public boolean f;
    public View g;
    public boolean h;
    private int k;
    private akn l;
    private View m;
    private Drawable n;
    private Drawable o;
    private alh p;
    private GestureDetector q;
    private final PointF r;
    private final akm s;
    private final GestureDetector.SimpleOnGestureListener t;

    public SwipeLayout(Context context) {
        super(context);
        this.f = true;
        this.h = true;
        this.r = new PointF();
        this.s = new zel(this);
        this.t = new zem(this);
        t(context, null, 0, 0);
    }

    private final void t(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.q = new GestureDetector(getContext(), this.t);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.a = yjk.K(getResources().getDisplayMetrics(), 40);
        this.b = viewConfiguration.getScaledMinimumFlingVelocity();
        this.k = yjk.K(getResources().getDisplayMetrics(), 5);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zeh.a, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            this.m = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
        }
        this.n = obtainStyledAttributes.getDrawable(2);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId2 != 0) {
            View inflate = LayoutInflater.from(getContext()).inflate(resourceId2, (ViewGroup) this, false);
            this.g = inflate;
            k(inflate);
        }
        this.o = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }

    private final void u(View view, zen zenVar, float f) {
        if (view == null) {
            return;
        }
        if (view.getWidth() == 0) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new zek(this, view, zenVar, f));
        } else {
            m(((Integer) zenVar.a()).intValue(), f);
        }
    }

    private final void v(int i2) {
        View view = this.c;
        if (view != null) {
            jw.D(view, i2 - view.getLeft());
            if (!e().l) {
                e().h(i2);
            }
            int i3 = this.e;
            Drawable drawable = i3 > 0 ? this.n : null;
            if (i3 < 0) {
                drawable = this.o;
            }
            setBackground(drawable);
            View view2 = this.m;
            if (view2 != null) {
                view2.setVisibility(i3 <= 0 ? 8 : 0);
            }
            View view3 = this.g;
            if (view3 != null) {
                view3.setVisibility(i3 < 0 ? 0 : 8);
            }
        }
    }

    public final int a() {
        View c = c();
        if (c != null) {
            return c.getWidth();
        }
        return 0;
    }

    public final int b() {
        View d = d();
        if (d != null) {
            return d.getWidth();
        }
        return 0;
    }

    public final View c() {
        return q() ? this.g : this.m;
    }

    public final View d() {
        return q() ? this.m : this.g;
    }

    public final alh e() {
        if (this.p == null) {
            alh alhVar = new alh(new hiq(null), (byte[]) null);
            ali aliVar = new ali(0.0f);
            aliVar.c();
            aliVar.e(1500.0f);
            alhVar.n = aliVar;
            alhVar.g(new ald() { // from class: zei
                @Override // defpackage.ald
                public final void a(float f) {
                    SwipeLayout swipeLayout = SwipeLayout.this;
                    if (swipeLayout.q()) {
                        f = -f;
                    }
                    swipeLayout.l((int) f);
                }
            });
            alhVar.h(0.0f);
            this.p = alhVar;
        }
        return this.p;
    }

    public final void f() {
        g(0.0f);
    }

    public final void g(float f) {
        m(0, f);
    }

    public final void h() {
        e().j();
        l(0);
    }

    public final void i(float f) {
        u(c(), new zej(this, 0), f);
    }

    public final void j(float f) {
        u(d(), new zej(this, 1), f);
    }

    public final void k(View view) {
        View view2 = this.g;
        if (view == view2) {
            return;
        }
        if (view2 != null) {
            removeView(view2);
        }
        this.g = view;
        if (view != null) {
            addView(view, 0);
        } else if (this.e < 0) {
            l(0);
        }
    }

    public final void l(int i2) {
        if ((i2 > 0 && !s()) || (i2 < 0 && !p())) {
            i2 = 0;
        }
        this.e = i2;
        v(q() ? -this.e : this.e);
    }

    public final void m(int i2, float f) {
        int left = this.c.getLeft();
        if (left != i2 || e().l) {
            if (!e().l) {
                alh e = e();
                e.h(left);
                e.g = f;
            }
            e().i(i2);
        }
    }

    public final void n(float f, float f2) {
        Drawable background = this.c.getBackground();
        if (background instanceof RippleDrawable) {
            this.c.drawableHotspotChanged(f, f2);
            ((RippleDrawable) background).setState(i);
        }
    }

    public final void o() {
        Drawable background = this.c.getBackground();
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setState(j);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c = getChildAt(getChildCount() - 1);
        this.l = akn.c(this, 1.0f, this.s);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (s() || p()) {
            return this.l.k(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View view = this.m;
        if (view != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).gravity = 8388611;
            this.m.setVisibility(4);
        }
        View view2 = this.g;
        if (view2 != null) {
            ((FrameLayout.LayoutParams) view2.getLayoutParams()).gravity = 8388613;
            this.g.setVisibility(4);
        }
        super.onLayout(z, i2, i3, i4, i5);
        int i6 = this.e;
        if (q()) {
            i6 = -i6;
        }
        v(i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6 A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p() {
        return this.h && this.g != null;
    }

    public final boolean q() {
        return jw.e(this) == 1;
    }

    public final boolean r() {
        return this.e != 0;
    }

    public final boolean s() {
        return this.f && this.m != null;
    }

    public SwipeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = true;
        this.h = true;
        this.r = new PointF();
        this.s = new zel(this);
        this.t = new zem(this);
        t(context, attributeSet, 0, 0);
    }

    public SwipeLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f = true;
        this.h = true;
        this.r = new PointF();
        this.s = new zel(this);
        this.t = new zem(this);
        t(context, attributeSet, i2, 0);
    }

    public SwipeLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f = true;
        this.h = true;
        this.r = new PointF();
        this.s = new zel(this);
        this.t = new zem(this);
        t(context, attributeSet, i2, i3);
    }
}
