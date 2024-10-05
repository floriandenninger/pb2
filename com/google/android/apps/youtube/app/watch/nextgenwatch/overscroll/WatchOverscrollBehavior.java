package com.google.android.apps.youtube.app.watch.nextgenwatch.overscroll;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.FlexyBehavior;
import defpackage.ahe;
import defpackage.nqp;
import defpackage.nxh;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WatchOverscrollBehavior extends ahe {
    private final nqp a;
    private final FlexyBehavior b;
    private boolean c;
    private boolean d;

    public WatchOverscrollBehavior(nqp nqpVar, FlexyBehavior flexyBehavior) {
        this.a = nqpVar;
        this.b = flexyBehavior;
    }

    private final boolean v() {
        return (!this.c || this.a.h().p || this.a.h().o == nxh.FULL_BLEED) ? false : true;
    }

    @Override // defpackage.ahe
    public final void c(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (this.d) {
            this.a.h().b.c(coordinatorLayout, view, view2, i - iArr[0], i2 - iArr[1], iArr, i3);
        }
        if (v()) {
            this.b.c(coordinatorLayout, view, view2, i - iArr[0], i2 - iArr[1], iArr, i3);
        }
    }

    @Override // defpackage.ahe
    public final void d(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (v()) {
            this.b.d(coordinatorLayout, view, view2, i, i2, i3 - iArr[0], i4 - iArr[1], i5, iArr);
        }
        if (this.d) {
            this.a.h().b.d(coordinatorLayout, view, view2, i, i2, i3 - iArr[0], i4 - iArr[1], i5, iArr);
        }
    }

    @Override // defpackage.ahe
    public final void e(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        if (this.c) {
            this.b.e(coordinatorLayout, view, view2, i);
            this.c = false;
        }
        if (this.d) {
            this.a.h().b.A();
            this.d = false;
        }
    }

    @Override // defpackage.ahe
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, boolean z) {
        if (v() && this.b.i(coordinatorLayout, view, view2, f, f2, z)) {
            return true;
        }
        return this.d && this.a.h().b.i(coordinatorLayout, view, view2, f, f2, z);
    }

    @Override // defpackage.ahe
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        if (!v()) {
            return false;
        }
        this.b.j(coordinatorLayout, view, view2, f, f2);
        return false;
    }

    @Override // defpackage.ahe
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.c = this.b.l(coordinatorLayout, view, view2, view3, i, i2);
        boolean l = this.a.h().b.l(coordinatorLayout, view, view2, view3, i, i2);
        this.d = l;
        return this.c || l;
    }
}
