package com.google.android.apps.youtube.app.ui.pivotbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import defpackage.atvx;
import defpackage.fav;
import defpackage.fyl;
import defpackage.gir;
import defpackage.in;
import defpackage.mjg;
import defpackage.mjh;
import defpackage.mjo;
import defpackage.mkb;
import defpackage.mkd;
import defpackage.yjk;
import defpackage.yzq;
import defpackage.zau;
import defpackage.zev;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PivotBar extends yzq {
    public Resources a;
    public zau b;
    public boolean c;
    public int d;
    in e;
    GestureDetector.OnGestureListener f;
    public mkb g;
    private final List m;
    private int n;

    public PivotBar(Context context) {
        super(context);
        this.m = new ArrayList();
        o(context);
    }

    private final void o(Context context) {
        setLayoutDirection(context.getResources().getConfiguration().getLayoutDirection());
        this.b = new zau(context);
        this.a = context.getResources();
        h(R.style.PivotBar_Default);
        setFillViewport(!yjk.aa(context));
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f = new mjg(this);
        in inVar = new in(context, this.f);
        this.e = inVar;
        inVar.a.a.setIsLongpressEnabled(false);
    }

    public final ColorStateList a(int i, int i2) {
        return this.b.a(i, i2, i, i2, i2, i);
    }

    public final View b(Drawable drawable, CharSequence charSequence, boolean z, int i, Map map, atvx atvxVar, Optional optional) {
        return c(new mjo(this, R.layout.image_with_text_tab, this.h, drawable, charSequence, map, optional), z, i, atvxVar);
    }

    public final View c(mjo mjoVar, boolean z, int i, atvx atvxVar) {
        mjoVar.b(z, i);
        TypedArray obtainStyledAttributes = mjoVar.d.getContext().obtainStyledAttributes(null, mkd.a, 0, this.n);
        mjoVar.c(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        this.m.add(mjoVar);
        View view = mjoVar.a;
        n(view, atvxVar != atvx.PIVOT_BAR_NAVIGATION_TYPE_UNSELECTABLE_TAB);
        return view;
    }

    final mjo d(int i) {
        mjo mjoVar = (i < 0 || i >= this.m.size()) ? null : (mjo) this.m.get(i);
        if ((mjoVar != null ? mjoVar.a : null) == k(i)) {
            return mjoVar;
        }
        throw new IllegalStateException("Internal pivot bar tab state does not match view hierarchy");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (zev.e(getContext()) || !this.c) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.e.a(motionEvent);
        return true;
    }

    public final void f(MotionEvent motionEvent) {
        View view;
        mkb mkbVar = this.g;
        if (mkbVar != null) {
            int height = getHeight();
            gir f = mkbVar.a.f();
            if (f == null || (view = f.O) == null || view.getParent() == null) {
                return;
            }
            Object parent = f.O.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                Point point = new Point();
                point.set((int) motionEvent.getRawX(), ((int) motionEvent.getRawY()) - height);
                fav.r(point, view2);
                obtain.setLocation(point.x, point.y);
                view2.dispatchTouchEvent(obtain);
                obtain.recycle();
            }
        }
    }

    public final void g(int i, boolean z, int i2) {
        mjo d = d(i);
        if (d != null) {
            d.b(z, i2);
        }
    }

    @Override // defpackage.yzq, android.widget.FrameLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    public final void h(int i) {
        if (this.n == i) {
            return;
        }
        this.n = i;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, mkd.a, 0, i);
        if (obtainStyledAttributes != null) {
            if (obtainStyledAttributes.hasValue(5)) {
                Drawable drawable = obtainStyledAttributes.getDrawable(5);
                if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.hasValue(6)) {
                    fyl fylVar = new fyl(drawable, obtainStyledAttributes.getColor(6, 0), obtainStyledAttributes.getDimensionPixelSize(0, 0));
                    fylVar.c(48);
                    drawable = fylVar;
                }
                setBackground(drawable);
            }
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                ((mjo) it.next()).c(obtainStyledAttributes);
            }
        }
        obtainStyledAttributes.recycle();
    }

    @Override // defpackage.yzq
    protected final void i(int i, boolean z) {
        mjo d = d(i);
        if (d != null) {
            View view = d.a;
            view.setSelected(z);
            view.setActivated(z);
            d.b(false, 0);
            if (d.b.isPresent()) {
                if (z) {
                    ((mjh) d.b.get()).d();
                } else {
                    ((mjh) d.b.get()).e();
                }
            }
        }
    }

    @Override // defpackage.yzq
    public final void lf() {
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((mjo) it.next()).c.qc();
        }
        this.m.clear();
        super.lf();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        setFillViewport(!yjk.aa(getContext()));
    }

    @Override // defpackage.yzq, android.widget.FrameLayout, android.view.ViewGroup
    protected final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -1, 17);
    }

    public PivotBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = new ArrayList();
        o(context);
    }

    public PivotBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = new ArrayList();
        o(context);
    }
}
