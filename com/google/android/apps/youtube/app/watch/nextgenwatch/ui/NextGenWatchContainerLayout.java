package com.google.android.apps.youtube.app.watch.nextgenwatch.ui;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchContainerLayout;
import com.google.android.youtube.R;
import defpackage.aih;
import defpackage.amkq;
import defpackage.amlr;
import defpackage.amsx;
import defpackage.ayrs;
import defpackage.ayrv;
import defpackage.gfw;
import defpackage.obr;
import defpackage.odm;
import defpackage.odq;
import defpackage.odr;
import defpackage.oel;
import defpackage.oer;
import defpackage.oev;
import defpackage.whu;
import defpackage.zao;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NextGenWatchContainerLayout extends odm {
    public View a;
    public View b;
    public View c;
    public obr d;
    public zao e;
    public obr f;
    public final odr g;
    public final odq h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final amsx n;
    private final int o;
    private final List p;
    private boolean q;

    public NextGenWatchContainerLayout(Context context) {
        this(context, null);
    }

    private final void f() {
        if (this.b == null) {
            return;
        }
        Rect a = this.h.a();
        this.b.measure(View.MeasureSpec.makeMeasureSpec(a.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(a.height(), 1073741824));
    }

    private static final void g(View view, boolean z, int i, int i2, int i3, int i4) {
        if (view != null) {
            if (z || view.getVisibility() != 8) {
                view.layout(i, i2, i3, i4);
            }
        }
    }

    private static final void h(View view, boolean z, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i += marginLayoutParams.leftMargin;
            i2 += marginLayoutParams.topMargin;
        }
        int i3 = i;
        int i4 = i2;
        g(view, z, i3, i4, i3 + view.getMeasuredWidth(), i4 + view.getMeasuredHeight());
    }

    public final void c() {
        boolean b = this.h.b();
        boolean g = this.d.g();
        gfw.c();
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            if (this.n.contains(Integer.valueOf(((View) this.p.get(i)).getId()))) {
                whu.I((View) this.p.get(i), ((View) this.p.get(i)).getVisibility() != 8 && b);
            } else {
                whu.I((View) this.p.get(i), b);
            }
        }
        whu.I(this.a, g);
        View view = this.b;
        if (view != null) {
            whu.I(view, g);
        }
        whu.I(this.c, g);
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (!this.q) {
            bringChildToFront(this.a);
            View view = this.b;
            if (view != null) {
                bringChildToFront(view);
            }
            bringChildToFront(this.c);
            this.q = true;
        }
        c();
        this.e.a.A(new ayrv() { // from class: odp
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                NextGenWatchContainerLayout nextGenWatchContainerLayout = NextGenWatchContainerLayout.this;
                zck zckVar = (zck) obj;
                int i = 0;
                if (nextGenWatchContainerLayout.e.l() && nextGenWatchContainerLayout.f.e()) {
                    i = zckVar.a.d.top;
                }
                return Integer.valueOf(i);
            }
        }).n().X(new ayrs() { // from class: odo
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                yny.z(NextGenWatchContainerLayout.this.c, yny.v(((Integer) obj).intValue()), ViewGroup.MarginLayoutParams.class);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        if (this.h.b()) {
            int size = this.p.size();
            for (int i6 = 0; i6 < size; i6++) {
                h((View) this.p.get(i6), z, i, i2);
            }
        }
        boolean z2 = this.d.g() || this.g.b();
        if (z2) {
            View view = this.a;
            g(view, z, i, i2, i + view.getMeasuredWidth(), i2 + this.a.getMeasuredHeight());
        }
        if (!this.g.b()) {
            if (z2) {
                oev oevVar = this.h.a;
                f = oevVar != null ? ((oel) oevVar).c().p() : 0.0f;
            } else {
                f = 1.0f;
            }
            this.a.setAlpha(f);
            if (z2) {
                oev oevVar2 = this.h.a;
                i5 = ((Integer) (oevVar2 != null ? ((oel) oevVar2).c().I() : amlr.a).e(Integer.valueOf(this.o))).intValue();
            } else {
                i5 = this.o;
            }
            this.a.setBackgroundColor(i5);
        }
        if (this.d.g()) {
            h(this.c, z, i, i2);
        }
        if (this.b == null || !this.d.g()) {
            return;
        }
        Rect a = this.h.a();
        if (this.b.getMeasuredWidth() != a.width() || this.b.getMeasuredHeight() != a.height()) {
            f();
        }
        g(this.b, z, a.left, a.top, a.left + this.b.getMeasuredWidth(), a.top + this.b.getMeasuredHeight());
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View.MeasureSpec.getSize(i);
        View.MeasureSpec.getSize(i2);
        gfw.c();
        c();
        int size = this.p.size();
        for (int i3 = 0; i3 < size; i3++) {
            measureChildWithMargins((View) this.p.get(i3), i, 0, i2, 0);
        }
        if (this.d.g()) {
            measureChild(this.a, i, i2);
            measureChildWithMargins(this.c, i, 0, i2, 0);
            f();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        odr odrVar = this.g;
        Animator animator = odrVar.b;
        if (animator == null) {
            return;
        }
        animator.cancel();
        odrVar.a();
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        gfw.b();
        super.onViewAdded(view);
        if (view == null) {
            return;
        }
        int id = view.getId();
        if (this.i == id) {
            this.a = view;
        } else if (this.j == id) {
            this.b = view;
        } else if (this.k == id) {
            this.c = view;
        } else if (!this.p.contains(view)) {
            this.p.add(view);
        }
        this.q = false;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        gfw.b();
        super.onViewRemoved(view);
        if (view == null) {
            return;
        }
        int id = view.getId();
        if (this.i != id) {
            if (this.j != id) {
                if (this.k == id) {
                    throw new IllegalStateException("Watch layout must not be removed.");
                }
                if (this.p.contains(view)) {
                    this.p.remove(view);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Player view must not be removed.");
        }
        throw new IllegalStateException("Scrim view must not be removed.");
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public NextGenWatchContainerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public NextGenWatchContainerLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public NextGenWatchContainerLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.p = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, oer.a);
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        this.i = resourceId;
        this.j = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(4, 0);
        this.k = resourceId2;
        int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
        this.l = resourceId3;
        int resourceId4 = obtainStyledAttributes.getResourceId(3, 0);
        this.m = resourceId4;
        this.n = amsx.s(Integer.valueOf(resourceId3), Integer.valueOf(resourceId4));
        obtainStyledAttributes.recycle();
        amkq.N(resourceId != 0);
        amkq.N(resourceId2 != 0);
        odr odrVar = new odr(this);
        this.g = odrVar;
        obr obrVar = this.d;
        obrVar.getClass();
        this.h = new odq(obrVar, odrVar);
        this.o = aih.d(context, R.color.watch_layout_scrim_color);
    }
}
