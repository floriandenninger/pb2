package com.google.android.apps.youtube.app.watch.nextgenwatch.flexy;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.app.common.ui.OverScrollLinearLayoutManager;
import defpackage.ahe;
import defpackage.iv;
import defpackage.nyx;
import defpackage.nyz;
import defpackage.nzc;
import defpackage.wd;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FlexyBehavior extends ahe {
    public boolean a = true;
    public boolean b = false;
    private final int c;
    private final nzc d;
    private final nyz e;
    private final nyx f;

    public FlexyBehavior(Context context, nzc nzcVar, nyz nyzVar) {
        this.d = nzcVar;
        this.e = nyzVar;
        this.f = new nyx(this, nzcVar);
        this.c = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
    }

    private final boolean A() {
        return x() < v();
    }

    private final boolean B() {
        return x() > w();
    }

    private final int v() {
        return this.e.a();
    }

    private final int w() {
        return this.e.b();
    }

    private final int x() {
        return this.e.c();
    }

    private final RecyclerView y(View view) {
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        if (!(view instanceof iv) || !(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getChildCount() > 0) {
            return y(viewGroup.getChildAt(0));
        }
        return null;
    }

    private final void z(boolean z) {
        boolean z2 = this.b;
        boolean z3 = true;
        if (!z && !A()) {
            z3 = false;
        }
        this.b = z2 | z3;
    }

    @Override // defpackage.ahe
    public final void c(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        boolean z = i2 > 0;
        if (z && B()) {
            int min = Math.min(Math.max(0, x() - w()), i2);
            iArr[1] = min;
            this.e.d(x() - min);
            if (coordinatorLayout.getParent() != null) {
                coordinatorLayout.getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        z(z);
    }

    @Override // defpackage.ahe
    public final void d(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i4 >= 0 || !A()) {
            return;
        }
        this.e.d(x() + Math.min(Math.max(0, v() - x()), Math.abs(i4)));
        if (coordinatorLayout.getParent() != null) {
            coordinatorLayout.getParent().requestDisallowInterceptTouchEvent(true);
        }
        iArr[1] = iArr[1] + i4;
    }

    @Override // defpackage.ahe
    public final void e(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        this.a = true;
    }

    @Override // defpackage.ahe
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, boolean z) {
        if (Math.abs(f2) < this.c || f2 <= 0.0f || !B()) {
            return false;
        }
        this.d.g(1, true);
        return true;
    }

    @Override // defpackage.ahe
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        z(f2 < 0.0f);
        return false;
    }

    @Override // defpackage.ahe
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        RecyclerView y = y(view3);
        if (y != null) {
            wd wdVar = y.n;
            if (wdVar instanceof OverScrollLinearLayoutManager) {
                nyx nyxVar = this.f;
                Set set = ((OverScrollLinearLayoutManager) wdVar).a;
                nyxVar.getClass();
                set.add(nyxVar);
            }
        }
        this.a = false;
        return !this.e.e() && (i & 2) == 2;
    }
}
